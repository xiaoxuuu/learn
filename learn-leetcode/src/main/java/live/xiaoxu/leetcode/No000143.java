package live.xiaoxu.leetcode;

import live.xiaoxu.leetcode.bean.ListNode;

/**
 * <p><a href="https://leetcode.cn/problems/reorder-list/">143. 重排链表</a></p>
 *
 * @author 小徐
 * @since 2023/7/31 15:56
 */
public class No000143 {

    public void reorderList(ListNode head) {

        // 找出链表中间节点
        ListNode centerListNode = findCenterNode(head, head);
        ListNode centerNextListNode = centerListNode.next;
        centerListNode.next = null;
        // 反转后半部链表
        ListNode reverseCenterNextListNode = reverseNode(centerNextListNode);
        // 拼接两条链表
        concatNode(head, reverseCenterNextListNode);
    }

    private ListNode findCenterNode(ListNode slow, ListNode fast) {

        if (null == slow.next || null == fast.next || null == fast.next.next) {
            return slow;
        }
        return findCenterNode(slow.next, fast.next.next);
    }

    private ListNode reverseNode(ListNode node) {

        if (null == node || null == node.next) {
            return node;
        }
        ListNode temp = node.next;
        ListNode listNode = reverseNode(node.next);
        temp.next = node;
        node.next = null;
        return listNode;
    }

    private void concatNode(ListNode first, ListNode second) {

        // 链表节点依次连接
        ListNode cur1 = first, cur2 = second;
        while (cur1 != null && cur2 != null) {
            // 取出两条链表的第二节点
            ListNode tmp1 = cur1.next;
            ListNode tmp2 = cur2.next;
            // 将 1 的第二节点指向 2 的头
            cur1.next = cur2;
            // 将 2 的第二节点指向 1 的第二节点，这一步完成了插入
            cur2.next = tmp1;
            // 将两条链表的第二节点存储
            cur1 = tmp1;
            cur2 = tmp2;
        }
    }
}