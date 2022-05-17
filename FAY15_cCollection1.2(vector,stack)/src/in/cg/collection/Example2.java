package in.cg.collection;

import java.util.Stack;

public class Example2 {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(23);
		s.push(56);
		s.add(28);
		s.add(54);
		s.pop();
		s.push(29);
		System.out.println(s);

	}

}
