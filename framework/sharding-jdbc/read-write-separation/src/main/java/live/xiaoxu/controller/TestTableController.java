package live.xiaoxu.controller;

import groovy.util.logging.Slf4j;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import live.xiaoxu.service.TestTableService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "测试表", description = "测试表-数据新增删除")
@Slf4j
@RestController
@RequestMapping("/test_table")
public class TestTableController {

    @Resource
    private TestTableService testTableService;

    @Operation(summary = "/add", description = "新增")
    @PostMapping("/add")
    public void add() {

        testTableService.add();
    }
}