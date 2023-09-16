package live.xiaoxu;

import live.xiaoxu.service.DoSomethingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.SpringVersion;

@SpringBootApplication(scanBasePackages = "live.xiaoxu")
public class Spring5AopApplication {

    public static void main(String[] args) {
        System.err.println(SpringVersion.getVersion());
        ConfigurableApplicationContext run = SpringApplication.run(Spring5AopApplication.class, args);
        DoSomethingService doSomethingService = run.getBean(DoSomethingService.class);
        System.err.println(doSomethingService.doSomething());
    }
}