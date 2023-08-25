package live.xiaoxu.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestTableMapper {

    @Insert("INSERT INTO `test_table` (`id`, `name`) VALUES (NULL, '2')")
    public void add();
}