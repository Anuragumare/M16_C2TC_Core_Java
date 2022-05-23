package in.cg.regexExmpl;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {

	public static void main(String[] args) {
		Pattern p= Pattern.compile("Programming ");
		
		Matcher m= p.matcher("Java Programming is enough to get a job in IT indresrty");
		while (m.find()) {
			System.out.println("pattern strat from"+m.start()+"to "+(m.end()-1));
		}
	}

}
