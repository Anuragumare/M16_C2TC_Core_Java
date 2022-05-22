package in.cg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Example4 {

	public static void main(String[] args) {
		List<Integer> obj = Arrays.asList(10,20,30,32,42,19,03,55);
		List<Integer> obj2=obj.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(obj2);
	}

}