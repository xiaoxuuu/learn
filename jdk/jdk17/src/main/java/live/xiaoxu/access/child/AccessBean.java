package live.xiaoxu.access.child;

public class AccessBean {

    public Integer integerPublic = 1;
    protected Integer integerProtected = 2;
    Integer integerDefault = 3;
    private Integer integerPrivate = 4;

    public static void main(String[] args) {
        AccessBean accessBean = new AccessBean();
        System.out.println(accessBean.integerPublic);
        System.out.println(accessBean.integerProtected);
        System.out.println(accessBean.integerDefault);
        System.out.println(accessBean.integerPrivate);
    }
}