package live.xiaoxu.leetcode;

import live.xiaoxu.leetcode.bean.Node;

/**
 * <p><a href="https://leetcode.cn/problems/reorder-list/">143. 重排链表</a></p>
 *
 * @author 小徐
 * @since 2023/7/31 15:56
 */
public class No000143 {

    public void reorderList(Node head) {

        // 思路：找出链表中间节点 反转后半部链表 拼接两条链表

        // 找出链表中间节点
        Node centerNode = findCenterNode(head, head);
        Node centerNextNode = centerNode.next;
        centerNode.next = null;
        Node reverseCenterNextNode = reverseNode(centerNextNode);
        concatNode(head, reverseCenterNextNode);
    }

    private Node findCenterNode(Node slow, Node fast) {

        if (null == slow.next || null == fast.next || null == fast.next.next) {

            return slow;
        }
        return findCenterNode(slow.next, fast.next.next);
    }

    private Node reverseNode(Node node) {

        if (null == node || null == node.next) {
            return node;
        }
        Node listNode = reverseNode(node.next);
        node.next = null;
        listNode.next = node;
        return listNode;
    }

    private void concatNode(Node first, Node second) {

        // 链表节点依次连接
        Node cur1 = first, cur2 = second;
        while (cur1 != null && cur2 != null) {
            // 取出两条链表的第二节点
            Node tmp1 = cur1.next;
            Node tmp2 = cur2.next;
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