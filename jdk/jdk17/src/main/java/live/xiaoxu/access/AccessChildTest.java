package live.xiaoxu.access;

import live.xiaoxu.access.child.AccessBean;

public class AccessChildTest extends AccessBean {

    public static void main(String[] args) {
        AccessBean accessBean = new AccessBean();
        System.out.println(accessBean.integerPublic);
        // 无法访问：
//        System.out.println(accessBean.integerProtected);
//        System.out.println(accessBean.integerDefault);
//        System.out.println(accessBean.integerPrivate);
    }
}