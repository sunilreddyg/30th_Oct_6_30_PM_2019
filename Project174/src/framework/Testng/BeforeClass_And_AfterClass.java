package framework.Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeClass_And_AfterClass {
  
	
	
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
	  
	 
  @BeforeClass //Invoke before execution of first @test annotation
  public void beforeClass() 
  {
	  System.out.println("Precondition for Class");
  }

  @AfterClass  //Invoke after execution of last @Test annotation
  public void afterClass() 
  {
	  System.out.println("PostCondition for Class");
  }

}
