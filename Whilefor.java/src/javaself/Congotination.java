package javaself;

public class Congotination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30};
		int[] b = {40,50};
		int length=a.length+b.length;
		int[] c=new int[length];
		for(int i=0;i<a.length;i++)
		{
			c[i] = a[i];
			
		}
		int j =0;
		for(int i=a.length;i<c.length;i++)
		{
			c[i] =b[j];
			j++;
		}
		for(int i=0;i<c.length;i++)
		{
		   System.out.println (c[i]);
		   
		}
		

	}

}
