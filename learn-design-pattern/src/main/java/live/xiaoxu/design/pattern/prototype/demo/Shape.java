package live.xiaoxu.design.pattern.prototype.demo;

/**
 * @author Xiao Xu
 * @date 2021/9/22 下午 05:26
 */
public abstract class Shape implements Cloneable {

    protected String type;
    private String id;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {

        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}