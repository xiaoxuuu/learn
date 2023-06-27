package live.xiaoxu.design.pattern.builder.demo;

/**
 * @author Xiao Xu
 * @date 2021/9/22 下午 03:35
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}