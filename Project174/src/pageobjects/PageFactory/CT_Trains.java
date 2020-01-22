package pageobjects.PageFactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CT_Trains 
{
	
	//@Findby lookup for object at webpage using pagefactory class.
	@FindBy(how=How.ID,using="from_station") 
	public WebElement From_AEB;
	
	//@FindBys lookup for group of objects
	@FindBys(@FindBy(tagName="select"))
	public List<WebElement> dropdowns;
	
	
	@FindBy(xpath = "//li[contains(.,'Hyderabad Decan (HYB)')]")
	@CacheLookup  //Never look for object
	public WebElement From_HYD_City;
	
	@FindBy(xpath="//input[@name='to_station']")
	public WebElement To_AEB;
	
	@FindBy(xpath = "//li[contains(.,'Delhi (DLI)')]")
	public WebElement To_DIL_City;
	
	@FindBy(xpath = "//select[@id='trainClass']")
	public WebElement Travel_Class_DD;
	
	@FindBy(xpath = "//input[contains(@id,'dpt_date')]")
	public WebElement Date_DP;
	
	@FindBy(xpath = "//button[@id='trainFormButton']")
	public WebElement Search_train_BTN;
	
	@FindBy(how=How.LINK_TEXT,using="Check PNR Status")
	public WebElement Check_pnr_status_link;
	
	@FindBy(linkText="Trains availability calendar")
	public WebElement Trains_Availability_cal_Link;
	
	@FindBy(xpath = "//a[@title='Cancel trains tickets']")
	public WebElement Cancel_Train_tickets_link;
	
	@FindBy(xpath="@FindBy(xpath = \"//a[@title='Cancel trains tickets']\")")
	public WebElement Tour_packges_link;
	
	
	
	/*
	 * Method:--> Search Train
	 */
	public void SearchTrain() throws Exception
	{
		From_AEB.clear();
		From_AEB.sendKeys("HYD");
		Thread.sleep(4000);
		From_HYD_City.click();
		
		To_AEB.clear();
		To_AEB.sendKeys("DEL");
		Thread.sleep(4000);
		To_DIL_City.click();
		
		new Select(Travel_Class_DD)
		.selectByVisibleText("AC 2 Tier (2A)");

		Search_train_BTN.click();

	}
}
