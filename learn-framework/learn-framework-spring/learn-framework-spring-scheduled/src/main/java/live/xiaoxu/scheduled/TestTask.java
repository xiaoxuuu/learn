package live.xiaoxu.scheduled;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * <p>测试任务</p>
 *
 * @author 小徐
 * @since 2023/7/10 11:00
 */
@Slf4j
@Service
public class TestTask {

    @Scheduled(cron = "0/30 * * * * ?")
    public void task() {

        taskHalfMinute();
    }

    @Scheduled(cron = "0/30 * * * * ?")
    public void task2() {

        taskHalfMinute();
    }

    @Scheduled(cron = "0/30 * * * * ?")
    public void task3() {

        taskHalfMinute();
    }

    @SneakyThrows
    public void taskHalfMinute() {

        String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Thread.sleep(new Random().nextInt(1000) + 500);
        if (!format.endsWith("00") && !format.endsWith("30")) {
            log.error("{} 执行时间： {}", Thread.currentThread().getName(), format);
        } else {
            log.info("{} 执行时间： {}", Thread.currentThread().getName(), format);
        }
    }
}