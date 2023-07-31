package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/reorder-list/">143. 重排链表</a></p>
 *
 * @author 小徐
 * @since 2023/7/31 15:56
 */
public class No000143 {

    public void reorderList(ListNode head) {

        // 思路：找出链表中间节点 反转后半部链表 拼接两条链表

        // 找出链表中间节点
        ListNode centerNode = findCenterNode(head, head);
        ListNode centerNextNode = centerNode.next;
        centerNode.next = null;
        ListNode reverseCenterNextNode = reverseNode(centerNextNode);
        concatNode(head, reverseCenterNextNode);
        System.out.println(123);
    }

    private ListNode findCenterNode(ListNode slow, ListNode fast) {

        if (null == slow.next || null == fast.next || null == fast.next.next) {

            return slow;
        }
        return findCenterNode(slow.next, fast.next.next);
    }

    private ListNode reverseNode(ListNode node) {

        if (null == node.next) {
            return node;
        }
        ListNode listNode = reverseNode(node.next);
        listNode.next = node;
        return listNode;
    }

    private void concatNode(ListNode first, ListNode second) {

        ListNode twoNode = second;
        while (null != twoNode) {

            ListNode next = first.next;
            first.next = twoNode;
            ListNode next1 = twoNode.next;
            twoNode.next = next;
            twoNode = next1;
        }
    }

    public static class ListNode {

        public int val;
        public ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}