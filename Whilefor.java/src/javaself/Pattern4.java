package javaself;

public class Pattern4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern4 p = new Pattern4();
//		Pattern5 p = new Pattern5();
		private void pattern4() {
		    // TODO Auto-generated method stub
		    for(int count = 5;count>=3;count--)
		    {
		        for(int no=1; no<=count; no++) {
		        System.out.print(no+" "); 
		        }
		        System.out.println(); 
		    
		    }
		    private void pattern5() {
		        // TODO Auto-generated method stub
		        int count =5; 
		        int num = 1; 
		        while(count>=1)
		        {
		        for(int no=1; no<=count; no++)
		        { 
		          System.out.print(num + "\t");
		          num++; 
		        }
		        System.out.println(); 
		        count--; 
		        }
		      
		    
//		  }

	}

}
