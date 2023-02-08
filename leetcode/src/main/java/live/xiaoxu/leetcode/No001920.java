package live.xiaoxu.leetcode;

import java.util.Arrays;

/**
 * <p><a href="https://leetcode.cn/problems/build-array-from-permutation/">1920. 基于排列构建数组</a></p>
 *
 * @author 小徐
 * @since 2023/2/8 10:58
 */
public class No001920 {

    public static void main(String[] args) {

        int[] numOne = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(new No001920().buildArray(numOne)));
        int[] numsTwo = {5, 0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(new No001920().buildArray(numsTwo)));
    }

    /**
     * 通常解法
     *
     * @param numArray 数组
     * @return 结果
     */
    public int[] buildArray(int[] numArray) {

        int[] ints = new int[numArray.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = numArray[numArray[i]];
        }
        return ints;
    }
}