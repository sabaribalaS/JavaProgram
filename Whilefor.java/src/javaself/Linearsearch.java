package javaself;

import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int deva []= {10,20,30,40,50};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a key");
		int key=sc.nextInt();
		for(int i=0;i<deva.length;i++)
		{
			if(deva[i]==key)
			{
				System.out.println("key is present");
				
			}
			else
			{
				System.out.println("key is not present");
			}
		}

	}

}
