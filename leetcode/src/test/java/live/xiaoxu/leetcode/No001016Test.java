package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No001016Test {

    @Test
    void queryString() {

        No001016 n1016 = new No001016();

        Assertions.assertFalse(n1016.queryString("0110", 4));
        Assertions.assertFalse(n1016.queryString("110101011011000011011111000000", 15));
        Assertions.assertTrue(n1016.queryString("0110", 3));
    }
}