package ui_verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Runtime_URl 
{

	public static void main(String[] args) 
	{
		
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		driver.manage().window().maximize();
				
		
		String Exp_url="https://selenium.dev/";
		
		//Capture runtime url
		String Runtime_url=driver.getCurrentUrl();
				
		if(Runtime_url.contains(Exp_url))
		{
			System.out.println("Expected url presented for selenium homepage");
			
			
			WebElement Downlaod_btn=driver.findElement(By.xpath("//div[@class='download-button webdriver']"));
			Downlaod_btn.click();
		
			
			if(driver.getCurrentUrl().contains("downloads/"))
				System.out.println("expected url presented, Downlaod page verified");
			else
				System.out.println("expected url not presented, download page not verified");
		}
		else
		{
			System.out.println("Wrong url presnted for selenium hompage");
		}
	
	}

}
