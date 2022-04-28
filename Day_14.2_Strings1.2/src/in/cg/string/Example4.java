package in.cg.string;

import java.util.StringTokenizer;

public class Example4 {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Let@s@try@this","@");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		
		

	}

}