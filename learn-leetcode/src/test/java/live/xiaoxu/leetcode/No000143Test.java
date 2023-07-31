package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Test;

/**
 * <p></p>
 *
 * @author 小徐
 * @since 2023/7/31 16:33
 */
class No000143Test {

    @Test
    void reorderList() {

        No000143 n143 = new No000143();
        No000143.ListNode listNode = numberToNode(new int[]{1, 2, 3, 4});
        n143.reorderList(listNode);
        No000143.ListNode listNode1 = numberToNode(new int[]{1, 2, 3, 4, 5});
        n143.reorderList(listNode1);
        System.out.println();
    }

    private No000143.ListNode numberToNode(int[] num) {

        No000143.ListNode listNode = new No000143.ListNode();
        No000143.ListNode nextNode = listNode;
        for (int i = 0; i < num.length; i++) {
            nextNode.val = num[i];
            if (i == num.length - 1) {
                continue;
            }
            nextNode.next = new No000143.ListNode();
            nextNode = nextNode.next;
        }
        return listNode;
    }
}