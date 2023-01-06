package live.xiaoxu.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * <p><a href="https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting/">524. 通过删除字母匹配到字典里最长单词</a></p>
 *
 * @author 小徐
 * @since 2021/9/14 10:38
 */
public class No000524 {

    public static void main(String[] args) {

        if (!"ab".equals(new No000524().findLongestWord("bab", Arrays.asList("ba", "ab", "a", "b")))) {
            System.err.println("不通过");
            return;
        }
        if (!"apple".equals(new No000524().findLongestWord("abpcplea", Arrays.asList("ale", "apple", "monkey", "plea")))) {
            System.err.println("不通过");
            return;
        }
        if (!"a".equals(new No000524().findLongestWord("abpcplea", Arrays.asList("a", "b", "c")))) {
            System.err.println("不通过");
            return;
        }
        if (!"abc".equals(new No000524().findLongestWord("abce", Arrays.asList("abe", "abc")))) {
            System.err.println("不通过");
            return;
        }
        System.out.println("通过");
    }

    public String findLongestWord(String s, List<String> dictionary) {

        // 字典排序，按长度从小到大
        dictionary.sort((o1, o2) -> o1.length() != o2.length() ? o2.length() - o1.length() : o1.compareTo(o2));
        for (String str : dictionary) {
            int sLoopTimes = 0;
            int strLoopTimes = 0;
            while (sLoopTimes < s.length() && strLoopTimes < str.length()) {
                if (s.charAt(sLoopTimes) == str.charAt(strLoopTimes)) {
                    strLoopTimes++;
                }
                sLoopTimes++;
            }
            if (str.length() == strLoopTimes) {
                return str;
            }
        }
        return "";
    }
}