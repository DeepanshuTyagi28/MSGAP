package com.ttn.commonutils;

/**
 * This Java program demonstrates how to read data from excel.
 *
 * @author TTN
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class ExcelReader {
	
	private static Sheet sheet;
	private static Row row;
	private static Cell cell;
	private static Workbook wb=null;
	static File file;
	static FileInputStream inputStream;
	static DataFormatter formatter;
	
	public static String path;
	public static String Environment=PropertyReader.getProperty_for_baseconfig("Environment");
		
	
	public static String read_data(String sheetName, int rowNumber, int ColumnNumber) throws EncryptedDocumentException, IOException
	{
		
		 if(Environment.equalsIgnoreCase("UAT"))
	    	{
			 path="/src/test/resources/API_DataSheet_UAT.xls";
	    	}
	    	else if(Environment.equalsIgnoreCase("Stage"))
	    	{
	    		path="/src/test/resources/API_DataSheet_Stage.xls";
	    	}
	    	else if(Environment.equalsIgnoreCase("prod"))
	    	{
	    		path="/src/test/resources/API_DataSheet_Prod.xls";
	    	}
		
		
	 file =    new File(ResourceHelper.getResourcePath(path));
	 inputStream = new FileInputStream(file);
	 wb = new HSSFWorkbook(inputStream);
	 
	 formatter = new DataFormatter();
		
		sheet = wb.getSheet(sheetName);	
			 row = sheet.getRow(rowNumber-1);
			 cell = row.getCell(ColumnNumber-1);
			 String value = formatter.formatCellValue(cell);
			 inputStream.close();
		return value;
		
		
		
	}
	
	
	
	
	
	
}