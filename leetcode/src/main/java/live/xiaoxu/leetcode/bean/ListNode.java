package live.xiaoxu.leetcode.bean;

/**
 * <p>单向链表</p>
 *
 * @author 小徐
 * @since 2023/8/1 16:58
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}