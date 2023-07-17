package com.learning2;

public class Looping {
	public static void main(String[] args) {
		Looping ll = new Looping();
//ll.print_11111();
//		ll.star1();
		ll.star2();
	}

	private void star2() {
		// TODO Auto-generated method stub
		for(int no =5;no>=1;no--)
		{
			System.out.println("*");
		}
		for(int num =1;num<=6-no;num++)
		{
			System.out.println(1+"");
			
		}
		System.out.println();
		
	}

	private void star1() {
		// TODO Auto-generated method stub
		for(int count=5;count>=1;count--)
			for(int no =1;no<count;no++)
			{
				System.out.print("* "+" ");
			}
		System.out.println();
	
	}

	
 

	private void print_11111() {
		// TODO Auto-generated method stub
		int no =1;
		while(no<=5)
		{
			System.out.print(1+"");
			no=no+1;
		}
	}	

}


