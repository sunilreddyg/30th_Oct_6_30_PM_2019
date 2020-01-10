package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_Title_Presented {

	public static void main(String[] args) {
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
							   
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		
		
		String Exp_title="Facebook – log in or sign up";
		
		
		new WebDriverWait(driver, 30).until
		(ExpectedConditions.titleIs(Exp_title));
		System.out.println("Timeout Released and expected title presented");
		
		
		new WebDriverWait(driver, 30).until
		(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		System.out.println("Email element visible at webpage");
		
	}

}
