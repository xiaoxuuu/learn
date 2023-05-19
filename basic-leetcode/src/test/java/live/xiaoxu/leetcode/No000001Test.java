package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class No000001Test {

    @Test
    void twoSum() {

        No000001 n1 = new No000001();
        Assertions.assertTrue(List.of("[2, 1]", "[1, 2]").contains(Arrays.toString(n1.twoSum(new int[]{3, 2, 4}, 6))));
        Assertions.assertTrue(List.of("[0, 1]", "[1, 0]").contains(Arrays.toString(n1.twoSum(new int[]{2, 7, 11, 15}, 9))));
        Assertions.assertTrue(List.of("[0, 1]", "[1, 0]").contains(Arrays.toString(n1.twoSum(new int[]{3, 3}, 6))));
    }
}