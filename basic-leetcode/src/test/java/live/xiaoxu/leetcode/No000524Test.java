package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class No000524Test {

    @Test
    void findLongestWord() {

        No000524 n524 = new No000524();

        Assertions.assertEquals("ab", n524.findLongestWord("bab", Arrays.asList("ba", "ab", "a", "b")));
        Assertions.assertEquals("apple", n524.findLongestWord("abpcplea", Arrays.asList("ale", "apple", "monkey", "plea")));
        Assertions.assertEquals("a", n524.findLongestWord("abpcplea", Arrays.asList("a", "b", "c")));
        Assertions.assertEquals("abc", n524.findLongestWord("abce", Arrays.asList("abe", "abc")));
    }
}