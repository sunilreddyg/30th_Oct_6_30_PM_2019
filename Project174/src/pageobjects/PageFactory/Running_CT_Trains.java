package pageobjects.PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Running_CT_Trains {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		/*
		 * Note:-->	
		 * 		@Findby objects only identify using pagfactory class.
		 */
		CT_Trains trains=PageFactory.initElements(driver, CT_Trains.class);
		trains.SearchTrain();
		
		
	}

}
