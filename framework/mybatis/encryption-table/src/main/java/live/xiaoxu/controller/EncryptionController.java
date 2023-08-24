package live.xiaoxu.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import live.xiaoxu.entity.SQLDTO;
import live.xiaoxu.service.EncryptionService;
import live.xiaoxu.util.EncodeUtil;
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

    /**
     * <p>使用方式：</p>
     * <p>{@code curl -X POST 'http://localhost:8888/encryption/decode_sql' -H 'Content-Type: application/json' --data-raw '{"sql":"待解码 SQL"}'}</p>
     *
     * @param sqlDto sql
     * @return sql
     */
    @Operation(summary = "解密数据", description = "解密被加密的 SQL")
    @PostMapping("/decode_sql")
    public @ResponseBody
    String decodeSql(@RequestBody SQLDTO sqlDto) {

        return EncodeUtil.decodeData(sqlDto.getSql());
    }
}