package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No0024131Test {

    @Test
    void smallestEvenMultiple() {

        No002413_1 n2413 = new No002413_1();

        Assertions.assertEquals(2, n2413.smallestEvenMultiple(2));
        Assertions.assertEquals(10, n2413.smallestEvenMultiple(5));
        Assertions.assertEquals(6, n2413.smallestEvenMultiple(6));
    }
}