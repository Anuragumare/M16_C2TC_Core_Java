package in.cg.regexExmpl;


import java.util.Scanner;

public class Example3{

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String str ="M1-16 \r\n anurag umare\r \n";
		String[]res=str.split("a",3);
		for (String i : res) {
			System.out.println(i);
		}

	}

}