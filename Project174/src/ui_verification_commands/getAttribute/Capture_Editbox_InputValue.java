package ui_verification_commands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Editbox_InputValue {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:-->
		 * 		Prepaid Mobile recharage functinality at Paytm Homepage
		 * 		
		 * 		1. Enter Url http://paytm.com
		 * 		2. Make sure prepaid radio button
		 * 		3. Enter prepaid Mobile number
		 * 	Expected:-->
		 * 		Should display operator and location 
		 */
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		
		WebElement Mobile_EB=driver.findElement(By.xpath("//input[contains(@data-reactid,'200')]"));
		Mobile_EB.clear();
		Mobile_EB.sendKeys("9030248855");
		Thread.sleep(5000);  //To load Operator and Location 
		
		
		WebElement Operator_EB=driver.findElement(By.cssSelector("._2CU_ > input:nth-child(1)"));
		String Act_operator=Operator_EB.getAttribute("value");
		
		if(Act_operator.equals("Airtel"))
			System.out.println("Testpass:--> Expected operator displayed");
		else
			System.out.println("Testfail:--> Wrong operator displayed");
		
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
