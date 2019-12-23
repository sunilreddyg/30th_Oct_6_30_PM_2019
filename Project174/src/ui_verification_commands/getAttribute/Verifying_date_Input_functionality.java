package ui_verification_commands.getAttribute;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifying_date_Input_functionality {

	public static void main(String[] args) 
	{

		/*
		 * Scenario:-->
		 * 		Verifying Departude date functionality.
		 * 		
		 * 		Step1;--> Enter url  http://spicejet.com
		 * 		Expected:--> Make sure departure date matching with
		 * 					current system date.
		 */
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		WebElement Departure_EB=driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']"));
		String Act_Date=Departure_EB.getAttribute("value");
		System.out.println(Act_Date);
		
		
		//Get Current System Default Date.
		Date d=new Date();
		System.out.println(d.toString());
		//Convert Default Date into required format
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM");
		//Convert Default Date using Date formatter
		String Exp_Date=sdf.format(d);
		
		
		//verify Expected and Actual date
		if(Exp_Date.equals(Act_Date))
			System.out.println("Testpass;--> Date match found");
		else
			System.out.println("Testfail:--> Date found mismatch");

		

		/*
		 * Date formatters:-->
		 * 
		 * 		yyyy =>    year   [2019]
		 * 		  yy =>    year   [19]
		 * 		  MM =>    Month  [01-12]
		 * 		MMM  =>    Month  [Jan -Dec]
		 * 		EEE  =>    week   [sun -sat]
		 * 		  dd =>    date   [01-31]
		 * 		  hh =>    hour   [01-24]
		 * 		  mm =>    minute [01-60]
		 * 		  ss =>    Seconds[01-60]
		 * 		
		 */
		
	}

}
