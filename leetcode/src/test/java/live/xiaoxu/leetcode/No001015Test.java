package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No001015Test {

    @Test
    void smallestRepunitDivByK() {

        No001015 n1015 = new No001015();

        Assertions.assertEquals(16, n1015.smallestRepunitDivByK(17));
        Assertions.assertEquals(9, n1015.smallestRepunitDivByK(9));
        Assertions.assertEquals(1, n1015.smallestRepunitDivByK(1));
        Assertions.assertEquals(-1, n1015.smallestRepunitDivByK(2));
        Assertions.assertEquals(3, n1015.smallestRepunitDivByK(3));
    }
}