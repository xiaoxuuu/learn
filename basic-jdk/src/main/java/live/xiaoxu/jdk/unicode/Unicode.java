package live.xiaoxu.jdk.unicode;

public class Unicode {

    public static void main(String[] args) {

        // 截取前两个字符
        String str = "这是☁️云朵";
        System.out.println(subStr(str, 1));
        System.out.println(subStr(str, 2));
        System.out.println(subStr(str, 3));
        System.out.println(subStr(str, 4));
        String s = "☁️";
        System.out.println(substring(str, 0, 3));
    }

    private static String subStr(String str, int length) {

        int codePointCount = str.codePointCount(0, str.length());
        if (codePointCount > length) {
            // 获取包含 emoji 在内的两个字符实际长度
            int offset = str.offsetByCodePoints(0, length);
            return str.substring(0, offset);
        }
        return str;
    }

    public static String substring(String source, int start, int end) {
        String result;
        try {
            result = source.substring(source.offsetByCodePoints(0, start),
                    source.offsetByCodePoints(0, end));
        } catch (Exception e) {
            result = "";
        }
        return result;
    }
}
