package live.xiaoxu.leetcode;

import live.xiaoxu.leetcode.bean.TreeNode;
import live.xiaoxu.leetcode.util.TreeUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 此题验证存在问题，请依据实际题目进行判定
 */
class No0010802Test {

    @Test
    void sufficientSubset() {

        TreeNode node12 = TreeUtil.toNode(new Integer[]{5, 4, 8, 11, null, 17, 4, 7, 1, null, null, 5, 3});
        TreeNode node1 = TreeUtil.toNode(new Integer[]{1, 2, 3, 4, -99});
        TreeNode node11 = TreeUtil.toNode(new Integer[]{1, 2, 3});
        TreeNode node = TreeUtil.toNode(new Integer[]{1, -99});
        TreeNode node2 = TreeUtil.toNode(new Integer[]{1, 2, 3, 4, -99, -99, 7, 8, 9, -99, -99, 12, 13, -99, 14});
        No001080_2 n1080 = new No001080_2();

        Integer[] input4 = {10, 5, 10};
        Integer[] result4 = {};
        Assertions.assertArrayEquals(result4, TreeUtil.toArray(n1080.sufficientSubset(TreeUtil.toNode(input4), 21)));

        Integer[] input3 = {1, 2, -3, -5, null, 4, null};
        Integer[] result3 = {1, null, -3, 4};
        Assertions.assertArrayEquals(result3, TreeUtil.toArray(n1080.sufficientSubset(TreeUtil.toNode(input3), -1)));

        Integer[] input2 = {5, 4, 8, 11, null, 17, 4, 7, 1, null, null, 5, 3};
        Integer[] result2 = {5, 4, 8, 11, null, 17, 4, 7, null, null, null, 5};
        Assertions.assertArrayEquals(result2, TreeUtil.toArray(n1080.sufficientSubset(TreeUtil.toNode(input2), 22)));

        Integer[] input1 = {1, 2, 3, 4, -99, -99, 7, 8, 9, -99, -99, 12, 13, -99, 14};
        Integer[] result1 = {1, 2, 3, 4, null, null, 7, 8, 9, null, 14};
        Assertions.assertArrayEquals(result1, TreeUtil.toArray(n1080.sufficientSubset(TreeUtil.toNode(input1), 1)));

        Integer[] input0 = {1, -99};
        Integer[] result0 = {1};
        Assertions.assertArrayEquals(result0, TreeUtil.toArray(n1080.sufficientSubset(TreeUtil.toNode(input0), 1)));
    }
}