package live.xiaoxu.service;

import jakarta.annotation.Resource;
import live.xiaoxu.dao.EncryptionMapper;
import live.xiaoxu.entity.FieldInfoDTO;
import live.xiaoxu.util.EncryptionUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class EncryptionService {

    @Value("${custom.encryption.clean.comment:false}")
    private Boolean cleanComment;

    @Resource
    private EncryptionMapper encryptionMapper;

    public List<String> listTable() {

        // 查询所有的表
        return encryptionMapper.getTableList();
    }

    @Transactional(rollbackFor = Exception.class)
    public void encryptionDatabase() {

        // 查询所有的表
        List<String> tableList = encryptionMapper.getTableList();

        for (String tableName : tableList) {

            String encryptionTableName = EncryptionUtil.encryptionData(tableName);
            log.info("当前处理表：{}({})", tableName, encryptionTableName);

            // 查询字段
            List<FieldInfoDTO> tableStructureList = encryptionMapper.getTableStructure(tableName);
            // 编码字段
            encryptionMapper.encryptionField(tableName, tableStructureList, cleanComment);
            // 编码表名
            encryptionMapper.editTableComment(tableName, cleanComment ? "" : tableName);
            encryptionMapper.encryptionTableName(tableName, encryptionTableName);
        }
    }
}