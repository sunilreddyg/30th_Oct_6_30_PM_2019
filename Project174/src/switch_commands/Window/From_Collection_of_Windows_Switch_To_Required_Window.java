package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class From_Collection_of_Windows_Switch_To_Required_Window 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		

		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
		//Get all window ID's
		Set<String> AllwindowsIDS=driver.getWindowHandles();
		
		//Iterate for collection of objects using foreach loop.
		for (String Eachwindow : AllwindowsIDS) 
		{
			//Switch to every window under iteration
			driver.switchTo().window(Eachwindow);
			//Get every focused window title runtime
			String Runtime_title=driver.getTitle();
			
			//If Runtime title match with expected title accept condition
			if(Runtime_title.contains("Cancel Train Bookings"))
			{
				break;   //Eject from loop by stopping iteration
			}
		}
		

		
		System.out.println("Focused window title is => "+driver.getTitle());
	}

}
