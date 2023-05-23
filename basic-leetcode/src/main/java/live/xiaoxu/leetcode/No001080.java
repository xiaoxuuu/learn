package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/insufficient-nodes-in-root-to-leaf-paths/">1080. 根到叶路径上的不足节点</a></p>
 *
 * @author 小徐
 * @since 2023/5/22 14:35
 */
public class No001080 {

    private static boolean remove(TreeNode node, TreeNode nodeParent, int pathCount, int limit) {

        boolean finalNode = true;
        if (node.left != null) {
            finalNode = remove(node.left, node, pathCount + node.val, limit);
        }
        if (node.right != null) {
            finalNode = remove(node.right, node, pathCount + node.val, limit);
        }

        if (finalNode && nodeParent != null && pathCount + node.val < limit) {
            if (nodeParent.left == node) {
                nodeParent.left = null;
                return true;
            }
            if (nodeParent.right == node) {
                nodeParent.right = null;
                return true;
            }
            return false;
        }
        return false;
    }

    public TreeNode sufficientSubset(TreeNode root, int limit) {
        remove(root, null, 0, limit);
        return root;
    }

    static class TreeNode {

        int val;

        TreeNode parent;

        TreeNode left;

        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(TreeNode parent) {
            this.val = -Integer.MAX_VALUE;
            this.parent = parent;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}