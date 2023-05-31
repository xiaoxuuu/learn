package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/reverse-integer/">7. 整数反转</a></p>
 *
 * @author 小徐
 * @since 2023/5/19 10:07
 */
public class No000007 {

    public int reverse(int x) {

        if (x < 10 && x > -10) {
            return x;
        }

        long reverse = 0;
        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return (int) reverse == reverse ? (int) reverse : 0;
    }
}