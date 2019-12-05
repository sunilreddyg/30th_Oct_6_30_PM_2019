package mouse_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_On_Location 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//Identifying location and storing into reference
		WebElement Jobs_menu=driver.findElement(By.xpath("//div[@class='mTxt'][contains(.,'Jobs')]"));
		//Creating object for actions class.
		new Actions(driver).moveToElement(Jobs_menu).perform();
		
		//identifying Sub category form jobs menu
		WebElement Jobs_menu_Register=driver.findElement(By.xpath("(//a[@title='Register Now'])[1]"));
		//Perfroming left click action using Mouse interactions
		new Actions(driver).click(Jobs_menu_Register).perform();
	}

}
