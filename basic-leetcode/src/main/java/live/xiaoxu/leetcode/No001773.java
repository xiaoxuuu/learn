package live.xiaoxu.leetcode;

import java.util.List;

/**
 * <p><a href="https://leetcode.cn/problems/count-items-matching-a-rule/">1773. 统计匹配检索规则的物品数量</a></p>
 *
 * @author 小徐
 * @since 2023/2/8 10:58
 */
public class No001773 {

    public static void main(String[] args) {

        System.out.println(new No001773().countMatches(List.of(List.of("phone", "blue", "pixel"), List.of("computer", "silver", "lenovo"), List.of("phone", "gold", "iphone")), "color", "silver"));
        System.out.println(new No001773().countMatches(List.of(List.of("phone", "blue", "pixel"), List.of("computer", "silver", "phone"), List.of("phone", "gold", "iphone")), "type", "phone"));
    }

    /**
     * 通常解法
     *
     * @param items     数据
     * @param ruleKey   索引 key
     * @param ruleValue 索引值
     * @return 结果
     */
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int index = "type".equals(ruleKey) ? 0 : ("color".equals(ruleKey) ? 1 : 2);
        return (int) items.stream().filter(k -> k.get(index).equals(ruleValue)).count();
    }
}