package framework.DataDriven.Excel;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_WebDriver_TestCase_Data {

	public static void main(String[] args) throws Exception 
	{
		
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Get Workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using above workbook
		XSSFSheet sht=book.getSheetAt(1);
		
		//target row using sheet referrence
		XSSFRow row=sht.getRow(1);
		
		//Get excel data
		String URL=row.getCell(1).getStringCellValue();
		String Signin_Link_loc=row.getCell(2).getStringCellValue();
		String Email_loc=row.getCell(3).getStringCellValue();
		String Email_input=row.getCell(4).getStringCellValue();
		String Email_Next_btn_loc=row.getCell(5).getStringCellValue();
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 
		driver.manage().window().maximize();
		
		//Load webpage
		driver.get(URL);
		
		//Click Signin button to get login page
		driver.findElement(By.xpath(Signin_Link_loc)).click();
		
		//Type email 
		driver.findElement(By.xpath(Email_loc)).clear();
		driver.findElement(By.xpath(Email_loc)).sendKeys(Email_input);
		
		//click Next button
		driver.findElement(By.xpath(Email_Next_btn_loc)).click();
		
		
		

	}

}
