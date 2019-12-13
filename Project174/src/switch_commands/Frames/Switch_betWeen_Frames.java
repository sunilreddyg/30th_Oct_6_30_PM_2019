package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switch_betWeen_Frames {

	public static void main(String[] args) 
	{
		
		
		//Browser initiation
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://epass.apcfss.in/");
		driver.manage().window().maximize();
		
		
		//Apply Switch to frame
		driver.switchTo().frame("menuFrame");
		
		//Under Menu Frame Click On FeeStructure link
		WebElement Fee_structure=driver.findElement(By.xpath("//a[contains(.,'Fee Structure')]"));
		Fee_structure.click();
		
		//Get Control From menu frame to mainpage
		driver.switchTo().defaultContent();
		
		//Switch to Control Another frame
		driver.switchTo().frame("bodyFrame");
		
		//Selecting dropdown under body frame
		new Select(driver.findElement(By.id("univ")))
		.selectByVisibleText("ANDHRA UNIVERSITY");
		
		/*
		 * 	After completed action under body frame get
		 *  control back to mainpage
		 */
		driver.switchTo().defaultContent();
		System.out.println("Control available at mainpage");
		

	}

}
