package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/longest-palindromic-substring/">5. 最长回文子串</a></p>
 *
 * @author 小徐
 * @since 2023/5/16 10:57
 */
public class No000005_2 {

    public String longestPalindrome(String s) {

        if (s == null || s.length() == 0) {
            return "";
        }
        int length = s.length();
        if (length == 1) {
            return s;
        }
        char[] charArray = s.toCharArray();

        int begin = 0, end = 0;
        // 循环每一次
        for (int i = 0; i < length; i++) {

            // 已知子串的长度若超过字符串一半，则剩下的一半无需判断
            if (s.length() < (end - begin) * 2) {
                break;
            }
            for (int j = i + 1; j < length; j++) {
                // 默认子串符合回文子串要求
                boolean choose = true;
                int tempJ = j;
                // 循环子串的一半验证
                for (int k = i; k <= ((j - i) / 2 + i); k++) {
                    if (charArray[k] != charArray[tempJ]) {
                        choose = false;
                        break;
                    }
                    tempJ--;
                }
                if (choose && j - i > end - begin) {
                    begin = i;
                    end = j;
                }
            }
        }
        return s.substring(begin, end + 1);
    }
}