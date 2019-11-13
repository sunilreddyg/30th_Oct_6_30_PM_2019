package launch_browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browsers 
{

	public static void main(String[] args) 
	{
		
		/*
		 * download geckodriver.exe:-->
		 * 		URL:--> https://github.com/mozilla/geckodriver/releases
		 * 		select driver w.r.t browser version
		 * 				firefox browser version :-->  60 above version
		 * 				geckodriver version     :-->  v0.26.0
		 * 		Download Zip format file w.r.t OS [WINDOWS]
		 * 		After download completed unzip file to backup folder
		 * 		
		 */
		
		
		//Set Runtime environment variable for geckodriver
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://www.facebook.com");
		

	}

}
