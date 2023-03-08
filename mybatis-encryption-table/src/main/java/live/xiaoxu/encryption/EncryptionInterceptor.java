package live.xiaoxu.encryption;

import lombok.extern.slf4j.Slf4j;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Slf4j
@Intercepts({
        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class}),
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class}),
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
        @Signature(type = StatementHandler.class, method = "prepare", args = {java.sql.Connection.class, Integer.class}),
})
@Component
public class EncryptionInterceptor implements Interceptor {

    @Value("${custom.encryption.enable:false}")
    private Boolean encryptionEnable;

    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        // 未开启
        if (!encryptionEnable) {
            return invocation.proceed();
        }

        BoundSql boundSql = ((StatementHandler) invocation.getTarget()).getBoundSql();
        // 获取到原始 SQL 语句
        String sql = boundSql.getSql();
        log.debug("原始 SQL：{}", sql);
        Statement statement;
        try {
            statement = CCJSqlParserUtil.parse(sql);
            statement.accept(new EncryptionVisitor());
        } catch (JSQLParserException e) {
            throw new RuntimeException(e.getMessage());
        }
        log.debug("编码 SQL：{}", statement);

        // 修改 SQL 语句
        Field field = boundSql.getClass().getDeclaredField("sql");
        field.setAccessible(true);
        field.set(boundSql, statement.toString());

        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        // 判断是否拦截这个类型对象（根据 @Intercepts 注解决定），然后决定是返回一个代理对象还是返回原对象。
        // 故我们在实现 plugin 方法时，要判断一下目标类型，如果是插件要拦截的对象时才执行 Plugin.wrap 方法，否则的话，直接返回目标本身。
        if (target instanceof StatementHandler) {
            return Plugin.wrap(target, this);
        }
        return target;
    }
}