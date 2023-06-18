package live.xiaoxu.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import live.xiaoxu.service.EncryptionService;
import org.springframework.web.bind.annotation.*;

@Tag(name = "编码", description = "描述")
@RestController
@RequestMapping("/encryption")
@CrossOrigin(origins = "*")
public class EncryptionController {

    @Resource
    private EncryptionService encryptionService;

    @Operation(summary = "加密数据", description = "加密表和字段")
    @GetMapping("/database")
    public @ResponseBody
    void encryptionDatabase() {

        encryptionService.encryptionDatabase();
    }
}