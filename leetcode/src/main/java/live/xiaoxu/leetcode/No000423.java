package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>https://leetcode-cn.com/problems/reconstruct-original-digits-from-english/</p>
 * <p>0 zero、1 one、2 two、3 three、4 four</p>
 * <p>5 five、6 six、7 seven、8 eight、9 nine</p>
 *
 * @author 小徐
 * @since 2023/1/6 10:23
 */
public class No000423 {

    @Test
    public void test() {

        assert "012".equals(originalDigits("owoztneoer"));
        assert "45".equals(originalDigits("fviefuro"));
    }

    /**
     * <p>按照单词包含字母情况进行数据取出</p>
     * <p>0 -z zero</p>
     * <p>2 -w two</p>
     * <p>4 -u four</p>
     * <p>6 -x six</p>
     * <p>8 -g eight</p>
     * <p>7  s seven</p>
     * <p>5  v five</p>
     * <p>3  h three</p>
     * <p>9  i nine</p>
     * <p>1  o  one</p>
     *
     * @param s 字符串
     * @return 排序好的结果
     */
    public String originalDigits(String s) {

        String[] stringSortArray = {"z-0", "w-2", "u-4", "x-6", "g-8", "s-7", "v-5", "h-3", "i-9", "o-1"};
        Integer[] intArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        Map<String, Integer> map = new HashMap<>();
        // 计算字符串中字符数量
        for (char c : s.toCharArray()) {
            Integer i = map.getOrDefault(c + "", 0);
            map.put(c + "", i + 1);
        }

        for (String value : stringSortArray) {
            String[] split = value.split("-");
            String letter = split[0];
            int index = Integer.parseInt(split[1]);
            for (int k = 0; k < map.getOrDefault(letter, 0); k++) {
                Integer letterCount = intArray[index];
                intArray[index] = letterCount + 1;
            }
            map.remove(letter);
        }

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
            stringBuilder.append((i + "").repeat(intArray[i]));
        }

        return stringBuilder.toString();
    }
}