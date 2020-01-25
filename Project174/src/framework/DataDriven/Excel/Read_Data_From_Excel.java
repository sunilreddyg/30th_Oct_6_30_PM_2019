package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Excel 
{

	public static void main(String[] args) throws IOException 
	{
	
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Access workbook using above fileinputstream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using book reference
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//target row using sheet referral
		XSSFRow row=sht.getRow(1);                      
		
		//Target cell using row referral
		XSSFCell cell=row.getCell(0);
		
		/*
		 * 	To Read Cell data we can foolow below formats
		 * 		getStringCellValue
		 * 		getNumericCellValue
		 * 		getBooleanCellValue
		 * 		getDateCelLValue
		 */
		
		//Read characters from string cell
		String URL=cell.getStringCellValue();
		System.out.println(URL);
		
		//Read Customer ID
		String CID=sht.getRow(1).getCell(1).getStringCellValue();
		System.out.println(CID);
		
	}

}
