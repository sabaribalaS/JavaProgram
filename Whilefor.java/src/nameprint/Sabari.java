package nameprint;

public class Sabari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sabari sb = new Sabari();
		sb.print_s();
		sb.print_a();
		sb.print_b();

	}

	private void print_b() {
		// TODO Auto-generated method stub
		 int size = 5;
	        
	        for (int i = 1; i <= size; i++) {
	            for (int j = 1; j <= size; j++) {
	                if (i == 1 || j == 1 || i == j || i == size - j + 1) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	
		
	

	private void print_a() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=9;col++)
			{
				if(col==row|| col==10-row || col==5-row )
				{
					System.out.print("* ");
				}
				else
				
				
				System.out.print("  ");
			}
			System.out.println();
		}
		
	}

	private void print_s() {
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
 System.out.println();
 System.out.println();
 }
	
}

	
	

