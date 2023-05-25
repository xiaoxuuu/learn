package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/palindrome-number/">9. 回文数</a></p>
 *
 * @author 小徐
 * @since 2023/5/25 17:43
 */
public class No000009 {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        String s = String.valueOf(x);
        if (s.length() / 2 == 0 && s.length() != 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1 - i) {
                return true;
            }
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}