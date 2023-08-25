package live.xiaoxu.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import live.xiaoxu.dao.TestTableMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "测试表", description = "测试表-数据新增删除")
@Slf4j
@RestController
@RequestMapping("/test_table")
public class TestTableController {

    @Resource
    private TestTableMapper testTableMapper;

    @Operation(summary = "/add", description = "新增")
    @GetMapping("/add")
    public void add() {

        testTableMapper.add();
    }
}