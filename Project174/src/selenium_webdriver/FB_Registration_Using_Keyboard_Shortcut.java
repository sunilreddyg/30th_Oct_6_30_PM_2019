package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Registration_Using_Keyboard_Shortcut 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("u_0_m"))
		.sendKeys("Krishna"+Keys.TAB
				+"Kumar"+Keys.TAB
				+"krishnakumar@gmail.com"
				+Keys.TAB+"krishnakumar@gmail.com"
				+Keys.TAB+"Hello123456");

	}

}
