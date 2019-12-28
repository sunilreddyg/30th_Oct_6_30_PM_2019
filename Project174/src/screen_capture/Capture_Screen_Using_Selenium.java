package screen_capture;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screen_Using_Selenium {

	public static void main(String[] args) throws Exception 
	{

		/*
		 * 	Note:-->To use fileutils[local folders and files] in selenium 
		 * 			3.6 above version ,below downloads required.  
		 * 
		 * URL:--> https://commons.apache.org/proper/commons-io/download_io.cgi
		 * 		   Download binrary file  --> commons-io-2.6-bin.zip
		 * 		   Unzip file and configure all executable jar files to selenium-project.
		 */
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.firstnaukri.com/");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
								
		//Capturesceen and convert into file format		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Dump file into local utilites.
		FileUtils.copyFile(src, new File("screens\\image.png"));
		
	
		/*
		 * Disadvantages:-->
		 * 		
		 * 			=> Only Capture Top frame of window.
		 * 			=> Failed to capture when alert presented at webpage.
		 * 			=> When screen capture repeatedly it override image.
		 */

	}

}
