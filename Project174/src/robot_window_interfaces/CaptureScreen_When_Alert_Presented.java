package robot_window_interfaces;


import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen_When_Alert_Presented {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.firstnaukri.com/");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
								
		
		//Identify Search button without enter details [It display alert]
		WebElement Search_btn=driver.findElement(By.xpath("//input[@type='submit']"));
		Search_btn.click();
		Thread.sleep(3000);
		
		
		//Create object for Robot class
		Robot robot=new Robot();
		
		
		//get current Screen dimension
		Dimension Screen_Dimension=Toolkit.getDefaultToolkit().getScreenSize();
		//Using screen dimension create screen and store into buffered image..
		BufferedImage Image=robot.createScreenCapture(new Rectangle(Screen_Dimension));
		//Write Image
		String file_path="C:\\Users\\Administrator\\git\\30th_Oct_6_30_PM_2019\\Project174\\src\\robot_window_interfaces\\Robot_alert.png";
		ImageIO.write(Image, "PNG", new File(file_path));
		
		

		/*
		 * Note:-->
		 * 		Selenium fail to capture screen when alert presented
		 * 		at webpage. But Robot framework capture screen even
		 * 		alert presented at webpage.
		 */
		

	}

}
