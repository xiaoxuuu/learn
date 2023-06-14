package live.xiaoxu.util;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EncodeUtil {

    private static final String CONFUSION_VARIABLE = "0B4FD093BD6A97154001542E682A9289";

    public static String encodeData(Object data) {

        String md5 = MD5Util.getMD5(data.toString() + CONFUSION_VARIABLE);
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : md5.toCharArray()) {
            if (48 <= c && c <= 57) {
                // 0 ~ 9 映射为 G ～ P
                stringBuilder.append((char) (c + 23));
            } else {
                stringBuilder.append(c);
            }
        }

        log.debug("原数据：{}，编码后数据：{}", data, stringBuilder);
        return stringBuilder.toString();
    }
}