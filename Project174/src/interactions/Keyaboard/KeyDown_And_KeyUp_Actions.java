package interactions.Keyaboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_And_KeyUp_Actions
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		
		//Identify frame
		WebElement ModalFrame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(ModalFrame);
		System.out.println("Frame identified");
		
		
		//Hold Control down using keyboard actions
		new Actions(driver).keyDown(Keys.CONTROL).perform();
		
		
		//Select Items
		driver.findElement(By.xpath("//li[contains(.,'Item 1')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 3')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 5')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 7')]")).click();
		
		//After completed actions release control key.
		new Actions(driver).keyUp(Keys.CONTROL).perform();
		
	}

}
