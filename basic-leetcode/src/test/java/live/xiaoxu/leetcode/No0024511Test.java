package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No0024511Test {

    @Test
    void oddString() {

        No002451_1 n2451 = new No002451_1();

        Assertions.assertEquals("aas", n2451.oddString(new String[]{"aaa", "aas", "bbb"}));
        Assertions.assertEquals("abd", n2451.oddString(new String[]{"abd", "dfg", "kmn"}));
        Assertions.assertEquals("bob", n2451.oddString(new String[]{"aaa", "bob", "ccc", "ddd"}));
        Assertions.assertEquals("ddd", n2451.oddString(new String[]{"dcc", "poo", "baa", "onn", "ddd"}));
        Assertions.assertEquals("ddd", n2451.oddString(new String[]{"ddd", "poo", "baa", "onn"}));
        Assertions.assertEquals("abc", n2451.oddString(new String[]{"adc", "wzy", "abc"}));
    }
}