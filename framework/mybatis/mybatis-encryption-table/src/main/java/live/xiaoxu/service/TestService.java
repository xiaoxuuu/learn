package live.xiaoxu.service;

import jakarta.annotation.Resource;
import live.xiaoxu.dao.TestMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public void sqlTest() {

        List<String> selectSqlList = List.of(
                "select id, dict_name, dict_type, is_system, `enable`, remark from easy_dict_type where `enable` = 1 and is_system = true"
        );
        for (int i = 0; i < selectSqlList.size(); i++) {
            log.info("第 {} 条 SELECT SQL 查询结果：{}", i, testMapper.testSelectSQL(selectSqlList.get(i)));
        }

        List<String> updateSqlList = List.of(
                "DELETE FROM easy_dict_data WHERE dict_type='1'"
        );
        for (int i = 0; i < updateSqlList.size(); i++) {
            log.info("第 {} 条 UPDATE SQL 查询结果：{}", i, testMapper.testUpdateSQL(updateSqlList.get(i)));
        }
    }
}