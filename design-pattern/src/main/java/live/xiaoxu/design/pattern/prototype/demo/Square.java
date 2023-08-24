package live.xiaoxu.design.pattern.prototype.demo;

/**
 * @author Xiao Xu
 * @date 2021/9/22 下午 05:26
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}