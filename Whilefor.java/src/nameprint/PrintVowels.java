package nameprint;
import java.util.Scanner;

public class PrintVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter a string");
		int vowel=0;
		int cons=0;
		int ws=0;
		String x= sc.nextLine();
		x=x.toLowerCase();
		for(int i=0;i<x.length();i++) {
		char ch = x.charAt(i);
		if(Character.isLetter(ch)==true) {
		if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
		vowel++;
		else
		cons++;
		}
		if(Character.isWhitespace(ch)==true)
			ws++;
		}
		System.out.println("Number of vowels" +vowel);
		System.out.println("Number of consonants"+cons);
		System.out.println("Number of whitespaces" +ws);

	}

}
