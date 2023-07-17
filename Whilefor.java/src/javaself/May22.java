package javaself;

import java.util.Scanner;

public class May22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		May22 M = new May22();
//		M.first();
//		M.secound();
		M.third();
//		M.fourth();
//		M.five();
//		M.six();
//		M.seven();
//		M.eight_y();
//		M.pyramid();
//		M.pyramid2();

	}

	private void pyramid2() {
		// TODO Auto-generated method stub
		  int size = 5;
		    for (int i = 0; i < size; i++) {
		      // print spaces
		      for (int j = 0; j < size - i - 1; j++) {
		        System.out.print(" ");
		      }
		      // print stars
		      for (int k = 0; k < 2* i + 1; k++) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
		  }
		

	private void pyramid() {
		// TODO Auto-generated method stub
		int i,j,row;
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
//		outer loop work:
		for(i=1;i<=row;i++);
		{
//			inner loop work
			for(j=i;j<=row-i;j++);
			{
//				print space
				System.out.print(" ");
				}
//			inner loop in column work
			for(j=1;j<=i;j++);
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		sc.close();
		
	}

	private void eight_y() {
		// TODO Auto-generated method stub
		for(int row=1; row<=9;row++)
	    {
	      if(row<=5) 
	      {
	        for(int col=1; col<=9;col++)
	        {
	          if(col==row || col==10-row)
	          {
	            System.out.print("* ");
	          }
	          else
	            System.out.print("  ");
	        }
	        System.out.println();
	      }
	      else
	      {
	        for(int space=1; space<=4; space++)
	        {
	          System.out.print("  ");
	        }
	      System.out.println("*");
	      }
	      
	    }
	  	  }


	private void seven() {
		// TODO Auto-generated method stub
		for(int star=1; star<=9; star++)
	    {
	    System.out.print("*"+" ");
	    }
	System.out.println(); 
	for(int star=1; star<=7; star++)
	    {
	    for(int space=1; space<=4; space++)
	        {
	        System.out.print(" "+" ");
	        }
	    System.out.println("*"); 
	}
	for(int star=1; star<=5; star++)
    {
    System.out.print("*"+" ");
    }
		
	}

	private void six() {
		// TODO Auto-generated method stub
		   for(int col=1; col<=7; col++)
		      {
		      if(col==1)
		          System.out.print("  "); 
		      else
		          System.out.print("* "); 
		      }
		    System.out.println();
		  for(int star=1; star<=7; star++)
		      {
		      System.out.print("* "); 
		      for(int space=1; space<=6;space++)
		        {
		        System.out.print("  ");
		        }
		      System.out.println("*"); 
		      }
		  for(int col=1; col<=7; col++)
		      {
		       if(col==1)
		          System.out.print("  "); 
		      else
		          System.out.print("* "); 
		      }
		    System.out.println();
		    for(int star=1; star<=7; star++)
		      {
		      System.out.print("* "); 
		      for(int space=1; space<=6;space++)
		        {
		        System.out.print("  ");
		        }
		      System.out.println("*"); 
		      }
		    for(int col=1; col<=7; col++)
		      {
		       if(col==1)
		          System.out.print("  "); 
		      else
		          System.out.print("* "); 
		      }
		    
		  }
		
	

	private void five() {
		// TODO Auto-generated method stub
		   for(int col=1; col<=7; col++)
		      {
		      if(col==1)
		          System.out.print("  "); 
		      else
		          System.out.print("* "); 
		      }
		    System.out.println();
		  for(int star=1; star<=7; star++)
		      {
		      System.out.print("* "); 
		      for(int space=1; space<=6;space++)
		        {
		        System.out.print("  ");
		        }
		      System.out.println("*"); 
		      }
		  for(int col=1; col<=7; col++)
		      {
		       if(col==1)
		          System.out.print("  "); 
		      else
		          System.out.print("* "); 
		      }
		
	}

	private void fourth() {
		// TODO Auto-generated method stub
		for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.println("* "); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println(); 
	    for(int star=1; star<=7; star++)
	      {
	      System.out.println("* "); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    
	    
	  }



	private void third() {
		// TODO Auto-generated method stub
		  for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=3; star++)
	      {
	      System.out.println("* "); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	  for(int space=1; space<=6;space++)
      {
      System.out.print("  ");
      }
    System.out.println("*");
    for(int star=1; star<=3; star++)
    	 
    {
    System.out.println("             *"); 
    }
   for(int star=7;star>=1;star--)
    {
     if(star==7)
        System.out.print("  "); 
    else
        System.out.print("* "); 
    }
	
	}

	private void secound() {
		// TODO Auto-generated method stub
		for(char row = 'E'; row>='A'; row--)
	    {
	      for(char star='A'; star<='E'-row; star++)
	        {
	        System.out.print("  ");
	        }
	    for(char col='A'; col<=row; ++col)
	        {
	        System.out.print(col+"   "); 
	        }
	    System.out.println(); 
	    }
		
	}

	private void first() {
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
		
	}


