package in.cg.regexExmpl;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		String pattern = "Anurag Umare";
		Scanner sc =new Scanner(System.in);
		String input = sc.nextLine();
		boolean result =pattern.matches(pattern);
		System.out.println(result);
        sc.close();
	}

}