package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Identification_With_Attribute_And_Innertext 
{

	public static void main(String[] args) throws Exception 
	{

		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		 //Launch browser
		driver.get("https://www.naukri.com/");  	 //Load webpage
		driver.manage().window().maximize(); 		 //maximize browser window

		/*
		 * identify Location using element text
		 * HtmlSource:-->
		 * 		<button id="cjaMain">Create a Job Alert</button>
		 * Syntax:--.
		 * 		//tagname[text()='ElementText']
		 * 
		 * Note:-->
		 * 		text()  or .[dot] keywords target Element Text area at hmtl-node
		 */
		driver.findElement(By.xpath("//button[text()='Create a Job Alert']")).click();
		
		
		
		/*
		 * Identify location using Element Attributes
		 * HtmlSource:-->
		 * 			<input class="sugInp" name="keyskills" type="text">
		 * Syntax:-->
		 * 			//tagname[@Propertyname='PropertyValue']
		 * 
		 *  Note:-->
		 *  		@ symbol identify only attributes at html-node
		 */
		
		//Identify Editbox with attribute identification
		driver.findElement(By.xpath("//*[@placeholder='Skills, Designations, Roles, Companies']")).clear();
		driver.findElement(By.xpath("//*[@placeholder='Skills, Designations, Roles, Companies']")).sendKeys("software testing");
		Thread.sleep(5000);
		
		//Select Element with text identification
		driver.findElement(By.xpath("//div[text()='Software Testing']")).click();
		Thread.sleep(2000);
		
		//Select Element with text identification
		driver.findElement(By.xpath("//div[text()='Automation Testing']")).click();
		Thread.sleep(2000);
		
		//Select Element with text identification
		driver.findElement(By.xpath("//div[.='Selenium']")).click();
		Thread.sleep(2000);
		
		//Selecting Element with text identification
		driver.findElement(By.xpath("//div[.='Cucumber']")).click();
				
				
				
		
	}

}
