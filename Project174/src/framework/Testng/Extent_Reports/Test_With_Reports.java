package framework.Testng.Extent_Reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.lang.reflect.Method;
import org.testng.annotations.AfterClass;

public class Test_With_Reports 
{
	 ExtentReports logger;
	 ExtentTest test;
	 String file_location="Reports\\Final_Report1.html";


	 @Test
	 public void User_login()
	 {
		  test.log(LogStatus.INFO, "UserLogin successfull");
	 }
	 
	 @Test
	 public void User_reg()
	 {
		  test.log(LogStatus.INFO, "Userreg successfull");
	 }
	
	

  @BeforeMethod
  public void beforeMethod(Method method) 
  {
	  test=logger.startTest(method.getName());
  }

  @AfterMethod
  public void afterMethod() 
  {
	  logger.endTest(test);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  logger=new ExtentReports(file_location);
  }

  @AfterClass
  public void afterClass() 
  {
	  logger.flush();
  }

}
