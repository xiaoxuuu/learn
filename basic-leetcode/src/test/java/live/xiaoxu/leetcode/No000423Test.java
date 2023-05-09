package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No000423Test {

    @Test
    void originalDigits() {

        No000423 n423 = new No000423();

        Assertions.assertEquals("012", n423.originalDigits("owoztneoer"));
        Assertions.assertEquals("45", n423.originalDigits("fviefuro"));
    }
}