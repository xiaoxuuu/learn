package live.xiaoxu.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

@Mapper
public interface TestMapper {

    @Select("${sql}")
    List<Map<Object, Object>> testSelectSQL(@Param("sql") String sql);

    @Update("${sql}")
    int testUpdateSQL(@Param("sql") String sql);
}