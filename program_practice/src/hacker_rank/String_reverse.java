package hacker_rank;

import java.util.Scanner;

public class String_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String A =sc.next();//ashwini
		String b="";
		for(int i=A.length()-1;i>=0;i--) {
		b=b+A.charAt(i);
		}
		
		System.out.println(b);
		if(A.equals(b)) {
			System.out.println("yes its palindrome");
		}
		else {
			System.out.println("no its not palindrome");
		}
		
//		b=b+A.charAt(5);
//		b=b+A.charAt(4);
//		b=b+A.charAt(3);
//		b=b+A.charAt(2);

	}

}
