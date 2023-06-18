package live.xiaoxu.leetcode;

import live.xiaoxu.leetcode.bean.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * <p><a href="https://leetcode.cn/problems/delete-nodes-and-return-forest/">1110. 删点成林</a></p>
 *
 * @author 小徐
 * @since 2023/5/30 10:08
 */
public class No001110 {

    private LinkedList<TreeNode> treeList;
    private boolean[] delArray;

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        delArray = new boolean[1001];
        for (int i : to_delete) {
            delArray[i] = true;
        }
        treeList = new LinkedList<>();
        treeList.add(root);
        List<TreeNode> retlist = new LinkedList<>();
        while (treeList.size() != 0) {
            TreeNode treeNode = treeList.poll();
            TreeNode tree = cleanTree(treeNode);
            if (tree != null) {
                retlist.add(tree);
            }
        }
        return retlist;
    }

    /**
     * 返回是否将本节点设置为 null
     *
     * @param treeNode 节点
     * @return 修剪后的树
     */
    private TreeNode cleanTree(TreeNode treeNode) {

        if (treeNode == null) {
            return null;
        }
        treeNode.left = cleanTree(treeNode.left);
        treeNode.right = cleanTree(treeNode.right);
        if (delArray[treeNode.val]) {
            treeList.add(treeNode.left);
            treeNode.left = null;
            treeList.add(treeNode.right);
            treeNode.right = null;
            return null;
        }
        return treeNode;
    }
}