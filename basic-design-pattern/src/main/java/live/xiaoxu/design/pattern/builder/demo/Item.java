package live.xiaoxu.design.pattern.builder.demo;

/**
 * @author Xiao Xu
 * @date 2021/9/22 下午 03:30
 */
public interface Item {

    String name();

    Packing packing();

    float price();
}