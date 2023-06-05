package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/apply-operations-to-an-array/">2460. 对数组执行操作</a></p>
 *
 * @author 小徐
 * @since 2023/6/5 10:55
 */
public class No002460 {

    public int[] applyOperations(int[] nums) {

        int[] returnArray = new int[nums.length];
        int returnIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 0 && nums[i + 1] == 0) {
                continue;
            }
            if (nums[i] != nums[i + 1]) {
                if (i == nums.length - 2) {
                    if (nums[i] != 0) {
                        returnArray[returnIndex] = nums[i];
                        returnIndex++;
                    }
                    returnArray[returnIndex] = nums[i + 1];
                    continue;
                }
                if (nums[i] == 0) {
                    continue;
                }
                returnArray[returnIndex] = nums[i];
            } else {
                nums[i + 1] = 0;
                returnArray[returnIndex] = nums[i] * 2;
            }
            returnIndex++;
        }
        return returnArray;
    }
}