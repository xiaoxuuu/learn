package live.xiaoxu.leetcode;

import java.util.HashMap;

/**
 * <p><a href="https://leetcode.cn/problems/two-sum/">1. 两数之和</a></p>
 *
 * @author 小徐
 * @since 2023/5/19 10:07
 */
public class No000001 {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (map.containsKey(result)) {
                return new int[]{i, map.get(result)};
            }
            map.put(nums[i], i);
            map.put(-result, i);
        }
        return null;
    }

    public int[] twoSumOen(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (sub == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}