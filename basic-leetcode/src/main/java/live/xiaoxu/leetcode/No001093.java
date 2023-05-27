package live.xiaoxu.leetcode;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p><a href="https://leetcode.cn/problems/statistics-from-a-large-sample/">1093. 大样本统计</a></p>
 *
 * @author 小徐
 * @since 2023/5/27 10:41
 */
public class No001093 {

    public double[] sampleStats(int[] count) {

        // 最小数（数组索引）
        int minimum = 255;
        // 最大数（数组索引）
        int maximum = 0;
        // 平均值（数组索引 * 数据）/ 总数
        double mean = 0D;
        // 中位数（数据）
        double median = 0D;
        // 众数（数组索引）
        int mode = 0;
        // 总共出现的数字个数
        long allTimes = 0;
        LinkedHashMap<Integer, Long> map = new LinkedHashMap<>();
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                continue;
            }
            maximum = Math.max(maximum, i);
            if (count[i] > count[mode]) {
                mode = i;
            }
            allTimes += count[i];
            mean += (double) count[i] * i;
            map.put(i, (long) count[i]);
        }

        // 中位数位置
        long mapHalfSize = allTimes / 2;
        long index = 0;
        Iterator<Map.Entry<Integer, Long>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Long> entry = iterator.next();
            index += entry.getValue();
            if (mapHalfSize == index) {
                if (allTimes % 2 == 0) {
                    median = (double) (entry.getKey() + iterator.next().getKey()) / 2;
                } else {
                    median = iterator.next().getKey();
                }
                break;
            }
            if (mapHalfSize < index) {
                median = entry.getKey();
                break;
            }
        }
        return new double[]{map.entrySet().iterator().next().getKey(), maximum, mean / allTimes, median, mode};
    }
}