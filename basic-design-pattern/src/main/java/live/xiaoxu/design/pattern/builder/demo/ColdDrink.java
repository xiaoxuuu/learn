package live.xiaoxu.design.pattern.builder.demo;

/**
 * @author Xiao Xu
 * @date 2021/9/22 下午 03:34
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}