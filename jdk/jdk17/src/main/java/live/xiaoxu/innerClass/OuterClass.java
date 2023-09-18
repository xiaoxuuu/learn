package live.xiaoxu.innerClass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class OuterClass {

    public final User user = new User("name", 10);

    class InnerClass {
        public void send() {
            System.out.println(user.name);
        }
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class User {
        String name;
        Integer age;
    }
}