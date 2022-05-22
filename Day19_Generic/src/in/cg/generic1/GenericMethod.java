package in.cg.generic1;
import java.util.Iterator;

public class GenericMethod {
	public static <E> void print(E[]elements)
	{
		for(E itr:elements) 
		{
			System.out.println(itr);
			
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		Integer[]a= {12,22,31,41,51,61}	;
        Character[]b= {'F','D','B','C','A'};
         print(a);
         print(b);
	}

}