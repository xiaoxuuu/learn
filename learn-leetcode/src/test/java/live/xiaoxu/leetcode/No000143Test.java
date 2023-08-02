package live.xiaoxu.leetcode;

import live.xiaoxu.leetcode.bean.ListNode;
import live.xiaoxu.leetcode.util.NodeUtil;
import org.junit.jupiter.api.Assertions;
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

        ListNode listListNode1 = NodeUtil.numberToNode(new int[]{1});
        n143.reorderList(listListNode1);
        Assertions.assertArrayEquals(new int[]{1}, NodeUtil.nodeToArray(listListNode1));

        ListNode listListNode4 = NodeUtil.numberToNode(new int[]{1, 2, 3, 4});
        n143.reorderList(listListNode4);
        Assertions.assertArrayEquals(new int[]{1, 4, 2, 3}, NodeUtil.nodeToArray(listListNode4));

        ListNode listListNode5 = NodeUtil.numberToNode(new int[]{1, 2, 3, 4, 5});
        n143.reorderList(listListNode5);
        Assertions.assertArrayEquals(new int[]{1, 5, 2, 4, 3}, NodeUtil.nodeToArray(listListNode5));

        ListNode listListNode7 = NodeUtil.numberToNode(new int[]{1, 2, 3, 4, 5, 6, 7});
        n143.reorderList(listListNode7);
        Assertions.assertArrayEquals(new int[]{1, 7, 2, 6, 3, 5, 4}, NodeUtil.nodeToArray(listListNode7));
    }
}