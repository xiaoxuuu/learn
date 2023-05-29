package live.xiaoxu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <p><a href="https://leetcode.cn/problems/zigzag-conversion/">6. N 字形变换</a></p>
 *
 * @author 小徐
 * @since 2023/5/18 11:40
 */
public class No000006_2 {

    /**
     * 折返法
     *
     * @param s       字符串
     * @param numRows 所需行
     * @return 结果
     */
    public String convert(String s, int numRows) {

        int length = s.length();
        if (length <= 1 || numRows <= 1) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        // 当前行
        int i = 0;
        // 是否折返
        int flag = -1;
        for (char c : s.toCharArray()) {
            // 添加元素
            rows.get(i).append(c);
            // 判断下次是否需要折返
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            // 获取下一行索引
            i += flag;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) {
            res.append(row);
        }
        return res.toString();
    }

    /**
     * <p>规律法：</p>
     * <p>2 行：</p>
     * <pre>0 2 4 6 8 10 12 14 16 18</pre>
     * <pre>1 3 5 7 9 11 13 15 17</pre>
     * <p>3 行：</p>
     * <pre>0   4   8     12    16</pre>
     * <pre>1 3 5 7 9  11 13 15 17</pre>
     * <pre>2   6   10    14    18</pre>
     * <p>4 行：</p>
     * <pre>0     6      12        18</pre>
     * <pre>1   5 7   11 13    17</pre>
     * <pre>2 4   8 10   14 16</pre>
     * <pre>3     9      15</pre>
     *
     * @param s       字符串
     * @param numRows 所需行
     * @return 结果
     */
    public String convertTwo(String s, int numRows) {

        int length = s.length();
        if (length <= 1 || numRows == 1) {
            return s;
        }

        // 所有字符
        char[] charArray = s.toCharArray();
        List<StringBuilder> list = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }

        for (int i = 0; i < charArray.length; i++) {
            int k = i % (2 * numRows - 2);
            if (k <= numRows - 1) {
                // s[i] 就属于第 k 行
                list.get(k).append(charArray[i]);
            } else {
                // s[i] 就属于 2n-2-k 行
                list.get(2 * numRows - 2 - k).append(charArray[i]);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (StringBuilder stringBuilderField : list) {
            stringBuilder.append(stringBuilderField.toString());
        }
        return stringBuilder.toString();
    }

    /**
     * 暴力法，将每个字符放置到对应位置，再遍历
     *
     * @param s       字符串
     * @param numRows 所需行
     * @return 结果
     */
    public String convertOne(String s, int numRows) {

        if (s.length() <= 1 || numRows == 1) {
            return s;
        }

        // 所有字符
        char[] sArray = s.toCharArray();

        // 每次循环所需长度
        int cycleLength = numRows + (numRows - 2);
        // 循环占用宽度
        int cycleWidth = numRows - 1;

        // 完整循环剩余数量
        int cycleRemained = sArray.length % cycleLength;
        // 总共循环次数
        int cycleTimes = sArray.length / cycleLength + (cycleRemained == 0 ? 0 : 1);

        // 结果数组
        char[][] charArray = new char[numRows][cycleTimes * cycleWidth];

        for (int i = 0; i < sArray.length; i++) {

            // 第几次循环
            int cycleBatch = i / cycleLength;
            // 循环的第几个数字
            int cycleIndex = i % cycleLength;
            // 块索引
            int cycleBlockIndex = cycleBatch * cycleWidth;
            // 行
            int row;
            // 列
            int column;

            // 列加权
            int columnWeighting = 0;
            // 计算第几行
            if (cycleIndex + 1 <= numRows) {
                // 依次向下填充
                row = cycleIndex;
            } else {
                // 折返，倒数
                columnWeighting = cycleIndex - numRows + 1;
                row = numRows - 1 - columnWeighting;
            }

            // 计算第几列
            column = cycleBlockIndex + columnWeighting;

            // 放置
            charArray[row][column] = sArray[i];
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (char[] chars : charArray) {
            for (char aChar : chars) {
                if (aChar != '\u0000') {
                    stringBuilder.append(aChar);
                }
            }
        }
        return stringBuilder.toString();
    }
}