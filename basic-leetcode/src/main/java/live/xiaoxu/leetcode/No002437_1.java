package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/number-of-valid-clock-times/">2437. 有效时间的数目</a></p>
 *
 * @author 小徐
 * @since 2023/2/8 10:58
 */
public class No002437_1 {

    /**
     * 获取有效时间
     *
     * @param time 时间
     * @return 有效个数
     */
    public int countTime(String time) {

        // 小时分钟分开处理
        String[] split = time.split(":");
        // 小时有几种情况
        int hourTime;
        // 分钟有几种情况
        int minTime = 1;

        // 计算小时
        switch (split[0]) {
            case "?0", "?1", "?2", "?3" -> hourTime = 3;
            case "?4", "?5", "?6", "?7", "?8", "?9" -> hourTime = 2;
            case "0?", "1?" -> hourTime = 10;
            case "2?" -> hourTime = 4;
            case "??" -> hourTime = 24;
            default -> hourTime = 1;
        }

        // 计算分钟
        if (split[1].startsWith("?")) {
            minTime *= 6;
        }
        if (split[1].endsWith("?")) {
            minTime *= 10;
        }

        // 总个数
        return hourTime * minTime;
    }
}