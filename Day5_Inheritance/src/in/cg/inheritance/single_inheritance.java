package in.cg.inheritance;

class Parent
{
	void print()
	{
		System.out.println("Hello,What's going on?");
	}
}
class Child extends Parent
{
	void display()
	{
		System.out.println("Child class");
	}
}


public class single_inheritance {
	
	public static void main(String[] args) {
		Child c=new Child();
		c.display();
		c.print();
	
		
		
	}
}


