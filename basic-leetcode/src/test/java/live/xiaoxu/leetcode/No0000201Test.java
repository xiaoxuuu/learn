package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No0000201Test {

    @Test
    void isValid() {

        No000020_1 n20 = new No000020_1();
        // 通过
        Assertions.assertTrue(n20.isValid("()"));
        Assertions.assertTrue(n20.isValid("{}"));
        Assertions.assertTrue(n20.isValid("[]"));
        Assertions.assertTrue(n20.isValid("[({})]"));
        Assertions.assertTrue(n20.isValid("[]{}()"));

        // 不通过
        Assertions.assertFalse(n20.isValid("[)"));
        Assertions.assertFalse(n20.isValid("([)]"));
        Assertions.assertFalse(n20.isValid("(()"));
        Assertions.assertFalse(n20.isValid(")("));
    }
}