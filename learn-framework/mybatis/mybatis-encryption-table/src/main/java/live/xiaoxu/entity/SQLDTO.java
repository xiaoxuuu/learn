package live.xiaoxu.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "sql")
public class SQLDTO {

    @Schema(description = "sql")
    private String sql;
}