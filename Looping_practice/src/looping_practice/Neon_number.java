package looping_practice;
import java.util.Scanner;
public class Neon_number {
//	9 9square = 81  =8+1=9 neon;
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Neon_number lp = new Neon_number();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no to be check neon");
		int a = sc.nextInt();
		int power=lp.power(a);
//		System.out.println(power);
		int sum=0;
		while(power>0) {
			int rem=power%10;//8%10=8
			sum=sum+rem;//0+1 1+8=9
			power=power/10;//81/10=8 8/10=0
		}
		if(sum==a) {
			System.out.println(a+ " given is neon");
		}
		else {
			System.out.println(a+"  is an not neon");
		}
		}
		private int power(int a) {
		// TODO Auto-generated method stub
		int base=a;
		int power =base*base;
		return power;
		
	}

}
