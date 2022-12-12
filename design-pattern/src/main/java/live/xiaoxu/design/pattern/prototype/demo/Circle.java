package live.xiaoxu.design.pattern.prototype.demo;

/**
 * @author Xiao Xu
 * @date 2021/9/22 下午 05:26
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}