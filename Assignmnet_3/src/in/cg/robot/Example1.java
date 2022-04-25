package in.cg.robot;

	import java.util.Scanner;

	public class Example1 
	{
		static int display(int m,int n)
		{
			if(m==1||n==1)
				return 1;
			return display(m-1, n)+display(m, n-1);
		}

		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Row M :- ");
			 int m=sc.nextInt();
			 System.out.println("Enter The Column N :- ");
			 int n=sc.nextInt();
			 
			System.out.println(display(m, n));
		}

	}

