package live.xiaoxu.controller;

import jakarta.annotation.Resource;
import live.xiaoxu.dao.TestTableMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test_table")
public class TestTableController {

    @Resource
    private TestTableMapper testTableMapper;

    @GetMapping("/add")
    public void add() {

        testTableMapper.add();
    }
}