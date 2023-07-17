package javaself;

public class ArrayDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo5 ar =new ArrayDemo5();
//		ar.learning1();
		ar.learning2();
		
		
	}
	private void learning2() {
		// TODO Auto-generated method stub
//		int[][] marks = new int[3][5];
//		System.out.println(marks.length);
//		System.out.println(marks[0].length);
//		System.out.println(marks[1].length);
//		System.out.println(marks[2].length);
//		JaggedArray;
		int [][] marks = new int[6][];
		marks[0] = new int[5];
		marks[1] = new int[6];
		marks[2] = new int[4];
		System.out.println(marks.length);
		System.out.println(marks[0].length);
		System.out.println(marks[1].length);
		System.out.println(marks[2].length);
		
	}
	private void learning1() {
		// TODO Auto-generated method stub
		int [][]marks = new int[3][5];
		//quarterly
		int subject =0;
		int exam =0;
		marks[exam][ subject] =90;subject++;
		marks[exam][ subject] =98;subject++;
		marks[exam][ subject] =100;subject++;
		marks[exam][ subject] =65;subject++;
		marks[exam][ subject] =78;subject++;
		
		//half yearly
		System.out.println();
		exam++; subject=0;
		
		marks[exam][ subject] =90;subject++;
		marks[exam] [subject] =92;subject++;
		marks[exam][ subject] =99;subject++;
		marks[exam][ subject] =100;subject++;
		marks[exam][ subject] =95;subject++;
	
		//annual 
		System.out.println();
		exam++;
		subject=0;
		
		marks[exam][0] =96;subject++;
		marks[exam][1] =78;subject++;
		marks[exam][2] =89;subject++;
		marks[exam][3] =99;subject++;
		marks[exam][4] =92;subject++;
		System.out.println();
		exam++;
		
		
		
		int high =0; int examno = -1;
		
		for(exam =0;exam<3;exam++)
		{
			int total=0;
			
			   for(subject=0;subject<5;subject++)
			   {
				   total = total+ marks [exam][subject];
			   }
			   System.out.println("TotalMarks: "+ total);
			   if(total>high)
			   {
				   examno=exam;
				   high=total;
			   }
			 
			   }
		
		System.out.println("Highest total is "+high+"in exam no: "+examno);
		
		
	}
	
		

	}


