package mouse_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_DropBy 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
		driver.manage().window().maximize();
		
		
		WebElement Scroller=driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[1]"));
		
		//Performing drag and drop using coordinates.
		new Actions(driver).dragAndDropBy(Scroller, 100, 0).perform();
		
		

	}

}
