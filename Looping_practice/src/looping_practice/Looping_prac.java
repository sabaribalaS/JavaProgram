package looping_practice;

public class Looping_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping_prac pr = new Looping_prac();
//		pr.print1(); 
//		pr.printno();
//		pr.printno1();
//		pr.print3();
//		pr.print4(); //multiple of 3 and 5
//		pr.divided_of_3();
//		pr.multiples_or3or5();
//		pr.divisors_of_given_no();
//		pr.count_of_divisors();
//		pr.prime_no();
//		pr.reverseno();
		pr.palindrome();
		
		

	}

	private void palindrome() {
		// TODO Auto-generated method stub
		int no=121;
		int no1 =no;
		int rev=0;
		while(no>0) {
			int rem=no%10;//1 2
			rev=(rev*10)+rem;//1 12
			no=no/10;//122  12
		}
		System.out.println("rev is:"+rev);
		if(rev==no1) {
			System.out.println("given no is palindrome: "+rev);
			}
		else {
			System.out.println("not palindrome");
		}
	}

	private void reverseno() {
		// TODO Auto-generated method stub
		int no=1234;
		int rev=0;
		while(no>0) {
			int rem=no%10;//1234%10=4  123%10=
 			 rev=(rev*10)+rem;//(0*10)+4=4 (4*10)+3=43  
			no=no/10;//1234/10   123/10  12/10   
//			            4 43 
			
		}
		
		System.out.println("Reverse is: "+rev);
	}

	private void prime_no() {
		// TODO Auto-generated method stub
//		pagaa ean:11
		int no =131;
		int div=2;
		int count=0;
		while(div<no) {
			if(no%div==0) {
				System.out.print(div+" ");
				count++;
				
			}
			div++;
		}
		System.out.println("The count is: "+count);
		if(count==0) {
			System.out.println("is prime no");
		}
		else {
			System.out.println("is not prime no");
		}
		
		
		
		
	}

	private void count_of_divisors() {
		// TODO Auto-generated method stub
		int no=80;
		int div=2;
		int count=0;
		while(div<=no) {
			if(no%div==0) {
				
				System.out.println(div);
			count++;
			}
			div++;
			
		}
		System.out.print("The count is:"+count);
		
	}



	private void divisors_of_given_no() {
		// TODO Auto-generated method stub
		int no=50;
		int div =2;
		while(div<=no) {
			if(no%div==0) {//50%2==0
				System.out.println(div);
			}
			div++;
		}
		
	}

	private void multiples_or3or5() {
		// TODO Auto-generated method stub
		for(int no=1;no<=20;no++) {
			if(no%3==0 || no%5==0 ) {
				System.out.print(no+" ");
			}
		}
		
	}

	private void divided_of_3() {
		// TODO Auto-generated method stub
		for (int no=1;no<=20;no++) {
			if(no%3==0) {
				System.out.print(no+" ");
			}
		}
		
	}

	private void print4() {
		// TODO Auto-generated method stub
//		Multiples of 3 and 5
		for(int s=1;s<=40;s++) {
			if(s%3==0 && s%5==0) {
				System.out.print(s+" ");
			}
			
		}
		
	}

	private void print3() {
		// TODO Auto-generated method stub
//		3 6 9 12 15
		for(int no=3;no<=15;no=no+3) {
			System.out.print(no+" ");
		}
		
	}

	private void printno1() {
		// TODO Auto-generated method stub
//		1 3 5 7 9 
		int i=1;
		while(i<=9) {
			
			System.out.print(i+" ");
			i=i+2;
		}
		
		
	}

	private static void printno() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.print(i+" " );
		}
		
		
	}

	{
		// TODO Auto-generated method stub
		
	}

	private void print1() {
		// TODO Auto-generated method stub
//		output:1  1   1   1   1
		for(int i=1;i<=5;i++) {
			System.out.print("1 ");
		}
		
		
	}

}
