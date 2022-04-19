package in.cg.assignment;

	import java.util.Scanner;
	public class Fiboancci_Series {

	 public static void main(String[] args) {
		  Scanner sc =new Scanner(System.in);
		    int n = sc.nextInt() , firstTerm = 0, secondTerm = 1;
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    for (int i = 1; i <= n; ++i) {
		      System.out.print(firstTerm + ", ");

		      // compute the next term
		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;
		    }
		  }
		}


