package live.xiaoxu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
@EnableConfigurationProperties(ReadProperties.class)
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Main.class, args);
        ReadProperties properties = run.getBean(ReadProperties.class);
        log.error(properties.getA1());
        log.error(properties.getA2());
        log.error(properties.getA3());
        log.error(properties.getA4());
        log.error(properties.getA5());
        log.error(properties.getA6());
        log.error(properties.getA7());
        log.error(properties.getA8());
        log.error(properties.getA9());
    }
}