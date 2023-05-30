package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No000001Test {

    @Test
    void twoSum() {

        No000001 n1 = new No000001();

        Assertions.assertArrayEquals(new int[]{0, 1}, n1.twoSum(new int[]{2, 7, 11, 15}, 9));
        Assertions.assertArrayEquals(new int[]{1, 2}, n1.twoSum(new int[]{3, 2, 4}, 6));
        Assertions.assertArrayEquals(new int[]{0, 1}, n1.twoSum(new int[]{3, 3}, 6));
    }
}