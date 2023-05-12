package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No000003Test {

    @Test
    void lengthOfLongestSubstring() {

        No000003 n3 = new No000003();

        Assertions.assertEquals(2, n3.lengthOfLongestSubstring("au"));
        Assertions.assertEquals(1, n3.lengthOfLongestSubstring("a"));
        Assertions.assertEquals(3, n3.lengthOfLongestSubstring("pwwkew"));
        Assertions.assertEquals(3, n3.lengthOfLongestSubstring("abcabcbb"));
        Assertions.assertEquals(1, n3.lengthOfLongestSubstring("bbbbb"));
    }
}