package self_prepare;

public class Pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a = "Sunday Is Holiday";//"SundayIsHoliday"
        String s = new String("Holiay");
        String b = "SundayIsHoliday";//Sunday Is Holiday
        String c = new String("      Welcome To Java       ");
        
        System.out.println(a.replace(" ",""));
        System.out.println(b.replaceAll("([A-Z])"," $1"));
        System.out.println(c.trim());
        System.out.println(s.concat(a));
        System.out.println(b.contains(a));
        System.out.println(b.substring(6, 8));
	}
	
}
