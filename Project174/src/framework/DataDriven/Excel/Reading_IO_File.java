package framework.DataDriven.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_IO_File {

	public static void main(String[] args) throws IOException 
	{
		
		
		//Target File at local system..
		File file=new File("TestData\\InputData.xlsx");
		
		/*
		 * Excel is a binary file, To read data file
		 * location of excel we follow FileinputStream.
		 */
		FileInputStream fi=new FileInputStream(file);
		
		//To access workbok using above fileinputstream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
	
		
		
		
		
	}

}
