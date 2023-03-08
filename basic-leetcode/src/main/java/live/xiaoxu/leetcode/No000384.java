package live.xiaoxu.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <p><a href="https://leetcode-cn.com/problems/shuffle-an-array/">384. 打乱数组</a></p>
 *
 * @author 小徐
 * @since 2021/9/14 10:38
 */
public class No000384 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        Solution solution = new Solution(nums);
        int[] shuffle = solution.shuffle();
        int[] reset = solution.reset();
        int[] shuffle1 = solution.shuffle();
        int[] shuffle2 = solution.shuffle();
    }

    public static class Solution {

        private static final Random RANDOM = new Random();
        int[] nums, ret;
        List<Integer> list = new ArrayList<>();

        public Solution(int[] nums) {
            this.nums = nums;
            this.ret = new int[nums.length];
        }

        public int[] reset() {
            return nums;
        }

        public int[] shuffle() {

            for (int num : nums) {
                list.add(num);
            }
            for (int i = 0; i < nums.length; i++) {
                ret[i] = list.remove(RANDOM.nextInt(nums.length - i));
            }
            return ret;
        }
    }
}