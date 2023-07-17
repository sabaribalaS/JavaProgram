package calm.learning;

public class diea {
	public static void main(String[] args) {
	    Even_Number ee=new Even_Number();
	    ee.mark();
	    
	    
	  }
	  
	      private void mark() {
	          // TODO Auto-generated method stub
	          Scanner sc=new Scanner(System.in);
	      
	          System.out.print("Enter  subjects count : ");
	          int sub_count = sc.nextInt(); //5
	            int[] marks = new int[sub_count];

	            int i = 0; 
	            while(i<marks.length)
	            {
	              System.out.print("Enter the Marks : ");
	          marks[i] = sc.nextInt(); 
	          System.out.println(marks[i]);
	          
	          int b=marks[i]%10;
	          int a=marks[i]/10;
	            if(a<b)
	          System.out.println("Conditions satisfied: "+marks[i]);  
	            else
	              System.out.println("condition false");
	              i++; 
	            }
	           
	      }
}
