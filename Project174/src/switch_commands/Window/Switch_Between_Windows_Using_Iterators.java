package switch_commands.Window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Between_Windows_Using_Iterators 
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
		
		
		//Get All window Dynamic ID's
		Set<String> AllWindow_IDS=driver.getWindowHandles();
		
		//Convert set of objects into iterators
		Iterator<String> itr=AllWindow_IDS.iterator();
		
		
		String TrainsWindow=itr.next();
		driver.switchTo().window(TrainsWindow);
		System.out.println("w1 title is => "+driver.getTitle());
		
		
		String Seat_availability=itr.next();
		driver.switchTo().window(Seat_availability);
		System.out.println("W2 title is => "+driver.getTitle());
		
		
		String Pnr_status=itr.next();
		driver.switchTo().window(Pnr_status);
		System.out.println("w3 title is => "+driver.getTitle());
		
		
		driver.switchTo().window(Seat_availability);
		
		
	}

}
