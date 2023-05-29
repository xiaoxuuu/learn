package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No0000091Test {

    @Test
    void isPalindrome() {

        No000009_1 n9 = new No000009_1();

        Assertions.assertTrue(n9.isPalindrome(1001));
        Assertions.assertTrue(n9.isPalindrome(1));
        Assertions.assertTrue(n9.isPalindrome(121));
        Assertions.assertTrue(n9.isPalindrome(0));
        Assertions.assertFalse(n9.isPalindrome(-121));
        Assertions.assertFalse(n9.isPalindrome(10));
    }
}