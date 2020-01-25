package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Numeric_Values_From_Excel {

	public static void main(String[] args) throws IOException {
	
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Get Workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using above workbook
		XSSFSheet sht=book.getSheetAt(0);
		
		//target row using sheet referrence
		XSSFRow row=sht.getRow(1);
		
		
		//Target Cell using row referrence
		XSSFCell Pwd_cell=row.getCell(2);
		
		Double PWD_In_Double_Frmt=Pwd_cell.getNumericCellValue();
		System.out.println("PWD in double format => "+PWD_In_Double_Frmt);
		
		int PWD_IN_Int_Frmt=PWD_In_Double_Frmt.intValue();
		System.out.println("PWd in integer frmt => "+PWD_IN_Int_Frmt);
		
		
		//Get Mobile number from excel
		Double Mobile_in_Double_Frmt=row.getCell(3).getNumericCellValue();
		Long Mobile_in_long_frmt=Mobile_in_Double_Frmt.longValue();
		System.out.println("Mobile number in long format => "+Mobile_in_long_frmt);
		
		//Converting double format value into string
		String MobileIN_String_Frmt=NumberToTextConverter.toText(Mobile_in_Double_Frmt);
		System.out.println("Mobile in String format => "+MobileIN_String_Frmt);
		
		
		//get boolean cell value
		boolean flag=row.getCell(6).getBooleanCellValue();
		System.out.println("boolean value status is => "+flag);
		
		
	}

}
