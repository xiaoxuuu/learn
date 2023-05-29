package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No0024551Test {

    @Test
    void averageValue() {

        No002455_1 n2455 = new No002455_1();

        Assertions.assertEquals(6, n2455.averageValue(new int[]{9, 3, 8, 4, 2, 5, 3, 8, 6, 1}));
        Assertions.assertEquals(9, n2455.averageValue(new int[]{1, 3, 6, 10, 12, 15}));
        Assertions.assertEquals(9, n2455.averageValue(new int[]{1, 3, 6, 10, 12, 15}));
        Assertions.assertEquals(0, n2455.averageValue(new int[]{1, 2, 4, 7, 10}));
    }
}