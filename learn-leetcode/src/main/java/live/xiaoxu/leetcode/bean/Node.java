package live.xiaoxu.leetcode.bean;

/**
 * <p>单向链表</p>
 *
 * @author 小徐
 * @since 2023/8/1 16:58
 */
public class Node {

    public int val;
    public Node next;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}