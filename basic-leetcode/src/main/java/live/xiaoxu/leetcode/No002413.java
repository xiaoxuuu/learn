package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/smallest-even-multiple/">2413. 最小偶倍数</a></p>
 *
 * @author 小徐
 * @since 2023/2/8 10:58
 */
public class No002413 {

    /**
     * 通常解法
     *
     * @param n 数据
     * @return 结果
     */
    public int smallestEvenMultiple(int n) {

        return n % 2 == 0 ? n : n * 2;
    }
}