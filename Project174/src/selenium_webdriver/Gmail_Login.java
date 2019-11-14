package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login 
{

	public static void main(String[] args) throws Exception 
	{
		
	System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://gmail.com");
	driver.manage().window().maximize();
	
	//Enter email address and press ENTER keyboard shortcut
	driver.findElement(By.id("identifierId")).clear();
	driver.findElement(By.id("identifierId")).sendKeys("qadarshan"+Keys.ENTER);
	
	Thread.sleep(5000);
	
	//Enter password and press ENTER keyboard shortcut
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("password")).sendKeys("Hello12345"+Keys.ENTER);
	
		
	}

}
