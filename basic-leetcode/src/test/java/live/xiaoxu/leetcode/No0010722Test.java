package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No0010722Test {

    @Test
    void maxEqualRowsAfterFlips() {

        No001072_2 n1072 = new No001072_2();

        Assertions.assertEquals(2, n1072.maxEqualRowsAfterFlips(new int[][]{{0}, {1}}));
        Assertions.assertEquals(1, n1072.maxEqualRowsAfterFlips(new int[][]{{0, 1}, {1, 1}}));
        Assertions.assertEquals(2, n1072.maxEqualRowsAfterFlips(new int[][]{{0, 1}, {1, 0}}));
        Assertions.assertEquals(2, n1072.maxEqualRowsAfterFlips(new int[][]{{0, 0, 0}, {0, 0, 1}, {1, 1, 0}}));
    }
}