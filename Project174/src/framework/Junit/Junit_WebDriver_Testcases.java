package framework.Junit;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class Junit_WebDriver_Testcases 
{
	
	/*
	 * Note:-->  To use variables with in beforeclass annotation
	 * 			 we must declare as static variables.
	 */
	
	static WebDriver driver;
	static String Driver_path="drivers\\chromedriver.exe";
	static String url="http://facebook.com";
	
	
	
	@Test
	public void Tc001_Footer_links_signup_link()
	{
		driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).click();
		String Exp_title="Sign up for Facebook | Facebook";
		Assert.assertEquals(Exp_title, driver.getTitle());
		System.out.println("Signup page title verified");
	}
	

	@Test
	public void Tc003_Footer_links_Messenger_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Messenger')]")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
		System.out.println("Messenger link verified");
	}
	
	
	
	
	@Test
	public void Tc002_Footer_links_Login_link()
	{
		driver.findElement(By.xpath("//a[@title='Log in to Facebook']")).click();
		String Exp_title="Log in to Facebook | Facebook";
		Assert.assertEquals(Exp_title, driver.getTitle());
		System.out.println("Login in link title verified");
	}
	
	
	
	
	
	
	
	
	
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver",Driver_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}

	@BeforeEach
	void setUp() throws Exception
	{
		driver.get(url);
	}

	@AfterEach
	void tearDown(TestInfo testinfo) throws Exception 
	{
		String testname=testinfo.getTestMethod().get().getName();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+testname+".png"));
			
	}

	

}
