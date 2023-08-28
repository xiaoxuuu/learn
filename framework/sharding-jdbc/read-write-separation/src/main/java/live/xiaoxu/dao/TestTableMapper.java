package live.xiaoxu.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestTableMapper {

    @Insert("INSERT INTO `test_table` (`id`, `name`) VALUES (NULL, '2')")
    public void add();

    @Select("SELECT CONCAT( id, \"_\", `name` ) FROM test_table")
    public List<String> get();
}