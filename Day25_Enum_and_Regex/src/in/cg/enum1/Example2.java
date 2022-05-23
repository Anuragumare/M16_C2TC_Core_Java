package in.cg.enum1;

import java.util.Iterator;

public class Example2 {
	enum  Margin
	{
		TOP,BOTTOM,LEFT,RIGHT;
	}
	public static void main(String[] args) {
		int count ;
		for (Margin m:Margin.values())
		{
			System.out.printf("Margin:%d =%s");
		}
	}

}