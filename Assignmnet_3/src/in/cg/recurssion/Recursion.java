package in.cg.recurssion;

	import java.util.Scanner;

	public class Recursion 
	{
		static int m1(int n,int k)
		{
			if(n==1)
			return 1;
			else
			{
				return(m1(n-1,k)+k-1)%n+1;
			}
		}
		public static void main(String[] args) 
		{ Scanner sc=new Scanner(System.in);
		 System.out.println("Enter The Total Num  N :-");
			int n=sc.nextInt();
			System.out.println("Enter The Second Num  K:-");
			int k=sc.nextInt();
			System.out.println("Place Is "+m1(n,k));
			
	     }
	}


