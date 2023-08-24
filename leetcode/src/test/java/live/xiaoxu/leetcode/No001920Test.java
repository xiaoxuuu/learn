package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No001920Test {

    @Test
    void buildArray() {

        No001920 n1920 = new No001920();

        Assertions.assertArrayEquals(new int[]{0, 1, 2, 4, 5, 3}, n1920.buildArray(new int[]{0, 2, 1, 5, 3, 4}));
        Assertions.assertArrayEquals(new int[]{4, 5, 0, 1, 2, 3}, n1920.buildArray(new int[]{5, 0, 1, 2, 3, 4}));
    }
}