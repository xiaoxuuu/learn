package live.xiaoxu.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import live.xiaoxu.bean.TestTable;
import live.xiaoxu.dao.TestTableMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

@Slf4j
@Service
public class TestTableService extends ServiceImpl<TestTableMapper, TestTable> {

    @Resource
    private TestTableMapper testTableMapper;

    public void add() {

        TestTable testTable = new TestTable();
        testTable.setName("test" + new Random().nextInt());
        testTableMapper.insert(testTable);
    }
}