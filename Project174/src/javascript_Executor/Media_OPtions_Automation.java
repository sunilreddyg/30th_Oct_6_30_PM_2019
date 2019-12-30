package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Media_OPtions_Automation 
{

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=p8PTLQQo2GQ");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		
		//Create Interface for JsExecutor
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		WebElement Operator=driver.findElement(By.cssSelector(".ytp-play-button.ytp-button"));
		System.out.println("element identified");
		
		
		js.executeScript("arguments[0].click();",Operator);
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].click()",Operator);
		
		
	}
}
