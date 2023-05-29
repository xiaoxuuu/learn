package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No0025351Test {

    @Test
    void differenceOfSum() {

        No002535_1 n2535 = new No002535_1();

        Assertions.assertEquals(9, n2535.differenceOfSum(new int[]{1, 15, 6, 3}));
        Assertions.assertEquals(0, n2535.differenceOfSum(new int[]{1, 2, 3, 4}));
    }
}