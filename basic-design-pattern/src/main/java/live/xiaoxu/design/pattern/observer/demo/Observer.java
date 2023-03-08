package live.xiaoxu.design.pattern.observer.demo;

/**
 * @author Xiao Xu
 * @date 2021/9/23 下午 02:50
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}