package looping_practice;

import java.util.Scanner;

public class Armstrong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1643 =4
//		1 6 4 3 
//		1 power4 +6 power4=1643//
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int count=digits_count_(i);
		int sum=armstrong_no(i , count);
		if(sum==i) {
System.out.println("armsstrong");
	}
		else {
			System.out.println("is not arm");
		}
		
		}

private static int armstrong_no(int i, int count) {
	int sum =0;
	while(i>0) {
	int rem=i%10;//153%10=3^
	int result=find_power(rem, count);
	sum=sum+result;
	i=i/10;
	}
	return sum;
	}
private static int find_power(int base, int power) {
	// TODO Auto-generated method stub
		int box=1;
		while(power>0) {
			//
		box=box*base;//1*9=9  9*9=81 81*9=729
		power=power-1;//3-1=2 2-1=1 1-1=0
		}
	return box;
}
	private static int digits_count_(int i) {
		// TODO Auto-generated method stub
		int count=0;
		int no =i;
		while(no>0) {
			no=no/10;
			count++;
			}
		return count;
	}

}








