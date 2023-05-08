package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No000384Test {

    /**
     * 判断两数组中元素是否完全一样
     *
     * @param a1 数组1
     * @param a2 数组2
     * @return 是否相同
     */
    public static boolean equals(int[] a1, int[] a2) {

        if (a1 == null && a2 == null) {
            return true;
        }
        if (a1 == null || a2 == null) {
            return false;
        }
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }

    @Test
    void longestCommonPrefix() {

        int[] nums = {1, 2, 3, 4, 5, 6};

        No000384.Solution solution = new No000384.Solution(nums);
        Assertions.assertFalse(equals(solution.shuffle(), nums));
        Assertions.assertTrue(equals(solution.reset(), nums));
        Assertions.assertFalse(equals(solution.shuffle(), nums));
        Assertions.assertFalse(equals(solution.shuffle(), nums));
    }
}