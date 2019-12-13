package switch_commands.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_Window_Using_Navigation_Command 
{

	public static void main(String[] args) throws Exception
	{
		
		//Browser initiation
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		System.out.println("main window title is => "+driver.getTitle());
		
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//Switch to Window Using Navigation method.
		driver.navigate().to("https://www.cleartrip.com/trains/pnr");
		System.out.println("Current Focused window title is => "+driver.getTitle());
	}

}
