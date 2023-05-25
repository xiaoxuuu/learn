package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/palindrome-number/">9. 回文数</a></p>
 *
 * @author 小徐
 * @since 2023/5/25 17:43
 */
public class No000009 {

    public boolean isPalindrome(int x) {

        // 小于 0 或 0 结尾均不是回文数
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }
        int num = x;
        int temp = 0;
        while (num != 0) {
            temp = temp * 10 + num % 10;
            num /= 10;
        }
        return temp == x;
    }
}