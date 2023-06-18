package live.xiaoxu.util;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EncryptionUtil {

    private static final String confusionVariable = "0AAB595D13E70AA81A9B52DBE69F922E";

    public static String encryptionData(String data) {

        String md5 = MD5Util.getMD5(data + confusionVariable);
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : md5.toCharArray()) {
            if (c < 58 && 47 < c) {
                stringBuilder.append((char) (c + 22));
            } else {
                stringBuilder.append(c);
            }
        }

        log.debug("原数据：{}，编码后数据：{}", data, stringBuilder);
        return stringBuilder.toString();
    }
}