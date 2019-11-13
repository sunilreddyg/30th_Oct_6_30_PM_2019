package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class launch_chrome_browser 
{

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
		
		//Create Runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		//launching  chrome automation browser
		ChromeDriver chrome=new ChromeDriver();
		//Load webpage to browser window/
		chrome.get("http://facebook.com");
		
		
		
	}

}
