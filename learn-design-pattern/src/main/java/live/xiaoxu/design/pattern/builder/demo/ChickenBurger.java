package live.xiaoxu.design.pattern.builder.demo;

/**
 * @author Xiao Xu
 * @date 2021/9/22 下午 03:35
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}