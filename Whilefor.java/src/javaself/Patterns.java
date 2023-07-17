package javaself;

import java.util.regex.Pattern;

public class Patterns {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		for(int count = 1; count<=3;count++)
	    {
	        for(int no = 1; no<=5; no++)
	        {
	        System.out.print(no+" "); 
	        }
	        System.out.println(); 
	    }

	}
private void pattern3() {
    // TODO Auto-generated method stub
    int count = 5; 
    while(count>=3)
    {
        for(int no=1; no<=count; no++) {
        System.out.print(no+" "); 
        }
        System.out.println(); 
    count--; 
    }
    
  }
}
