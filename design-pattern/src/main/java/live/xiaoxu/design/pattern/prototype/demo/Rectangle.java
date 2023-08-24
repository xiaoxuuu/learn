package live.xiaoxu.design.pattern.prototype.demo;

/**
 * @author Xiao Xu
 * @date 2021/9/22 下午 05:26
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}