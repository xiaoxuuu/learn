package live.xiaoxu.util;

import java.security.MessageDigest;

public class MD5Util {

    /**
     * 生成 MD5
     */
    public static String getMD5(String message) {
        String md5str = "";
        try {
            // 1 创建一个提供信息摘要算法的对象，初始化为 MD5 算法对象
            MessageDigest md = MessageDigest.getInstance("MD5");

            // 2 将消息变成 byte 数组
            byte[] input = message.getBytes();

            // 3 计算后获得字节数组，这就是那 128 位了
            byte[] buff = md.digest(input);

            // 4 把数组每一字节（一个字节占八位）换成 16 进制连成 MD5 字符串
            md5str = bytesToHex(buff);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return md5str;
    }

    /**
     * 二进制转十六进制
     */
    public static String bytesToHex(byte[] bytes) {
        StringBuilder md5str = new StringBuilder();
        // 把数组每一字节换成 16 进制连成 MD5 字符串
        int digital;
        for (byte aByte : bytes) {
            digital = aByte;

            if (digital < 0) {
                digital += 256;
            }
            if (digital < 16) {
                md5str.append("0");
            }
            md5str.append(Integer.toHexString(digital));
        }
        return md5str.toString().toUpperCase();
    }
}