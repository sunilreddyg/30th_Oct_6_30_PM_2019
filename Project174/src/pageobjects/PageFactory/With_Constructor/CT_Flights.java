package pageobjects.PageFactory.With_Constructor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import switch_commands.Window.From_Collection_of_Windows_Switch_To_Required_Window;

public class CT_Flights 
{

	public CT_Flights(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//@findy annotation lookup for object at webpage
	@FindBy(how=How.ID,using="OneWay") 
	public WebElement Oneway_Rbtn;
	
	@FindBy(how=How.ID,using="RoundTrip")
	public WebElement Roundtrip_Rbtn;
	
	@FindBy(xpath="//input[@id='MultiCity']")
	public WebElement Multiple_Trip_Rbtn;
	
	@FindBy(xpath="//div[@id='homeErrorMessage']")
	public WebElement Home_error_msg;
	
	@FindBy(xpath = "//h1[contains(.,'Search flights')]")
	public WebElement Page_header;
	
	@FindBy(how=How.XPATH,using="//strong[contains(.,'One way')]")
	public WebElement Oneway_Rbtn_label;
	
	@FindBy(xpath = "(//strong[contains(.,'Round trip')])[1]")
	public WebElement Roundtrip_Rbtn_Label;
	
	@FindBy(xpath = "//input[@id='FromTag']")
	public WebElement From_EB;
	
	@FindBy(xpath = "//a[contains(.,'Hyderabad, IN - Rajiv Gandhi International (HYD)')]")
	public WebElement Hyd_City_Airport;
	
	@FindBy(xpath = "//input[@id='ToTag']")
	public WebElement Arrival_EB;
	
	@FindBy(xpath = "//a[contains(.,'New Delhi, IN - Indira Gandhi Airport (DEL)')]")
	public WebElement Delhi_City_Airport;
	
	@FindBy(xpath = "//select[@name='adults']")
	public WebElement Adults_DD;
	
	@FindBy(linkText="28")
	public WebElement Departue_Date;
	
	@FindBy(xpath = "//input[@id='SearchBtn']")
	public WebElement Flight_Search_btn;
	
	
	
	/*
	 * Methodname:--> Search flight
	 */
	public void flight_search_oneway_trip()
	{
		if(!Oneway_Rbtn.isSelected())
		{
			Oneway_Rbtn.click();
		}

		From_EB.clear();
		From_EB.sendKeys("H"+Keys.ARROW_RIGHT+"YD");
		Hyd_City_Airport.click();
		
		Arrival_EB.clear();
		Arrival_EB.sendKeys("D"+Keys.ARROW_RIGHT+"EL");
		Delhi_City_Airport.click();
		
		Flight_Search_btn.click();
		
		
	}
	
	/*
	 * Methodname:--> Search flight
	 */
	public void flight_search_roundtrip()
	{
		if(!Roundtrip_Rbtn.isSelected())
		{
			Roundtrip_Rbtn.click();
		}
		
		From_EB.clear();
		From_EB.sendKeys("H"+Keys.ARROW_RIGHT+"YD");
		Hyd_City_Airport.click();
		
		Arrival_EB.clear();
		Arrival_EB.sendKeys("D"+Keys.ARROW_RIGHT+"EL");
		Delhi_City_Airport.click();
		
		Flight_Search_btn.click();
		
		
	}
	
	//InputData
		public String Exp_page_header="Search flights";
		public String Exp_home_err_msg="Sorry, but we can't continue until you fix everything that's marked in RED";
		
		
		
		/*
		 * Reusable method:--> Verify Page Header displayed at webpage
		 */
		public void Verify_Page_Header_Visibility()
		{
			 if(Page_header.isDisplayed())
				 System.out.println("header visible at webpage");
			 else
				 System.out.println("header not visible at webpage");
			
		}
		
		
		//Reusable Method:--> Verify Expected Header visible at webpage
		public boolean Verify_Expected_Header_Visibility()
		{
			String Runtime_Header_text=Page_header.getText();
			boolean flag=Runtime_Header_text.equals(Exp_page_header);
			if(flag==true)
				System.out.println("Expected Header visible at webpage");
			else
				System.out.println("Expected Header not visible at webpage");
			
			return flag;
		}
		
		
		//reusable method:--> verify home error message displayed 
		public void Verify_Home_error_msg_displayed_on_Empty_Search()
		{
			String Runtime_text=Home_error_msg.getText();
			if(Runtime_text.contains(Exp_home_err_msg))
				System.out.println("As expected error msg displayed at webpage");
			else
				System.out.println("Expected home error message displayed at webpage");
		}

	
	


}
