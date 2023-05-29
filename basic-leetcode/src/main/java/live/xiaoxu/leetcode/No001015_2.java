package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/smallest-integer-divisible-by-k/">1015. 可被 K 整除的最小整数</a></p>
 * <p>解此题需了解：</p>
 * <p>1. BFS(广度优先搜索)</p>
 * <p>2. 2 或 5 的倍数永远不以 0 结尾</p>
 *
 * @author 小徐
 * @since 2023/5/10 10:00
 */
public class No001015_2 {

    public int smallestRepunitDivByK(int k) {

        // 若 k 能被 2 或 5 整除，则无解，返回 -1
        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }

        int last = 1 % k, len = 1;
        while (last != 0) {
            // 将除数的结果尾部拼上 1 继续进行计算
            last = (last * 10 + 1) % k;
            len++;
        }
        return len;
    }
}