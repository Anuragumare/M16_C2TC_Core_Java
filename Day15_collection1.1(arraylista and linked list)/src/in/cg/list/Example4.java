package in.cg.list;

	import java.util.LinkedList;

	public class Example4 {

		public static void main(String[] args) {
			LinkedList<Integer> a = new LinkedList<>();
			System.out.println(a.isEmpty());
			a.add(4);
			a.add(7);
			a.add(9);
			a.add(43);
			System.out.println(a);
			System.out.println(a.size());
			System.out.println(a.contains(4));
			System.out.println(a.indexOf(9));
			System.out.println(a.lastIndexOf(7));
			System.out.println(a.get(2));
			a.set(3, 72);
			System.out.println(a);
			System.out.println(a.isEmpty());

		}

	}


