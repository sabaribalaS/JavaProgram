package looping_practice;

public class Frequency_of {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i="sivasabari";
		int[] ss=new int [i.length()];
		int count=1;
		for(int j=0;j<i.length()-1;j++) {
//			count=1;
			char ch= i.charAt(j);
			for(int k=j+1;k<i.length();k++) {
				if(ch==i.charAt(k)) {
					ss[k]=-1;//s 0 a
					count=count+1;
				}
				}
//			System.out.println(count);
			if(ss[j]!=-1){
				ss[j]=count;// s 0 a
			}
			if(ss[j]>0) {
				System.out.println(ch+"no of count"+count);
			}

	}
	}}


