package live.xiaoxu.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Xiao Xu
 * @date 2021/9/14 上午 10:38
 * https://leetcode-cn.com/problems/reconstruct-original-digits-from-english/
 * <p>
 * 0 zero，
 * 1 one，
 * 2 two，
 * 3 three，
 * 4 four，
 * 5 five，
 * 6 six，
 * 7 seven，
 * 8 eight，
 * 9 nine。
 */
public class No000423 {

    //@Test
    public void test() {

        System.out.println(originalDigits("owoztneoer"));
        System.out.println(originalDigits("fviefuro"));
    }

    public String originalDigits(String s) {

        Map<String, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            Integer i = map.getOrDefault(c + "", 0);
            map.put(c + "", i + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < map.getOrDefault("z", 0); i++) {
            sb.append("0");
        }
        for (int i = 0; i < map.getOrDefault("z", 0); i++) {
            sb.append("0");
        }
        return s;
    }
}