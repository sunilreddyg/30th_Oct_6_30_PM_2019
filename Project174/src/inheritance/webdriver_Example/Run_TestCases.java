package inheritance.webdriver_Example;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Run_TestCases extends TestCases
{

	
	@Test
	public void Verify_FlighSearch()
	{
		Tc002_FlightSearch();
		Reporter.log("Flight search successfull");
	}
	
	@BeforeClass
	public void Pre_condition()
	{
		Tc001_Setup_browser();
		
	}

}
