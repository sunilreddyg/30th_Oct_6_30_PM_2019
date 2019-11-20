package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Multiple_Selection_Type 
{

	public static void main(String[] args) throws Exception
	{
		
		/*
		 * Below program verify dropdown selection type Single or multiple.
		 */
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://v1.hdfcbank.com/branch-atm-locator/");  
		driver.manage().window().maximize();  
		
		
		
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Multiple Dropdown selection state is => "+flag);
		Thread.sleep(5000);  //Static timegap
		
		/*
		 * Using javascript change single option selection dropdown 
		 * to multiple selection dropdown.
		 */
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById"
				+ "('customState').setAttribute('multiple','multiple')");
		Thread.sleep(5000);  //Static timegap
		
		
		boolean flag1=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Multiple Dropdown Selection state is => "+flag1);
		
	}

}
