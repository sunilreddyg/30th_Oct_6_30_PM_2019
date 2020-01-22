package waitcommands;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait_WaitFor_Element {

	public static void main(String[] args) 
	{
		
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
						
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	
		
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		     .withTimeout(Duration.ofSeconds(30))
		     .pollingEvery(Duration.ofSeconds(5))
		     .ignoring(NoSuchElementException.class);
		 
		 WebElement element = wait.until
		  (new Function<WebDriver, WebElement>() 
		  {
		     public WebElement apply(WebDriver driver) 
		     {
		       return driver.findElement(By.id("email"));
		     }
		  });
		 
		 
		 
		 element.clear();
		 element.sendKeys("newuser");

	}

}
