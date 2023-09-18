package live.xiaoxu.access.child;

public class AccessTest {

    public static void main(String[] args) {
        AccessBean accessBean = new AccessBean();
        System.out.println(accessBean.integerPublic);
        System.out.println(accessBean.integerProtected);
        System.out.println(accessBean.integerDefault);
        // 无法访问：
//        System.out.println(accessBean.integerPrivate);
    }
}