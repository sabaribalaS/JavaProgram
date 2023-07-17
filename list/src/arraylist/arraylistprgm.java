package arraylist;

import java.util.ArrayList;

public class arraylistprgm {
	public static void main(String[] args) {
		
	
     ArrayList ar = new ArrayList();
        ar.add(90);
        ar.add(90.0);
        ar.add("sabaribala");
        ar.add(90.76f);
        System.out.println(ar);
        for(Object ae : ar) {
        	try {
        		Integer a = (Integer)ae;
            	System.out.println(a);
        	}
        	catch(ClassCastException ak) {
        		
        		
        	}
   
        	
        	
        }
        
	}
}
