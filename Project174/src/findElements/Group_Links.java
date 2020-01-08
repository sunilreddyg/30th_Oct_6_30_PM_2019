package findElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Links 
{

	public static void main(String[] args) throws Exception 
	{
	
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 	
		driver.get("https://cleartrip.com");			  
		driver.manage().window().maximize();
		
		
		//identifying location of footerlinks
		WebElement Footer_Area;
		Footer_Area=driver.findElement(By.cssSelector(".inline.clearFix"));

		//Get list of links under footer area..
		List<WebElement> Footer_Links;
		Footer_Links=Footer_Area.findElements(By.cssSelector("a[rel='nofollow']"));
	
		//Iterate for number of footer links
		for (int i = 0; i < Footer_Links.size(); i++) 
		{
			
			//Get Each link using index number
			WebElement Each_link=Footer_Links.get(i);
			String linkname=Each_link.getText();
			String linkhref=Each_link.getAttribute("href");
			
			//Click Eachlink
			Each_link.click();
			Thread.sleep(3000);
			
			//Get Currnet page title and url
			String page_title=driver.getTitle();
			String page_url=driver.getCurrentUrl();
			
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			System.out.println(linkname+"   "+linkhref);
			//Restore all links to avoid staleElementReference exception
			Footer_Area=driver.findElement(By.cssSelector(".inline.clearFix"));
			Footer_Links=Footer_Area.findElements(By.cssSelector("a[rel='nofollow']"));

		}
		
		
		
		
	}

}
