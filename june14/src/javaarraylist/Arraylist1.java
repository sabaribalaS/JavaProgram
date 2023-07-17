
package javaarraylist;
import java.util.ArrayList;
	import java.util.Scanner;
	public class Arraylist1
	{
		public static void main(String[] args) {
//	    // TODO Auto-generated method stub
			ArrayList marks = new ArrayList(); 
			int total =0;
Scanner sc = new Scanner(System.in); 
        int i=0;
 	    while(true)
	    {
	      System.out.println("Enter mark: ");
	    int mark = sc.nextInt(); 
	    marks.add(mark);
	    System.out.println("Enter N to stop"); 
	    char ch = sc.next().charAt(i);
	    	if(ch=='N'|| ch=='n') {
	        break; 
	        }
	    	
	    }
 	    for (int j = 0; j < marks.size(); j++) {
 	    	total=total+(int)marks.get(j);
			
		}
 	    System.out.println(total);
	  }
		

}



