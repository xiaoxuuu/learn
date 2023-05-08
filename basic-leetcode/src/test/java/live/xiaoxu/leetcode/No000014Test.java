package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No000014Test {

    @Test
    void longestCommonPrefix() {

        No000014 no000014 = new No000014();
        Assertions.assertEquals("fl", no000014.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assertions.assertEquals("", no000014.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        Assertions.assertEquals("", no000014.longestCommonPrefix(new String[]{""}));
        Assertions.assertEquals("a", no000014.longestCommonPrefix(new String[]{"a"}));
    }
}