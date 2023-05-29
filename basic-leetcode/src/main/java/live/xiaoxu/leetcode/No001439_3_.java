package live.xiaoxu.leetcode;

import java.util.Arrays;

/**
 * <p><a href="https://leetcode.cn/problems/find-the-kth-smallest-sum-of-a-matrix-with-sorted-rows/">1439. 有序矩阵中的第 k 个最小数组和</a></p>
 *
 * @author 小徐
 * @since 2023/5/28 13:26
 */
public class No001439_3_ {

    public int kthSmallest(int[][] mat, int k) {

        int[] a = {0};
        for (int[] row : mat) {
            int[] b = new int[a.length * row.length];
            int i = 0;
            for (int x : a) {
                for (int y : row) {
                    b[i++] = x + y;
                }
            }
            Arrays.sort(b);
            // 保留最小的 k 个
            if (b.length > k) {
                b = Arrays.copyOfRange(b, 0, k);
            }
            a = b;
        }
        return a[k - 1];
    }
}