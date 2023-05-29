package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class No0017731Test {

    @Test
    void countMatches() {

        No001773_1 n1773 = new No001773_1();

        Assertions.assertEquals(1, n1773.countMatches(List.of(List.of("phone", "blue", "pixel"), List.of("computer", "silver", "lenovo"), List.of("phone", "gold", "iphone")), "color", "silver"));
        Assertions.assertEquals(2, n1773.countMatches(List.of(List.of("phone", "blue", "pixel"), List.of("computer", "silver", "phone"), List.of("phone", "gold", "iphone")), "type", "phone"));
    }
}