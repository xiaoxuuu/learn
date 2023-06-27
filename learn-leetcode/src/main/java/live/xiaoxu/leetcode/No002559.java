package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/count-vowel-strings-in-ranges/">2559. 统计范围内的元音字符串数</a></p>
 * <p>前缀和</p>
 *
 * @author 小徐
 * @since 2023/6/2 10:27
 */
public class No002559 {

    private static boolean isVowel(char c) {

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int[] vowelStrings(String[] words, int[][] queries) {

        // 判定所有数据
        int[] qualified = new int[words.length + 1];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean vowel = isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1));
            qualified[i + 1] = qualified[i] + (vowel ? 1 : 0);
        }

        // 判定指定范围
        int[] retQualifiedNum = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            retQualifiedNum[i] = qualified[query[1] + 1] - qualified[query[0]];
        }
        return retQualifiedNum;
    }
}