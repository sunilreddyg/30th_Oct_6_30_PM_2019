package framework.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestng_Test 
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
  
  @Test //Invoke method to run without object creation
  public void tc003() 
  {
	  Reporter.log("Tc003 executed");
  }
}
