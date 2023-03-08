package live.xiaoxu.design.pattern.observer;

import live.xiaoxu.design.pattern.observer.demo.BinaryObserver;
import live.xiaoxu.design.pattern.observer.demo.HexaObserver;
import live.xiaoxu.design.pattern.observer.demo.OctalObserver;
import live.xiaoxu.design.pattern.observer.demo.Subject;

/**
 * @author Xiao Xu
 * @date 2021/9/23 下午 02:51
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {

        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}