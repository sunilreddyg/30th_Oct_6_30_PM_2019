package framework.Testng.DP;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Application_Data 
{
  @Test(dataProvider = "dp")
  public void tc001(String name,String Empid) 
  {
	  
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
   {
      new Object[] { "arun","MQ001"},
      new Object[] { "suresh","MQ002"},
      new Object[] { "ajay","MQ003"},
      new Object[] { "amar","MQ004"},
    };
  }
}
