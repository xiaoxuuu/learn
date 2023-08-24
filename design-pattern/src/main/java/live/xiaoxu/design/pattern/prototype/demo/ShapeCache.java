package live.xiaoxu.design.pattern.prototype.demo;

import java.util.Hashtable;

/**
 * @author Xiao Xu
 * @date 2021/9/22 下午 05:26
 */
public class ShapeCache {

    private static final Hashtable<String, Shape> SHAPE_MAP = new Hashtable<>();

    public static Shape getShape(String shapeId) {

        Shape cachedShape = SHAPE_MAP.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {

        Circle circle = new Circle();
        circle.setId("1");
        SHAPE_MAP.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        SHAPE_MAP.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        SHAPE_MAP.put(rectangle.getId(), rectangle);
    }
}