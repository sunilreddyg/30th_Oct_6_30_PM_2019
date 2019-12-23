package ui_verification_commands.For_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Runtime_PageSource {

	public static void main(String[] args) 
	{
		
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		driver.manage().window().maximize();
				
		
		String Expected_Element_At_Source="dropdownButton";
		
		//Capture runtime pagesoure
		
		String Runtime_pagesource=driver.getPageSource();
		
		boolean flag=Runtime_pagesource.contains(Expected_Element_At_Source);
		System.out.println("elemnet presented status is => "+flag);
		
		
		//Decision statement to accept when expected dynamic element source presented at pagesource.
		if(flag==true)
		{
			WebElement Menu_List=driver.findElement(By.id("dropdownButton"));
			Menu_List.click();
			
		}
		
		
		
	}

}
