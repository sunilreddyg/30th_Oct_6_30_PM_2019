package framework.Testng.DP.Excel_integration;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel_DataProvider_Intergration
{
	XSSFWorkbook book;
	XSSFSheet sht;
	XSSFRow row;
	XSSFCell cell;
	String filepath="TestData\\InputData.xlsx";
	
	
	
	@Test(dataProvider="get_data",enabled=false)
	public void verify_login(String username,String password)
	{
		
	}
	
	@Test(dataProvider="get_data")
	public void Verify_login_Result(String uid,String pwd,String Result)
	{
		
	}
	

	@DataProvider
	public String [][] get_data()
	{
		int Rcount=sht.getLastRowNum();
		int Ccount=sht.getRow(0).getLastCellNum();
		String data[][];
		data=new String[Rcount+1][Ccount];
		
		for (int i = 0; i <= Rcount; i++) 
		{
			for (int j = 0; j < Ccount; j++) 
			{
				 data[i][j]= sht.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return data;
		
	}
	
	

	@BeforeClass
	public void Pre_Condition() throws IOException
	{
		FileInputStream fi=new FileInputStream(filepath);
		book=new XSSFWorkbook(fi);
		sht=book.getSheet("Sheet6");
		
	}
	
	
	@AfterClass
	public void Createoutput() throws IOException
	{
		FileOutputStream fo=new FileOutputStream("TestData\\OP1.xlsx");
		book.write(fo);
		book.close();
	}

}
