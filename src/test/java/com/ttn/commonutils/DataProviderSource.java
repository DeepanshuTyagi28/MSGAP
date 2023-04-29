package com.ttn.commonutils;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestContext;


public class DataProviderSource {
	
    //MSGA_DATA_PROVIDER
    //StateMaster
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_Statemaster_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_Statemaster_ValidInput", sheetName);
        return data;       
    }
    //StateMaster
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_Statemaster_InvalidDate(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_Statemaster_InvalidDate", sheetName);
        return data;        
    }   
    //StateMaster
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_Statemaster_InvalidPMC(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_Statemaster_InvalidPMC", sheetName);
        return data;        
    }    
   
    
    

    //GetCommmonMaster
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetCommmonMaster_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetCommmonMaster_ValidInput", sheetName);
        return data;        
    } 
    //GetCommmonMaster
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetCommmonMaster_BlankAuthToken(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetCommmonMaster_BlankAuthToken", sheetName);
        return data;     
    }
    //GetCommmonMaster
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetCommmonMaster_InvalidAuthToken(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetCommmonMaster_InvalidAuthToken", sheetName);
        return data;      
    }
    //GetCommmonMaster
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetCommmonMaster_InvalidDateFormat(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetCommmonMaster_InvalidDateFormat", sheetName);
        return data;      
    }
 
    
    
    //Get Esc Data
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_Get_ESC_DATA_ACC_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_Get_ESC_DATA_ACC_ValidInput", sheetName);
        return data;      
    }
    
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetESCDATAACC_Blank_PMC(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetESCDATAACC_Blank_PMC", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetESCDATAACC_Invalid_PMC(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetESCDATAACC_Invalid_PMC", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetESCDATAACC_Blank_P_LOC_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetESCDATAACC_Blank_P_LOC_CD", sheetName);
        return data;      
    }
    
   
    
    //City Master
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_CityMaster_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_CityMaster_ValidInput", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_CityMaster_ValidStateCode(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_CityMaster_ValidStateCode", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_CityMaster_InvalidStateCode(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_CityMaster_InvalidStateCode", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_CityMaster_InvalidDate(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_CityMaster_InvalidDate", sheetName);
        return data;      
    }
  
    
    
   // Insert ACC Enquiry  
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCEnquiry_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCEnquiry_ValidInput", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCEnquiry_BlankP_PARENT_GROUP(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCEnquiry_BlankP_PARENT_GROUP", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCEnquiry_InvalidP_PARENT_GROUP(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCEnquiry_InvalidP_PARENT_GROUP", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCEnquiry_BlankP_DEALER_MAP_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCEnquiry_BlankP_DEALER_MAP_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCEnquiry_InvalidP_DEALER_MAP_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCEnquiry_InvalidP_DEALER_MAP_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCEnquiry_Blank_P_LOC_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCEnquiry_Blank_P_LOC_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCEnquiry_Invalid_P_LOC_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCEnquiry_Invalid_P_LOC_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCEnquiry_Blank_P_ENQ_DATE(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCEnquiry_Blank_P_ENQ_DATE", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCEnquiry_Invalid_P_ENQ_DATE(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCEnquiry_Invalid_P_ENQ_DATE", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCEnquiry_Blank_P_CUST_FNAME(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCEnquiry_Blank_P_CUST_FNAME", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCEnquiry_Blank_P_PHONE(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCEnquiry_Blank_P_PHONE", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCEnquiry_Blank_P_SOURCE(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCEnquiry_Blank_P_SOURCE", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCEnquiry_Blank_P_MODE(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCEnquiry_Blank_P_MODE", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCEnquiry_Blank_P_APPOINT_TIME(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCEnquiry_Blank_P_APPOINT_TIME", sheetName);
        return data;      
    }
    
    
    
    // GET ACC ENQUIRY
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetACCEnquiry_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetACCEnquiry_ValidInput", sheetName);
        return data;      
    }
    
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetACCEnquiry_InvalidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetACCEnquiry_InvalidInput", sheetName);
        return data;      
    }
    
    
    
   //Insert ACC ORD 
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCEORD_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCEORD_ValidInput", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCORD_BlankP_PARENT_GROUP(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCORD_BlankP_PARENT_GROUP", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCORD_InvalidP_PARENT_GROUP(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCORD_InvalidP_PARENT_GROUP", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCORD_BlankP_DEALER_MAP_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCORD_BlankP_DEALER_MAP_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCORD_InvalidP_DEALER_MAP_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCORD_InvalidP_DEALER_MAP_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCORD_BlankP_LOC_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCORD_BlankP_LOC_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCORD_InvalidP_LOC_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCORD_InvalidP_LOC_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCORD_BlankP_ORDER_DATE(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCORD_BlankP_ORDER_DATE", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCORD_InvalidP_ORDER_DATE(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCORD_InvalidP_ORDER_DATE", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCORD_BlankP_CUST_FNAME(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCORD_BlankP_CUST_FNAME", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCORD_BlankP_P_PHONE(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCORD_BlankP_P_PHONE", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCORD_BlankP_SOURCE(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCORD_BlankP_SOURCE", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCORD_BlankP_APPOINT_TIME(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCORD_BlankP_APPOINT_TIME", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCORD_BlankP_AMT_PAID(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCORD_BlankP_AMT_PAID", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCORD_InvalidP_AMT_PAID(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCORD_InvalidP_AMT_PAID", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCORD_BlankP_TOTAL_AMT(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCORD_BlankP_TOTAL_AMT", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_InsertACCORD_InvalidP_TOTAL_AMT(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_InsertACCORD_InvalidP_TOTAL_AMT", sheetName);
        return data;      
    }
    
    
    // GET_ACC_ORD
    
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetACCORD_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetACCORD_ValidInput", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetACCORD_InvalidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetACCORD_InvalidInput", sheetName);
        return data;      
    }
    
    
    
   // GET_ORD_ENQ_LINE_STATUS
    
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GETORDENQLINESTATUS_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GETORDENQLINESTATUS_ValidInput", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GETORDENQLINESTATUS_Blank_P_PARENT_GROUP(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GETORDENQLINESTATUS_Blank_P_PARENT_GROUP", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GETORDENQLINESTATUS_Invalid_P_PARENT_GROUP(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GETORDENQLINESTATUS_Invalid_P_PARENT_GROUP", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GETORDENQLINESTATUS_Blank_P_DEALER_MAP_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GETORDENQLINESTATUS_Blank_P_DEALER_MAP_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GETORDENQLINESTATUS_Invalid_P_DEALER_MAP_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GETORDENQLINESTATUS_Invalid_P_DEALER_MAP_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GETORDENQLINESTATUS_Blank_P_LOC_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GETORDENQLINESTATUS_Blank_P_LOC_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GETORDENQLINESTATUS_Invalid_P_LOC_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GETORDENQLINESTATUS_Invalid_P_LOC_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GETORDENQLINESTATUS_Blank_P_ENQ_ORDER_NUM(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GETORDENQLINESTATUS_Blank_P_ENQ_ORDER_NUM", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GETORDENQLINESTATUS_Invalid_P_ENQ_ORDER_NUM(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GETORDENQLINESTATUS_Invalid_P_ENQ_ORDER_NUM", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GETORDENQLINESTATUS_Blank_P_FLAG(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GETORDENQLINESTATUS_Blank_P_FLAG", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GETORDENQLINESTATUS_Invalid_P_FLAG(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GETORDENQLINESTATUS_Invalid_P_FLAG", sheetName);
        return data;      
    }
    
    
    //GetModelVarMapping
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetModelVarMapping_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetModelVarMapping_ValidInput", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetModelVarMapping_InvalidDate(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetModelVarMapping_InvalidDate", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetModelVarMapping_FutureDate(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetModelVarMapping_FutureDate", sheetName);
        return data;      
    }
    
    
    // GetPartModelMapping
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetPartModelMapping_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetPartModelMapping_ValidInput", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetPartModelMapping_InvalidDate(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetPartModelMapping_InvalidDate", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetPartModelMapping_FutureDate(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetPartModelMapping_FutureDate", sheetName);
        return data;      
    }
    
    
    
    // GetPartMaster
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetPartMaster_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetPartMaster_ValidInput", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetPartMaster_InvalidDate(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetPartMaster_InvalidDate", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetPartMaster_FutureDate(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetPartMaster_FutureDate", sheetName);
        return data;      
    }
    
    
    
    //GetCategoryMaster
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetCategoryMaster_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetCategoryMaster_ValidInput", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetCategoryMaster_InvalidDate(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetCategoryMaster_InvalidDate", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetCategoryMaster_FutureDate(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetCategoryMaster_FutureDate", sheetName);
        return data;      
    }
    
    
    
    //GetSubCategoryMaster
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetSubCategoryMaster_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetSubCategoryMaster_ValidInput", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetSubCategoryMaster_InvalidDate(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetSubCategoryMaster_InvalidDate", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_GetSubCategoryMaster_FutureDate(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_GetSubCategoryMaster_FutureDate", sheetName);
        return data;      
    }
    
    
    
    
    //Fetch_Dealer_Details
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_FetchDealerDetails_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_FetchDealerDetails_ValidInput", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_FetchDealerDetails_Blank_P_mul_dealer_Cd(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_FetchDealerDetails_Blank_P_mul_dealer_Cd", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_FetchDealerDetails_Invalid_P_mul_dealer_Cd(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_FetchDealerDetails_Invalid_P_mul_dealer_Cd", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_FetchDealerDetails_Blank_p_for_Cd(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_FetchDealerDetails_Blank_p_for_Cd", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_FetchDealerDetails_Invalid_p_for_Cd(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_FetchDealerDetails_Invalid_p_for_Cd", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_FetchDealerDetails_Blank_p_pmc(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_FetchDealerDetails_Blank_p_pmc", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_FetchDealerDetails_Invalid_p_pmc(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_FetchDealerDetails_Invalid_p_pmc", sheetName);
        return data;      
    }
    
    
    
    //Booking cancel
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_BookingCancel_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_BookingCancel_ValidInput", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_BookingCancel_Blank_P_DEALER_MAP_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_BookingCancel_Blank_P_DEALER_MAP_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_BookingCancel_Invalid_P_DEALER_MAP_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_BookingCancel_Invalid_P_DEALER_MAP_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_BookingCancel_Blank_P_REFUND_AMT(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_BookingCancel_Blank_P_REFUND_AMT", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_BookingCancel_Invalid_P_REFUND_AMT(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_BookingCancel_Invalid_P_REFUND_AMT", sheetName);
        return data;      
    }
    
    
    //Dealer Details
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_DealerDetails_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_DealerDetails_ValidInput", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_DealerDetails_Invalid_P_PMC(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_DealerDetails_Invalid_P_PMC", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_DealerDetails_Invalid_P_DATE(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_DealerDetails_Invalid_P_DATE", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGA_DealerDetails_valid_P_DATE(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGA_DealerDetails_valid_P_DATE", sheetName);
        return data;      
    }
    
    
    
    
  // MSGP   
    
    
    //Get ESC Data
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GetEscData_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GetEscData_ValidInput", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GetEscData_Blank_P_PMC(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GetEscData_Blank_P_PMC", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GetEscData_Invalid_P_PMC(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GetEscData_Invalid_P_PMC", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GetEscData_Non_Existing_P_PMC(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GetEscData_Non_Existing_P_PMC", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GetEscData_Invalid_P_DLR_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GetEscData_Invalid_P_DLR_CD", sheetName);
        return data;      
    }
    
    
    // Get Model Master 
    
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GetModelMaster_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GetModelMaster_ValidInput", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GetModelMaster_invalidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GetModelMaster_invalidInput", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GetModelMaster_FutureDate(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GetModelMaster_FutureDate", sheetName);
        return data;      
    }
    
    
    
    //GEN_PART_SRV_ENQ
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GenPartSrvEnq_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GenPartSrvEnq_ValidInput", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GenPartSrvEnq_Blank_P_PARENT_GROUP(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GenPartSrvEnq_Blank_P_PARENT_GROUP", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GenPartSrvEnq_Invalid_P_PARENT_GROUP(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GenPartSrvEnq_Invalid_P_PARENT_GROUP", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GenPartSrvEnq_Blank_P_DEALER_MAP_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GenPartSrvEnq_Blank_P_DEALER_MAP_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GenPartSrvEnq_Invalid_P_DEALER_MAP_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GenPartSrvEnq_Invalid_P_DEALER_MAP_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GenPartSrvEnq_Blank_P_LOC_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GenPartSrvEnq_Blank_P_LOC_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GenPartSrvEnq_Invalid_P_LOC_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GenPartSrvEnq_Invalid_P_LOC_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GenPartSrvEnq_Blank_P_PHONE(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GenPartSrvEnq_Blank_P_PHONE", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GenPartSrvEnq_Blank_P_REG_NUM(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GenPartSrvEnq_Blank_P_REG_NUM", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GenPartSrvEnq_Invalid_P_REG_NUM(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GenPartSrvEnq_Invalid_P_REG_NUM", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GenPartSrvEnq_Blank_PartNumber(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GenPartSrvEnq_Blank_PartNumber", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_GenPartSrvEnq_Invalid_PartNumber(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_GenPartSrvEnq_Invalid_PartNumber", sheetName);
        return data;      
    }
    
    
    //Inser Acc Enquiry MSGP
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_InsertAccEnquiry_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_InsertAccEnquiry_ValidInput", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_InsertAccEnquiry_blank_P_PARENT_GROUP(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_InsertAccEnquiry_blank_P_PARENT_GROUP", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_InsertAccEnquiry_Invalid_P_PARENT_GROUP(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_InsertAccEnquiry_Invalid_P_PARENT_GROUP", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_InsertAccEnquiry_blank_P_DEALER_MAP_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_InsertAccEnquiry_blank_P_DEALER_MAP_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_InsertAccEnquiry_Invalid_P_DEALER_MAP_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_InsertAccEnquiry_Invalid_P_DEALER_MAP_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_InsertAccEnquiry_blank_P_LOC_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_InsertAccEnquiry_blank_P_LOC_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_InsertAccEnquiry_Invalid_P_LOC_CD(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_InsertAccEnquiry_Invalid_P_LOC_CD", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_InsertAccEnquiry_Blank_P_ENQ_DATE(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_InsertAccEnquiry_Blank_P_ENQ_DATE", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_InsertAccEnquiry_Blank_P_CUST_FNAME(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_InsertAccEnquiry_Blank_P_CUST_FNAME", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_InsertAccEnquiry_Blank_P_PHONE(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_InsertAccEnquiry_Blank_P_PHONE", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_InsertAccEnquiry_Blank_P_SOURCE(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_InsertAccEnquiry_Blank_P_SOURCE", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_InsertAccEnquiry_Blank_P_MODE(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_InsertAccEnquiry_Blank_P_MODE", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_InsertAccEnquiry_Blank_P_APPOINT_TIME(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_InsertAccEnquiry_Blank_P_APPOINT_TIME", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_InsertAccEnquiry_Invalid_P_APPOINT_TIME(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_InsertAccEnquiry_Invalid_P_APPOINT_TIME", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_InsertAccEnquiry_Blank_P_ENQ_CATG(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_InsertAccEnquiry_Blank_P_ENQ_CATG", sheetName);
        return data;      
    }
    @org.testng.annotations.DataProvider
    public Object[][] MSGP_InsertAccEnquiry_Invalid_P_ENQ_CATG(ITestContext context) throws EncryptedDocumentException, IOException {
    	String sheetName = context.getCurrentXmlTest().getParameter("SheetName");
        Object data [][] = DataProviderExcelReader.read_data("MSGP_InsertAccEnquiry_Invalid_P_ENQ_CATG", sheetName);
        return data;      
    }
    
}