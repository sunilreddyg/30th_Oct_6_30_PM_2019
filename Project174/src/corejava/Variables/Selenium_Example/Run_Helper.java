package corejava.Variables.Selenium_Example;

public class Run_Helper {

	public static void main(String[] args) throws Exception 
	{
		
		//Create object for Helper
		Helper obj=new Helper();
		obj.Launch_chrome_browser();
		
		obj.url="http://facebook.com";
		obj.Load_Webpage();
		
		//Assing runtime username and passwords
		obj.username="9030248855";
		obj.password="hello123456";
		obj.User_login();
		
		Thread.sleep(10000);
		
		
		
		obj.Load_Webpage();
		obj.driver.findElement(obj.UID_loc).sendKeys("NewUser");

	}

}
