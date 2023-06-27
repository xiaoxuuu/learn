package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/not-boring-movies/">620. 有趣的电影</a></p>
 *
 * @author 小徐
 * @since 2023/5/19 10:07
 */
public class No000620 {

    // SELECT * FROM cinema WHERE description <> 'boring' AND MOD (id, 2) = 1 ORDER BY rating DESC;
    // SELECT * FROM cinema WHERE description != 'boring' AND id % 2 != 0 ORDER BY rating DESC;
}