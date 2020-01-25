package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Dynamicrows_Using_Conditions {

	public static void main(String[] args) throws IOException 
	{
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Access workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using book referral
		XSSFSheet sht=book.getSheetAt(3);
		
		//Get number of rows data available at sheet
		int Rcount=sht.getLastRowNum();
		System.out.println(Rcount);
		
		//Iterate for number of rows
		for (int i = 5; i <= Rcount; i++) 
		{
			//Get execution status from 3rd cell
			String Exe_status=sht.getRow(i).getCell(2).getStringCellValue();
			
			if(Exe_status.equalsIgnoreCase("y"))
			{
				String UID=sht.getRow(i).getCell(0).getStringCellValue();
				String PWD=sht.getRow(i).getCell(1).getStringCellValue();
				
				
				
				//get Scenario type
				String SType=sht.getRow(i).getCell(3).getStringCellValue().trim();
				
				
				if(SType.equals("text"))
				{
					System.out.println(UID+"   "+PWD+"  => "+"text captured");
				}
				else if(SType.equals("alert"))
				{
					System.out.println(UID+"   "+PWD+"  => "+"alert handled");
				}
				else if(SType.equals("p"))
				{
					System.out.println(UID+"   "+PWD+"  => "+"Element displayed");
				}
				else
				{
					System.out.println("Scenario type mismatch");
				}
				
			}//exe_status
			
			
		
			
		}
		
	}

}
