package live.xiaoxu;

import com.alibaba.fastjson2.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class TransientTest {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class User {

        String name;
        transient Integer age = 2;

        @Override
        public String toString() {
            return "name='" + name + '\'' + ", age=" + age;
        }
    }

    public static void main(String[] args) {

        User user = new User("Tom", 1);
        // name='Tom', age=1
        System.out.println(user);
        String jsonString = JSONObject.toJSONString(user);
        // {"name":"Tom"}，age 未被反序列化
        System.out.println(jsonString);
        User user1 = JSONObject.parseObject(jsonString, User.class);
        // name='Tom', age=2
        System.out.println(user1);
    }
}