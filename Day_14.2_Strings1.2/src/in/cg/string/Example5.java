package in.cg.string;


	import java.util.StringTokenizer;

	public class Example5 {
		
		   public static void main(String args[]) 
		   { 
			StringTokenizer st3 = 
		                   new StringTokenizer("JAVA:Code:String", ":", false); 
			while (st3.hasMoreTokens()) 
		         System.out.println(st3.nextToken()); 
		   } 
		} 