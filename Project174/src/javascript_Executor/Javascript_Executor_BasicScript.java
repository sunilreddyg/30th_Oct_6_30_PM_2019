package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor_BasicScript {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  
		driver.get("https://www.facebook.com/");       
		driver.manage().window().maximize();  
		
	
		//type input value into editbox using javascript...
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('email').value='Sunil'");
		
		
		//Store javascriptexecutor into referral
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//type input value into firstname editbox
		js.executeScript("document.getElementById('u_0_m').value='Kiran'");
		
		//Identify location using Selenium Webdriver
		WebElement Surname_Editbox=driver.findElement(By.xpath("//input[@name='lastname']"));
		//identifying object other than ID propery
		js.executeScript("arguments[0].value='kishore'", Surname_Editbox);
		
		//Using javascript identify dropdown and select dropdown option
		js.executeScript("document.getElementById('day').value='15'");
				
		//Using javascript identify dropdown and select dropdown option
		js.executeScript("document.getElementById('month').value='11'");
				
		//Using javascript identify dropdown and select dropdown option
		js.executeScript("document.getElementById('year').selectedIndex ='2'");
						
		//Identify location using xpath
		WebElement Female_Radio_btn=driver.findElement(By.xpath("//input[@value='1']"));
		//Write javascript to select radio button
		js.executeScript("arguments[0].checked='true'", Female_Radio_btn);
						
				
		Thread.sleep(5000);  //static timeout
		
		//Identify location using xpath
		WebElement male_Radio_btn=driver.findElement(By.xpath("//input[@value='2']"));
		//Write javascript to select radio button
		js.executeScript("arguments[0].click()", male_Radio_btn);
			
		
		//Click Radio button usnig javascript
		js.executeScript("document.getElementById('u_0_13').click()");
		
		
				
	}

}
