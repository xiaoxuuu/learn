package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No001072Test {

    @Test
    void maxEqualRowsAfterFlips() {

        No001072 n1072 = new No001072();

        Assertions.assertEquals(1, n1072.maxEqualRowsAfterFlips(new int[][]{{0, 1}, {1, 1}}));
        Assertions.assertEquals(2, n1072.maxEqualRowsAfterFlips(new int[][]{{0}, {1}}));
        Assertions.assertEquals(2, n1072.maxEqualRowsAfterFlips(new int[][]{{0, 1}, {1, 0}}));
        Assertions.assertEquals(2, n1072.maxEqualRowsAfterFlips(new int[][]{{0, 0, 0}, {0, 0, 1}, {1, 1, 0}}));
    }
}