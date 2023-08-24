package live.xiaoxu.leetcode.util;

import live.xiaoxu.leetcode.bean.ListNode;

import java.util.LinkedList;
import java.util.List;

/**
 * <p>node 工具类</p>
 *
 * @author 小徐
 * @since 2023/8/1 16:58
 */
public class NodeUtil {

    public static ListNode numberToNode(int[] num) {

        ListNode listNode = new ListNode();
        ListNode nextListNode = listNode;
        for (int i = 0; i < num.length; i++) {
            nextListNode.val = num[i];
            if (i == num.length - 1) {
                continue;
            }
            nextListNode.next = new ListNode();
            nextListNode = nextListNode.next;
        }
        return listNode;
    }

    public static String nodeToNumber(ListNode listNode) {

        int val = listNode.val;
        if (listNode.next != null) {
            return val + nodeToNumber(listNode.next);
        }
        return String.valueOf(val);
    }

    public static List<Integer> nodeToList(ListNode listNode) {

        LinkedList<Integer> list = new LinkedList<>();
        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }
        return list;
    }

    public static int[] nodeToArray(ListNode listNode) {

        List<Integer> list = nodeToList(listNode);
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }
}
