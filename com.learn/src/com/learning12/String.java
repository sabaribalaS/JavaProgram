package com.learning12;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String n = new String();
		n.check_count_of_character();

	}

	
		  private void check_count_of_character() {
		// TODO Auto-generated method stub
			
			  java.lang.String n = "sivasabaribala";
			    int[] cc = new int[n.length()];
			    
			  for(int j = 0; j<n.length(); j++)
			  {
			    int count = 1; 
			    char ch = n.charAt(j);
			    for(int i=j+1; i<n.length();i++)
			    {
			      if(ch == n.charAt(i))
			      {
			        cc[i] = -1; 
			        count++; 
			      }
			    }
			    if(cc[j]!=-1) 
			    {
			      cc[j] = count;
			    }
			    if(cc[j]>1) {
			    System.out.println(ch + " appears for " + cc[j] + 
			        " times");
			    }

			  }
			    
			  }
}