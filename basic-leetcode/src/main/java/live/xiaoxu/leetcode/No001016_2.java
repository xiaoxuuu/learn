package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/binary-string-with-substrings-representing-1-to-n/">1016. 子串能表示从 1 到 N 数字的二进制串</a></p>
 *
 * @author 小徐
 * @since 2023/5/11 10:58
 */
public class No001016_2 {

    public boolean queryString(String s, int n) {

        boolean result = true;
        for (int i = 1; i <= n; i++) {
            String string = Integer.toString(i, 2);
            if (!s.contains(string)) {
                result = false;
                break;
            }
        }
        return result;
    }
}