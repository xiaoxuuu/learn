package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No002325Test {

    @Test
    void decodeMessage() {

        No002325 n2325 = new No002325();

        Assertions.assertEquals("abcdefghijklmnopqrstuvwxyz", n2325.decodeMessage("the quick brown fox jumps over the lazy dog", "thequickbrownfxjmpsvlazydg"));
        Assertions.assertEquals("this is a secret", n2325.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
        Assertions.assertEquals("the five boxing wizards jump quickly", n2325.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }
}