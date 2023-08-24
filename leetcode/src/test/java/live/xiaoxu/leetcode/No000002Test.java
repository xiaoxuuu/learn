package live.xiaoxu.leetcode;

import live.xiaoxu.leetcode.util.NodeUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No000002Test {

    @Test
    void addTwoNumbers() {

        No000002 n2 = new No000002();

        Assertions.assertEquals("0", NodeUtil.nodeToNumber(n2.addTwoNumbers(NodeUtil.numberToNode(new int[]{0}), NodeUtil.numberToNode(new int[]{0}))));
        Assertions.assertEquals("708", NodeUtil.nodeToNumber(n2.addTwoNumbers(NodeUtil.numberToNode(new int[]{2, 4, 3}), NodeUtil.numberToNode(new int[]{5, 6, 4}))));
        Assertions.assertEquals("89990001", NodeUtil.nodeToNumber(n2.addTwoNumbers(NodeUtil.numberToNode(new int[]{9, 9, 9, 9, 9, 9, 9}), NodeUtil.numberToNode(new int[]{9, 9, 9, 9}))));
    }
}