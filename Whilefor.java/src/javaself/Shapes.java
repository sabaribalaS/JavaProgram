package javaself;

public abstract class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes square = new Shapes();
		Shapes rectangle = new Shapes();
		Shapes circe = new Shapes();
		square.calculate_area(40);
		rectangle.calculate_area(40,30);
		
		

	}
     abstract void calculate_area();
	 void calculate_area(int leg, int bre) {
		// TODO Auto-generated method stub
		System.out.println(leg*bre);
		
	}

  void calculate_area(int  a) {
		// TODO Auto-generated method stub
		System.out.println(a*a);
		
	}

}
