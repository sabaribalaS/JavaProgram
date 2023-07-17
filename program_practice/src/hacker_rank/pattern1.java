package hacker_rank;

public class pattern1 {
public static void main(String[] args) {

	pattern1 pp =new pattern1();
//	pp.pattern1();
	pp.pattern2();
	
	}

private void pattern2() {
	// TODO Auto-generated method stub
	for(int col=5;col>=1;col--) {
	for(int row=5;row>=col;row--) {
		System.out.print(row+" ");
		}
	System.out.println();
	}
	}
private void pattern1() {
	// TODO Auto-generated method stub
	for(int col=1;col<=5;col++) {
	for(int row =1;row<=col;row++) {
		System.out.print(row+" ");
	}
	System.out.println();
}
}
}