package live.xiaoxu.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <p><a href="https://leetcode.cn/problems/count-vowel-strings-in-ranges/">2559. 统计范围内的元音字符串数</a></p>
 *
 * @author 小徐
 * @since 2023/6/2 10:27
 */
public class No002559 {

    private static final Set<Character> SET = new HashSet<>() {{
        add('a');
        add('e');
        add('i');
        add('o');
        add('u');
    }};

    private final Map<String, Boolean> verifiedMap = new HashMap<>();
    private final Map<String, Integer> verifiedArrayMap = new HashMap<>();

    public int[] vowelStrings(String[] words, int[][] queries) {

        // 判定所有数据
        int[] qualified = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (verifiedMap.containsKey(word)) {
                qualified[i] = verifiedMap.get(word) ? 1 : 0;
                continue;
            }
            boolean b = SET.contains(word.charAt(0)) && SET.contains(word.charAt(word.length() - 1));
            verifiedMap.put(word, b);
            qualified[i] = b ? 1 : 0;
        }

        // 判定指定范围
        int[] retQualifiedNum = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            if (verifiedArrayMap.containsKey(query[0] + "-" + query[1])) {
                retQualifiedNum[i] = verifiedArrayMap.get(query[0] + "-" + query[1]);
                continue;
            }
            int ret = 0;
            for (int j = query[0]; j <= query[1]; j++) {
                ret += qualified[j];
            }
            retQualifiedNum[i] = ret;
            verifiedArrayMap.put(query[0] + "-" + query[1], ret);
        }
        return retQualifiedNum;
    }
}