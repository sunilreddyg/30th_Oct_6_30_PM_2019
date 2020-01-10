package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait_Syntax 
{

	public static void main(String[] args) 
	{
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
					    
		//Browser initiation and loading webpage..
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/ServiceLogin");
		driver.manage().window().maximize();
		System.out.println("Maximized");
		
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("Automated");

		System.out.println("timeout released facebook id presented");
		
		
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("Automated");
		
		System.out.println("timeout released gmail id presented");
		
		/*
		 * Note:-->
		 * 		Implicit wait avoid nosuchelement exception.
		 */
		
		
	}

}
