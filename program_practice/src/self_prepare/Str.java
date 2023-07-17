package self_prepare;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sabaribala";
		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);  //charAt method
			System.out.println(charAt);
			
		}
int length = s.length();	
System.out.println(length); // lengthmethod
String sw =s.substring(6, s.length());
System.out.println(sw);//substring
try {
	String st = s.substring(11);
	System.out.println(st);
}
catch(StringIndexOutOfBoundsException ae) {

	}
boolean contains = s.contains(sw);
//System.out.println(contains);
String ss = "SaBaRIBAlA";
String sss = "SaBaRIbala";
if (ss.equalsIgnoreCase(sss)) {
	System.out.println("true");
}
else {
	System.out.println("false");
}

	}}
