package in.cg.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

	public class Example1 {

			public static void main(String[] args) {
				List<Integer> obj = Arrays.asList(10,20,30,32,42,19,03,55);
				obj.stream().filter(i -> i> 20).forEach(i->System.out.println(i));
			}

		}
		
