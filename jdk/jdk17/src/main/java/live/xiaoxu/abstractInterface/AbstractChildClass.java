package live.xiaoxu.abstractInterface;

public abstract class AbstractChildClass extends AbstractClass implements InterfaceClass {

    public abstract String childOne();

    @Override
    public String getTwo() {
        return "child2";
    }
}