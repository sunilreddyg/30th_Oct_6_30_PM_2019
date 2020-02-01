package framework.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_Ignore 
{
	  @Test(priority=0)
	  public void f() 
	  {  
		  Reporter.log("f method executed ",true);
	  }
	  
	  @Test(priority=1,enabled=false)
	  public void x() 
	  {  
		  Reporter.log("x method executed ",true);
	  }
	  
	  
	  public void a() 
	  {  
		  Reporter.log("a method executed ",true);
	  }
}
