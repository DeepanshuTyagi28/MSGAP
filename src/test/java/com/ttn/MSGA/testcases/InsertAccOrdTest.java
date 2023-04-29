package com.ttn.MSGA.testcases;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Hashtable;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ttn.commonutils.DataProviderSource;
import com.ttn.commonutils.MyPropertyNamingStrategy;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ttn.MSGA.businesslogic.InsertAccOrd;
import com.ttn.MSGA.pojo.InsertACCORDPojo;
import com.ttn.builder.BaseTest;

/**
 * @author Deepanshu Tyagi
 * This class is used to verify MSGA Insert ACC ORD API functionality.
 */


public class InsertAccOrdTest extends BaseTest {
	
    @Test( groups = {"Sanity", "Regression", "MSGA" ,"Pre_Prod"}, dataProvider = "MSGA_InsertACCEORD_ValidInput", dataProviderClass = DataProviderSource.class)
    public void insertAccOrd_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	InsertACCORDPojo InsertACCORDPojo = new InsertACCORDPojo(data.get("P_PARENT_GROUP") , data.get("P_DEALER_MAP_CD") , data.get("P_LOC_CD") , data.get("P_ENQ_NUM") , data.get("P_ORDER_DATE") , data.get("P_CUST_FNAME") , data.get("P_CUST_MNAME") , data.get("P_CUST_LNAME"),data.get("P_PHONE") , data.get("P_EMAIL") , data.get("P_ADDRESS1") , data.get("P_ADDRESS2"),data.get("P_ADDRESS3") , data.get("P_STATE") , data.get("P_CITY") , data.get("P_PIN") , data.get("P_REMARKS") , data.get("P_SOURCE") , data.get("P_MODE") , data.get("P_APPOINT_DATE"),data.get("P_APPOINT_TIME") , data.get("P_STATUS") , data.get("P_FITMENT_STATUS") , data.get("P_ORDER_TYPE") , data.get("P_PAYMENT_MODE") , data.get("P_AMT_PAID"),data.get("P_TOTAL_AMT") , data.get("P_ACC_PART_DTL") , data.get("P_PG_Tracking_Id") , data.get("P_PG_Bank_Ref_No"),data.get("P_PG_Order_Status") , data.get("P_PG_Payment_Mode") , data.get("P_PG_Payment_Amount") , data.get("P_Loyalty_Points") , data.get("P_Loyalty_Amount"),data.get("P_Loyalty_Transaction_Status") , data.get("P_ORDER_NUM") , data.get("P_WEB_ORDER_NUM") , data.get("P_MSPIN") , data.get("P_PG_Booking_Cancellation"));	    	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, InsertACCORDPojo);
        String bodyData=sw.toString();   
        InsertAccOrd.validInput(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(InsertAccOrd.code, 200);
        Assert.assertTrue(InsertAccOrd.Status.contains("200"));	
        Assert.assertTrue(InsertAccOrd.message.contains("SUCCESS"));	
        Assert.assertTrue(InsertAccOrd.P_ENQ_NUM.contains("ACC"));	
        Assert.assertTrue(InsertAccOrd.P_ORDER_NUM.contains("AOD"));	
    }
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_InsertACCORD_BlankP_PARENT_GROUP", dataProviderClass = DataProviderSource.class)
    public void insertAccOrd_Blank_P_PARENT_GROUP(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	InsertACCORDPojo InsertACCORDPojo = new InsertACCORDPojo(data.get("P_PARENT_GROUP") , data.get("P_DEALER_MAP_CD") , data.get("P_LOC_CD") , data.get("P_ENQ_NUM") , data.get("P_ORDER_DATE") , data.get("P_CUST_FNAME") , data.get("P_CUST_MNAME") , data.get("P_CUST_LNAME"),data.get("P_PHONE") , data.get("P_EMAIL") , data.get("P_ADDRESS1") , data.get("P_ADDRESS2"),data.get("P_ADDRESS3") , data.get("P_STATE") , data.get("P_CITY") , data.get("P_PIN") , data.get("P_REMARKS") , data.get("P_SOURCE") , data.get("P_MODE") , data.get("P_APPOINT_DATE"),data.get("P_APPOINT_TIME") , data.get("P_STATUS") , data.get("P_FITMENT_STATUS") , data.get("P_ORDER_TYPE") , data.get("P_PAYMENT_MODE") , data.get("P_AMT_PAID"),data.get("P_TOTAL_AMT") , data.get("P_ACC_PART_DTL") , data.get("P_PG_Tracking_Id") , data.get("P_PG_Bank_Ref_No"),data.get("P_PG_Order_Status") , data.get("P_PG_Payment_Mode") , data.get("P_PG_Payment_Amount") , data.get("P_Loyalty_Points") , data.get("P_Loyalty_Amount"),data.get("P_Loyalty_Transaction_Status") , data.get("P_ORDER_NUM") , data.get("P_WEB_ORDER_NUM") , data.get("P_MSPIN") , data.get("P_PG_Booking_Cancellation"));	    	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, InsertACCORDPojo);
        String bodyData=sw.toString();   
        InsertAccOrd.blank_P_PARENT_GROUP(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(InsertAccOrd.code, 200);
        Assert.assertTrue(InsertAccOrd.Status.contains("1"));	
        Assert.assertTrue(InsertAccOrd.message.contains("DEALER DETAILS CAN NOT BE BLANK"));	

    }
    

    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_InsertACCORD_InvalidP_PARENT_GROUP", dataProviderClass = DataProviderSource.class)
    public void insertAccOrd_Invalid_P_PARENT_GROUP(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	InsertACCORDPojo InsertACCORDPojo = new InsertACCORDPojo(data.get("P_PARENT_GROUP") , data.get("P_DEALER_MAP_CD") , data.get("P_LOC_CD") , data.get("P_ENQ_NUM") , data.get("P_ORDER_DATE") , data.get("P_CUST_FNAME") , data.get("P_CUST_MNAME") , data.get("P_CUST_LNAME"),data.get("P_PHONE") , data.get("P_EMAIL") , data.get("P_ADDRESS1") , data.get("P_ADDRESS2"),data.get("P_ADDRESS3") , data.get("P_STATE") , data.get("P_CITY") , data.get("P_PIN") , data.get("P_REMARKS") , data.get("P_SOURCE") , data.get("P_MODE") , data.get("P_APPOINT_DATE"),data.get("P_APPOINT_TIME") , data.get("P_STATUS") , data.get("P_FITMENT_STATUS") , data.get("P_ORDER_TYPE") , data.get("P_PAYMENT_MODE") , data.get("P_AMT_PAID"),data.get("P_TOTAL_AMT") , data.get("P_ACC_PART_DTL") , data.get("P_PG_Tracking_Id") , data.get("P_PG_Bank_Ref_No"),data.get("P_PG_Order_Status") , data.get("P_PG_Payment_Mode") , data.get("P_PG_Payment_Amount") , data.get("P_Loyalty_Points") , data.get("P_Loyalty_Amount"),data.get("P_Loyalty_Transaction_Status") , data.get("P_ORDER_NUM") , data.get("P_WEB_ORDER_NUM") , data.get("P_MSPIN") , data.get("P_PG_Booking_Cancellation"));	    	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, InsertACCORDPojo);
        String bodyData=sw.toString();   
        InsertAccOrd.invalid_P_PARENT_GROUP(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(InsertAccOrd.code, 200);
        Assert.assertTrue(InsertAccOrd.Status.contains("100"));	
        Assert.assertTrue(InsertAccOrd.message.contains("Object reference not set to an instance of an object."));	

    }
    

    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_InsertACCORD_BlankP_DEALER_MAP_CD", dataProviderClass = DataProviderSource.class)
    public void insertAccOrd_Blank_P_DEALER_MAP_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	InsertACCORDPojo InsertACCORDPojo = new InsertACCORDPojo(data.get("P_PARENT_GROUP") , data.get("P_DEALER_MAP_CD") , data.get("P_LOC_CD") , data.get("P_ENQ_NUM") , data.get("P_ORDER_DATE") , data.get("P_CUST_FNAME") , data.get("P_CUST_MNAME") , data.get("P_CUST_LNAME"),data.get("P_PHONE") , data.get("P_EMAIL") , data.get("P_ADDRESS1") , data.get("P_ADDRESS2"),data.get("P_ADDRESS3") , data.get("P_STATE") , data.get("P_CITY") , data.get("P_PIN") , data.get("P_REMARKS") , data.get("P_SOURCE") , data.get("P_MODE") , data.get("P_APPOINT_DATE"),data.get("P_APPOINT_TIME") , data.get("P_STATUS") , data.get("P_FITMENT_STATUS") , data.get("P_ORDER_TYPE") , data.get("P_PAYMENT_MODE") , data.get("P_AMT_PAID"),data.get("P_TOTAL_AMT") , data.get("P_ACC_PART_DTL") , data.get("P_PG_Tracking_Id") , data.get("P_PG_Bank_Ref_No"),data.get("P_PG_Order_Status") , data.get("P_PG_Payment_Mode") , data.get("P_PG_Payment_Amount") , data.get("P_Loyalty_Points") , data.get("P_Loyalty_Amount"),data.get("P_Loyalty_Transaction_Status") , data.get("P_ORDER_NUM") , data.get("P_WEB_ORDER_NUM") , data.get("P_MSPIN") , data.get("P_PG_Booking_Cancellation"));	    	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, InsertACCORDPojo);
        String bodyData=sw.toString();   
        InsertAccOrd.blank_P_DEALER_MAP_CD(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(InsertAccOrd.code, 200);
        Assert.assertTrue(InsertAccOrd.Status.contains("100"));	
        Assert.assertTrue(InsertAccOrd.message.contains("Object reference not set to an instance of an object."));	

    }
    

    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_InsertACCORD_InvalidP_DEALER_MAP_CD", dataProviderClass = DataProviderSource.class)
    public void insertAccOrd_Invalid_P_DEALER_MAP_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	InsertACCORDPojo InsertACCORDPojo = new InsertACCORDPojo(data.get("P_PARENT_GROUP") , data.get("P_DEALER_MAP_CD") , data.get("P_LOC_CD") , data.get("P_ENQ_NUM") , data.get("P_ORDER_DATE") , data.get("P_CUST_FNAME") , data.get("P_CUST_MNAME") , data.get("P_CUST_LNAME"),data.get("P_PHONE") , data.get("P_EMAIL") , data.get("P_ADDRESS1") , data.get("P_ADDRESS2"),data.get("P_ADDRESS3") , data.get("P_STATE") , data.get("P_CITY") , data.get("P_PIN") , data.get("P_REMARKS") , data.get("P_SOURCE") , data.get("P_MODE") , data.get("P_APPOINT_DATE"),data.get("P_APPOINT_TIME") , data.get("P_STATUS") , data.get("P_FITMENT_STATUS") , data.get("P_ORDER_TYPE") , data.get("P_PAYMENT_MODE") , data.get("P_AMT_PAID"),data.get("P_TOTAL_AMT") , data.get("P_ACC_PART_DTL") , data.get("P_PG_Tracking_Id") , data.get("P_PG_Bank_Ref_No"),data.get("P_PG_Order_Status") , data.get("P_PG_Payment_Mode") , data.get("P_PG_Payment_Amount") , data.get("P_Loyalty_Points") , data.get("P_Loyalty_Amount"),data.get("P_Loyalty_Transaction_Status") , data.get("P_ORDER_NUM") , data.get("P_WEB_ORDER_NUM") , data.get("P_MSPIN") , data.get("P_PG_Booking_Cancellation"));	    	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, InsertACCORDPojo);
        String bodyData=sw.toString();   
        InsertAccOrd.invalid_P_DEALER_MAP_CD(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(InsertAccOrd.code, 200);
        Assert.assertTrue(InsertAccOrd.Status.contains("100"));	
        Assert.assertTrue(InsertAccOrd.message.contains("Object reference not set to an instance of an object."));	

    }
    

    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_InsertACCORD_BlankP_LOC_CD", dataProviderClass = DataProviderSource.class)
    public void insertAccOrd_Blank_P_LOC_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	InsertACCORDPojo InsertACCORDPojo = new InsertACCORDPojo(data.get("P_PARENT_GROUP") , data.get("P_DEALER_MAP_CD") , data.get("P_LOC_CD") , data.get("P_ENQ_NUM") , data.get("P_ORDER_DATE") , data.get("P_CUST_FNAME") , data.get("P_CUST_MNAME") , data.get("P_CUST_LNAME"),data.get("P_PHONE") , data.get("P_EMAIL") , data.get("P_ADDRESS1") , data.get("P_ADDRESS2"),data.get("P_ADDRESS3") , data.get("P_STATE") , data.get("P_CITY") , data.get("P_PIN") , data.get("P_REMARKS") , data.get("P_SOURCE") , data.get("P_MODE") , data.get("P_APPOINT_DATE"),data.get("P_APPOINT_TIME") , data.get("P_STATUS") , data.get("P_FITMENT_STATUS") , data.get("P_ORDER_TYPE") , data.get("P_PAYMENT_MODE") , data.get("P_AMT_PAID"),data.get("P_TOTAL_AMT") , data.get("P_ACC_PART_DTL") , data.get("P_PG_Tracking_Id") , data.get("P_PG_Bank_Ref_No"),data.get("P_PG_Order_Status") , data.get("P_PG_Payment_Mode") , data.get("P_PG_Payment_Amount") , data.get("P_Loyalty_Points") , data.get("P_Loyalty_Amount"),data.get("P_Loyalty_Transaction_Status") , data.get("P_ORDER_NUM") , data.get("P_WEB_ORDER_NUM") , data.get("P_MSPIN") , data.get("P_PG_Booking_Cancellation"));	    	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, InsertACCORDPojo);
        String bodyData=sw.toString();   
        InsertAccOrd.blank_P_LOC_CD(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(InsertAccOrd.code, 200);
        Assert.assertTrue(InsertAccOrd.Status.contains("1"));	
        Assert.assertTrue(InsertAccOrd.message.contains("DEALER DETAILS CAN NOT BE BLANK"));	

    }
    

    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_InsertACCORD_InvalidP_LOC_CD", dataProviderClass = DataProviderSource.class)
    public void insertAccOrd_Invalid_P_LOC_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	InsertACCORDPojo InsertACCORDPojo = new InsertACCORDPojo(data.get("P_PARENT_GROUP") , data.get("P_DEALER_MAP_CD") , data.get("P_LOC_CD") , data.get("P_ENQ_NUM") , data.get("P_ORDER_DATE") , data.get("P_CUST_FNAME") , data.get("P_CUST_MNAME") , data.get("P_CUST_LNAME"),data.get("P_PHONE") , data.get("P_EMAIL") , data.get("P_ADDRESS1") , data.get("P_ADDRESS2"),data.get("P_ADDRESS3") , data.get("P_STATE") , data.get("P_CITY") , data.get("P_PIN") , data.get("P_REMARKS") , data.get("P_SOURCE") , data.get("P_MODE") , data.get("P_APPOINT_DATE"),data.get("P_APPOINT_TIME") , data.get("P_STATUS") , data.get("P_FITMENT_STATUS") , data.get("P_ORDER_TYPE") , data.get("P_PAYMENT_MODE") , data.get("P_AMT_PAID"),data.get("P_TOTAL_AMT") , data.get("P_ACC_PART_DTL") , data.get("P_PG_Tracking_Id") , data.get("P_PG_Bank_Ref_No"),data.get("P_PG_Order_Status") , data.get("P_PG_Payment_Mode") , data.get("P_PG_Payment_Amount") , data.get("P_Loyalty_Points") , data.get("P_Loyalty_Amount"),data.get("P_Loyalty_Transaction_Status") , data.get("P_ORDER_NUM") , data.get("P_WEB_ORDER_NUM") , data.get("P_MSPIN") , data.get("P_PG_Booking_Cancellation"));	    	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, InsertACCORDPojo);
        String bodyData=sw.toString();   
        InsertAccOrd.invalid_P_LOC_CD(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(InsertAccOrd.code, 200);
        Assert.assertTrue(InsertAccOrd.Status.contains("100"));	
        Assert.assertTrue(InsertAccOrd.message.contains("Object reference not set to an instance of an object."));	

    }
    

    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_InsertACCORD_BlankP_ORDER_DATE", dataProviderClass = DataProviderSource.class)
    public void insertAccOrd_Blank_P_ORDER_DATE(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	InsertACCORDPojo InsertACCORDPojo = new InsertACCORDPojo(data.get("P_PARENT_GROUP") , data.get("P_DEALER_MAP_CD") , data.get("P_LOC_CD") , data.get("P_ENQ_NUM") , data.get("P_ORDER_DATE") , data.get("P_CUST_FNAME") , data.get("P_CUST_MNAME") , data.get("P_CUST_LNAME"),data.get("P_PHONE") , data.get("P_EMAIL") , data.get("P_ADDRESS1") , data.get("P_ADDRESS2"),data.get("P_ADDRESS3") , data.get("P_STATE") , data.get("P_CITY") , data.get("P_PIN") , data.get("P_REMARKS") , data.get("P_SOURCE") , data.get("P_MODE") , data.get("P_APPOINT_DATE"),data.get("P_APPOINT_TIME") , data.get("P_STATUS") , data.get("P_FITMENT_STATUS") , data.get("P_ORDER_TYPE") , data.get("P_PAYMENT_MODE") , data.get("P_AMT_PAID"),data.get("P_TOTAL_AMT") , data.get("P_ACC_PART_DTL") , data.get("P_PG_Tracking_Id") , data.get("P_PG_Bank_Ref_No"),data.get("P_PG_Order_Status") , data.get("P_PG_Payment_Mode") , data.get("P_PG_Payment_Amount") , data.get("P_Loyalty_Points") , data.get("P_Loyalty_Amount"),data.get("P_Loyalty_Transaction_Status") , data.get("P_ORDER_NUM") , data.get("P_WEB_ORDER_NUM") , data.get("P_MSPIN") , data.get("P_PG_Booking_Cancellation"));	    	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, InsertACCORDPojo);
        String bodyData=sw.toString();   
        InsertAccOrd.blank_P_ENQ_DATE(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(InsertAccOrd.code, 200);
        Assert.assertTrue(InsertAccOrd.Status.contains("1"));	

    }
    

    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_InsertACCORD_InvalidP_ORDER_DATE", dataProviderClass = DataProviderSource.class)
    public void insertAccOrd_Invalid_P_ORDER_DATE(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	InsertACCORDPojo InsertACCORDPojo = new InsertACCORDPojo(data.get("P_PARENT_GROUP") , data.get("P_DEALER_MAP_CD") , data.get("P_LOC_CD") , data.get("P_ENQ_NUM") , data.get("P_ORDER_DATE") , data.get("P_CUST_FNAME") , data.get("P_CUST_MNAME") , data.get("P_CUST_LNAME"),data.get("P_PHONE") , data.get("P_EMAIL") , data.get("P_ADDRESS1") , data.get("P_ADDRESS2"),data.get("P_ADDRESS3") , data.get("P_STATE") , data.get("P_CITY") , data.get("P_PIN") , data.get("P_REMARKS") , data.get("P_SOURCE") , data.get("P_MODE") , data.get("P_APPOINT_DATE"),data.get("P_APPOINT_TIME") , data.get("P_STATUS") , data.get("P_FITMENT_STATUS") , data.get("P_ORDER_TYPE") , data.get("P_PAYMENT_MODE") , data.get("P_AMT_PAID"),data.get("P_TOTAL_AMT") , data.get("P_ACC_PART_DTL") , data.get("P_PG_Tracking_Id") , data.get("P_PG_Bank_Ref_No"),data.get("P_PG_Order_Status") , data.get("P_PG_Payment_Mode") , data.get("P_PG_Payment_Amount") , data.get("P_Loyalty_Points") , data.get("P_Loyalty_Amount"),data.get("P_Loyalty_Transaction_Status") , data.get("P_ORDER_NUM") , data.get("P_WEB_ORDER_NUM") , data.get("P_MSPIN") , data.get("P_PG_Booking_Cancellation"));	    	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, InsertACCORDPojo);
        String bodyData=sw.toString();   
        InsertAccOrd.invalid_P_ENQ_DATE(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(InsertAccOrd.code, 200);
        Assert.assertTrue(InsertAccOrd.Status.contains("1"));	

    }
    

    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_InsertACCORD_BlankP_CUST_FNAME", dataProviderClass = DataProviderSource.class)
    public void insertAccOrd_Blank_P_CUST_FNAME(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	InsertACCORDPojo InsertACCORDPojo = new InsertACCORDPojo(data.get("P_PARENT_GROUP") , data.get("P_DEALER_MAP_CD") , data.get("P_LOC_CD") , data.get("P_ENQ_NUM") , data.get("P_ORDER_DATE") , data.get("P_CUST_FNAME") , data.get("P_CUST_MNAME") , data.get("P_CUST_LNAME"),data.get("P_PHONE") , data.get("P_EMAIL") , data.get("P_ADDRESS1") , data.get("P_ADDRESS2"),data.get("P_ADDRESS3") , data.get("P_STATE") , data.get("P_CITY") , data.get("P_PIN") , data.get("P_REMARKS") , data.get("P_SOURCE") , data.get("P_MODE") , data.get("P_APPOINT_DATE"),data.get("P_APPOINT_TIME") , data.get("P_STATUS") , data.get("P_FITMENT_STATUS") , data.get("P_ORDER_TYPE") , data.get("P_PAYMENT_MODE") , data.get("P_AMT_PAID"),data.get("P_TOTAL_AMT") , data.get("P_ACC_PART_DTL") , data.get("P_PG_Tracking_Id") , data.get("P_PG_Bank_Ref_No"),data.get("P_PG_Order_Status") , data.get("P_PG_Payment_Mode") , data.get("P_PG_Payment_Amount") , data.get("P_Loyalty_Points") , data.get("P_Loyalty_Amount"),data.get("P_Loyalty_Transaction_Status") , data.get("P_ORDER_NUM") , data.get("P_WEB_ORDER_NUM") , data.get("P_MSPIN") , data.get("P_PG_Booking_Cancellation"));	    	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, InsertACCORDPojo);
        String bodyData=sw.toString();   
        InsertAccOrd.blank_P_CUST_FNAME(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(InsertAccOrd.code, 200);
        Assert.assertTrue(InsertAccOrd.Status.contains("1"));	

    }   

    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_InsertACCORD_BlankP_P_PHONE", dataProviderClass = DataProviderSource.class)
    public void insertAccOrd_BlankP_P_PHONE(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	InsertACCORDPojo InsertACCORDPojo = new InsertACCORDPojo(data.get("P_PARENT_GROUP") , data.get("P_DEALER_MAP_CD") , data.get("P_LOC_CD") , data.get("P_ENQ_NUM") , data.get("P_ORDER_DATE") , data.get("P_CUST_FNAME") , data.get("P_CUST_MNAME") , data.get("P_CUST_LNAME"),data.get("P_PHONE") , data.get("P_EMAIL") , data.get("P_ADDRESS1") , data.get("P_ADDRESS2"),data.get("P_ADDRESS3") , data.get("P_STATE") , data.get("P_CITY") , data.get("P_PIN") , data.get("P_REMARKS") , data.get("P_SOURCE") , data.get("P_MODE") , data.get("P_APPOINT_DATE"),data.get("P_APPOINT_TIME") , data.get("P_STATUS") , data.get("P_FITMENT_STATUS") , data.get("P_ORDER_TYPE") , data.get("P_PAYMENT_MODE") , data.get("P_AMT_PAID"),data.get("P_TOTAL_AMT") , data.get("P_ACC_PART_DTL") , data.get("P_PG_Tracking_Id") , data.get("P_PG_Bank_Ref_No"),data.get("P_PG_Order_Status") , data.get("P_PG_Payment_Mode") , data.get("P_PG_Payment_Amount") , data.get("P_Loyalty_Points") , data.get("P_Loyalty_Amount"),data.get("P_Loyalty_Transaction_Status") , data.get("P_ORDER_NUM") , data.get("P_WEB_ORDER_NUM") , data.get("P_MSPIN") , data.get("P_PG_Booking_Cancellation"));	    	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, InsertACCORDPojo);
        String bodyData=sw.toString();   
        InsertAccOrd.blank_P_PHONE(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(InsertAccOrd.code, 200);
        Assert.assertTrue(InsertAccOrd.Status.contains("1"));	

    }
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_InsertACCORD_BlankP_SOURCE", dataProviderClass = DataProviderSource.class)
    public void insertAccOrd_Blank_P_SOURCE(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	InsertACCORDPojo InsertACCORDPojo = new InsertACCORDPojo(data.get("P_PARENT_GROUP") , data.get("P_DEALER_MAP_CD") , data.get("P_LOC_CD") , data.get("P_ENQ_NUM") , data.get("P_ORDER_DATE") , data.get("P_CUST_FNAME") , data.get("P_CUST_MNAME") , data.get("P_CUST_LNAME"),data.get("P_PHONE") , data.get("P_EMAIL") , data.get("P_ADDRESS1") , data.get("P_ADDRESS2"),data.get("P_ADDRESS3") , data.get("P_STATE") , data.get("P_CITY") , data.get("P_PIN") , data.get("P_REMARKS") , data.get("P_SOURCE") , data.get("P_MODE") , data.get("P_APPOINT_DATE"),data.get("P_APPOINT_TIME") , data.get("P_STATUS") , data.get("P_FITMENT_STATUS") , data.get("P_ORDER_TYPE") , data.get("P_PAYMENT_MODE") , data.get("P_AMT_PAID"),data.get("P_TOTAL_AMT") , data.get("P_ACC_PART_DTL") , data.get("P_PG_Tracking_Id") , data.get("P_PG_Bank_Ref_No"),data.get("P_PG_Order_Status") , data.get("P_PG_Payment_Mode") , data.get("P_PG_Payment_Amount") , data.get("P_Loyalty_Points") , data.get("P_Loyalty_Amount"),data.get("P_Loyalty_Transaction_Status") , data.get("P_ORDER_NUM") , data.get("P_WEB_ORDER_NUM") , data.get("P_MSPIN") , data.get("P_PG_Booking_Cancellation"));	    	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, InsertACCORDPojo);
        String bodyData=sw.toString();   
        InsertAccOrd.blank_P_SOURCE(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(InsertAccOrd.code, 200);
        Assert.assertTrue(InsertAccOrd.Status.contains("1"));	

    }
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_InsertACCORD_BlankP_APPOINT_TIME", dataProviderClass = DataProviderSource.class)
    public void insertAccOrd_Blank_P_APPOINT_TIME(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	InsertACCORDPojo InsertACCORDPojo = new InsertACCORDPojo(data.get("P_PARENT_GROUP") , data.get("P_DEALER_MAP_CD") , data.get("P_LOC_CD") , data.get("P_ENQ_NUM") , data.get("P_ORDER_DATE") , data.get("P_CUST_FNAME") , data.get("P_CUST_MNAME") , data.get("P_CUST_LNAME"),data.get("P_PHONE") , data.get("P_EMAIL") , data.get("P_ADDRESS1") , data.get("P_ADDRESS2"),data.get("P_ADDRESS3") , data.get("P_STATE") , data.get("P_CITY") , data.get("P_PIN") , data.get("P_REMARKS") , data.get("P_SOURCE") , data.get("P_MODE") , data.get("P_APPOINT_DATE"),data.get("P_APPOINT_TIME") , data.get("P_STATUS") , data.get("P_FITMENT_STATUS") , data.get("P_ORDER_TYPE") , data.get("P_PAYMENT_MODE") , data.get("P_AMT_PAID"),data.get("P_TOTAL_AMT") , data.get("P_ACC_PART_DTL") , data.get("P_PG_Tracking_Id") , data.get("P_PG_Bank_Ref_No"),data.get("P_PG_Order_Status") , data.get("P_PG_Payment_Mode") , data.get("P_PG_Payment_Amount") , data.get("P_Loyalty_Points") , data.get("P_Loyalty_Amount"),data.get("P_Loyalty_Transaction_Status") , data.get("P_ORDER_NUM") , data.get("P_WEB_ORDER_NUM") , data.get("P_MSPIN") , data.get("P_PG_Booking_Cancellation"));	    	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, InsertACCORDPojo);
        String bodyData=sw.toString();   
        InsertAccOrd.blank_P_APPOINT_TIME(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(InsertAccOrd.code, 200);
        Assert.assertTrue(InsertAccOrd.Status.contains("1"));	

    }
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_InsertACCORD_BlankP_AMT_PAID", dataProviderClass = DataProviderSource.class)
    public void insertAccOrd_Blank_P_AMT_PAID(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	InsertACCORDPojo InsertACCORDPojo = new InsertACCORDPojo(data.get("P_PARENT_GROUP") , data.get("P_DEALER_MAP_CD") , data.get("P_LOC_CD") , data.get("P_ENQ_NUM") , data.get("P_ORDER_DATE") , data.get("P_CUST_FNAME") , data.get("P_CUST_MNAME") , data.get("P_CUST_LNAME"),data.get("P_PHONE") , data.get("P_EMAIL") , data.get("P_ADDRESS1") , data.get("P_ADDRESS2"),data.get("P_ADDRESS3") , data.get("P_STATE") , data.get("P_CITY") , data.get("P_PIN") , data.get("P_REMARKS") , data.get("P_SOURCE") , data.get("P_MODE") , data.get("P_APPOINT_DATE"),data.get("P_APPOINT_TIME") , data.get("P_STATUS") , data.get("P_FITMENT_STATUS") , data.get("P_ORDER_TYPE") , data.get("P_PAYMENT_MODE") , data.get("P_AMT_PAID"),data.get("P_TOTAL_AMT") , data.get("P_ACC_PART_DTL") , data.get("P_PG_Tracking_Id") , data.get("P_PG_Bank_Ref_No"),data.get("P_PG_Order_Status") , data.get("P_PG_Payment_Mode") , data.get("P_PG_Payment_Amount") , data.get("P_Loyalty_Points") , data.get("P_Loyalty_Amount"),data.get("P_Loyalty_Transaction_Status") , data.get("P_ORDER_NUM") , data.get("P_WEB_ORDER_NUM") , data.get("P_MSPIN") , data.get("P_PG_Booking_Cancellation"));	    	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, InsertACCORDPojo);
        String bodyData=sw.toString();   
        InsertAccOrd.blank_P_AMT_PAID(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(InsertAccOrd.code, 200);
        Assert.assertTrue(InsertAccOrd.Status.contains("1"));
        Assert.assertTrue(InsertAccOrd.message.contains("Input string was not in a correct format."));	


    }
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_InsertACCORD_InvalidP_AMT_PAID", dataProviderClass = DataProviderSource.class)
    public void insertAccOrd_Invalid_P_AMT_PAID(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	InsertACCORDPojo InsertACCORDPojo = new InsertACCORDPojo(data.get("P_PARENT_GROUP") , data.get("P_DEALER_MAP_CD") , data.get("P_LOC_CD") , data.get("P_ENQ_NUM") , data.get("P_ORDER_DATE") , data.get("P_CUST_FNAME") , data.get("P_CUST_MNAME") , data.get("P_CUST_LNAME"),data.get("P_PHONE") , data.get("P_EMAIL") , data.get("P_ADDRESS1") , data.get("P_ADDRESS2"),data.get("P_ADDRESS3") , data.get("P_STATE") , data.get("P_CITY") , data.get("P_PIN") , data.get("P_REMARKS") , data.get("P_SOURCE") , data.get("P_MODE") , data.get("P_APPOINT_DATE"),data.get("P_APPOINT_TIME") , data.get("P_STATUS") , data.get("P_FITMENT_STATUS") , data.get("P_ORDER_TYPE") , data.get("P_PAYMENT_MODE") , data.get("P_AMT_PAID"),data.get("P_TOTAL_AMT") , data.get("P_ACC_PART_DTL") , data.get("P_PG_Tracking_Id") , data.get("P_PG_Bank_Ref_No"),data.get("P_PG_Order_Status") , data.get("P_PG_Payment_Mode") , data.get("P_PG_Payment_Amount") , data.get("P_Loyalty_Points") , data.get("P_Loyalty_Amount"),data.get("P_Loyalty_Transaction_Status") , data.get("P_ORDER_NUM") , data.get("P_WEB_ORDER_NUM") , data.get("P_MSPIN") , data.get("P_PG_Booking_Cancellation"));	    	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, InsertACCORDPojo);
        String bodyData=sw.toString();   
        InsertAccOrd.invalid_P_AMT_PAID(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(InsertAccOrd.code, 200);
        Assert.assertTrue(InsertAccOrd.Status.contains("1"));	
        Assert.assertTrue(InsertAccOrd.message.contains("Input string was not in a correct format."));	

    }
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_InsertACCORD_BlankP_TOTAL_AMT", dataProviderClass = DataProviderSource.class)
    public void insertAccOrd_Blank_P_TOTAL_AMT(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	InsertACCORDPojo InsertACCORDPojo = new InsertACCORDPojo(data.get("P_PARENT_GROUP") , data.get("P_DEALER_MAP_CD") , data.get("P_LOC_CD") , data.get("P_ENQ_NUM") , data.get("P_ORDER_DATE") , data.get("P_CUST_FNAME") , data.get("P_CUST_MNAME") , data.get("P_CUST_LNAME"),data.get("P_PHONE") , data.get("P_EMAIL") , data.get("P_ADDRESS1") , data.get("P_ADDRESS2"),data.get("P_ADDRESS3") , data.get("P_STATE") , data.get("P_CITY") , data.get("P_PIN") , data.get("P_REMARKS") , data.get("P_SOURCE") , data.get("P_MODE") , data.get("P_APPOINT_DATE"),data.get("P_APPOINT_TIME") , data.get("P_STATUS") , data.get("P_FITMENT_STATUS") , data.get("P_ORDER_TYPE") , data.get("P_PAYMENT_MODE") , data.get("P_AMT_PAID"),data.get("P_TOTAL_AMT") , data.get("P_ACC_PART_DTL") , data.get("P_PG_Tracking_Id") , data.get("P_PG_Bank_Ref_No"),data.get("P_PG_Order_Status") , data.get("P_PG_Payment_Mode") , data.get("P_PG_Payment_Amount") , data.get("P_Loyalty_Points") , data.get("P_Loyalty_Amount"),data.get("P_Loyalty_Transaction_Status") , data.get("P_ORDER_NUM") , data.get("P_WEB_ORDER_NUM") , data.get("P_MSPIN") , data.get("P_PG_Booking_Cancellation"));	    	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, InsertACCORDPojo);
        String bodyData=sw.toString();   
        InsertAccOrd.blank_P_TOTAL_AMT(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(InsertAccOrd.code, 200);
        Assert.assertTrue(InsertAccOrd.Status.contains("1"));	
        Assert.assertTrue(InsertAccOrd.message.contains("Input string was not in a correct format."));	

    }
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_InsertACCORD_InvalidP_TOTAL_AMT", dataProviderClass = DataProviderSource.class)
    public void insertAccOrd_Invalid_P_TOTAL_AMT(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	InsertACCORDPojo InsertACCORDPojo = new InsertACCORDPojo(data.get("P_PARENT_GROUP") , data.get("P_DEALER_MAP_CD") , data.get("P_LOC_CD") , data.get("P_ENQ_NUM") , data.get("P_ORDER_DATE") , data.get("P_CUST_FNAME") , data.get("P_CUST_MNAME") , data.get("P_CUST_LNAME"),data.get("P_PHONE") , data.get("P_EMAIL") , data.get("P_ADDRESS1") , data.get("P_ADDRESS2"),data.get("P_ADDRESS3") , data.get("P_STATE") , data.get("P_CITY") , data.get("P_PIN") , data.get("P_REMARKS") , data.get("P_SOURCE") , data.get("P_MODE") , data.get("P_APPOINT_DATE"),data.get("P_APPOINT_TIME") , data.get("P_STATUS") , data.get("P_FITMENT_STATUS") , data.get("P_ORDER_TYPE") , data.get("P_PAYMENT_MODE") , data.get("P_AMT_PAID"),data.get("P_TOTAL_AMT") , data.get("P_ACC_PART_DTL") , data.get("P_PG_Tracking_Id") , data.get("P_PG_Bank_Ref_No"),data.get("P_PG_Order_Status") , data.get("P_PG_Payment_Mode") , data.get("P_PG_Payment_Amount") , data.get("P_Loyalty_Points") , data.get("P_Loyalty_Amount"),data.get("P_Loyalty_Transaction_Status") , data.get("P_ORDER_NUM") , data.get("P_WEB_ORDER_NUM") , data.get("P_MSPIN") , data.get("P_PG_Booking_Cancellation"));	    	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, InsertACCORDPojo);
        String bodyData=sw.toString();   
        InsertAccOrd.invalid_P_TOTAL_AMT(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(InsertAccOrd.code, 200);
        Assert.assertTrue(InsertAccOrd.Status.contains("1"));	
        Assert.assertTrue(InsertAccOrd.message.contains("Input string was not in a correct format."));	

    }
    
}

