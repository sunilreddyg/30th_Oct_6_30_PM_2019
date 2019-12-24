package ui_validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checking_Element_Visibility 
{

	public static void main(String[] args) throws Exception 
	{
	
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launch browser
		driver.get("https://www.facebook.com");  //Load webpage
		driver.manage().window().maximize();     //maximize browser window
		
		
		
		/*
		 * Scenario;-->
		 * 			Verifying Email Entry Without domain address.
		 * Exepcted:-->
		 * 			Should not display retype mobile number
		 * 			editbox.
		 */
		
		WebElement Email_EB=driver.findElement(By.xpath("//input[@id='u_0_r']"));
		Email_EB.clear();
		Email_EB.sendKeys("info.mindq");
		Thread.sleep(5000);
		
		WebElement Retype_Email_Eb=driver.findElement(By.xpath("//input[@id='u_0_u']"));
		if(!Retype_Email_Eb.isDisplayed())  //!--NOT
		{
			System.out.println("Testpass:--> Retype emailid editbox is not displayed");
		}
		else
		{
			System.out.println("Testfail:--> Retype email editbox is displayed on Wrong Email");
		}
		
		
		

		/*
		 * Scenario;-->
		 * 			Verifying Email Entry With valid domain address
		 * Exepcted:-->
		 * 			Shold display retype email id at webpage
		 */
		

		Email_EB.clear();
		Email_EB.sendKeys("info.mindq@gmail.com");
		Thread.sleep(5000);
		
		if(Retype_Email_Eb.isDisplayed())  
		{
			System.out.println("Testpass:--> Retype email_id editbox is  displayed");
		}
		else
		{
			System.out.println("Testfail:--> Retype email not visible on valid domain address");
		}
		
	}

}
