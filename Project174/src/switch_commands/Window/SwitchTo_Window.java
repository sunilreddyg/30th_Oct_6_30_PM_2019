package switch_commands.Window;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window 
{

	public static void main(String[] args) throws Exception {
		
		//Browser initiation
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  
		driver.get("https://www.facebook.com"); 
		driver.manage().window().maximize();  
		
		//It capture current widnow ID
		String FB_Window_ID=driver.getWindowHandle();
		
		
		//IDentifying HyperLink at webpage [Hyperlink Open page at New tab/Window]
		WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
		Instagram_link.click();
		Thread.sleep(5000);
		
	
		//Get All window Dynamic ID's opened throw webdriver scripting
		Set<String> allwindowIDS=driver.getWindowHandles();
		for (String EachWindowID : allwindowIDS) 
		{
			//If not facebook window equals with iterator window ID.
			if(!FB_Window_ID.equals(EachWindowID))
			{
				driver.switchTo().window(EachWindowID);
				break;
			}
		}
		
		
		
		Thread.sleep(10000);
		System.out.println("Current focused window title is => "+driver.getTitle());
		WebElement Mobile_EB=driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']"));
		Mobile_EB.clear();
		Mobile_EB.sendKeys("9030248855");
		
		
		
		//Get Control back to facebook
		driver.switchTo().window(FB_Window_ID);
		
		
		//Identify Locations at Facebook page
		WebElement Signin_Email=driver.findElement(By.id("email"));
		Signin_Email.clear();
		Signin_Email.sendKeys("90302488855");
		
		
		
		
		
		
		
		
	}

}
