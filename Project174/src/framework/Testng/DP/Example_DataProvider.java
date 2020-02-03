package framework.Testng.DP;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Example_DataProvider 
{
  @Test(dataProvider = "dp")
  public void test(Integer n, String s) 
  {
	  System.out.println(n+"  "+s);
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "c" },
    };
  }
}
