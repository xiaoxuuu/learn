package live.xiaoxu.jdk.lock.saleTicket;

import java.util.concurrent.locks.ReentrantLock;

public class Window implements Runnable {

    private int tickets = 100;

    private ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {

        lock.lock();
        try {
            while (tickets > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "售票 1 张，余票：" + tickets + "张");
                tickets--;
            }
        } finally {
            lock.unlock();
        }
    }
}