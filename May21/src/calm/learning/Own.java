package calm.learning;

public class Own {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Own o = new Own();
//		o.star1();
//		o.star2();
//		o.star3();
//		o.star4();
//		o.star5();
//		o.star6();
//		o.star7();
//		o.star8();
//		o.star9();
//		o.star10();
//		o.star11();
//		o.pattern();
//		o.pattern1();
}
private void pattern1() {
		// TODO Auto-generated method stub
//	* * * * * * *
//	      *
//        *
//	      *
//	      *
//	      *
//	      *
	for(int row=1;row<=7;row++);
	{
		System.out.print("* "+" ");
		
	}
	{
	System.out.println();
	}
		
	}
private void pattern() {
		// TODO Auto-generated method stub
	for(int row = 5; row>=1; row--)
    {
      for(int star=1; star<=5-row; star++)
        {
        System.out.print("  ");
        }
    for(int col=1; col<=row; ++col)
        {
        System.out.print(col+" "); 
        }
    System.out.println(); 
    }

    
  }


private void star11() {
		// TODO Auto-generated method stub
//	1 2 3 4 5 
//	  1 2 3 4
//	    1 2 3 
//	      1 2 
//	         1
	
	
	
	
		
	}
private void star10() {
		// TODO Auto-generated method stub
	
//	public class PatternProgram {
//	    public static void main(String[] args) {
	        int n = 5;
	        int startingNumber = n;
	        for (int i = 1; i <= n; i++) {
	            for (int j = startingNumber; j >= startingNumber - i + 1; j--) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	    }
	

private void star9() {
		// TODO Auto-generated method stub 
//	5
//	5 4
//	5 4 3 
//	5 4 3 2
//	5 4 3 2 1
	             int n = 5;
	        for (int i = n; i >= 1; i--) {
	            for (int j = n; j >= i; j--) {
	                System.out.print(j+" ");
	            }
	            System.out.println();
	        }
	    }
	

		
	
private void star8() {
		// TODO Auto-generated method stub
//		****1
//		***12
//		**123
//		*1234
//		12345
		for(int row=1;row<=5;row++);
		{
		
			int row=1;
			for(int star=5;star<=5-row;star++);
		
		{
			System.out.print("* "+" ");
		}
		System.out.println();}
		}
		
		private void star7() {
		// TODO Auto-generated method stub
//		1 2 3 4 5
//		2 3 4 5 
//		3 4 5 
//		4 5 
//		5
		for(int i =1;i<=5;i++)
		{
			int count=5;
			for(int j=i;j<=count;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			}
		
		
	
	}

	private void star6() {
		
		int rows=5;
	      for(int i=1;i<=rows;i++) {
	        
	        for(int j=i;j<=rows;j++) {
	          System.out.print(j+" ");
	          
	        }
	        
	        System.out.println();

	        }		
	}

	private void star5() {
		// TODO Auto-generated method stub
		for(int no = 5; no>=1; no--)
		{
		    for(int star = 1; star<no; star++)
		    	{   
		    	System.out.print("  ");     
		    	}
		    for(int num=1; num<=6-no; num++)
		    	{ 
		    	System.out.print(num+ " ");
		    	}
		     System.out.println(); 
		}
	}


		
	

	private void star4() {
		// TODO Auto-generated method stub
//		5 4 3 2 1 
//		5 4 3 2
//		5 4 3
//		5 4
//		5
		for(int count=5;count>=1;count--) {
		for(int no=5;no<=count;no++)
		{
			System.out.print(no+" ");
		}
		{
			System.out.println();
		}
		
	}
	}
	private void star3() {
		// TODO Auto-generated method stub
//		1 2 3 4 5 
//		1 2 3 4 
		
		
for(int c=5;c>=4;c--) 
{
		for(int no =1;no<=c;no++)
		{
			System.out.print(no+" ");
			
		}
		{
			System.out.println();
		}
}
	}
	private void star2() {
		// TODO Auto-generated method stub
//		1 2 3 4 5 
//		1 2 3 4 
//		1 2 3 
//		1 2
//		1
		for(int num=5;num>=1;num--)
		{
		for(int no=1;no<=num;no++)
		{
			System.out.print(no+" ");
			
		} 
		{
		System.out.println();
		}
	}
		
		
	}

	private void star1() {
		// TODO Auto-generated method stub
//		1 2 3 4 5 
//		1 2 3 4 5
		for(int num=1;num<=2;num++)
		{
		for(int no =1;no<=5;no++) 
		{
			System.out.print(no+" ");
		}
		
		{
			System.out.println();
		}
		}
		}
		
	}

