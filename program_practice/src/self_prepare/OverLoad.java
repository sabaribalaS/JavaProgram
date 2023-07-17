package self_prepare;

public class OverLoad {
	private void add() {
		// TODO Auto-generated method stub
System.out.println("addition");
	}
	public void add(int a,int b){
		System.out.println(a*b);
	}
public void add(int a,float c){
		System.out.println(a-c);
	}
public void add(float g){
	System.out.println(g+"from parent ");
}
public void add(int a,int r,float g){
	System.out.println(g);
}
	public static void main(String[] args) {
		OverLoad ol = new OverLoad();
		ol.add();
		ol.add(0, 5);
		ol.add(0, 0, 5);
		
	}

}
