package live.xiaoxu.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * <p><a href="https://leetcode.cn/problems/longest-substring-without-repeating-characters/">3. 无重复字符的最长子串</a></p>
 *
 * @author 小徐
 * @since 2023/5/12 09:49
 */
public class No000003 {

    public int lengthOfLongestSubstring(String s) {
        char[] charArray = s.toCharArray();
        Set<Character> characterSet = new HashSet<>();
        for (char c : charArray) {
            characterSet.add(c);
        }
        // 最长的长度
        int maxFinalLength = characterSet.size();

        // 最大的子字符串长度
        int maxLength = 0;
        for (int index = 0; index < charArray.length; index++) {

            // 读取当前索引最大不重复子串长度
            for (int tempLength = 1; tempLength + index <= charArray.length; tempLength++) {
                // 清空上次记录
                characterSet.clear();
                // 取出指定位置指定长度子串
                for (int j = index; j < index + tempLength; j++) {
                    if (charArray.length <= j) {
                        break;
                    }
                    characterSet.add(charArray[j]);
                }
                // 当前子串是否重复
                if (characterSet.size() != tempLength) {
                    break;
                }
                // 如果查找的子串长度等于最长长度，停止查找
                if (tempLength == maxFinalLength) {
                    return maxFinalLength;
                }
                maxLength = Math.max(maxLength, tempLength);
            }
        }
        return maxLength;
    }
}