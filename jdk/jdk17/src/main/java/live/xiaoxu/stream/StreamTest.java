package live.xiaoxu.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {

        List<People> peopleList = List.of(new People("Bob", 19, "male"), new People("Tom", 20, "male"), new People("Anna", 19, "female"));
        // 按性别分组后取年龄最大
        Map<String, People> collect = peopleList.stream().collect(Collectors.toMap(People::name, Function.identity(), (c1, c2) -> c1.age > c2.age ? c2 : c1));
        Map<String, Integer> collect2 = peopleList.stream().collect(Collectors.toMap(People::name, People::age, (c1, c2) -> c1 > c2 ? c2 : c1));
    }

    public record People(String name, Integer age, String gender) {
    }
}