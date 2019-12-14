package switch_commands.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:-->
		 * 			Given site url https://www.firstnaukri.com/
		 * 			When user click search button witout enter Course and keywords
		 * 			Then system should display Alert window with approriate error message.
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  //Launch browser
		driver.get("https://www.firstnaukri.com/");       //Load webpage
		driver.manage().window().maximize();  			  //maximize browser window
		
		
		//Clicking Search button without enter proper details.
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		//Switch to alert and get Text
		String Alert_msg=driver.switchTo().alert().getText();
		System.out.println(Alert_msg);
		
		//Switch to alert and close
		driver.switchTo().alert().accept();
		

		Thread.sleep(5000);
		driver.close();
		System.out.println("Run Complted");
	}

}
