package in.cg.generic1;

public class GenericClass<T> {

	T val;
	
	void print()
	{
		System.out.println(val.getClass());
	}
	public static void main(String[] args) 
	{
		GenericClass<Integer>  g=new GenericClass<Integer>();
		GenericClass<String>  g1=new GenericClass<String>();
	    g.val=457;
	    g.print();
        g1.val="anurag";
        g1.print();
//     GenericClass g=new GenericClass();
//	   g.val="Abc";
//		g.print();
	}


}
