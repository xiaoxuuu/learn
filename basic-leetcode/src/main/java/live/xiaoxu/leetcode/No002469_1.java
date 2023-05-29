package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/convert-the-temperature/">2469. 温度转换</a></p>
 *
 * @author 小徐
 * @since 2023/2/8 10:58
 */
public class No002469_1 {

    /**
     * 通常解法
     *
     * @param celsius 数据
     * @return 结果
     */
    public double[] convertTemperature(double celsius) {

        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}