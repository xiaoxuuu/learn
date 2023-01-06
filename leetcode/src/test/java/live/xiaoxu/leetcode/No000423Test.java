package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Test;

class No000423Test {

    @Test
    void originalDigits() {
        No000423 no000423 = new No000423();
        assert "012".equals(no000423.originalDigits("owoztneoer"));
        assert "45".equals(no000423.originalDigits("fviefuro"));
    }
}