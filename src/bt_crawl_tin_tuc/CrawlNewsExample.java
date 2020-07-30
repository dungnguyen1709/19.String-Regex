package bt_crawl_tin_tuc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNewsExample {
    public static void main(String[] args) throws IOException {
        try {
            URL url = new URL ("https://dantri.com.vn/the-gioi.htm");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder builder = new StringBuilder();
            String str;

            while ((str = bufferedReader.readLine()) != null) {
                builder.append(str);
            }

            String content = builder.toString();
            bufferedReader.close();

            content = content.replaceAll("\\\\R","");
            Pattern pattern = Pattern.compile("class=\"news-item__sapo\" title=\"(.*?)\" href=");
            Matcher matcher = pattern.matcher(content);

            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
