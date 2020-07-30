package li_thuyet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test5 {
    public static void main(String[] args) {
       // String content = "01/10/2020";
        String content = "Nguyen8fas";
       // Pattern pattern = Pattern.compile("\\d{2}[/|-]\\d{2}[/|-]\\d{4}");
       // Pattern pattern = Pattern.compile("^[a-zA-Z0-9\\s]+$");
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{7,}+$");
       // Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{7,14}+$");
        Matcher matcher = pattern.matcher(content);
        System.out.println(matcher.matches());
    }
}
