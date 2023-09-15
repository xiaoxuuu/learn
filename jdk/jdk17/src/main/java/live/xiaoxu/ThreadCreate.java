package live.xiaoxu;

import lombok.SneakyThrows;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadCreate {

    public static class ThreadTest extends Thread {
        @SneakyThrows
        @Override
        public void run() {
            Thread.sleep(1000);
            System.out.println("Thread 执行：" + this.getName());
        }
    }

    public static class RunnableTest implements Runnable {
        @SneakyThrows
        @Override
        public void run() {
            Thread.sleep(2000);
            System.out.println("Runnable 执行");
        }
    }

    public static class CallableTest implements Callable<String> {
        @Override
        public String call() throws Exception {
            System.out.println("Callable 执行");
            Thread.sleep(3000);
            return "Callable 返回";
        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        new ThreadTest().start();
        System.out.println("Thread");
        new Thread(new RunnableTest()).start();
        System.out.println("Runnable");
        Future<String> future = Executors.newSingleThreadExecutor().submit(new CallableTest());
        System.out.println("Callable");
        System.out.println("End");
        System.out.println(future.get());
        /*
        输出顺序：
        Thread
        Runnable
        Callable
        End
        Callable 执行
        Thread 执行：Thread-0
        Runnable 执行
        Callable 返回
        * */
    }
}