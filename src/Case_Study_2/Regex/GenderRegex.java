package Case_Study_2.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GenderRegex {
    public static final String genderRegex = "^[Nn][Aa][Mm]+|[Nn][Uu]$";

//    public GenderRegex(){
//    }
    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(genderRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
