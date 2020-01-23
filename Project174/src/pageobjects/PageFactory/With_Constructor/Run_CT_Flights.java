package pageobjects.PageFactory.With_Constructor;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_CT_Flights {

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/flights");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		CT_Flights flights=new CT_Flights(driver);
		if(flights.Verify_Expected_Header_Visibility())
		{
			flights.flight_search_oneway_trip();
		}
		else
			System.out.println("flights page header mismatch");
		
		
	}

}
