package switch_commands.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_UnderFrame_Elements {

	public static void main(String[] args) throws Exception 
	{
		
		//Browser initiation
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  
		driver.get("https://www.redbus.in/hotels/"); 
		driver.manage().window().maximize();  
		
		
		//Identifying location under page
		WebElement Singin_nav_btn=driver.findElement(By.xpath("//button[@class='login-btn']"));
		Singin_nav_btn.click();
		Thread.sleep(5000);
		
		
		//Identifying frame with class property
		WebElement Modal_Frame=driver.findElement(By.className("modalIframe"));
		driver.switchTo().frame(Modal_Frame);
		
		
		Thread.sleep(3000);
		WebElement Mobile_num=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		Mobile_num.clear();
		Mobile_num.sendKeys("9030248855");
		
		
		
				
		

	}

}
