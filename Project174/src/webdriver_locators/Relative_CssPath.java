package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_CssPath 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		 //Launch browser
		driver.get("https://login.yahoo.com/");  	 //Load webpage
		driver.manage().window().maximize(); 		 //maximize browser window
		Thread.sleep(5000);
				
				
		WebElement Create_Account=driver.findElement(By.cssSelector("p[class='row sign-up-link'] > a"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", Create_Account);
		
		
		driver.findElement(By.cssSelector("div[class='first-name pure-u-1-2'] > input")).clear();
		driver.findElement(By.cssSelector("div[class='first-name pure-u-1-2'] > input")).sendKeys("Akshay");
		
		
		driver.findElement(By.cssSelector("form[id=regform] > fieldset > div.pure-g > div.last-name > input")).clear();
		driver.findElement(By.cssSelector("form[id=regform] > fieldset > div.pure-g > div.last-name > input")).sendKeys("Krishna");
		
		
	}

}
