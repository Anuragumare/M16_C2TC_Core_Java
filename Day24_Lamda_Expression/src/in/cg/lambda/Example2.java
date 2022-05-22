package in.cg.lambda;

interface B
{
	String display(String str);
}

public class Example2 {

	public static void main(String[] args) {
		//Lambda Expression with return statement
		//Lambda Expression with Single Parameter
		B obj=(String str)->
		{
			
			return str;
		};
		System.out.println(obj.display("Lambda Expression with Single Parameter"));

	}

}