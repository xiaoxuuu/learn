package live.xiaoxu.dao;

import live.xiaoxu.entity.FieldInfoDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface EncryptionMapper {

    @Select("SHOW TABLES")
    List<String> getTableList();

    @Select("SELECT * FROM information_schema.TABLES WHERE TABLE_NAME = '${tableName}'")
    List<Map<String, String>> tableExists(@Param("tableName") String tableName);

    @Update("DROP TABLE `${tableName}`")
    void deleteTable(@Param("tableName") String tableName);

    @Update("CREATE TABLE `${newTableName}` AS SELECT * FROM `${tableName}`")
    void copyTable(@Param("newTableName") String newTableName, @Param("tableName") String tableName);

    @Select("DESC ${tableName}")
    List<FieldInfoDTO> getTableStructure(@Param("tableName") String tableName);

    @UpdateProvider(type = EncryptionProvider.class, method = "encryptionField")
    void encryptionField(@Param("tableName") String tableName, @Param("fieldInfoList") List<FieldInfoDTO> fieldInfoList, @Param("cleanComment") Boolean cleanComment);

    @Update("ALTER TABLE `${tableName}` COMMENT '${comment}'")
    void editTableComment(@Param("tableName") String tableName, @Param("comment") String comment);

    @Update("ALTER TABLE `${oldTableName}` RENAME TO `${newTableName}`")
    void encryptionTableName(@Param("oldTableName") String oldTableName, @Param("newTableName") String newTableName);
}