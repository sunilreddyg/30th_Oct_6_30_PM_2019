package ui_verification_commands.For_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_Commands 
{

	public static void main(String[] args)
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		driver.manage().window().maximize();
		
		
		String Runtime_title=driver.getTitle();
		System.out.println("Current window title => "+Runtime_title);
		
		String Runtime_url=driver.getCurrentUrl();
		System.out.println("Current window url  => "+Runtime_url);
		
		String Runtime_WindowID=driver.getWindowHandle();
		System.out.println(Runtime_WindowID);
		
		String Runtime_pageSource=driver.getPageSource();
		//System.out.println(Runtime_pageSource);

	}

}
