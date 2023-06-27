package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No000005Test {

    @Test
    void longestPalindrome() {

        No000005 n5 = new No000005();

        Assertions.assertEquals("ranynar", n5.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
        Assertions.assertEquals("cdc", n5.longestPalindrome("bbcdc"));
        Assertions.assertEquals("dcd", n5.longestPalindrome("cbbdcdc"));
        Assertions.assertEquals("c", n5.longestPalindrome("cbd"));
        Assertions.assertEquals("bb", n5.longestPalindrome("cbbd"));
        Assertions.assertEquals("bb", n5.longestPalindrome("bb"));
        Assertions.assertEquals("bbb", n5.longestPalindrome("bbb"));
        Assertions.assertEquals("bbbb", n5.longestPalindrome("bbbb"));
        Assertions.assertEquals("bab", n5.longestPalindrome("babad"));
        Assertions.assertEquals("b", n5.longestPalindrome("b"));
        Assertions.assertEquals("bab", n5.longestPalindrome("bab11ab"));
    }
}