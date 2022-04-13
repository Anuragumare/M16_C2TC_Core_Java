package in.cg.modle;
import java.util.Scanner;

public class Relational_Operator {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the frist number");
		int x = sc.nextInt();
		System.out.println("enter the second number");
		int y = sc.nextInt();
		boolean c = x < y;
		System.out.println(c);
	}

}
