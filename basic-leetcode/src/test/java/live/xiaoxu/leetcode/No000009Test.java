package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No000009Test {

    @Test
    void isPalindrome() {

        No000009 n9 = new No000009();

        Assertions.assertTrue(n9.isPalindrome(121));
        Assertions.assertTrue(n9.isPalindrome(0));
        Assertions.assertFalse(n9.isPalindrome(-121));
        Assertions.assertFalse(n9.isPalindrome(10));
    }
}