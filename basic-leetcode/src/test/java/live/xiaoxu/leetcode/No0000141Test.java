package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No0000141Test {

    @Test
    void longestCommonPrefix() {

        No000014_1 n14 = new No000014_1();
        Assertions.assertEquals("fl", n14.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assertions.assertEquals("", n14.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        Assertions.assertEquals("", n14.longestCommonPrefix(new String[]{""}));
        Assertions.assertEquals("a", n14.longestCommonPrefix(new String[]{"a"}));
    }
}