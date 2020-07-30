package thuc_hanh_crawl_danh_sach_bai_hat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample2 {
    public static void main(String[] args) throws IOException {
        try {

            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder contentBuilder = new StringBuilder();
            String str;

            while ((str = bufferedReader.readLine()) != null) {
                contentBuilder.append(str);
            }
            String content = contentBuilder.toString();
            bufferedReader.close();

            content = content.replaceAll("\\\\R", "");
            Pattern pattern = Pattern.compile("name_song\">(.*?)</a>");
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

