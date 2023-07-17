package javaself;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s =sc.nextInt();
		
		
     for(int no=1;no<=s;no++)
     {
    	 System.out.println(no+"*"+n+"="+no*n);
     }
	}

}
