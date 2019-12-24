package ui_validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDisplayed_For_Static_Elements 
{

	public static void main(String[] args) throws Exception 
	{
		//set runtime environment variable
		String driver_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com/");
		driver.manage().window().maximize();
		
		
		//Identify Email Editbox
		WebElement Email_eb=driver.findElement(By.id("identifierId"));
		

		//writing condition to accept on elemnet visible/enabled
		if(Email_eb.isDisplayed() &&  Email_eb.isEnabled())
		{
			Email_eb.clear();
			Email_eb.sendKeys("qadarshan@gmail.com",Keys.RETURN);
			//Thread.sleep(5000);
		}
		else
		{
			System.out.println("Element is not visible or enable");
		}
	

		/*
		 * ElementNotvisibleException   ==> When user perform action on hidden element  
		 * InvalidElementstateException ==> When user perform action on disabled element
		 */
		
		
		
		
		
		
		
		try {
			
			WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
			Password.clear();
			Password.sendKeys("Hello");
			
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		} catch (ElementNotVisibleException e) {
			System.out.println(e.getMessage());
		}catch (InvalidElementStateException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Run continued");
	
			
			
		
		
		
		
		
		
		

	}

}
