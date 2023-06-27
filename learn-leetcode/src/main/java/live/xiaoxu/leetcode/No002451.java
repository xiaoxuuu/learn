package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/odd-string-difference/">2451. 差值数组不同的字符串</a></p>
 *
 * @author 小徐
 * @since 2023/5/25 09:44
 */
public class No002451 {

    public String oddString(String[] words) {

        int[] array = new int[words[0].length() - 1];
        for (int i = 0; i < words[0].length() - 1; i++) {
            array[i] = words[0].charAt(i + 1) - words[0].charAt(i);
        }

        // 与第 0 相同的字符串数量
        int equalStrNum = 0;
        // 不与第 0 相同的字符串索引位置
        int indexNotEqual = -1;
        for (int i = 1; i < words.length; i++) {
            for (int j = 0; j < words[i].length() - 1; j++) {
                // 遇到与第 0 个不同的字符串
                if (array[j] != words[i].charAt(j + 1) - words[i].charAt(j)) {
                    // 已有与第 0 相同字符串，返回当前
                    if (equalStrNum != 0) {
                        return words[i];
                    }
                    // 已有与第 0 不同字符串，返回第 0
                    if (indexNotEqual != -1) {
                        return words[0];
                    }
                    indexNotEqual = i;
                    // 与第 0 不同，减去下面自增的数据
                    equalStrNum--;
                    break;
                }
            }
            equalStrNum++;
        }
        return words[indexNotEqual];
    }
}