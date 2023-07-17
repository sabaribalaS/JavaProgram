package self_prepare;

public class ClassB extends ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB  b = new ClassB();
		b.property();
		}

	@Override
	public void due() {
		// TODO Auto-generated method stub
		System.out.println("finish dad due");
		
	}
	@Override
	public void property() {
		// TODO Auto-generated method stub
		System.out.println(20L);
		
	}

}
