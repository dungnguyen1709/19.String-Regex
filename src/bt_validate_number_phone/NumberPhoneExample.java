package bt_validate_number_phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhoneExample {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String NUMBER_REGEX = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";

    public NumberPhoneExample() {
        pattern = Pattern.compile(NUMBER_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
