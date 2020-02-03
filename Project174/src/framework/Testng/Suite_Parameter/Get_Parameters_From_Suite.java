package framework.Testng.Suite_Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Get_Parameters_From_Suite 
{
	public WebDriver driver;
	String path="Drivers\\";
	
	@Test(priority=0)
	@Parameters("browser_name")
	public void launch_browser(String browser)
	{

		switch (browser) 
		{
		case "firefox":
			System.setProperty("webdriver.gecko.driver",path+"geckodriver.exe");
			driver=new FirefoxDriver();
			Reporter.log("firefox browser launched successfull");
			break;
			
		case "chrome":
			System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
			driver=new ChromeDriver();
			Reporter.log("chrome browser launched successfull");
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver", path+"IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			Reporter.log("ie browser launched successfull");
			break;

		default: System.out.println("browser name mismatch");
			break;
		}
		
	}
	
	@Test(priority=1)
	@Parameters("appurl")
	public void loadWebpage(String url)
	{
		driver.get(url);
		Reporter.log("Webpage load successfull");
	}
	
	
	@Test(priority=2)
	@Parameters({"uid","pwd"})
	public void User_login(String Auid,String Apwd)
	{
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(Auid);
		Reporter.log("Email enter successfull");
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(Apwd);
		Reporter.log("password entered successfull");
	}
	
	
	@Test(priority=3)
	@Parameters("Fname")
	public void User_registration(String firstname)
	{
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		Reporter.log("firstname entered successfull");
	}
	
	
	
	

}
