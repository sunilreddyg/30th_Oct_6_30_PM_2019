package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Positive_And_Negative_Testcases {

	public static void main(String[] args) throws Exception 
	{
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Create ouput file
		FileOutputStream fo=new FileOutputStream("TestData\\Output.xlsx");
		
		//Access workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using sheetname
		XSSFSheet sht=book.getSheet("Sheet5");
		
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//static Locactors
		String Sigin_link_loc=sht.getRow(6).getCell(1).getStringCellValue();
		String Email_loc=sht.getRow(6).getCell(2).getStringCellValue();
		String Next_btn_loc=sht.getRow(6).getCell(4).getStringCellValue();
		
		//Application url
		String URL=sht.getRow(4).getCell(1).getStringCellValue();
		
		//Iterate for number of rows
		for (int i = 6; i <= sht.getLastRowNum(); i++)
		{
			
			
			String TestName=sht.getRow(i).getCell(0).getStringCellValue();
			String Email_Input=sht.getRow(i).getCell(3).getStringCellValue();
			String Exp_res=sht.getRow(i).getCell(5).getStringCellValue();
			
			//Get Execution status
			String Exe_status=sht.getRow(i).getCell(6).getStringCellValue();
			if(Exe_status.equalsIgnoreCase("y"))
			{
				driver.get(URL);
				driver.findElement(By.xpath(Sigin_link_loc)).click();
				
				driver.findElement(By.xpath(Email_loc)).clear();
				driver.findElement(By.xpath(Email_loc)).sendKeys(Email_Input);
				
				driver.findElement(By.xpath(Next_btn_loc)).click();
				Thread.sleep(10000);
				
				//Get Scenario type
				String stype=sht.getRow(i).getCell(7).getStringCellValue();
				if(stype.equalsIgnoreCase("text"))
				{
					String PageText=driver.findElement(By.tagName("body")).getText();
					if(PageText.contains(Exp_res))
					{
						sht.getRow(i).createCell(8).setCellValue("Testpass");
					}
					else
					{
						sht.getRow(i).createCell(8).setCellValue("Testfail");
					}
				}
				else if(stype.equalsIgnoreCase("object"))
				{
						if(driver.findElement(By.id(Exp_res)).isDisplayed())
						{
							sht.getRow(i).createCell(8).setCellValue("Testpass");
						}
						
						else
						{
							sht.getRow(i).createCell(8).setCellValue("Testfail");
						}
				}
			}
		
		}//close loop
		
		//Write Data into output file   [Note:--> Don't write inside loop]
		book.write(fo);
		book.close();
		
		
		
		
	}

}
