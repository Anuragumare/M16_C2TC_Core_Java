package in.cg.map;

import java.util.ArrayDeque;

public class Example2 {

	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(11);
		ad.add("hello");
		System.out.println(ad);
		ad.addFirst(12);
		ad.addLast("world");
		System.out.println(ad);

	}

}
