package in.cg.JuniTesting;

import org.junit.jupiter.api.*;

public class JUnitTesting4
{	
	@BeforeAll // it will test this case first then other,make static 
	// @AfterAll --> this test will excute last 
	static void display()
	{
		System.out.println("Anurag");
	}
	@Tag("me")
	//@Disabled
	@Test
	void display1()
	{
		System.out.println("Umare");
	}
	
	

}
