package Case_Study_2.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberRegex {
    public static final String numberRegex = "^[0]\\d{9}$";

    public PhoneNumberRegex() {
    }
    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(numberRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
