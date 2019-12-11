package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_frame_Using_Navigation_Command {

	public static void main(String[] args) throws Exception
	{
		
		//Browser initiation
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  
		driver.get("https://www.redbus.in/hotels/"); 
		driver.manage().window().maximize();  
		
		//Navigate to frame using Frame url
		driver.navigate().to("https://www.redbus.in/account?pageName=Hotels");
		

		Thread.sleep(3000);
		WebElement Mobile_num=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		Mobile_num.clear();
		Mobile_num.sendKeys("9030248855");
		
		
		//Navigate back to page
		driver.navigate().back();

	}

}
