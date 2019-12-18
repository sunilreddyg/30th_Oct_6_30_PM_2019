package ui_verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_page_title {

	public static void main(String[] args) throws Exception 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		driver.manage().window().maximize();
		
		
		String Exp_title="SeleniumHQ Browser Automation";
		
		//Get Current window Actual title at runtime.
		String Actual_title=driver.getTitle();
		
		//verify Equal Comparision between expected and actual title
		boolean flag=Actual_title.equals(Exp_title);
		System.out.println("SeleniumHQ title verificaton status is => "+flag);
		
		//Only Accept conditon on title verified
		if(flag==true)
		{
			System.out.println("Expected title verified");
			
			WebElement Downlaod_btn=driver.findElement(By.xpath("//div[@class='download-button webdriver']"));
			Downlaod_btn.click();
		}
		else
		{
			System.out.println("Title Mismatch Test skipped");
		}
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
