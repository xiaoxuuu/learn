package live.xiaoxu.config;

import org.apache.commons.lang3.concurrent.BasicThreadFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * <p>定时任务配置</p>
 *
 * @author 小徐
 * @since 2023/7/10 11:15
 */
@Configuration
public class ScheduleConfig implements SchedulingConfigurer {

    /**
     * 当前机器的CPU核心数
     */
    private static final int AVAILABLE_PROCESSORS = Runtime.getRuntime().availableProcessors();

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler(scheduledExecutorService());
    }

    /**
     * 执行周期性或定时任务线程池
     */
    @Bean(name = "scheduledExecutorService")
    protected ScheduledExecutorService scheduledExecutorService() {

        return new ScheduledThreadPoolExecutor(AVAILABLE_PROCESSORS,
                new BasicThreadFactory.Builder().namingPattern("schedule-pool-%d").daemon(true).build(),
                new ThreadPoolExecutor.CallerRunsPolicy()) {
            @Override
            protected void afterExecute(Runnable r, Throwable t) {
                super.afterExecute(r, t);
            }
        };
    }
}
