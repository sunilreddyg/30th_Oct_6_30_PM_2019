package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_DynamicRow_And_Static_CellData {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");			  
		driver.manage().window().maximize();
		
		
		WebElement Markets=driver.findElement(By.xpath("//a[contains(.,'markets')]"));
		Markets.click();
		
		//Identifying table at webpage.
		WebElement Table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));

		//Get list of rows under table [Every table row contains <tr> </tr> tagname]
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
		
		//Iterate for number of rows
		for (int i = 1; i < rows.size(); i++) 
		{
			
			//Get Dynamic Row 
			WebElement DynamicRow=rows.get(i);
			

			//Find list of cell under selectedrow[Table cell contain <td> tagname]
			List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
			
			//Get Cell data
			String Cname=cells.get(0).getText();
			String HighPrice=cells.get(3).getText();
			String LowPrice=cells.get(4).getText();
			
			System.out.println(Cname+"   "+HighPrice+"    "+LowPrice);
			
			
		}

	}

}
