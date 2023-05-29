package live.xiaoxu.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * <p><a href="https://leetcode.cn/problems/longest-common-prefix">最长公共前缀</a></p>
 *
 * @author 小徐
 * @since 2022/12/19 17:32
 */
public class No000014_1 {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        String finalStr = strs[0];
        for (String str : strs) {
            while (!str.startsWith(finalStr)) {
                finalStr = finalStr.substring(0, finalStr.length() - 1);
            }
        }
        return finalStr;
    }

    public static String longestCommonPrefixOld(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            Set<Character> set = new HashSet<>();
            for (String str : strs) {
                if (str.length() == 0) {
                    return "";
                }
                if (str.length() <= i) {
                    return stringBuilder.toString();
                }
                set.add(str.charAt(i));
            }
            if (set.size() != 1) {
                break;
            } else {
                stringBuilder.append(set.iterator().next());
            }
        }
        return stringBuilder.toString();
    }
}