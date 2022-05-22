package in.cg.generic1;

public class GenericMethod_Exmpl {
	
		public static <E>void display(E[] arr)
		{
			for(E itr:arr)
			{
				System.out.println(itr);
			}
			System.out.println();
			
		}

		public static void main(String[] args)
		{
			Integer[] a= {55,66,77};
			Character[] b={'h','m'};
			display(a);
			display(b);
			
			

		}
}
	