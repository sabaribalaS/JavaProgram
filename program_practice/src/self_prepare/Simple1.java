package self_prepare;

import java.util.Scanner;

public class Simple1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double FirstNumber=sc.nextDouble();
		
		
		
		System.out.println("Enter the Second number: ");
		double SecondNumber = sc.nextDouble();
//		double addition = FirstNumber+SecondNumber;
//		System.out.println("Addition is: "+addition);

		System.out.println("Select an operator:");
		System.out.println("1.Addition");
		System.out.println("2.Subraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int operator =sc.nextInt();
		double result =0;
		     if (operator == 1) {
			         result = FirstNumber+SecondNumber;
			             }
		
		else {
			System.out.println("Invalid operator : ");
			
			
		}
		     System.out.println("Result:"+result);
		     
		

	}

}
