package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No000006Test {

    @Test
    void addNegabinary() {

        No000006 n6 = new No000006();

        Assertions.assertEquals("PAHNAPLSIIGYIR", n6.convert("PAYPALISHIRING", 3));
        Assertions.assertEquals("PINALSIGYAHRPI", n6.convert("PAYPALISHIRING", 4));
        Assertions.assertEquals("A", n6.convert("A", 1));
    }
}