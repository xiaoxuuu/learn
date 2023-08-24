package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No002460Test {

    @Test
    void applyOperations() {

        No002460 n2460 = new No002460();

        Assertions.assertArrayEquals(new int[]{1694, 399, 832, 1758, 412, 206, 272, 0, 0, 0, 0, 0, 0, 0}, n2460.applyOperations(new int[]{847, 847, 0, 0, 0, 399, 416, 416, 879, 879, 206, 206, 206, 272}));
        Assertions.assertArrayEquals(new int[]{1, 0}, n2460.applyOperations(new int[]{0, 1}));
        Assertions.assertArrayEquals(new int[]{0, 0}, n2460.applyOperations(new int[]{0, 0}));
        Assertions.assertArrayEquals(new int[]{1, 4, 2, 0, 0, 0}, n2460.applyOperations(new int[]{1, 2, 2, 1, 1, 0}));
    }
}