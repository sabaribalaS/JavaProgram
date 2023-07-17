package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Regex2 rx = new Regex2();
//		rx.rx100();
		rx.rx200();
//		String password = "Chennai 600001";
//		  Pattern patternObj = Pattern.compile("\\d");
//		    Matcher matcherObj = patternObj.matcher(password);
//		    int count = 0;
//		    while(matcherObj.find())
//		    {
//		      count++;
//		      System.out.print(matcherObj.group());
//		    }
//		    System.out.println(count);

	}

	

	private void rx200() {
		// TODO Auto-generated method stub
		String pattern = "-";
	       String input = "28-March-2023";
	            Pattern patternObj = Pattern.compile(pattern);
	            String[] items = patternObj.split(input);
	            for(int i=0;i<items.length;i++)
	            {
	              System.out.println(items[i]);
	            }
		
	}



	private void rx100() {
		// TODO Auto-generated method stub
		String mobile = "9884012810";
		  Pattern patternObj = Pattern.compile("(0)?[0-9]{10}");
		    Matcher matcherObj = patternObj.matcher(mobile);
		    while(matcherObj.find())
		    {
		      System.out.print(matcherObj.group());
		    }
		
	}

}
