package javaself;

public class Citizen extends Parents
implements Govt, zoho, StateGovt{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Govt officer = new Citizen();
//		
		officer.displayAddressProof();
		
		Citizen citizen1 = new Citizen();
		Citizen citizen2 = new Citizen();
		citizen1.change2000Rupees();
		citizen1.watchmovies();
		citizen2.change2000Rupees();
		
		System.out.println(Govt.fine_for_helmet);
		System.out.println(Govt.last_date);
		
		

	}
	public void watchmovies()
	{
		System.out.println("watching movies");
	}

	@Override
	public void change2000Rupees() {
		// TODO Auto-generated method stub
		System.out.println("Changing in bank");
		
	}

	@Override
	public void displayIDProof() {
		// TODO Auto-generated method stub
		System.out.println("Adhar card");
		
	}

	@Override
	public void displayAddressProof() {
		// TODO Auto-generated method stub
		System.out.println("Ration card");
		
	}

	@Override
	public void wearHelmet() {
		// TODO Auto-generated method stub
		System.out.println("Folloe trafic rules");
		
	}
	@Override
	public void develope() {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void study() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void work() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void provide_Electricity() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void lay_roads() {
		// TODO Auto-generated method stub
		
	}

}
