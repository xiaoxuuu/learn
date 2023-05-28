package live.xiaoxu.leetcode;

import java.util.LinkedList;

/**
 * <p><a href="https://leetcode.cn/problems/find-the-kth-smallest-sum-of-a-matrix-with-sorted-rows/">1439. 有序矩阵中的第 k 个最小数组和</a></p>
 *
 * @author 小徐
 * @since 2023/5/28 13:26
 */
public class No001439 {

    public int kthSmallest(int[][] mat, int k) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(Integer.MAX_VALUE);
        add(mat, list, 0, 0, k);
        return list.get(k - 1);
    }

    private static void add(int[][] mat, LinkedList<Integer> list, int index, int sum, int k) {

        if (index < mat.length) {
            for (int i = 0; i < mat[index].length; i++) {

                int count = sum + mat[index][i];
                if (count < list.getLast()) {
                    add(mat, list, index + 1, count, k);
                }
            }
        }
        if (index == mat.length) {
            push(list, sum, k);
        }
    }

    private static void push(LinkedList<Integer> list, int sum, int k) {

        // 从末尾往前数，将数据插入，保证队列数据递增
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i == 0) {
                if (list.get(0) > sum) {
                    list.add(i, sum);
                } else {
                    list.add(i + 1, sum);
                }
                break;
            }
            if (list.get(i) < sum) {
                list.add(i + 1, sum);
                break;
            }
        }
        if (list.size() > k) {
            list.removeLast();
        }
    }
}