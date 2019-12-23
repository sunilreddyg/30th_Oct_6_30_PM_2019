package ui_verification_commands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifying_Redable_or_Wrtiable_behaviour_of_Editbox {

	public static void main(String[] args) 
	{
		
		/*
		 * Scenario:--> verifing return date readon functinal behaviour.
		 * 
		 * 		Given Url http://spicejet.com
		 * 		And make sure oneway trip type selected
		 * 		Then return date should be in readonly mode.
		 */
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		WebElement Oneway_label=driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td[1]/label"));
		String Runtime_class=Oneway_label.getAttribute("class");
		
		if(Runtime_class.contains("select-label"))
		{
			System.out.println("Oneway selected");
			
			//Identify return date location
			WebElement Return_date=driver.findElement(By.id("ctl00_mainContent_view_date2"));
			//Get Return date readonly attribute
			String Readonly_value=Return_date.getAttribute("readonly");
			
			if(!Readonly_value.isEmpty())
				System.out.println("Editbox displayed in readonly mode");
			else
				System.out.println("Tesfail, Return date editbox in not in readonly mode");
		}
		
		

	}

}
