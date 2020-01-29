package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReports_Using_Log {

	public static void main(String[] args) 
	{
		
		//create extentreport html file at location
		String File_path="Reports\\Report3.html";
		ExtentReports logger=new ExtentReports(File_path, true);
		
				//Create test 
				ExtentTest test=logger.startTest("Tc001_valid_login");
				
				test.log(LogStatus.INFO, "Browser launched");
				test.log(LogStatus.INFO, "Email Enter successfull");
				test.log(LogStatus.INFO, "password enter successfull");
				test.log(LogStatus.INFO, "Login button clicked");
				test.log(LogStatus.PASS, "As expected logout button displayed");
				
				
				logger.endTest(test);
	
		//Write and Save file
		logger.flush();

	}

}
