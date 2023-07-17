package calm.learning;

public class Tie {
	public static void main(String[] args) {
	    
	    int[] watchTime=  {120,180,90,210,150,200,100};
	    int totalWatchTime=0;
	    double averageWatchTime=0.0;
	    for(int i=0;i<watchTime.length;i++)
	    {
	      totalWatchTime+=watchTime[i];
	    }
	    averageWatchTime =(double)totalWatchTime/watchTime.length;
	    System.out.println("Total watch time for 7 days :"+totalWatchTime + "minutes");
	    System.out.printf("Average watch time for 7 days :%.2f minutes\n",averageWatchTime);


	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
