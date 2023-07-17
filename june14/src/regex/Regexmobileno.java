package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexmobileno {
public static void main(String[] args) {
	String input = "My mobile number is 9884010000@gmail.com";
    Pattern patternObj = Pattern.compile("[a-zA-Z0-9$]");
    Matcher matcherObj = patternObj.matcher(input);
    while(matcherObj.find())
    {
      System.out.print(matcherObj.group());
//      System.out.println(matcherObj.start());
//      System.out.println(matcherObj.end());

    }
}
}
