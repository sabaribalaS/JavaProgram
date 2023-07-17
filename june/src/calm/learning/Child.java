package calm.learning;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child(); 
		
//		  ch.receive();
		ch.develop_java_applications();
		//Dynamic Binding
		  Child pa = new Child(); 
		  pa.cook();
		  pa.receive();

	}
	void cook() {
		// TODO Auto-generated method stub
		
	}
	public void develop_java_applications()
	  {
	    System.out.println("Java Developer");
	  }
	public void receive()
	  {System.out.println("Taking Care "
	        + "of Relatives and friends");
//	  parent p = new Parent();
//	  super.receive();
	  }

}
