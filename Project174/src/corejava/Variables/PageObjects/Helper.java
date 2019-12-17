package corejava.Variables.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper 
{
	
	public WebDriver driver;
	String chrome_path="Drivers\\";
	public String url="http://facebook.com";
	private String username="9030248855";
	private String password="Hello12345";
	
	public void SetUp_Browser()
	{
		System.setProperty("webdriver.chrome.driver", chrome_path+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void Facebook_User_login()
	{
		driver.findElement(FB_Home_Loc.FB_Signin_UID).clear();
		driver.findElement(FB_Home_Loc.FB_Signin_UID).sendKeys(username);
		
		driver.findElement(FB_Home_Loc.Fb_Signin_PWD).clear();
		driver.findElement(FB_Home_Loc.Fb_Signin_PWD).sendKeys(password);
		
		driver.findElement(FB_Home_Loc.Fb_Signin_Login_btn).click();
	}

}
