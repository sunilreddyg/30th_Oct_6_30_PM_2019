package ui_verification_commands.gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifying_Expected_Dropdown_Option_Presented {

	public static void main(String[] args) 
	{
		/*
		 * Scenario:-->
		 * 		Given site url http://facebook.com
		 * 		when user Open Month dropdown 
		 * 		Then month dropdown should contains Expected month..
		 */
		
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		//identify locatio of dropdown
		WebElement Month_dropdown=driver.findElement(By.xpath("//select[@id='month']"));
		//capture dropdown otions
		String Month_list=Month_dropdown.getText();
		System.out.println(Month_list);
		
		//Write a decison to verify expected month presented at dropdown
		if(Month_list.contains("Aug"))
				System.out.println("Expected option presented at month dropdown");
		else
				System.out.println("Expected option not presented at month dropdown");
		
		

	}

}
