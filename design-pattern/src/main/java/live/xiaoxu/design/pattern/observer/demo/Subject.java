package live.xiaoxu.design.pattern.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiao Xu
 * @date 2021/9/23 下午 02:50
 */
public class Subject {

    private final List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}