package live.xiaoxu.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSort {

    public static void main(String[] args) {
        // 定制排序
        Comparator<User> comparator = new Comparator<>() {
            @Override
            public int compare(User o1, User o2) {
                System.out.println("Comparator: " + o1.age + "-" + o2.age + "=" + (o1.age - o2.age));
                return o1.age - o2.age;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };
        // 自然排序
        Set<User> treeSet = new TreeSet<>(comparator);
        treeSet.add(new User("Test", 17));
        treeSet.add(new User("Tom", 18));
        treeSet.add(new User("Anna", 19));
        treeSet.add(new User("Bob", 17));
        System.out.println(treeSet.size());
    }

    public record User(String name, Integer age) implements Comparable<User> {
        @Override
        public int compareTo(User user) {
            return user.age - age;
        }
    }
}