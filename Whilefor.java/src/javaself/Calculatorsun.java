package javaself;

import java.util.Scanner;


public class Calculatorsun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double firstnumber = sc.nextDouble();
		
		System.out.println("Enter second number: ");
		double secondnumber = sc.nextDouble();
		System.out.println("Select any arithatic operators(+,*,/,%)");
char ch1 = sc.next().charAt(0);
	
//		char ch1 =charAt();
		if(ch1 == 0) {
			  double addition = firstnumber + secondnumber;
		      System.out.println("Sum is: "+ addition);
		}
		else {
		}
		System.out.println();
		
		
		if(ch1 == 1) {
		
		double multiple = firstnumber * secondnumber;
		System.out.println("multiple is: "+ multiple);
		}
		else {
		}
		
		if(ch1==2) {
		double divide = firstnumber / secondnumber;
		System.out.println("divided is: "+ divide);
		}
		else {
		}
		
		
		if(ch1 == 3) {
		double modulo = firstnumber % secondnumber;
		System.out.println("modulo is: "+ modulo);
		}
		else {
			
		}
	}

}
