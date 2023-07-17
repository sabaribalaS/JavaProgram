package self_prepare;

public class OverRide extends OverLoad {
	@Override
	public void add(float g) {
		// TODO Auto-generated method stub
		
		System.out.println("child addition"+g);
	}

	public static void main(String[] args) {
		OverRide or = new OverRide();
		or.add(0);
;
		}
	@Override
	public void add(int a, float c) {
		// TODO Auto-generated method stub
		super.add(a, c);
	}

}
