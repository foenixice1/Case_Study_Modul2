package Case_Study_2.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScoreRegex {
    public static final String scoreRegex = "^\\d+$";

    public ScoreRegex(){
    }
    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(scoreRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
