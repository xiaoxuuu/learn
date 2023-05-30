package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No002469Test {

    @Test
    void convertTemperature() {

        No002469 n2469 = new No002469();

        Assertions.assertArrayEquals(new double[]{309.65000, 97.70000}, n2469.convertTemperature(36.50));
        Assertions.assertArrayEquals(new double[]{395.26000, 251.79800}, n2469.convertTemperature(122.11));
    }
}