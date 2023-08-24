package live.xiaoxu.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p><a href="https://leetcode.cn/problems/card-flipping-game/">822. 翻转卡片游戏</a></p>
 *
 * @author 小徐
 * @since 2023/8/2 16:27
 */
public class No000822_ {

    public int flipgame(int[] fronts, int[] backs) {

        Set<Integer> set = new HashSet<>(fronts.length);
        for (int front : fronts) {
            set.add(front);
        }

        List<Integer> list = new ArrayList<>(set.size());
        for (int i = 0; i < backs.length; i++) {
            if (!set.contains(backs[i])) {
                list.add(fronts[i]);
            }
        }

        if (list.isEmpty()) {
            return 0;
        }
        if (list.size() == 1) {
            return list.get(0);
        }

        int temp = Integer.MAX_VALUE;
        for (Integer i : list) {
            if (temp > i) {
                temp = i;
            }
        }
        return temp;
    }
}