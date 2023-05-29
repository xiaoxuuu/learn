package live.xiaoxu.leetcode;

import java.util.Map;
import java.util.Stack;

/**
 * <p><a href="https://leetcode.cn/problems/valid-parentheses/">20. 有效的括号</a></p>
 *
 * @author 小徐
 * @since 2023/5/8 16:02
 */
public class No000020_1 {

    private static final Map<Character, Character> MATCH_MAP = Map.of('}', '{', ']', '[', ')', '(');

    public boolean isValid(String s) {

        // 长度奇数
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (MATCH_MAP.containsKey(c)) {
                if (stack.empty()) {
                    return false;
                }
                Character pop = stack.pop();
                if (!pop.equals(MATCH_MAP.get(c))) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}