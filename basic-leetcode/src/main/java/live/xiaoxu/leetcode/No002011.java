package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode.cn/problems/final-value-of-variable-after-performing-operations/">2011. 执行操作后的变量值</a></p>
 *
 * @author 小徐
 * @since 2023/2/8 10:58
 */
public class No002011 {

    public static void main(String[] args) {

        String[] operations = new String[]{"X++", "++X", "--X", "X--"};
        System.out.println(new No002011().finalValueAfterOperations(operations));

        String[] operations2 = new String[]{"--X", "X++", "X++"};
        System.out.println(new No002011().finalValueAfterOperations(operations2));

        String[] operations3 = new String[]{"++X", "++X", "X++"};
        System.out.println(new No002011().finalValueAfterOperations(operations3));
    }

    /**
     * 通常解法
     *
     * @param operations 公式
     * @return 结果
     */
    public int finalValueAfterOperations(String[] operations) {

        int x = 0;
        for (String operation : operations) {
            x += operation.charAt(1) == '+' ? 1 : -1;
        }
        return x;
    }
}