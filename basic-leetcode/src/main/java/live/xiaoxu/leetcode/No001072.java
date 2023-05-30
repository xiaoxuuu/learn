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
        char[] charArray = new char[length];
        for (int[] intArray : matrix) {
            for (int j = 0; j < length; j++) {
                // 异或，将部分数据取反
                charArray[j] = (char) (intArray[0] ^ intArray[j]);
            }
            max = Math.max(max, map.merge(String.valueOf(charArray), 1, Integer::sum));
        }
        return max;
    }
}