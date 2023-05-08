package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No000020Test {

    @Test
    void isValid() {

        // 通过
        Assertions.assertTrue(new No000020().isValid("()"));
        Assertions.assertTrue(new No000020().isValid("{}"));
        Assertions.assertTrue(new No000020().isValid("[]"));
        Assertions.assertTrue(new No000020().isValid("[({})]"));
        Assertions.assertTrue(new No000020().isValid("[]{}()"));

        // 不通过
        Assertions.assertFalse(new No000020().isValid("[)"));
        Assertions.assertFalse(new No000020().isValid("([)]"));
        Assertions.assertFalse(new No000020().isValid("(()"));
        Assertions.assertFalse(new No000020().isValid(")("));
    }
}