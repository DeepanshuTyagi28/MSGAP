package com.ttn.commonutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Hashtable;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataProviderExcelReader {
	protected static Logger logger = LoggerFactory.getLogger(DataProviderExcelReader.class);
	  private static XSSFSheet sheet;
	    private static XSSFWorkbook workbook = null;
	    static File file;
	    static FileInputStream inputStream;

	    private static XSSFRow row = null;
	    private static XSSFCell cell = null;

	    public static String path;
	    public static String Environment=PropertyReader.getProperty_for_baseconfig("Environment");

	    public static String TEST_CASES_DATA_SHEET_NAME;

	    public static Object[][] read_data(String testName, String sheetName) throws IOException {

	    	if(Environment.equalsIgnoreCase("UAT"))
	    	{
			 path="/src/test/resources/API_DataSheet_UAT.xlsx";
	    	}
	    	else if(Environment.equalsIgnoreCase("Stage"))
	    	{
	    		path="/src/test/resources/API_DataSheet_Stage.xlsx";
	    	}
	    	else if(Environment.equalsIgnoreCase("prod"))
	    	{
	    		path="/src/test/resources/API_DataSheet_Prod.xlsx";
	    	}
	    	
	    	TEST_CASES_DATA_SHEET_NAME=sheetName;


	        file = new File(ObjectReader.getResourcePath(path));
	        inputStream = new FileInputStream(file);
	        workbook = new XSSFWorkbook(inputStream);
	        sheet = workbook.getSheet(TEST_CASES_DATA_SHEET_NAME);



	        int testStartRowNum = 0;
	        try {
	           // logger.info(getRowCount(TEST_CASES_DATA_SHEET_NAME));
	            for (int rNum = 1; rNum <= getRowCount(TEST_CASES_DATA_SHEET_NAME); rNum++) {
	                try {
	                    //logger.info(getCellData(TEST_CASES_DATA_SHEET_NAME, 0, rNum));
	                    if (getCellData(TEST_CASES_DATA_SHEET_NAME, 0, rNum).equals(testName)) {
	                        testStartRowNum = rNum;
	                        break;
	                    }
	                } catch (Exception ex) {
	                    logger.info("------++++Test Case Skipped+++++------" + testName+","+TEST_CASES_DATA_SHEET_NAME+","+rNum);
	                    logger.info("------Print Exception Message------" + ex);

	                }
	            }
	        } catch (Exception e1) {
	            logger.info("=========Check for Test case Name Or Runmode==========" + e1.getMessage());
	        }
	        int colStartRowNum = testStartRowNum + 1;
	        int totalCols = 0;
	        while (!getCellData(TEST_CASES_DATA_SHEET_NAME, totalCols, colStartRowNum).equals("")) {
	            totalCols++;
	        }
	        int dataStartRowNum = testStartRowNum + 2;
	        int totalRows = 0;
	        while (!getCellData(TEST_CASES_DATA_SHEET_NAME, 0, dataStartRowNum + totalRows)
	                .equals("")) {
	            totalRows++;
	        }

	        Object[][] data = new Object[totalRows][1];
	        int index = 0;
	        Hashtable<String, String> table = null;
	        try {
	            logger.info(">>>>>>>>>>>>DataStartRowNum: " + dataStartRowNum);
	            logger.info(">>>>>>>>>>>>(dataStartRowNum + totalRows): " + (dataStartRowNum + totalRows));
	            logger.info(">>>>>>>>>>>>totalCols: " + totalCols);
	            logger.info("++--Test Case:--++" + testName);
	            for (int rNum = dataStartRowNum; rNum < (dataStartRowNum + totalRows); rNum++) {
	                table = new Hashtable<String, String>();
	                //Thread.sleep(3000);

	                for (int cNum = 0; cNum < totalCols; cNum++) {
	                    table.put(getCellData(TEST_CASES_DATA_SHEET_NAME, cNum, colStartRowNum),
	                            getCellData(TEST_CASES_DATA_SHEET_NAME, cNum, rNum));
	                    //Thread.sleep(3000);
	                    //logger.info("==========++++++++++++++++++++++++++===========");

	                }
	                data[index][0] = table;
	                index++;
	            }
	        } catch (Exception ex) {
	            logger.info("Exception caused by : " + ex.getMessage());
	            return null;
	        }

	        return data;
	    }



	    public static int getRowCount(String sheetName) {
	        int index = workbook.getSheetIndex(sheetName);
	        if (index == -1)
	            return 0;
	        else {
	            sheet = workbook.getSheetAt(index);
	            int number = sheet.getLastRowNum() + 1;
	            return number;
	        }

	    }

	    // returns the data from a cell
	    public String getCellData(String sheetName, String colName, int rowNum) {
	        try {
	            if (rowNum <= 0) {

	                return "";
	            }

	            int index = workbook.getSheetIndex(sheetName);
	            int col_Num = -1;
	            if (index == -1) {

	                return "";
	            }
	            sheet = workbook.getSheetAt(index);
	            row = sheet.getRow(0);
	            for (int i = 0; i < row.getLastCellNum(); i++) {
	                // logger.info(row.getCell(i).getStringCellValue().trim());
	                try{
	                    if (row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
	                        col_Num = i;
	                }catch(Exception ex){
	                    logger.info("Error in row : " + row.getRowNum() + " , column is : "  + i );
	                }

	            }
	            if (col_Num == -1) {
	                //logger.info("+++++Empty string returned conditon col_Num = -1");
	                return "";
	            }
	            sheet = workbook.getSheetAt(index);
	            row = sheet.getRow(rowNum - 1);
	            if (row == null) {
	                //	logger.info("+++++Empty string returned conditon row = null");
	                return "";
	            }

	            cell = row.getCell(col_Num);
	            if (cell == null) {
	                //	logger.info("+++++Empty string returned conditon cell = null");
	                return "";
	            }
	            // logger.info(cell.getCellType());
	            if (cell.getCellType() == CellType.STRING) {
	                //logger.info("+++++ Print Cell Value for CELL_TYPE_STRING +++++"+cell.getStringCellValue());
	                return cell.getStringCellValue();
	            } else if (cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.FORMULA) {

	                String cellText = String.valueOf(cell.getNumericCellValue());
	                if (HSSFDateUtil.isCellDateFormatted(cell)) {
	                    // format in form of M/D/YY
	                    double d = cell.getNumericCellValue();

	                    Calendar cal = Calendar.getInstance();
	                    cal.setTime(HSSFDateUtil.getJavaDate(d));
	                    cellText = (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
	                    cellText = cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.MONTH) + 1 + "/" + cellText;
	                }
	                return cellText;
	            } else if (cell.getCellType() == CellType.BLANK) {
	                //logger.info("+++++Empty string returned conditon cell.getCellType() == Cell.CELL_TYPE_BLANK");
	                return "";
	            } else {
	                throw new IllegalArgumentException("+++++++++Invalid cell value for Cell type :  " + cell.getCellType()
	                        + " and row : " + rowNum +"Column name"+colName);
	                //return String.valueOf(cell.getBooleanCellValue());
	            }
	        } catch (Exception e) {

	            e.printStackTrace();
	            return "row " + rowNum + " or column " + colName + " does not exist in xls";
	        }
	    }

	    public static String getCellData(String sheetName, int colNum, int rowNum) {
	        try {
	            //logger.info("Reading value for row : " + rowNum + " , column : " + colNum);
	            if (rowNum <= 0) {
	                //	logger.info("Empty string returned conditon rowNum <= 0");
	                return "";
	            }
	            int index = workbook.getSheetIndex(sheetName);
	            if (index == -1) {
	                //	logger.info("Empty string returned conditon index == -1");
	                return "";
	            }
	            sheet = workbook.getSheetAt(index);
	            row = sheet.getRow(rowNum - 1);
	            if (row == null) {
	                //	logger.info("Empty string returned conditon row == null");
	                return "";
	            }
	            cell = row.getCell(colNum);
	            if (cell == null) {
	                //	logger.info("Empty string returned conditon cell == null");
	                return "";
	            }
	            if (cell.getCellType() == CellType.STRING) {
	                try {
	                    // logger.info("----value from
	                    // XLREADER-----"+cell.getStringCellValue());
	                    //logger.info("Cell value : " + cell.getStringCellValue());
	                    return cell.getStringCellValue();
	                } catch (Exception ex) {
	                    logger.info("Cell value In catch block: " + cell.toString());
	                    return cell.toString();
	                }
	            } else if (cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.FORMULA) {

	                String cellText = String.valueOf(cell.getNumericCellValue());
	                if (HSSFDateUtil.isCellDateFormatted(cell)) {
	                    // format in form of M/D/YY
	                    double d = cell.getNumericCellValue();
	                    Calendar cal = Calendar.getInstance();
	                    cal.setTime(HSSFDateUtil.getJavaDate(d));
	                    cellText = (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
	                    cellText = cal.get(Calendar.MONTH) + 1 + "/" + cal.get(Calendar.DAY_OF_MONTH) + "/" + cellText;

	                    // logger.info(cellText);

	                }
	                logger.info("Above Cell Text : " + cellText);
	                return cellText;
	            } else if (cell.getCellType() == CellType.BLANK) {
	                //logger.info("Empty string returned conditon cell.getCellType() == Cell.CELL_TYPE_BLANK");
	                return "";
	            }

	            if(cell.getCellType() == CellType.BOOLEAN){
	                if(cell.getBooleanCellValue()){
	                    return "True";
	                }else{
	                    return "False";
	                }
	            }

	            else {
	                throw new IllegalArgumentException("Invalid cell value. Cell type : " + cell.getCellType()
	                        + " and row : " + rowNum + " , column : " + colNum);



	            }
	        } catch (Exception e) {

	            e.printStackTrace();
	            return "row " + rowNum + " or column " + colNum + " does not exist  in xls";
	        }
	    }



	    // find whether sheets exists
	    public boolean isSheetExist(String sheetName) {
	        int index = workbook.getSheetIndex(sheetName);
	        if (index == -1) {
	            index = workbook.getSheetIndex(sheetName.toUpperCase());
	            if (index == -1)
	                return false;
	            else
	                return true;
	        } else
	            return true;
	    }

	    // returns number of columns in a sheet
	    public int getColumnCount(String sheetName) {
	        // check if sheet exists
	        if (!isSheetExist(sheetName))
	            return -1;

	        sheet = workbook.getSheet(sheetName);
	        row = sheet.getRow(0);

	        if (row == null)
	            return -1;

	        return row.getLastCellNum();

	    }

	    public int getCellRowNum(String sheetName, String colName, String cellValue) {

	        for (int i = 2; i <= getRowCount(sheetName); i++) {
	            if (getCellData(sheetName, colName, i).equalsIgnoreCase(cellValue)) {
	                return i;
	            }
	        }
	        return -1;

	    }


}
