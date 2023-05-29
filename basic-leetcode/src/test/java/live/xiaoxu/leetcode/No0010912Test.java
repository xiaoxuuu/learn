package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No0010912Test {

    @Test
    void shortestPathBinaryMatrix() {

        No001091_2 n1091 = new No001091_2();

        Assertions.assertEquals(-1, n1091.shortestPathBinaryMatrix(new int[][]{{1}}));
        Assertions.assertEquals(1, n1091.shortestPathBinaryMatrix(new int[][]{{0}}));
        Assertions.assertEquals(4, n1091.shortestPathBinaryMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
        Assertions.assertEquals(2, n1091.shortestPathBinaryMatrix(new int[][]{{0, 1}, {1, 0}}));
        Assertions.assertEquals(-1, n1091.shortestPathBinaryMatrix(new int[][]{{1, 0, 0}, {0, 0, 0}, {0, 0, 0}}));
        Assertions.assertEquals(-1, n1091.shortestPathBinaryMatrix(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 1}}));
        Assertions.assertEquals(3, n1091.shortestPathBinaryMatrix(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}));
        Assertions.assertEquals(-1, n1091.shortestPathBinaryMatrix(new int[][]{{0, 1, 1}, {1, 1, 1}, {1, 1, 0}}));
        Assertions.assertEquals(4, n1091.shortestPathBinaryMatrix(new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}}));
    }
}