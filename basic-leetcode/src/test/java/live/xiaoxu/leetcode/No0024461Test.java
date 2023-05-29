package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No0024461Test {

    @Test
    void haveConflict() {

        No002446_1 n2446 = new No002446_1();

        Assertions.assertFalse(n2446.haveConflict(new String[]{"10:00", "11:00"}, new String[]{"14:00", "15:00"}));
        Assertions.assertTrue(n2446.haveConflict(new String[]{"01:15", "02:00"}, new String[]{"02:00", "03:00"}));
        Assertions.assertTrue(n2446.haveConflict(new String[]{"01:00", "02:00"}, new String[]{"01:20", "03:00"}));
    }
}