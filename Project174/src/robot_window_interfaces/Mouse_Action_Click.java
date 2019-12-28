package robot_window_interfaces;

import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouse_Action_Click {

	public static void main(String[] args) throws Exception 
	{
		//Handling browser notification popup window.
		
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.cleartrip.com/");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		Thread.sleep(5000);								
				
		
		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		
		//Perform Mousemove action
		robot.mouseMove(305, 164);
		
		//Peform left click
		robot.mousePress(InputEvent.BUTTON1_MASK);
		//Click Release mouse inorder to perform left click action
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		
		//Perform Scoll Down
		robot.mouseWheel(200);
		
		
		//Pefrom Scolling page to top
		robot.mouseWheel(-200);
	
	}

}
