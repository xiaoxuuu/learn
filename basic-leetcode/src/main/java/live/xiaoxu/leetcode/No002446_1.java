package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/determine-if-two-events-have-conflict/">2446. 判断两个事件是否存在冲突</a></p>
 *
 * @author 小徐
 * @since 2023/5/17 14:15
 */
public class No002446_1 {

    public boolean haveConflict(String[] event1, String[] event2) {
        return !(event1[0].compareTo(event2[1]) > 0 || event1[1].compareTo(event2[0]) < 0);
    }

    public boolean haveConflictMy(String[] event1, String[] event2) {

        int e10 = Integer.parseInt(event1[0].replace(":", ""));
        int e11 = Integer.parseInt(event1[1].replace(":", ""));

        int e20 = Integer.parseInt(event2[0].replace(":", ""));
        int e21 = Integer.parseInt(event2[1].replace(":", ""));
        if (e10 == e20) {
            return true;
        }
        if (e10 < e20) {
            return e20 <= e11;
        }
        return e10 <= e21;
    }
}