package live.xiaoxu.leetcode;

import java.util.Arrays;

/**
 * <p><a href="https://leetcode.cn/problems/convert-the-temperature/">2469. 温度转换</a></p>
 *
 * @author 小徐
 * @since 2023/2/8 10:58
 */
public class No002469 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new No002469().convertTemperature(36.50)));
        System.out.println(Arrays.toString(new No002469().convertTemperature(122.11)));
    }

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