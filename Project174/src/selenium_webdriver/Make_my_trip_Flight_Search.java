package selenium_webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Make_my_trip_Flight_Search 
{

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://makemytrip.com");  
		driver.manage().window().maximize(); 

	
		/*
		 * 	Becuase element under framesource available. we have to switch controls to frame
		 * 	by using frame id/name property inorder to identify and perform actions on elemnets
		 *  under frame.
		 * 
		 */
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		System.out.println("switch to frame successfull");
		//Identify frame elemnet and click to close advertise window.
		driver.findElement(By.xpath("//a[contains(@class,'close')]")).click();
		System.out.println("advertise window get closed");
		
		//Get Control back to page
		driver.switchTo().defaultContent();
		System.out.println("Controls available at Homepage");
		
		

	}

}
