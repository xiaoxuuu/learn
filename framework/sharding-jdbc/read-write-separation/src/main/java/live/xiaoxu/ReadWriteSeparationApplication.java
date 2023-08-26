package live.xiaoxu;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication(scanBasePackages = "live.xiaoxu")
@MapperScan("live.xiaoxu")
public class ReadWriteSeparationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadWriteSeparationApplication.class, args);
        log.error("启动完成");
    }
}