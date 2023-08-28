package live.xiaoxu.controller;

import jakarta.annotation.Resource;
import live.xiaoxu.dao.TestTableMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/get")
    public @ResponseBody List<String> get() {

        return testTableMapper.get();
    }
}