package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/average-value-of-even-numbers-that-are-divisible-by-three/">2455. 可被三整除的偶数的平均值</a></p>
 *
 * @author 小徐
 * @since 2023/5/19 10:07
 */
public class No002455 {

    private static boolean div(int i) {

        int k = 0;
        while (i != 0) {
            k += i % 10;
            i = i / 10;
        }
        return k % 3 == 0;
    }

    public int averageValue(int[] nums) {

        // 总数、和
        int total = 0, sum = 0;
        for (int num : nums) {
            if (num % 2 != 0) {
                continue;
            }
            if (div(num)) {
                sum += num;
                total++;
            }
        }
        if (total == 0) {
            return 0;
        }
        return sum / total;
    }
}