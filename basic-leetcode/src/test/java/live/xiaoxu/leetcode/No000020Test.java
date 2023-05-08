package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No000020Test {

    @Test
    void isValid() {

        No000020 n20 = new No000020();
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