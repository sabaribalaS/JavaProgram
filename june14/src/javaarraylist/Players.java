package javaarraylist;

public class Players implements Comparable
{

	int score;
	
 String name;
	public Players(int score) {
		// TODO Auto-generated constructor stub
		
	}


	public Players(String name, int score) {
		this.score=score;
		this.name=name;
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Players mahi = new Players(100);
		Players virat = new Players(90);
		Players rohit = new Players(110);
		
		

	}
	public String toString()
	  {
	    return this.name + " "+this.score;
	  }
//	public String toString()
//	  {
//	    return "Hi";
//	  }


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
