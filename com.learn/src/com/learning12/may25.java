package com.learning12;

public class may25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		may25 may = new may25();
//		may.heart();
		may.s();

	}

	private void s() {
		// TODO Auto-generated method stub
//		
		        int size = 7; // Adjust the size of the S-shaped pattern here

		        for (int row = 0; row < size; row++) {
		            for (int col = 0; col < size; col++) {
		                if ((row == 0 || row == size - 1 || row == size / 2)
		                        || (row < size / 2 && col == 0)
		                        || (row > size / 2 && col == size - 1)) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		    }
		

		
	}

	private void heart() {
		// TODO Auto-generated method stub
		{
		
		        int size = 10; // Adjust the size of the heart shape here

		        for (int row = size/ 2; row <= size; row=row+2) {
		            for (int space = 1; space < size - row; space=space+2) {
		                System.out.print(" ");
		            }

		            for (int star = 1; star <= row; star++) {
		                System.out.print("*");
		            }

		            for (int space = 1; space <= size - row; space++) {
		                System.out.print(" ");
		            }

		            for (int star = 1; star <= row; star++) {
		                System.out.print("*");
		            }

		            System.out.println();
		        }

		        for (int row = size; row >= 1; row--) {
		            for (int space = row; space < size; space++) {
		                System.out.print(" ");
		            }

		            for (int star = 1; star <= (row * 2) - 1; star++) {
		                System.out.print("*");
		            }

		            System.out.println();
		        }
		    }
		}

		
	}

}
