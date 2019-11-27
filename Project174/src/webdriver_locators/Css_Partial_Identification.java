package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Partial_Identification {

	public static void main(String[] args) {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://register.rediff.com/register/register.php?");   //Load webpage
		driver.manage().window().maximize();  //maximize browser window
				
				
		
		driver.findElement(By.cssSelector("input[name*='name']")).clear();
		driver.findElement(By.cssSelector("input[name*='name']")).sendKeys("Akshay");

		driver.findElement(By.cssSelector("input[name^='login']")).clear();
		driver.findElement(By.cssSelector("input[name^='login']")).sendKeys("Akshay_mq");
		
		
	}

}
