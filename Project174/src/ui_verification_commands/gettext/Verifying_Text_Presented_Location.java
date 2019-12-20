package ui_verification_commands.gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifying_Text_Presented_Location {

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

		
		//Identify Error location
		WebElement Error_location=driver.findElement(By.xpath("//div[@class='o6cuMc']"));
		String Act_err_msg=Error_location.getText();
		//System.out.println(Act_err_msg);
		
		String Exp_err_msg="Couldn't find your Google Account";
		
		//Verify Comparision between two strings
		if(Act_err_msg.equals(Exp_err_msg))
			System.out.println("As Expected error msg displayed on invalid email address");
		else
			System.out.println("Testfail:--> Expected msg not displayed on invalid email address");
		
		
		Thread.sleep(4000);
		driver.close();
	}

}
