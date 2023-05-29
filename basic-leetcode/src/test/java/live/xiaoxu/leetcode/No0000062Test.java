package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No0000062Test {

    @Test
    void addNegabinary() {

        No000006_2 n6 = new No000006_2();

        Assertions.assertEquals("PAHNAPLSIIGYIR", n6.convert("PAYPALISHIRING", 3));
        Assertions.assertEquals("PINALSIGYAHRPI", n6.convert("PAYPALISHIRING", 4));
        Assertions.assertEquals("A", n6.convert("A", 1));
    }
}