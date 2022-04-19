package in.cg.assignment;

public class Sum_Of_Digit {
	
	  private static int sumOfDigits(int num) {
		//If num zero then return  
	      if(num == 0) {
	          return 0;
	      }

	      //recursive call
	      return num % 10 + sumOfDigits(num/10);
	 }

	 public static void main(String[] args) {

	     //Calling sumOfDigits method
	     int result = sumOfDigits(1234);
	  
	     //Print result
	     System.out.println(result);
	 }


	}

		         