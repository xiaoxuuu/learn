package live.xiaoxu.learn.data.structure.binary.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Xiao Xu
 * @date 2021/9/28 下午 02:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BinaryTree {

    private BinaryTreeNode root;

    /**
     * 清空树
     */
    public void clear() {

        BinaryTreeUtil.clear(root);
    }

    /**
     * 判断二叉树是否为空
     */
    public boolean isEmpty() {

        return root == null;
    }

    /**
     * 获取二叉树的高度
     */
    public int height() {

        return BinaryTreeUtil.height(root);
    }

    /**
     * 获取二叉树的节点数
     */
    public int size() {

        return BinaryTreeUtil.size(root);
    }

    /**
     * 查找 node 节点在二叉树中的父节点
     */
    public BinaryTreeNode getParent(BinaryTreeNode node) {

        return (root == null || root == node) ? null : BinaryTreeUtil.getParent(root, node);
    }
}