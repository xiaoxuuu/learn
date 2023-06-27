package live.xiaoxu.leetcode.util;

import live.xiaoxu.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class TreeUtil {

    public static TreeNode toNode(Integer[] array) {

        int index = 0;
        TreeNode treeNode = new TreeNode(array[index]);
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(treeNode);
        while (index < array.length) {

            TreeNode node = linkedList.poll();
            if (array[index] != null) {
                node.val = array[index];
            }
            int leftIndex = (index + 1) * 2 - 1;
            if (leftIndex < array.length) {
                if (node != null) {
                    node.left = array[leftIndex] == null ? null : new TreeNode(array[leftIndex]);
                    linkedList.add(node.left);
                } else {
                    linkedList.add(null);
                }
            }
            int rightIndex = leftIndex + 1;
            if (rightIndex < array.length) {
                if (node != null) {
                    node.right = array[rightIndex] == null ? null : new TreeNode(array[rightIndex]);
                    linkedList.add(node.right);
                } else {
                    linkedList.add(null);
                }
            }
            index++;
        }
        return treeNode;
    }

    /**
     * 删除叶子节点空数据
     *
     * @param treeNode 待删除数据
     */
    public static boolean cleanEmptyNode(TreeNode treeNode) {

        if (treeNode == null) {
            return false;
        }
        if (treeNode.left == null && treeNode.right == null) {
            return true;
        }
        boolean left = cleanEmptyNode(treeNode.left);
        boolean right = cleanEmptyNode(treeNode.right);
        if (left && right) {
            treeNode.left = null;
            treeNode.right = null;
        }
        return false;
    }

    public static Integer[] toArray(TreeNode treeNode) {

        List<TreeNode> list = toList(treeNode);
        List<Integer> integerList = new ArrayList<>();
        for (TreeNode node : list) {
            if (node == null) {
                integerList.add(null);
            } else {
                integerList.add(node.val);
            }
        }
        List<Integer> integerListRemoveNull = removeTail(integerList, null);

        return integerListRemoveNull.toArray(new Integer[]{});
    }

    public static <T> List<T> removeTail(List<T> list, T t) {

        int i = list.size() - 1;
        while (i >= 0 && Objects.isNull(t) ? Objects.isNull(list.get(i)) : (Objects.equals(t, list.get(i)))) {
            i--;
        }
        List<T> newList = new ArrayList<>(i + 1);
        for (int j = 0; j <= i; j++) {
            newList.add(list.get(j));
        }
        return newList;
    }

    public static List<TreeNode> toList(TreeNode treeNode) {

        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(treeNode);
        return toList(list);
    }

    /**
     * 将树从跟节点逐层加入队列，不存在的节点用 null 代替
     *
     * @param treeNodeList 根节点
     * @return 铺平后的集合
     */
    public static List<TreeNode> toList(LinkedList<TreeNode> treeNodeList) {

        LinkedList<TreeNode> list = new LinkedList<>();
        if (treeNodeList == null || treeNodeList.size() == 0) {
            return list;
        }

        LinkedList<TreeNode> nextLevelList = new LinkedList<>();
        boolean noData = true;
        for (TreeNode treeNode : treeNodeList) {
            list.add(treeNode);
            if (treeNode == null) {
                nextLevelList.add(null);
                nextLevelList.add(null);
            } else {
                nextLevelList.add(treeNode.left);
                nextLevelList.add(treeNode.right);
                if (treeNode.left != null || treeNode.right != null) {
                    noData = false;
                }
            }
        }

        if (noData) {
            return list;
        }

        list.addAll(toList(nextLevelList));
        return list;
    }
}
