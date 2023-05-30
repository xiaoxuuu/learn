package live.xiaoxu.leetcode;

import live.xiaoxu.leetcode.bean.TreeNode;
import live.xiaoxu.leetcode.util.TreeUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * 此题验证存在问题，请依据实际题目进行判定
 */
class No001110Test {

    @Test
    void delNodes() {

        No001110 n1110 = new No001110();

        // [[3, null, 4]]
        List<TreeNode> treeNode004 = n1110.delNodes(TreeUtil.toNode(new Integer[]{1, 2, 3, null, null, null, 4}), new int[]{2, 1});
        // [[1, 2, 4]]
        List<TreeNode> treeNode2 = n1110.delNodes(TreeUtil.toNode(new Integer[]{1, 2, 4, null, 3}), new int[]{3});
        // [[1, 2, null, 4], [6], [7]]
        List<TreeNode> treeNode000 = n1110.delNodes(TreeUtil.toNode(new Integer[]{1, 2, 3, 4, 5, 6, 7}), new int[]{3, 5});
    }
}