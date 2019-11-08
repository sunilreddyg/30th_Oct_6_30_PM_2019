package selenium_webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Run_WebDriver {

	public static void main(String[] args) 
	{
		
		/*
		 * Download chromedriver.exe file:-->
		 * 	URL ==> https://chromedriver.chromium.org/downloads
		 * 		==> Download chromedriver w.r.t chrome browser version.
		 * 				chrome 78  --> Chromedriver 78
		 * 		==> Select operating system and download zip format file
		 * 		==> After download unzip file to backup drive.
		 * 
		 * 		Note:--> Create Runtime environment varaible before launch
		 * 				 chrome browser.
		 * 
		 * 			System.setproperty("webdriver.chrome.driver","chromedriver.exe");
		 */
		
		//Using chromedriver path create runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://facebook.com");
	}

}
