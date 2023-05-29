package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No002455Test {

    @Test
    void averageValue() {

        No002455 n2455 = new No002455();

        Assertions.assertEquals(9, n2455.averageValue(new int[]{1, 3, 6, 10, 12, 15}));
        Assertions.assertEquals(9, n2455.averageValue(new int[]{1, 3, 6, 10, 12, 15}));
        Assertions.assertEquals(0, n2455.averageValue(new int[]{1, 2, 4, 7, 10}));
    }
}