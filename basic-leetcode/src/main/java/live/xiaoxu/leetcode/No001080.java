package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/insufficient-nodes-in-root-to-leaf-paths/">1080. 根到叶路径上的不足节点</a></p>
 *
 * @author 小徐
 * @since 2023/5/22 14:35
 */
public class No001080 {

    /**
     * 递归移除不合格叶子节点，节点数据 null 则视为不合格
     *
     * @param node      根节点
     * @param pathCount 当前路径结果
     * @param limit     合格值，大于此数据视为合格
     * @return 不合格或节点为空 true
     */
    private static boolean remove(TreeNode node, int pathCount, int limit) {

        // 本级和
        int pathCountThis = pathCount + node.val;

        if (node.left == null && node.right == null) {
            return pathCountThis < limit;
        }

        if (node.left != null) {
            if (remove(node.left, pathCountThis, limit)) {
                node.left = null;
            }
        }
        if (node.right != null) {
            if (remove(node.right, pathCountThis, limit)) {
                node.right = null;
            }
        }
        return node.left == null && node.right == null;
    }

    public TreeNode sufficientSubset(TreeNode root, int limit) {
        boolean remove = remove(root, 0, limit);
        return remove ? null : root;
    }

    static class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}