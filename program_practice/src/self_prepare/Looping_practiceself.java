package self_prepare;

public class Looping_practiceself {
	public static void main(String[] args) {
		for(int row=5;row>=1;row--) {
	for(int star=1;star<=5-row;star++) {
		System.out.print(" ");
	}
	for(int col=1;col<=row;col++) {
		System.out.print(col+" ");
	}
	System.out.println();
		}
	}
}
