package live.xiaoxu.design.pattern.observer.demo;

/**
 * @author Xiao Xu
 * @date 2021/9/23 下午 02:51
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {

        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "
                + Integer.toHexString(subject.getState()).toUpperCase());
    }
}