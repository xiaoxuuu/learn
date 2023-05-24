package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

class No001080Test {

    private static No001080.TreeNode toNode(Integer[] array) {

        int index = 0;
        No001080.TreeNode treeNode = new No001080.TreeNode(array[index]);
        LinkedList<No001080.TreeNode> linkedList = new LinkedList<>();
        linkedList.add(treeNode);
        while (index < array.length && linkedList.size() != 0) {

            No001080.TreeNode node = linkedList.poll();
            if (node == null) {
                continue;
            }
            node.val = array[index];
            node.left = new No001080.TreeNode();
            linkedList.add(node.left);
            node.right = new No001080.TreeNode();
            linkedList.add(node.right);
            index++;
        }

        cleanEmptyNode(treeNode);
        return treeNode;
    }

    /**
     * 删除叶子节点空数据
     *
     * @param treeNode 待删除数据
     */
    private static boolean cleanEmptyNode(No001080.TreeNode treeNode) {

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

    private static Integer[] toArray(No001080.TreeNode treeNode) {

        List<No001080.TreeNode> list = toList(treeNode);
        List<Integer> integerList = new ArrayList<>();
        for (No001080.TreeNode node : list) {
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

    private static List<No001080.TreeNode> toList(No001080.TreeNode treeNode) {

        LinkedList<No001080.TreeNode> list = new LinkedList<>();
        list.add(treeNode);
        return toList(list);
    }

    /**
     * 将树从跟节点逐层加入队列，不存在的节点用 null 代替
     *
     * @param treeNodeList 根节点
     * @return 铺平后的集合
     */
    private static List<No001080.TreeNode> toList(LinkedList<No001080.TreeNode> treeNodeList) {

        LinkedList<No001080.TreeNode> list = new LinkedList<>();
        if (treeNodeList == null || treeNodeList.size() == 0) {
            return list;
        }

        LinkedList<No001080.TreeNode> nextLevelList = new LinkedList<>();
        boolean noData = true;
        for (No001080.TreeNode treeNode : treeNodeList) {
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

    @Test
    void sufficientSubset() {

//        No001080.TreeNode node12 = toNode(new Integer[]{5, 4, 8, 11, null, 17, 4, 7, 1, null, null, 5, 3});
//        No001080.TreeNode node1 = toNode(new Integer[]{1, 2, 3, 4, -99});
//        No001080.TreeNode node11 = toNode(new Integer[]{1, 2, 3});
        No001080.TreeNode node = toNode(new Integer[]{1, -99});
//        No001080.TreeNode node2 = toNode(new Integer[]{1, 2, 3, 4, -99, -99, 7, 8, 9, -99, -99, 12, 13, -99, 14});
        No001080 n1080 = new No001080();

        Integer[] input4 = {10, 5, 10};
        Integer[] result4 = {};
        Assertions.assertArrayEquals(result4, toArray(n1080.sufficientSubset(toNode(input4), 21)));

        Integer[] input3 = {1, 2, -3, -5, null, 4, null};
        Integer[] result3 = {1, null, -3, 4};
        Assertions.assertArrayEquals(result3, toArray(n1080.sufficientSubset(toNode(input3), -1)));

        Integer[] input2 = {5, 4, 8, 11, null, 17, 4, 7, 1, null, null, 5, 3};
        Integer[] result2 = {5, 4, 8, 11, null, 17, 4, 7, null, null, null, 5};
        Assertions.assertArrayEquals(result2, toArray(n1080.sufficientSubset(toNode(input2), 22)));

        Integer[] input1 = {1, 2, 3, 4, -99, -99, 7, 8, 9, -99, -99, 12, 13, -99, 14};
        Integer[] result1 = {1, 2, 3, 4, null, null, 7, 8, 9, null, 14};
        Assertions.assertArrayEquals(result1, toArray(n1080.sufficientSubset(toNode(input1), 1)));

        Integer[] input0 = {1, -99};
        Integer[] result0 = {1};
        Assertions.assertArrayEquals(result0, toArray(n1080.sufficientSubset(toNode(input0), 1)));
    }
}