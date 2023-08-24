package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No002559Test {

    @Test
    void vowelStrings() {

        No002559 n2559 = new No002559();

        Assertions.assertArrayEquals(new int[]{2, 3, 0}, n2559.vowelStrings(new String[]{"aba", "bcb", "ece", "aa", "e"}, new int[][]{{0, 2}, {1, 4}, {1, 1}}));
        Assertions.assertArrayEquals(new int[]{3, 2, 1}, n2559.vowelStrings(new String[]{"a", "e", "i"}, new int[][]{{0, 2}, {0, 1}, {2, 2}}));
    }
}