package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Until_Element_Visible_At_Webpage 
{

	public static void main(String[] args) {
		
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
							   
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		
		
		//Enable Explicit wait on automation browser
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ReturnDate']")));
		System.out.println("Return date visible at webpage");
		
		
		
	}

}
