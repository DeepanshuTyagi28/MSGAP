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
//import com.ttn.MSGA.businesslogic.BookingCancel;
import com.ttn.MSGA.businesslogic.GetAccEnquiry;
import com.ttn.MSGA.businesslogic.GetCommmonMaster;
import com.ttn.MSGA.businesslogic.StateMaster;
import com.ttn.MSGA.pojo.BookingDetailPojo;
import com.ttn.MSGA.pojo.InsertACCEnquiryPojo;
import com.ttn.MSGA.pojo.PhoneNumberPojo;
import com.ttn.MSGA.pojo.StateMasterpojo;
import com.ttn.builder.BaseTest;

/**
 * @author Deepanshu Tyagi
 * This class is used to verify MSGA Get ACC Enquiry API functionality.
 */
/*

public class BookingCancelTest extends BaseTest {
	
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_BookingCancel_ValidInput", dataProviderClass = DataProviderSource.class)
    public void bookingCancel_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	BookingDetailPojo BookingDetailPojo = new BookingDetailPojo(data.get("P_PARENT_GROUP"),data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD"),data.get("P_ENQ_NUM"),data.get("P_BOOKING_ID"),data.get("P_STATUS"),data.get("P_REFUND_AMT"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, BookingDetailPojo);
        String bodyData=sw.toString();   
        BookingCancel.validInput(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(BookingCancel.code, 200);
        Assert.assertTrue(BookingCancel.Status.contains("200"));	
        Assert.assertTrue(BookingCancel.message.contains("SUCCESS"));	

    }
 
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_BookingCancel_Blank_P_DEALER_MAP_CD", dataProviderClass = DataProviderSource.class)
    public void bookingCancel_Blank_P_DEALER_MAP_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	BookingDetailPojo BookingDetailPojo = new BookingDetailPojo(data.get("P_PARENT_GROUP"),data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD"),data.get("P_ENQ_NUM"),data.get("P_BOOKING_ID"),data.get("P_STATUS"),data.get("P_REFUND_AMT"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, BookingDetailPojo);
        String bodyData=sw.toString();   
        BookingCancel.blank_P_DEALER_MAP_CD(bodyData); 
        Assert.assertEquals(BookingCancel.code, 400);
    }
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_BookingCancel_Invalid_P_DEALER_MAP_CD", dataProviderClass = DataProviderSource.class)
    public void bookingCancel_Invalid_P_DEALER_MAP_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	BookingDetailPojo BookingDetailPojo = new BookingDetailPojo(data.get("P_PARENT_GROUP"),data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD"),data.get("P_ENQ_NUM"),data.get("P_BOOKING_ID"),data.get("P_STATUS"),data.get("P_REFUND_AMT"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, BookingDetailPojo);
        String bodyData=sw.toString();   
        BookingCancel.invalid_P_DEALER_MAP_CD(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(BookingCancel.code, 400);
    }
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_BookingCancel_Blank_P_REFUND_AMT", dataProviderClass = DataProviderSource.class)
    public void bookingCancel_Blank_P_REFUND_AMT(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	BookingDetailPojo BookingDetailPojo = new BookingDetailPojo(data.get("P_PARENT_GROUP"),data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD"),data.get("P_ENQ_NUM"),data.get("P_BOOKING_ID"),data.get("P_STATUS"),data.get("P_REFUND_AMT"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, BookingDetailPojo);
        String bodyData=sw.toString();   
        BookingCancel.blank_P_REFUND_AMT(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(BookingCancel.code, 400);
    }
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_BookingCancel_Invalid_P_REFUND_AMT", dataProviderClass = DataProviderSource.class)
    public void bookingCancel_Invalid_P_REFUND_AMT(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	BookingDetailPojo BookingDetailPojo = new BookingDetailPojo(data.get("P_PARENT_GROUP"),data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD"),data.get("P_ENQ_NUM"),data.get("P_BOOKING_ID"),data.get("P_STATUS"),data.get("P_REFUND_AMT"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, BookingDetailPojo);
        String bodyData=sw.toString();   
        BookingCancel.invalid_P_REFUND_AMT(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(BookingCancel.code, 400);
    }
}*/
