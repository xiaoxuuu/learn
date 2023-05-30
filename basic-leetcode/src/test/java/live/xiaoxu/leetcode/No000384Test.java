package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No000384Test {

    @Test
    void longestCommonPrefix() {

        int[] nums = {1, 2, 3, 4, 5, 6};

        No000384.Solution solution = new No000384.Solution(nums);

        Assertions.assertArrayEquals(solution.shuffle(), nums);
        Assertions.assertArrayEquals(solution.reset(), nums);
        Assertions.assertArrayEquals(solution.shuffle(), nums);
        Assertions.assertArrayEquals(solution.shuffle(), nums);
    }
}