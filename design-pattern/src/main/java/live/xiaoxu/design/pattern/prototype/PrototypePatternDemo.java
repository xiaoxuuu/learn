package live.xiaoxu.design.pattern.prototype;

import live.xiaoxu.learn.designPattern.prototypePattern.demo.Shape;
import live.xiaoxu.learn.designPattern.prototypePattern.demo.ShapeCache;

/**
 * @author Xiao Xu
 * @date 2021/9/22 下午 05:27
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}