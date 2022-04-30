package in.cg.list;

	import java.util.ArrayList;

	public class Example3 {

		public static void main(String[] args) {
			ArrayList a=new ArrayList<>();
			Object clone1;
			a.add("anurag");
			a.add("anurag");
			a.add(5);
			System.out.println(a);
			clone1=a.clone();
			System.out.println(clone1);
			

		}

	}

