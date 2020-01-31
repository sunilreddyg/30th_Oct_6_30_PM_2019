package framework.Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class BeforeMethod_And_AfterMethod 
{

	  @Test //Invoke method to run without object creation
	  public void tc001() 
	  {
		  Reporter.log("Tc001 executed",true);
	  }
	  
	  @Test //Invoke method to run without object creation
	  public void tc002() 
	  {
		  Reporter.log("Tc002 executed",true);
	  }
	  
	  
	  
	  
	  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Method Precondition");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Method post condition");
  }

}
