package live.xiaoxu.leetcode;

/**
 * <p><a href="https://leetcode-cn.com/problems/reconstruct-original-digits-from-english/">423. 从英文中重建数字</a></p>
 * <p>0 zero、1 one、2 two、3 three、4 four</p>
 * <p>5 five、6 six、7 seven、8 eight、9 nine</p>
 *
 * @author 小徐
 * @since 2023/1/6 10:23
 */
public class No000423 {

    public static void main(String[] args) {
        assert "012".equals(originalDigits("owoztneoer"));
        assert "45".equals(originalDigits("fviefuro"));
    }

    /**
     * <p>按照单词包含字母情况进行数据取出</p>
     *
     * @param s 字符串
     * @return 排序好的结果
     */
    public static String originalDigits(String s) {

        int[] intArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // 统计字母出现次数
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'z' -> intArray[0]++;
                case 'o' -> intArray[1]++;
                case 'w' -> intArray[2]++;
                case 'h' -> intArray[3]++;
                case 'u' -> intArray[4]++;
                case 'v' -> intArray[5]++;
                case 'x' -> intArray[6]++;
                case 's' -> intArray[7]++;
                case 'g' -> intArray[8]++;
                case 'i' -> intArray[9]++;
            }
        }

        // 删除重复统计
        if (0 != intArray[7]) {
            intArray[7] = intArray[7] - intArray[6];
        }
        if (0 != intArray[5]) {
            intArray[5] = intArray[5] - intArray[7];
        }
        if (0 != intArray[3]) {
            intArray[3] = intArray[3] - intArray[8];
        }
        if (0 != intArray[9]) {
            intArray[9] = intArray[9] - intArray[5] - intArray[6] - intArray[8];
        }
        if (0 != intArray[1]) {
            intArray[1] = intArray[1] - intArray[0] - intArray[2] - intArray[4];
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < intArray.length; i++) {
            stringBuilder.append((String.valueOf(i)).repeat(intArray[i]));
        }

        return stringBuilder.toString();
    }
}