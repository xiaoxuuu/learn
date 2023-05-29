package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No0000032Test {

    @Test
    void lengthOfLongestSubstring() {

        No000003_2 n3 = new No000003_2();

        Assertions.assertEquals(2, n3.lengthOfLongestSubstring("au"));
        Assertions.assertEquals(3, n3.lengthOfLongestSubstring("pwwkew"));
        Assertions.assertEquals(1, n3.lengthOfLongestSubstring("a"));
        Assertions.assertEquals(3, n3.lengthOfLongestSubstring("abcabcbb"));
        Assertions.assertEquals(1, n3.lengthOfLongestSubstring("bbbbb"));
    }
}