package ui_verification_commands.gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifying_Text_Visible_At_Webpage {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:-->
		 * 		Given site url http://gmail.com
		 * 		when user enter email with invalid domain address
		 * 		And click Next button to validate
		 * 		Then receive Error message "Couldn't find your Google Account"
		 */
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		
		
		WebElement Email_EB=driver.findElement(By.xpath("//input[@id='identifierId']"));
		Email_EB.clear();
		Email_EB.sendKeys("qadarshan@outlook.com"+Keys.ENTER);
		Thread.sleep(5000);  //static timegap to display error message.

		
		WebElement Page=driver.findElement(By.tagName("body"));
		String Page_Visible_Text=Page.getText();
		//System.out.println(Page_Visible_Text);
		
		String Exp_text="Couldn't find your Google Account";
		if(Page_Visible_Text.contains(Exp_text))
			System.out.println("text visible at webpage");
		else
			System.out.println("text not visible at webpage");
		
	
		Thread.sleep(4000);
		driver.close();
	}

}
