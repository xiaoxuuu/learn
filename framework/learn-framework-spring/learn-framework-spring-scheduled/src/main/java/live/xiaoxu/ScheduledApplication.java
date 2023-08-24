package live.xiaoxu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * <p>测试定时任务</p>
 *
 * @author 小徐
 * @since 2023/7/10 11:02
 */
@Slf4j
@EnableScheduling
@SpringBootApplication(scanBasePackages = "live.xiaoxu")
public class ScheduledApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduledApplication.class, args);
    }
}