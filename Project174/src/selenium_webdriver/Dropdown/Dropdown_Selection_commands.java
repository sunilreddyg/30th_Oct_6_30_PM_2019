package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection_commands
{
	
	public static void main(String args[]) throws Exception
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://v1.hdfcbank.com/branch-atm-locator/");  
		driver.manage().window().maximize();  
		
		
		/*
		 * Dropdown Selection Syntax:-->
		 * 		new Select(WebElement).SelectbyVisibleText("Optionname");
		 * 		new Select(WebElement).SelectbyValue("Option-value");
		 * 		new Select(WebElement).SelectbyIndex(int index-number);
		 */
		
		
		//Select dropdown option using Option visible name.
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Telangana");
		
		Thread.sleep(3000);  //Static timegap to load cities.
		
		//select dropdown option using <option> value property from backend html
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("hyderabad");
		
		//type Locality name into editbox
		driver.findElement(By.id("customLocality")).clear();
		driver.findElement(By.id("customLocality")).sendKeys("chaitanyapuri");
		
		//Select dropdown option using index number
		new Select(driver.findElement(By.id("customRadius"))).selectByIndex(3);;
		
		//Select checkbox [for selection and deselection of checkbox we follow click command]
		driver.findElement(By.id("amenity_category_order_types49")).click();
		
		//Click Button using xpath locator
		driver.findElement(By.xpath("//input[@value='SEARCH']")).click();
		
		
		
		
		
	}

}
