package in.cg.annotation;
class a
{
	void display()
	{
		System.out.println("parent class");
	}
}
class b extends a
{ @Override
	void display()
	{
		System.out.println("parent class");
	}
}
public class Example1 
{
	public static void main(String[] args)
	{
		b obj = new b();
		obj.display();
	}
}