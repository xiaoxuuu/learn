package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode-cn.com/problems/add-two-numbers/">2. 两数相加</a></p>
 *
 * @author 小徐
 * @since 2021/9/14 10:38
 */
public class No000002_1 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode newNode = null;
        // 同级别节点不为空则计算
        if (null != l1 || null != l2) {
            // 补全错位为空的数据
            if (l1 == null) {
                l1 = new ListNode(0);
            }
            if (l2 == null) {
                l2 = new ListNode(0);
            }
            // 返回数据的子节点
            newNode = new ListNode();
            int i = l1.val + l2.val;
            // 计算结果超过 10，向下级进位
            if (10 <= l1.val + l2.val) {
                i = i % 10;
                // 如果接下来是单链，处理丢失的进位数据
                if (null != l1.next) {
                    l1.next.val++;
                } else {
                    if (null == l2.next) {
                        l2.next = new ListNode(0);
                    }
                    l2.next.val++;
                }
            }
            newNode.val = i;
            newNode.next = addTwoNumbers(l1.next, l2.next);
        }
        return newNode;
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