package live.xiaoxu.jdk.optional;

import java.util.Optional;

public class OptionalLearn {

    public static void main(String[] args) {

        build("1");
    }

    private static void build(Object obj) {

        // 确定对象不为 null
        Optional<Object> of = Optional.of(obj);
        // 创建一个空 Optional 处理器
        Optional<Object> empty = Optional.empty();
        // 不确定对象是否为空
        Optional<Object> obj1 = Optional.ofNullable(obj);

        // 获取被包装数据
        Object o = of.get();

        // 如果不为 null 返回 true
        boolean present = of.isPresent();
        // 如果为 null 返回 true
        boolean empty1 = of.isEmpty();

        // 如果不为 null，调用方法
        of.ifPresent(System.out::println);
        // 如果不为 null，调用方法，否则执行另一方法
        of.ifPresentOrElse(System.out::println, () -> System.out.println("null"));

        // 满足 filter 则返回被包装数据，否则返回 Optional.empty()
        Optional<Object> o1 = of.filter(k -> "1".equals(k.toString()));
        Optional<Object> o2 = of.filter(k -> "2".equals(k.toString()));

        // 对数据进行转换
        Optional<Integer> o3 = of.map(k -> Integer.parseInt(k.toString()));

        // 如果为 null 则返回另一数据
        Object o4 = of.orElse("2");

        // 如果为 null 则调用方法
        Object o5 = of.orElseGet(() -> "2");

        // 如果为 null 则抛出异常
        Object aNull = of.orElseThrow(() -> new RuntimeException("null"));
    }
}