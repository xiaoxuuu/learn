package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No0000021Test {

    @Test
    void addTwoNumbers() {

        No000002_1 n2 = new No000002_1();
        Assertions.assertEquals("0", nodeToNumber(n2.addTwoNumbers(numberToNode(new int[]{0}), numberToNode(new int[]{0}))));
        Assertions.assertEquals("708", nodeToNumber(n2.addTwoNumbers(numberToNode(new int[]{2, 4, 3}), numberToNode(new int[]{5, 6, 4}))));
        Assertions.assertEquals("89990001", nodeToNumber(n2.addTwoNumbers(numberToNode(new int[]{9, 9, 9, 9, 9, 9, 9}), numberToNode(new int[]{9, 9, 9, 9}))));
    }

    private No000002_1.ListNode numberToNode(int[] num) {

        No000002_1.ListNode listNode = new No000002_1.ListNode();
        No000002_1.ListNode nextNode = listNode;
        for (int i = 0; i < num.length; i++) {
            nextNode.val = num[i];
            if (i == num.length - 1) {
                continue;
            }
            nextNode.next = new No000002_1.ListNode();
            nextNode = nextNode.next;
        }
        return listNode;
    }

    private String nodeToNumber(No000002_1.ListNode node) {

        int val = node.val;
        if (node.next != null) {
            return val + nodeToNumber(node.next);
        }
        return String.valueOf(val);
    }
}