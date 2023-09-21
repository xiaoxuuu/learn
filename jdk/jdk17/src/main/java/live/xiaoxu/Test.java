package live.xiaoxu;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        Set<Integer> collect = List.of(1, 2).stream().collect(Collectors.toSet());
        collect.add(3);
        System.out.println(collect.size());
    }
}