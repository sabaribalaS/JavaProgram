package javaarraylist;

public class Laptop {

	int price; 
	  
	  public Laptop(int price) {
	    // TODO Auto-generated constructor stub
	    this.price = price; 
	  }
	  public static void main(String[] args) {
	    Laptop lap1 = new Laptop(25000); 
	    Laptop lap2 = new Laptop(26000); 
	    System.out.println(lap1.equals(lap2)); 
	  }
	  public boolean equals(Object ob)
	  {
	    System.out.println(this.price);
	    Laptop ll = (Laptop) ob; 
	    System.out.println(ll.price);
	    if(this.price>ll.price)
	        return true; 
	    else
	        return false; 
	  
	  }
}

