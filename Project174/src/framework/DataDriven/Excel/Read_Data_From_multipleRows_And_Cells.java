package framework.DataDriven.Excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_multipleRows_And_Cells {

	public static void main(String[] args) throws Exception 
	{
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Get Workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using above workbook
		XSSFSheet sht=book.getSheetAt(2);
		
		
		//Get number of rows data available with in sheet
		int Rcount=sht.getLastRowNum();
		System.out.println("Number of rows available in sheet => "+Rcount);
		
		//Iterate for expected number of rows
		for (int i = 5; i <= Rcount; i++) 
		{
			
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(UID+"  "+PWD);
		}
		
		
		
		
		//Return number in whilch row data started.
		int Frnum=sht.getFirstRowNum();
		//Return Number of rows data in excel
		int Lrnum=sht.getLastRowNum();
		
		System.out.println("First Row number where data started in excel is => "+Frnum);
		System.out.println("Last row number where data ended in excel is => "+Lrnum);
		
		
		//Return number in which cell data started
		int Fcnum=sht.getRow(5).getFirstCellNum();
		int Lcnum=sht.getRow(5).getLastCellNum();
		System.out.println("Cell data started at => "+Fcnum);
		System.out.println("Cell data Ended at => "+Lcnum);
		
		
		//Read dynamic rows and dynamic cells
		for (int i = Frnum; i <= Lrnum; i++) 
		{
			
			for (int j = Fcnum; j < Lcnum; j++) 
			{
				
				XSSFCell Eachcell=sht.getRow(i).getCell(j);
				//This condition avoid reading data from empty cells.
				if(Eachcell.getCellType()!=Cell.CELL_TYPE_BLANK)
				{
					String CellData=Eachcell.getStringCellValue();
					if(CellData.equals("Newuser61"))
					{
						System.out.println("data available at sheet");
					}
				}
				
				
				
			}
		}

	}

}
