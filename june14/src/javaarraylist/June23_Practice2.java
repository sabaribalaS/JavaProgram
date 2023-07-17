package javaarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class June23_Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedHashMap menu = new LinkedHashMap(); 
//	    menu.put("Idli", 20);
//	    menu.put("Dosai", 300);
//	    menu.put("Poori",  40);
//	    
//	    Set s = menu.entrySet();
//	    int max = 0; 
//	    Object obj=""; 
//	    for(Object ob: s)
//	    {
//	      Entry entry = (Entry) ob;
//	      System.out.println(entry.getKey() + " -> "+ entry.getValue());
//	      if((int)entry.getValue()>max)
//	      {
//	        max = (int) entry.getValue(); 
//	        obj = entry.getKey();
//	        
//	        
//	      }
//	    }
//	    System.out.println(max + " price is for "+ obj);
		ArrayList al = new ArrayList(); 
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Iterator it = al.iterator(); 
		while(it.hasNext())
{
			System.out.println(it.next());
		}
//		System.out.println(it.next()); 
//		System.out.println(it.next()); 
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());

	}

}
