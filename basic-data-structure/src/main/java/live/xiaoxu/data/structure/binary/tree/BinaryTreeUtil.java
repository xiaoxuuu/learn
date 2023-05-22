package live.xiaoxu.data.structure.binary.tree;

import java.util.Scanner;

/**
 * @author Xiao Xu
 * @date 2021/9/28 下午 02:40
 */
public class BinaryTreeUtil {

    /**
     * <p>清除某个子树的所有节点</p>
     * <p>二叉树的清空：</p>
     * <p>首先提供一个清空以某个节点为根节点的子树的方法，既递归地删除每个节点；</p>
     * <p>接着提供一个删除树的方法，直接通过第一种方法删除到根节点即可</p>
     */
    public static void clear(BinaryTreeNode node) {

        if (node != null) {
            clear(node.getLeftChild());
            clear(node.getRightChild());
            // 删除节点
            node = null;
        }
    }

    /**
     * <p>获取以某节点为子树的高度</p>
     * <p>求二叉树的高度：</p>
     * <p>首先要一种获取以某个节点为子树的高度的方法，使用递归调用。</p>
     * <p>如果一个节点为空，那么这个节点肯定是一颗空树，高度为 0；</p>
     * <p>如果不为空，那么我们要遍历地比较它的左子树高度和右子树高度，高的一个为这个子树的最大高度，然后加上自己本身的高度就是了</p>
     * <p>获取二叉树的高度，只需要调用第一种方法，即传入根节点</p>
     */
    public static int height(BinaryTreeNode node) {

        if (node == null) {
            // 递归结束，空子树高度为 0
            return 0;
        } else {
            // 递归获取左子树高度
            int l = height(node.getLeftChild());
            // 递归获取右子树高度
            int r = height(node.getRightChild());
            // 高度应该算更高的一边，（+1 是因为要算上自身这一层）
            return l > r ? (l + 1) : (r + 1);
        }
    }

    /**
     * <p>求二叉树的节点数：</p>
     * <p>求节点数时，我们看看获取某个节点为子树的节点数的实现。</p>
     * <p>首先节点为空，则个数肯定为 0；</p>
     * <p>如果不为空，那就算上这个节点之后继续递归所有左右子树的子节点数，</p>
     * <p>全部相加就是以所给节点为根的子树的节点数</p>
     * <p>如果求二叉树的节点数，则输入根节点即可</p>
     */
    public static int size(BinaryTreeNode node) {

        if (node == null) {
            // 如果节点为空，则返回节点数为 0
            return 0;
        } else {
            // 计算本节点 所以要 +1
            // 递归获取左子树节点数和右子树节点数，最终相加
            return 1 + size(node.getLeftChild()) + size(node.getRightChild());
        }
    }

    /**
     * <p>node 节点在 subTree 子树中的父节点</p>
     */
    public static BinaryTreeNode getParent(BinaryTreeNode subTree, BinaryTreeNode node) {

        if (subTree == null) {
            // 如果是空子树，则没有父节点
            return null;
        }
        if (subTree.getLeftChild() == node || subTree.getRightChild() == node) {
            // 如果子树的根节点的左右孩子之一是待查节点，则返回子树的根节点
            return subTree;
        }
        BinaryTreeNode parent;
        if (getParent(subTree.getLeftChild(), node) != null) {
            parent = getParent(subTree.getLeftChild(), node);
            return parent;
        } else {
            // 递归左右子树
            return getParent(subTree.getRightChild(), node);
        }
    }

    /**
     * <p>先根遍历(PreOrder):</p>
     * <p>若二叉树为空，则退出，否则进行下面操作</p>
     * <p>1. 访问根节点</p>
     * <p>2. 先根遍历左子树</p>
     * <p>3. 先根遍历右子树</p>
     * <p>4. 退出</p>
     */
    public static void preOrder(BinaryTreeNode node) {

        if (node != null) {
            // 先访问根节点
            System.out.println(node.getData());
            // 先根遍历左子树
            preOrder(node.getLeftChild());
            // 先根遍历右子树
            preOrder(node.getRightChild());
        }
    }

    /**
     * <p>中根遍历(InOrder):</p>
     * <p>若二叉树为空，则退出，否则进行下面操作</p>
     * <p>1. 中根遍历左子树</p>
     * <p>2. 访问根节点</p>
     * <p>3. 中根遍历右子树</p>
     * <p>4. 退出</p>
     */
    public static void inOrder(BinaryTreeNode node) {

        if (node != null) {
            // 中根遍历左子树
            inOrder(node.getLeftChild());
            // 访问根节点
            System.out.println(node);
            // 中根遍历右子树
            inOrder(node.getRightChild());
        }
    }

    /**
     * <p>后根遍历(PostOrder):</p>
     * <p>若二叉树为空，则退出，否则进行下面操作</p>
     * <p>1. 后根遍历左子树</p>
     * <p>2. 后根遍历右子树</p>
     * <p>3. 访问根节点</p>
     * <p>4. 退出</p>
     */
    public static void postOrder(BinaryTreeNode node) {

        if (node != null) {
            // 后根遍历左子树
            postOrder(node.getLeftChild());
            // 后根遍历右子树
            postOrder(node.getRightChild());
            // 访问根节点
            System.out.println(node);
        }
    }

    /**
     * <p>根据前序遍历结果反向生成二叉树</p>
     * <p>无子节点使用 # 占位</p>
     * <p>例子：AB#D##C##</p>
     */
    public static void createTreeByPreOrder(BinaryTreeNode node) {

        String s = new Scanner(System.in).nextLine();
        node.setData(s);
        if ("#".equals(s)) {
            return;
        }

        node.setLeftChild(new BinaryTreeNode());

        createTreeByPreOrder(node.getLeftChild());

        if ("#".equals(node.getLeftChild().getData())) {
            node.setLeftChild(null);
        }

        node.setRightChild(new BinaryTreeNode());

        createTreeByPreOrder(node.getRightChild());

        if ("#".equals(node.getRightChild().getData())) {
            node.setRightChild(null);
        }
    }

    public static void main(String[] args) {

        BinaryTreeNode binaryTreeNode = new BinaryTreeNode();
        createTreeByPreOrder(binaryTreeNode);
        preOrder(binaryTreeNode);
    }
}