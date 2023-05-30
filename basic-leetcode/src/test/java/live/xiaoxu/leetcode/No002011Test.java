package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No002011Test {

    @Test
    void finalValueAfterOperations() {

        No002011 n2011 = new No002011();

        Assertions.assertEquals(0, n2011.finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"}));
        Assertions.assertEquals(1, n2011.finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
        Assertions.assertEquals(3, n2011.finalValueAfterOperations(new String[]{"++X", "++X", "X++"}));
    }
}