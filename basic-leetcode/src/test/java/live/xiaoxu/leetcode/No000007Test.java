package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No000007Test {

    @Test
    void reverse() {

        No000007 n7 = new No000007();

        Assertions.assertEquals(0, n7.reverse(1534236469));
        Assertions.assertEquals(21, n7.reverse(120));
        Assertions.assertEquals(0, n7.reverse(0));
        Assertions.assertEquals(321, n7.reverse(123));
        Assertions.assertEquals(-321, n7.reverse(-123));
    }
}