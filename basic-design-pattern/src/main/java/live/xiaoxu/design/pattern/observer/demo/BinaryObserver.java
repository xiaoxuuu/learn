package live.xiaoxu.design.pattern.observer.demo;

/**
 * @author Xiao Xu
 * @date 2021/9/23 下午 02:50
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}