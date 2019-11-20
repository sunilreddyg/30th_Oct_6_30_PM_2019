package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Allow_More_than_one_option {

	public static void main(String[] args) throws Exception 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://v1.hdfcbank.com/branch-atm-locator/");  
		driver.manage().window().maximize();  
				
		/*
		 * Using javascript change single option selection dropdown 
		 * to multiple selection dropdown.
		 */
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById"
				+ "('customState').setAttribute('multiple','multiple')");
		Thread.sleep(5000);  //Static timegap
		
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Multiple Dropdown Selection state is => "+flag);
		
		
		//Write Decision statement to accept on multiple selection type
		if(flag==true)
		{
			Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
			State_Dropdown.deselectAll();   //Command only deselect on multiple selection type.
			State_Dropdown.selectByIndex(2);
			State_Dropdown.selectByIndex(4);
			State_Dropdown.selectByIndex(6);
			
			
			int Selection_Count=State_Dropdown.getAllSelectedOptions().size();
			if(Selection_Count > 1)
			{
				System.out.println("As expected Dropdown accepting morethan one selection");
			}
			else
			{
				System.err.println("Testfail, Dropdown accept lessthan one option");
			}
			
		}
		else
		{
			throw new Exception("Dropdown is not a single option selection type");
		}
				
				

	}

}
