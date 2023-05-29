package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No0024371Test {

    @Test
    void countTime() {

        No002437_1 n2437 = new No002437_1();

        Assertions.assertEquals(3, n2437.countTime("?2:16"));
        Assertions.assertEquals(240, n2437.countTime("2?:??"));
        Assertions.assertEquals(2, n2437.countTime("?5:00"));
        Assertions.assertEquals(100, n2437.countTime("0?:0?"));
        Assertions.assertEquals(1440, n2437.countTime("??:??"));
    }
}