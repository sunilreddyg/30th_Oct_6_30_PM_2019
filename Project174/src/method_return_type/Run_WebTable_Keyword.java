package method_return_type;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Run_WebTable_Keyword extends Repository
{
 String url="http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx";
 
 @Test(priority=0)
 public void tc001_Verify_static_Webtable_Records()
 {
	 click_element("//a[contains(.,'markets')]");
	WebElement Celladdress=Get_Static_Webtable_Cell("//div[@id='pnl_Bse']/table", 5, 3);
	String price=Celladdress.getText();
	System.out.println(price);
	driver.navigate().back();
 }
 
 
 @Test(priority=1)
 public void tc002_Verify_static_Webtable_Records()
 {
	click_element("//a[contains(.,'markets')]");
	WebElement Celladdress=Get_Static_Webtable_Cell("//div[@id='pnl_Bse']/table", 5, 0);
	Celladdress.click();
	Assert.assertTrue(isTitle_Presented("Hero MotoCorp Ltd."));
	System.out.println("Expected page load successfull");
 }
 
 
 @Test(priority=2)
 public void tc003_Verify_runtime_Webtable_Records()
 {
	click_element("//a[contains(.,'markets')]");
	WebElement Celladdress=Get_Dynaic_Webtable_Cell("//div[@id='pnl_Bse']/table", "TCS", 7);
	Celladdress.click();
	Assert.assertTrue(isTitle_Presented("TCS"));
	System.out.println("Tcs news displayed");
 }
 
 
 
  @BeforeClass
  public void beforeClass()
  {
	  launch_browser("firefox");
	  load_app(url);
	  set_timeout(20);
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  Thread.sleep(4000);
	  driver.close();
  }

}
