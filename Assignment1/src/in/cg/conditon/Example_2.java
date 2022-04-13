package in.cg.conditon;

public class Example_2 {

	public static void main(String[] args)
	{
		int a =11 ,b=7,c=30;
		if(a>b&& a>c) {
			System.out.println(b);
		}else if(b>a && b>c) {
			System.out.println(b);
		}
		else {
			System.out.println("else block");
		}

	}

}
