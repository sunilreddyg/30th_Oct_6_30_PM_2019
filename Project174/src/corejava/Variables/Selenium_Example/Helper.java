package corejava.Variables.Selenium_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper 
{
	WebDriver driver=null;
	String chrome_path="Drivers\\";
	String url=null;
	String username=null;
	String password=null;
	
	//Object Locators
	By UID_loc=By.id("email");
	By PWD_loc=By.id("pass");
	By Login_btn_loc=By.xpath("//input[@value='Log In']");
	/*
	 * MethodName:-->  Launching chrome browser
	 * paremters :--> Should Define Chrome_path :--> Chromedriver location.
	 */
	public void Launch_chrome_browser()
	{
		System.setProperty("webdriver.chrome.driver", chrome_path+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	/*
	 * MethodName:--> Load Webpage Using Http:// Or https:// protocal.
	 * Parameters:-->  
	 */
	  public void Load_Webpage()
	  {
		  driver.get(url);
	  }
	  
	  
	  /*
	   * MethodName:-->
	   * 		UserLogin
	   */
	  public void User_login()
	  {
		  
		 driver.findElement(UID_loc).clear();
		 driver.findElement(UID_loc).sendKeys(username);
		 
		 driver.findElement(PWD_loc).clear();
		 driver.findElement(PWD_loc).sendKeys(password);
		 
		 driver.findElement(Login_btn_loc).click();
		  
	  }
	
	

}
