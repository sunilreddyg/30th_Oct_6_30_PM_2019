package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_Using_WebDriver_Interface {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("sdfsdfsd");
	    
	    driver.findElement(By.id("pass")).click();
	    driver.findElement(By.id("pass")).sendKeys("sdfdfsd");
	    
	    driver.findElement(By.xpath("//label[@id=\'loginbutton\']/input")).click();

		
	}

}
