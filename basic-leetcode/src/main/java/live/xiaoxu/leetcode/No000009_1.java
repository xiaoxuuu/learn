package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/palindrome-number/">9. 回文数</a></p>
 *
 * @author 小徐
 * @since 2023/5/25 17:43
 */
public class No000009_1 {

    public boolean isPalindrome(int x) {

        // 小于 0 或 0 结尾均不是回文数
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }
        int temp = 0;
        // 仅需循环一半数字
        while (x > temp) {
            temp = temp * 10 + x % 10;
            x /= 10;
        }
        // 偶数位数直接判断，奇数位数去除中间位数后判断
        return temp == x || temp / 10 == x;
    }
}