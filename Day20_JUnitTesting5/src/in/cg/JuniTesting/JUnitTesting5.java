package in.cg.JuniTesting;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
public class JUnitTesting5 
{
	@Test
	void accecpt()
	{
		System.setProperty("1", "anurag");
		Assumptions.assumeTrue("anurag".equals(System.getProperty("1")));
	
	}
}