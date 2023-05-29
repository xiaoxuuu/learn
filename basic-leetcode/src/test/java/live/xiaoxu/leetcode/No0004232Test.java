package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No0004232Test {

    @Test
    void originalDigits() {

        No000423_2 n423 = new No000423_2();

        Assertions.assertEquals("012", n423.originalDigits("owoztneoer"));
        Assertions.assertEquals("45", n423.originalDigits("fviefuro"));
    }
}