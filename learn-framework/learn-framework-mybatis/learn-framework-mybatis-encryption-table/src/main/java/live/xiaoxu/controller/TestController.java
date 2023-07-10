package live.xiaoxu.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import live.xiaoxu.service.TestService;
import org.springframework.web.bind.annotation.*;

/**
 * <p>测试</p>
 *
 * @author 小徐
 * @since 2023/1/4 14:35
 */
@Tag(name = "api 测试", description = "描述")
@RestController
@RequestMapping("/test")
@CrossOrigin(origins = "*")
public class TestController {

    @Resource
    private TestService testService;

    @Operation(summary = "sqlTest", description = "加密表和字段")
    @GetMapping("/sqlTest")
    public @ResponseBody
    String sqlTest() {

        testService.sqlTest();
        return "成功";
    }
}