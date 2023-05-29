package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/difference-between-element-sum-and-digit-sum-of-an-array/">2535. 数组元素和与数字和的绝对差</a></p>
 *
 * @author 小徐
 * @since 2023/2/8 10:58
 */
public class No002535_1 {

    /**
     * 通常解法
     *
     * @param numArray 数据
     * @return 结果
     */
    public int differenceOfSum(int[] numArray) {

        int a = 0, b = 0;
        for (int num : numArray) {
            a += num;
            b += digitSum(num);
        }
        return a - b;
    }

    private int digitSum(int num) {

        int res = 0;
        while (num >= 10) {
            res += num % 10;
            num = num / 10;
        }
        return res + num;
    }
}