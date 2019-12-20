package ui_verification_commands.gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Expected_text_presented_At_Webtable {

	public static void main(String[] args) {
		
		/*
		 * Scenario:-->
		 * 		Given site url https://www.icicidirect.com/ 
		 * 		Then verify expected company name available at Top-gainers table
		 */

		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		//Identify Webtable
		WebElement Top_Gainers_Table=driver.findElement(By.cssSelector("#pnl_Bse > table"));
		//On Table Capture Entire visibel text
		String Gainers_list=Top_Gainers_Table.getText();
		
		//Condition to verify expected record presented at top gainers table.
		if(Gainers_list.contains("ICIBAN"))
			System.out.println("Record exist at topgainers table");
		else
			System.out.println("Doesn't at topgainers table");
	}

}
