package live.xiaoxu.leetcode;

import live.xiaoxu.leetcode.bean.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <p><a href="https://leetcode.cn/problems/delete-nodes-and-return-forest/">1110. 删点成林</a></p>
 *
 * @author 小徐
 * @since 2023/5/30 10:08
 */
public class No001110 {

    /**
     * 返回是否将本节点设置为 null
     *
     * @param treeNode 节点
     * @param treeList 待操作树集合
     * @param delSet   待删除节点
     * @return 修剪后的树
     */
    private static TreeNode cleanTree(TreeNode treeNode, LinkedList<TreeNode> treeList, Set<Integer> delSet) {

        if (treeNode == null) {
            return null;
        }
        treeNode.left = cleanTree(treeNode.left, treeList, delSet);
        treeNode.right = cleanTree(treeNode.right, treeList, delSet);
        if (delSet.contains(treeNode.val)) {
            treeList.add(treeNode.left);
            treeNode.left = null;
            treeList.add(treeNode.right);
            treeNode.right = null;
            return null;
        }
        return treeNode;
    }

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        Set<Integer> delSet = Arrays.stream(to_delete).boxed().collect(Collectors.toSet());
        LinkedList<TreeNode> treeList = new LinkedList<>();
        treeList.add(root);
        List<TreeNode> retlist = new LinkedList<>();
        while (treeList.size() != 0) {
            TreeNode treeNode = treeList.poll();
            TreeNode tree = cleanTree(treeNode, treeList, delSet);
            if (tree != null) {
                retlist.add(tree);
            }
        }
        return retlist;
    }
}