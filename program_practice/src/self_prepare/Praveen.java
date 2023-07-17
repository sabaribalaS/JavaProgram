package self_prepare;

public class Praveen implements Payilagam{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Praveen p =new Praveen();
		p.batch1();
		System.out.println("fees"+fees);

	}

	@Override
	public void batch1() {
		// TODO Auto-generated method stub
		System.out.println("my class time "+batch1_time);
		
	}

	@Override
	public void classtime() {
		// TODO Auto-generated method stub
		System.out.println("2.30 to 5.00 pm");
		
	}

	@Override
	public void playtime() {
		// TODO Auto-generated method stub
		System.out.println("after5.30pm");
		
	}
}

