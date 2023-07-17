package javaarraylist;

import java.util.LinkedHashMap;

public class June23_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap hm = new LinkedHashMap(); 
	    System.out.println(hm);
	String name = "prabakaran";
	for(int i=0; i<name.length();i++)
	{
	  if(hm.containsKey(name.charAt(i)))
	  {
	    int count = (Integer)hm.get(name.charAt(i));
	    hm.put(name.charAt(i),count+1);
	  }
	  else
	  {
	    hm.put(name.charAt(i),1);
	  }
	}
	    System.out.println(hm);

	}

}
