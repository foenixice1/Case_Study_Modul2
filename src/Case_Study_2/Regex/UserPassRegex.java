package Case_Study_2.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserPassRegex {
    public static final String userRegex = "[^\\s]+";
    public UserPassRegex(){

    }
    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(userRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
