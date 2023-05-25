package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/odd-string-difference/">2451. 差值数组不同的字符串</a></p>
 *
 * @author 小徐
 * @since 2023/5/25 09:44
 */
public class No002451 {

    public String oddString(String[] words) {

        if (words.length == 1) {
            return words[0];
        }
        int[] intArray = new int[words[0].length() - 1];

        char[] charArray = words[0].toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            intArray[i] = charArray[i + 1] - charArray[i];
        }

        // 与第 0 相同的字符串数量
        int sameStrNum = 0;
        // 不与第 0 相同的字符串索引位置
        int indexNotEqual = -1;
        boolean sameStrNumAdd;
        for (int i = 1; i < words.length; i++) {
            sameStrNumAdd = true;
            char[] charArrayTemp = words[i].toCharArray();
            for (int j = 0; j < charArrayTemp.length - 1; j++) {
                int tempSub = charArrayTemp[j + 1] - charArrayTemp[j];
                // 遇到与第 0 个不同的字符串
                if (intArray[j] != tempSub) {
                    // 已有与第 0 相同字符串，返回当前
                    if (sameStrNum != 0) {
                        return words[i];
                    }
                    // 已有与第 0 不同字符串，返回第 0
                    if (indexNotEqual != -1) {
                        return words[0];
                    }
                    indexNotEqual = i;
                    sameStrNumAdd = false;
                    break;
                }
            }
            if (sameStrNumAdd) {
                sameStrNum++;
            }
        }
        return words[indexNotEqual];
    }
}