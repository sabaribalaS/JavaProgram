package javaself;

import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int no =sc.nextInt();
		int count =0;
		for(int div=2;div<no;div++)
		
			{
				if(no%div==0)
		
			
		System.out.println(div);
			count++;
			}
		
        if(count==0)
        {
        	System.out.println("Prime number");
        	
        }
        else
        {
        	System.out.println("Not prime number");
        }
	}

}
