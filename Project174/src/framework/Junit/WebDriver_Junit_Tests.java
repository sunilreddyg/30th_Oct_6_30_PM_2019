package framework.Junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class WebDriver_Junit_Tests 
{
	
	/*
	 * Note:-->  To use variables with in beforeclass annotation
	 * 			 we must declare as static variables.
	 */
	
	static WebDriver driver;
	static String Driver_path="drivers\\chromedriver.exe";
	static String url="http://facebook.com";
	
	
	@Test
	public void tc001()
	{
		driver.findElement(By.id("email")).sendKeys("9030248855");
	}
	
	
	
	@Test
	public void tc002()
	{
		driver.findElement(By.id("u_0_m")).sendKeys("9030248855");
	}
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver",Driver_path);
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}

	

}
