package live.xiaoxu.design.pattern.observer.demo;

/**
 * @author Xiao Xu
 * @date 2021/9/23 下午 02:51
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {

        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}