package live.xiaoxu.regex;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    private static final Pattern URL_PATTERN = Pattern.compile("(?<=HREF=\")(?<url>.*?)(?=\" ADD_DATE)");
    private static final Pattern ICON_PATTERN = Pattern.compile("(?<=ICON=\")(?<icon>.*?)(?=\">)");
    private static final Pattern NAME_PATTERN = Pattern.compile("(?<=\">)(?<name>.*?)(?=</A>)");

    private static final String sql = "INSERT INTO `api`.`t_nav_website` VALUES (NUll, '%s', '-', '%s', '%s', '未分类', '未分类', NULL, 0, NULL, 'E', NULL, NULL, NULL, NULL, NULL, '%s');";

    public static void main(String[] args) throws IOException {

        Regex regex = new Regex();
        regex.function1("浏览器收藏夹.html");
    }

    public void function1(String fileName) throws IOException {
        // 注意 getResource("") 里面是空字符串
        String path = this.getClass().getClassLoader().getResource("").getPath();
        getFileContent(path + fileName);
    }

    /**
     * 根据文件路径读取文件内容
     *
     * @param fileInPath 文件路径
     * @throws IOException 异常
     */
    public static void getFileContent(Object fileInPath) throws IOException {
        BufferedReader br = null;
        if (fileInPath == null) {
            return;
        }
        if (fileInPath instanceof String) {
            br = new BufferedReader(new FileReader((String) fileInPath));
        } else if (fileInPath instanceof InputStream) {
            br = new BufferedReader(new InputStreamReader((InputStream) fileInPath));
        }
        String line;
        if (br != null) {
            while ((line = br.readLine()) != null) {
                if (!line.contains("<A HREF") || !line.contains("</A>")) {
                    continue;
                }
                Matcher urlMatcher = URL_PATTERN.matcher(line);
                if (!urlMatcher.find()) {
                    continue;
                }
                String url = urlMatcher.group("url");
                Matcher iconMatcher = ICON_PATTERN.matcher(line);
                if (!iconMatcher.find()) {
                    continue;
                }
                String icon = iconMatcher.group("icon");
                Matcher nameMatcher = NAME_PATTERN.matcher(line);
                if (!nameMatcher.find()) {
                    continue;
                }
                String name = nameMatcher.group("name");
                System.out.println(String.format(sql, name, url, name, icon));
            }
        }
        if (br != null) {
            br.close();
        }
    }
}