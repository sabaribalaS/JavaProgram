package javaarraylist;

public class Mobiles  implements Comparable{

	public Mobiles (int price, int ram, float screensize, String brand)
    {
        super();
        this.price = price;
        this.ram = ram;
        this.screensize = screensize;
        this.brand = brand;
      }
      int price, ram; 
      float screensize; 
      String brand;
  
      public String toString()
      {
        return this.brand;
      }

	@Override
	public int compareTo(Object o) {
////		 TODO Auto-generated method stub
//	    Mobiles mob2 = (Mobiles)this; 
//	    Mobiles mob1 = (Mobiles)o; 
//	    
//	    if(mob2.price > mob1.price)
//	      return -123; 
//	    else if(mob1.price > mob2.price)
//	      return +100;
		Mobiles mob2 = (Mobiles)this; 
	    Mobiles mob1 = (Mobiles)o; 
	    String s2 = mob2.brand;
	    String s1 = mob1.brand; 
	    int result = s2.compareTo(s1);
	    if(result>0)
	      return +11; 
	    else if(result<0)
	      return -98;
		return 0;
	}
	    

	}
