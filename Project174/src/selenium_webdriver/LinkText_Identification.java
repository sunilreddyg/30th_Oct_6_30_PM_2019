package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Identification {

	public static void main(String[] args) throws Exception 
	{
		
		//Runtime environment varaible for chrome
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//Click Link
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		//Type Email at edibtox
		driver.findElement(By.id("identify_email")).clear();
		driver.findElement(By.id("identify_email")).sendKeys("qadarshan@gmail.com");
		
		//Click Button
		driver.findElement(By.name("did_submit")).click();
		Thread.sleep(4000);
		
		//Click continue button
		driver.findElement(By.name("reset_action")).click();
		Thread.sleep(4000);
		
		
		//Click Link
		driver.findElement(By.linkText("Didn't get a code?")).click();
		
		
	}

}
