package Case_Study_2.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IDRegex {
    public static final String idRegex = "^[H][S]+\\d{6}$";

    public IDRegex() {
    }

    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(idRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
