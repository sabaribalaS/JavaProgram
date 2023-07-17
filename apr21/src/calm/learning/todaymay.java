package calm.learning;

public class todaymay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10,20,30,40}; 
	    for(int j=1;j<=2; j++){
	    int temp = a[0]; 
	    int i = 0; 
	    while(i<a.length-1)
	    {
	    a[i] = a[i+1]; 
	    System.out.print(a[i] + " "); 
	    i++; 
	    }
	    a[i] = temp; 
	    System.out.print(a[i] + " "); 
	    }
	}

}
