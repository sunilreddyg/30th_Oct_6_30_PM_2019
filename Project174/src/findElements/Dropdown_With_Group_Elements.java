package findElements;

import java.rmi.activation.Activatable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_With_Group_Elements {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Example:--> verify expected cities displayed
		 * 	w.r.t state selection.
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 	
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");			  
		driver.manage().window().maximize();
		
		
		String Exp_cities[]= 
						{
							"Please select state first",
							"South Andaman",		
							"Anantapur",
							"East Siang",
							"Darrang",
							"Gaya",
							"Chandigarh",
							"Raipur",
							"Silvassa"
						};
		
		
		//Identify state Dropdown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		//Identifying list of option tags under state dropdown
		List<WebElement> All_states=State_Dropdown.findElements(By.tagName("option"));
		
		
		//Iterate for number of states
		for (int i = 0; i < 9; i++) 
		{
			
			//Get Each State using index number
			WebElement Each_state=All_states.get(i);
			//Click Each state
			Each_state.click();
			Thread.sleep(4000);
			
			//Identifying city dropdown
			WebElement City_Dropdown=driver.findElement(By.id("customCity"));
			//get Text at City Dropdown 
			String Actual_Cities=City_Dropdown.getText();
			
			
			if(Actual_Cities.contains(Exp_cities[i]))
			{
				System.out.println("for state "+Each_state.getText()+"\t"+"\t"+" City displayed ==> "+Exp_cities[i]);
			}
			else
			{
				System.out.println("for state "+Each_state.getText()+"\t"+"\t"+" City mismatch ==> "+Exp_cities[i]);
			}
			
		}

	}

}
