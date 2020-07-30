package th_validateaccount;

import java.util.regex.Pattern;

import java.util.regex.Matcher;


public class AccountExample {

    private static Pattern pattern;
    private static Matcher matcher;

    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountExample() {
        pattern = Pattern.compile(ACCOUNT_REGEX);

    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
