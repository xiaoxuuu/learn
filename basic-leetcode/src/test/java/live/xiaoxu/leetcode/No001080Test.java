package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

class No001080Test {

    private static No001080.TreeNode toNode(Integer[] array) {

        int index = 0;
        No001080.TreeNode treeNode = new No001080.TreeNode(array[index]);
        LinkedList<No001080.TreeNode> linkedList = new LinkedList<>();
        linkedList.add(treeNode);
        while (index < array.length) {

            No001080.TreeNode node = linkedList.poll();
            if (array[index] != null) {
                node.val = array[index];
            }
            int leftIndex = (index + 1) * 2 - 1;
            if (leftIndex < array.length) {
                if (node != null) {
                    node.left = array[leftIndex] == null ? null : new No001080.TreeNode(array[leftIndex]);
                    linkedList.add(node.left);
                } else {
                    linkedList.add(null);
                }
            }
            int rightIndex = leftIndex + 1;
            if (rightIndex < array.length) {
                if (node != null) {
                    node.right = array[rightIndex] == null ? null : new No001080.TreeNode(array[rightIndex]);
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
    private static void cleanEmptyNode(No001080.TreeNode treeNode) {

        if (treeNode == null) {
            return;
        }
        if (treeNode.left != null) {
            cleanEmptyNode(treeNode.left);
            if (-Integer.MAX_VALUE == treeNode.left.val) {
                treeNode.left = null;
            }
        }
        if (treeNode.right != null) {
            cleanEmptyNode(treeNode.right);

            if (-Integer.MAX_VALUE == treeNode.right.val) {
                treeNode.right = null;
            }
        }
    }

    private static Integer[] toArray(No001080.TreeNode treeNode) {

        return toList(treeNode).stream()
                .map(k -> {
                    if (k == null) {
                        return null;
                    }
                    return k.val;
                }).toArray(Integer[]::new);
    }

    private static List<No001080.TreeNode> toList(No001080.TreeNode treeNode) {

        LinkedList<No001080.TreeNode> list = new LinkedList<>();
        list.add(treeNode);
        return toList(list);
    }

    private static List<No001080.TreeNode> toList(LinkedList<No001080.TreeNode> treeNodeList) {

        LinkedList<No001080.TreeNode> list = new LinkedList<>();
        if (treeNodeList == null || treeNodeList.size() == 0) {
            return list;
        }

        LinkedList<No001080.TreeNode> nextLevelList = new LinkedList<>();
        boolean noData = true;
        for (No001080.TreeNode treeNode : treeNodeList) {
            list.add(treeNode);
            nextLevelList.add(treeNode.left);
            if (treeNode.left != null) {
                noData = false;
            }
            nextLevelList.add(treeNode.right);
            if (treeNode.right != null) {
                noData = false;
            }
        }

        list.addAll(toList(nextLevelList));
        return list;
    }

    @Test
    void sufficientSubset() {

//        No001080.TreeNode node1 = toNode(new Integer[]{1, 2, 3, 4, -99});
//        No001080.TreeNode node11 = toNode(new Integer[]{1, 2, 3});
//        No001080.TreeNode node = toNode(new Integer[]{1, -99});
//        No001080.TreeNode node2 = toNode(new Integer[]{1, 2, 3, 4, -99, -99, 7, 8, 9, -99, -99, 12, 13, -99, 14});
        No001080 n1080 = new No001080();

        Integer[] input4 = {5, 4, 8, 11, null, 17, 4, 7, 1, null, null, 5, 3};
        Integer[] result4 = {5, 4, 8, 11, null, 17, 4, 7, null, null, null, 5};
        Assertions.assertArrayEquals(result4, toArray(n1080.sufficientSubset(toNode(input4), 22)));

        Integer[] input1 = {1, 2, 3, 4, -99, -99, 7, 8, 9, -99, -99, 12, 13, -99, 14};
        Integer[] result1 = {1, 2, 3, 4, null, null, 7, 8, 9, null, 14};
        Assertions.assertArrayEquals(result1, toArray(n1080.sufficientSubset(toNode(input1), 1)));

        Integer[] input0 = {1, -99};
        Integer[] result0 = {1};
        Assertions.assertArrayEquals(result0, toArray(n1080.sufficientSubset(toNode(input0), 1)));

        Integer[] input2 = {5, 4, 8, 11, null, 17, 4, 7, 1, null, null, 5, 3};
        Integer[] result2 = {5, 4, 8, 11, null, 17, 4, 7, null, null, null, 5};
        Assertions.assertArrayEquals(result2, toArray(n1080.sufficientSubset(toNode(input2), 22)));

        Integer[] input3 = {1, 2, -3, -5, null, 4, null};
        Integer[] result3 = {1, null, -3, 4};
        Assertions.assertArrayEquals(result3, toArray(n1080.sufficientSubset(toNode(input3), -1)));
    }
}