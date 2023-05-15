package live.xiaoxu.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * <p><a href="https://leetcode.cn/problems/flip-columns-for-maximum-number-of-equal-rows/">1072. 按列翻转得到最大值等行数</a></p>
 *
 * @author 小徐
 * @since 2023/5/15 10:38
 */
public class No001072 {

    public int maxEqualRowsAfterFlips(int[][] matrix) {

        Map<String, Integer> map = new HashMap<>(matrix.length);
        int max = 0, length = matrix[0].length;
        char[] cs = new char[length];
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < length; j++) {
                cs[j] = (char) (matrix1[0] ^ matrix1[j]);
            }
            max = Math.max(max, map.merge(String.valueOf(cs), 1, Integer::sum));
        }
        return max;
    }
}