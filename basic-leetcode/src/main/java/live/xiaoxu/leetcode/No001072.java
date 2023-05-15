package live.xiaoxu.leetcode;

import java.util.Arrays;
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
        int max = 0;

        for (int[] matrix1 : matrix) {
            if (matrix1[0] == 1) {
                for (int j = 0; j < matrix1.length; j++) {
                    matrix1[j] = matrix1[j] == 0 ? 1 : 0;
                }
            }
            // hash
            String string = Arrays.toString(matrix1);
            int integer = map.computeIfAbsent(string, k -> 0);
            map.put(string, integer + 1);
            max = Math.max(max, integer + 1);
        }

        return max;
    }
}