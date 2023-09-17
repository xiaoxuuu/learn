package live.xiaoxu;

import cn.hutool.core.bean.BeanUtil;
import com.alibaba.fastjson2.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.BeanUtils;

import java.io.*;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class CloneTest {

    @SneakyThrows
    public static void main(String[] args) {

        int forNum = 100000;
        User user = newUser();

        // new
        long newStart = System.currentTimeMillis();
        List<User> newUserList = new LinkedList<>();
        for (int i = 0; i < forNum; i++) {
            newUserList.add(newUser());
        }
        long newEnd = System.currentTimeMillis();

        // clone
        long cloneStart = System.currentTimeMillis();
        List<User> cloneUserList = new LinkedList<>();
        for (int i = 0; i < forNum; i++) {
            cloneUserList.add(user.clone());
        }
        long cloneEnd = System.currentTimeMillis();

        // stream
        long streamStart = System.currentTimeMillis();
        List<User> streamUserList = new LinkedList<>();
        for (int i = 0; i < forNum; i++) {
            streamUserList.add(copyImplSerializable(user));
        }
        long streamEnd = System.currentTimeMillis();

        // json
        long jsonStart = System.currentTimeMillis();
        List<User> jsonList = new LinkedList<>();
        for (int i = 0; i < forNum; i++) {
            jsonList.add(JSONObject.parseObject(JSONObject.toJSONString(user), User.class));
        }
        long jsonEnd = System.currentTimeMillis();

        // beanCopyHuTool
        long beanCopyHuToolStart = System.currentTimeMillis();
        List<User> beanCopyHuToolList = new LinkedList<>();
        for (int i = 0; i < forNum; i++) {
            User user1 = new User();
            BeanUtil.copyProperties(user, user1);
            beanCopyHuToolList.add(user1);
        }
        long beanCopyHuToolEnd = System.currentTimeMillis();

        // beanCopySpring
        long beanCopySpringStart = System.currentTimeMillis();
        List<User> beanCopySpringList = new LinkedList<>();
        for (int i = 0; i < forNum; i++) {
            User user1 = new User();
            BeanUtils.copyProperties(user, user1);
            beanCopySpringList.add(user1);
        }
        long beanCopySpringEnd = System.currentTimeMillis();

        // beanCopyApache
        long beanCopyApacheStart = System.currentTimeMillis();
        List<User> beanCopyApacheList = new LinkedList<>();
        for (int i = 0; i < forNum; i++) {
            User user1 = new User();
            org.apache.commons.beanutils.BeanUtils.copyProperties(user, user1);
            beanCopyApacheList.add(user1);
        }
        long beanCopyApacheEnd = System.currentTimeMillis();

        System.out.println("new   :" + (newEnd - newStart));
        System.out.println("clone :" + (cloneEnd - cloneStart));
        System.out.println("stream:" + (streamEnd - streamStart));
        System.out.println("json  :" + (jsonEnd - jsonStart));
        System.out.println("HuTool:" + (beanCopyHuToolEnd - beanCopyHuToolStart));
        System.out.println("Spring:" + (beanCopySpringEnd - beanCopySpringStart));
        System.out.println("Apache:" + (beanCopyApacheEnd - beanCopyApacheStart));
    }

    /**
     * 深层拷贝 - 需要类继承序列化接口
     *
     * @param <T> 对象类型
     * @param obj 原对象
     * @return 深度拷贝的对象
     * @throws Exception
     * @see java.io.Closeable
     * @see AutoCloseable 不用进行关闭
     */
    @SuppressWarnings("unchecked")
    public static <T> T copyImplSerializable(T obj) throws Exception {
        ByteArrayOutputStream baos;
        ObjectOutputStream oos;

        ByteArrayInputStream bais;
        ObjectInputStream ois;

        Object o;
        // 如果子类没有继承该接口，这一步会报错
        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(obj);
            bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);

            o = ois.readObject();
            return (T) o;
        } catch (Exception e) {
            throw new Exception("对象中包含没有继承序列化的对象");
        }
    }

    private static User newUser() {
        User user = new User();
        user.setName("姓名");
        user.setAge(20);
        user.setDesc("梦游天姥吟留别 / 别东鲁诸公【作者】李白 海客谈瀛洲，烟涛微茫信难求，越人语天姥，云霞明灭或可睹。天姥连天向天横，势拔五岳掩赤城。天台四万八千丈，对此欲倒东南倾。我欲因之梦吴越，一夜飞度镜湖月。湖月照我影，送我至剡溪。谢公宿处今尚在，渌水荡漾清猿啼。脚著谢公屐，身登青云梯。半壁见海日，空中闻天鸡。千岩万转路不定，迷花倚石忽已暝。熊咆龙吟殷岩泉，栗深林兮惊层巅。云青青兮欲雨，水澹澹兮生烟。列缺霹雳，丘峦崩摧。洞天石扉，訇然中开。青冥浩荡不见底，日月照耀金银台。霓为衣兮风为马，云之君兮纷纷而来下。虎鼓瑟兮鸾回车，仙之人兮列如麻。忽魂悸以魄动，恍惊起而长嗟。惟觉时之枕席，失向来之烟霞。世间行乐亦如此，古来万事东流水。别君去兮何时还？且放白鹿青崖间。须行即骑访名山。安能摧眉折腰事权贵，使我不得开心颜！");
        user.setPhone("19900001111");
        user.setBirthday(new Date());
        user.setBoo(false);
        user.setDou(2.00001);
        user.setFlo(2.00002F);
        user.setLon(Long.MIN_VALUE);
        user.setCha('c');
        user.setFather(new User("父亲", 40, "描述", "18899990000", new Date(), List.of("看报", "钓鱼"), null, null, false, 10.111, 2.222F, Long.MIN_VALUE, 'K'));
        user.setMother(new User("母亲", 40, "描述母亲", "17788880000", new Date(), List.of("插花", "刺绣"), null, null, false, 15.111, 9.222F, Long.MIN_VALUE, 'M'));
        return user;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class User implements Cloneable, Serializable {

        private String name;
        private Integer age;
        private String desc;
        private String phone;
        private Date birthday;
        private List<String> hobbyList;
        private User father;
        private User mother;

        private Boolean boo;
        private Double dou;
        private Float flo;
        private Long lon;
        private Character cha;

        @Override
        public User clone() {
            try {
                User clone = (User) super.clone();
                // TODO: 复制此处的可变状态，这样此克隆就不能更改初始克隆的内部项
                if (null != father) {
                    clone.setFather(father.clone());
                }
                if (null != mother) {
                    clone.setMother(mother.clone());
                }
                return clone;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }
}