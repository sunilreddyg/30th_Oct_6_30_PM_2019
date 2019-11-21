package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Complete_editbox 
{

	public static void main(String[] args) throws Exception
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://cleartrip.com");  
		driver.manage().window().maximize(); 
		Thread.sleep(5000); //Static timeout to laod notification popup.

		//Click Roundtrip radio button
		driver.findElement(By.id("RoundTrip")).click();
		
	
		//Type referal keyword into FromEditbox
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(5000);//timeout load suggesstions.
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		Thread.sleep(5000);//timeout load suggesstions.
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		
		//Select Date from datepicker [form active month]
		driver.findElement(By.linkText("27")).click();
		
		//Typing date into writable datepicker editox
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("Wed, 22 Apr, 2020");
		/*
		 * [Copty date fromat from application]
		 * Type date only when it return as writable Editbox.
		 */
	}

}
