package in.cg.stream;

import java.util.Arrays;
import java.util.List;

public class Example2 
{

	public static void main(String[] args) 
	{
		List<Integer> obj = Arrays.asList(10,20,30,32,42,19,03,55);
		System.out.println("-----Distinct--------");
		obj.stream().distinct().forEach(System.out::println);
		System.out.println("------limt-------");
		obj.stream().limit(5).forEach(System.out::println);
		System.out.println("------skip-------");
		obj.stream().skip(5).forEach(System.out::println);
	}

}