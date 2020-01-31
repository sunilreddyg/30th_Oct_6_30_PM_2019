package extent_reports;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

class Junit_With_Extent_Reports 
{
	static ExtentReports logger;
	static ExtentTest test;
	static String file_location="Reports\\Final_Report.html";

	
	
	@Test
	public void Tc001_User_Registration()
	{
		test.log(LogStatus.INFO, "Signup link clicked");
		test.log(LogStatus.INFO, "Details Entered successfull");
		test.log(LogStatus.INFO, "Click Create account button");
		if(true)
			test.log(LogStatus.PASS, "Account Created successfull");
		else
			test.log(LogStatus.FAIL, "Account Creation failed");
	}
	
	
	
	
	
	
	
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		//Create Html extent report
		logger=new ExtentReports(file_location);
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		//Write all reports
		logger.flush();
	}

	@BeforeEach
	void setUp(TestInfo testinfo) throws Exception 
	{
		//Capture current constructed methodname at runtime
		String TestMethod_name=testinfo.getTestMethod().get().getName();
		test=logger.startTest(TestMethod_name);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		logger.endTest(test);
	}

	

}
