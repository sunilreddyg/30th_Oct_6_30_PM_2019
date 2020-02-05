package method_parameters;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Run_Repository_Using_Testng extends Repository
{
	
	
	@Test(priority=0)
	public void TextEntry_with_Xpath()
	{
		Enter_text("//input[@id='email']", "9030248855");
		Enter_text("//input[@id='pass']", "Hello12345");
	}
	
	
 
  @BeforeClass
  public void beforeClass() 
  {
	  launch_browser("chrome");
	  load_app("http://facebook.com");
	  set_timeout(20);
  }
  
  
  @AfterClass
  public void afterClass() throws Exception
  {
	 Thread.sleep(5000);
	 driver.close();
  }

}
