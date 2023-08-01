package live.xiaoxu.leetcode.util;

import live.xiaoxu.leetcode.bean.Node;

import java.util.LinkedList;
import java.util.List;

/**
 * <p>node 工具类</p>
 *
 * @author 小徐
 * @since 2023/8/1 16:58
 */
public class NodeUtil {

    public static Node numberToNode(int[] num) {

        Node listNode = new Node();
        Node nextNode = listNode;
        for (int i = 0; i < num.length; i++) {
            nextNode.val = num[i];
            if (i == num.length - 1) {
                continue;
            }
            nextNode.next = new Node();
            nextNode = nextNode.next;
        }
        return listNode;
    }

    public static String nodeToNumber(Node node) {

        int val = node.val;
        if (node.next != null) {
            return val + nodeToNumber(node.next);
        }
        return String.valueOf(val);
    }

    public static List<Integer> nodeToList(Node node) {

        LinkedList<Integer> list = new LinkedList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        return list;
    }

    public static int[] nodeToArray(Node node) {

        List<Integer> list = nodeToList(node);
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }
}
