package Pattern_sample;

public class Patternsiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patternsiva p = new Patternsiva();
		
//		p.pattern1();
//		p.pattern2();
//		p.pattern3();
//		p.pattern4();
//		p.pattern5();
//		p.pattern6();
//		p.pattern7();

	}
	
	private void pattern7() {
		// TODO Auto-generated method stub
		for(int count=10;count<=20;count++) {
			for(int no=count;no<1;no++) {
				System.out.println("no" +"");
			}
			System.out.println();
			}
		}
		
		
	

	private void pattern6() {
		// TODO Auto-generated method stub
		
	
		
	}

	private void pattern5() {
		// TODO Auto-generated method stub
		for(int count=5;count>=1;count--) {
			for(int no=count;no>=1;no--) {
				System.out.print(no+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern4() {
		// TODO Auto-generated method stub
		int count=1;
		while(count<=5) {
		for(int i=5;i>=count;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		count++;
	}
		
	}

	private void pattern3() {
	    // TODO Auto-generated method stub
	    int count = 5; 
	    while(count>=1)
	    {
	        for(int no=1; no<=count; no++) {
	        System.out.print(no+" "); 
	        }
	        System.out.println(); 
	    count--; 
	    }
	    
	  }

	private void pattern2() {
		// TODO Auto-generated method stub
		for(int no=1; no<=25; no++)
	    {
	    System.out.print(no+" ");
	    if(no%5==0)
	    {
	      System.out.println();
	    }
	    }
		
	}

	private void pattern1() {
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

}