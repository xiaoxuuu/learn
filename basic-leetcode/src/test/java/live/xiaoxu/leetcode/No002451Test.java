package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No002451Test {

    @Test
    void oddString() {

        No002451 n2451 = new No002451();

        Assertions.assertEquals("ddd", n2451.oddString(new String[]{"ddd", "poo", "baa", "onn"}));
        Assertions.assertEquals("bob", n2451.oddString(new String[]{"aaa", "bob", "ccc", "ddd"}));
        Assertions.assertEquals("abc", n2451.oddString(new String[]{"adc", "wzy", "abc"}));
    }
}