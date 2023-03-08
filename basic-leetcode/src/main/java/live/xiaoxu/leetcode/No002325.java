package live.xiaoxu.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * <p><a href="https://leetcode.cn/problems/decode-the-message/">2325. 解密消息</a></p>
 *
 * @author 小徐
 * @since 2023/2/8 10:58
 */
public class No002325 {

    public static void main(String[] args) {

        System.out.println(new No002325().decodeMessage("the quick brown fox jumps over the lazy dog", "thequickbrownfxjmpsvlazydg"));
        System.out.println(new No002325().decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
        System.out.println(new No002325().decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }

    /**
     * 通常解法
     *
     * @param key     加密规则
     * @param message 消息
     * @return 结果
     */
    public String decodeMessage(String key, String message) {

        char cur = 'a';
        Map<Character, Character> map = new HashMap<>();

        for (char s : key.toCharArray()) {
            if (s != 32 && !map.containsKey(s)) {
                map.put(s, cur);
                cur++;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c != 32) {
                stringBuilder.append(map.get(c));
                continue;
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}