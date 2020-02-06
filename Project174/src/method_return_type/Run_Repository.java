package method_return_type;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Run_Repository extends Repository
{
  String url="http://facebook.com";
  @Test(priority=0)
  public void Verify_page_Availability_Using_Title() 
  {
	  String Exp_title="Facebook";
	  Assert.assertTrue(isTitle_Presented(Exp_title));
	  Reporter.log("Expected title presented at webpage");
	  
  }
  
  
  @Test(priority=0)
  public void Verify_page_Availability_Using_url() 
  {
	  String Exp_url="https://www.facebook.com/";
	  Assert.assertTrue(isUrl_Presented(Exp_url));
	  Reporter.log("Expected url presented at webpage");
	  
  }
  
  @Test(priority=0)
  public void Verify_text_visible_At_webpage() 
  {
	  String Exp_text="Create an account";
	  Assert.assertTrue(istext_visible_at_webpage(Exp_text));
	  Reporter.log("Expected url presented at webpage");
	  
  }
  
  @Test(priority=0)
  public void IsInput_Available_At_Editox() 
  {
	By Email=By.id("email");
	String input="MQ-DSNR";
	Enter_text(Email, input);
	Assert.assertTrue(isInput_presented_At_Editbox(Email, input));
	Reporter.log("expected input presented at editbox");
  }
  
  
  
  @BeforeClass
  public void beforeClass() 
  {
	  launch_browser("chrome");
	  load_app(url);
	  set_timeout(20);
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  Thread.sleep(5000);
	  driver.close();
  }

}
