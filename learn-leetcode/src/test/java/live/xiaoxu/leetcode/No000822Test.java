package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <p></p>
 *
 * @author 小徐
 * @since 2023/8/2 16:32
 */
class No000822Test {

    @Test
    void flipgame() {

        No000822_ n822 = new No000822_();

        Assertions.assertEquals(0, n822.flipgame(new int[]{1}, new int[]{1}));
        Assertions.assertEquals(2, n822.flipgame(new int[]{1, 1}, new int[]{1, 2}));
        Assertions.assertEquals(2, n822.flipgame(new int[]{1, 2, 4, 4, 7}, new int[]{1, 3, 4, 1, 3}));
    }
}