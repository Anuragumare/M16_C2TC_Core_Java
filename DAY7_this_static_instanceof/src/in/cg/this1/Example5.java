package in.cg.this1;

public class Example5 {
	int x ;
	Example5()
	{
		this(25);
		System.out.println("abc");
	}
	Example5(int x)
	{
		this.x=x;
		System.out.println("xyz");
	}
	public static void main(String[] args) {
		Example5 e = new Example5();

	}


}
