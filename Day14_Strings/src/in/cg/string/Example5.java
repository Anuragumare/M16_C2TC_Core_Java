package in.cg.string;

import java.util.Scanner;

public class Example5 {
	
		public static void main(String[] args) {
			String str="Anurag umare";
			Scanner s=new Scanner(System.in);
			String str1=s.nextLine();
			if(str.equals(str1))
			{
				System.out.println("Matching");
			}
			else
			{
				System.out.println("Not Matching");
			}

		}

}
