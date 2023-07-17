package self_prepare;

public class Puriyatha {
public static void main(String[] args) {
	
	        int number = 98765;
	        int result = getSingleDigitSum(number);
	        System.out.println("Single Digit Sum: " + result);
	    }
	    
	    public static int getSingleDigitSum(int number) {
	        int sum = 0;
	        
	        while (number > 0 || sum > 9) {
	            if (number == 0) {
	                number = sum;
	                sum = 0;
	            }
	            
	            sum += number % 10;
	            number /= 10;
	        }
	        
	        return sum;
	    }
	}

}
}
