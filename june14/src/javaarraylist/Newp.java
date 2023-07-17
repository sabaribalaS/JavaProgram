package javaarraylist;

import java.util.Scanner;

public class Newp {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int no=	sc.nextInt();
		
		for(int i =1;i<=10;i++)
		{
			System.out.println(no+"*"+i+"="+(no*i));
		}
		
	}

}
