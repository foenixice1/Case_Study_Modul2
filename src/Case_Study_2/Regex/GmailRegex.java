package Case_Study_2.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmailRegex {
    public static final String gmailRegex = "^[A-Za-z0-9]+[A-Za-z0-9]*(@gmail.com)$";

    public GmailRegex() {
    }
    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(gmailRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
