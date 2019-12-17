package corejava.Variables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_And_Locator_References {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Email Editbox without references
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("Newuser");
		
		//WebElement reference
		WebElement password_EB=driver.findElement(By.id("pass"));
		password_EB.clear();
		password_EB.sendKeys("Hello123");
		 /*
		  * In Above syntax, If page reloaded or  refreshed Element reference going to be expire
		  *	and display excepation "staleElementReference" Exception
		  */
	
		//Locator Reference
		By login_btn_locator=By.xpath("//label[contains(@id,'loginbutton')]");
		driver.findElement(login_btn_locator).click();
	}

}
