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
import com.ttn.MSGA.businesslogic.GetAccEnquiry;
import com.ttn.MSGA.businesslogic.GetCommmonMaster;
import com.ttn.MSGA.businesslogic.StateMaster;
import com.ttn.MSGA.pojo.InsertACCEnquiryPojo;
import com.ttn.MSGA.pojo.PhoneNumberPojo;
import com.ttn.MSGA.pojo.StateMasterpojo;
import com.ttn.builder.BaseTest;

/**
 * @author Deepanshu Tyagi
 * This class is used to verify MSGA Get ACC Enquiry API functionality.
 */


public class GetAccEnquiryTest extends BaseTest {
	
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GetACCEnquiry_ValidInput", dataProviderClass = DataProviderSource.class)
    public void getAccEnquiry_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	PhoneNumberPojo PhoneNumberPojo = new PhoneNumberPojo(data.get("P_PHONE"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, PhoneNumberPojo);
        String bodyData=sw.toString();   
        GetAccEnquiry.validInput(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(GetAccEnquiry.code, 200);
        Assert.assertTrue(GetAccEnquiry.Status.contains("200"));	
        Assert.assertTrue(GetAccEnquiry.message.contains("SUCCESS"));	
        Assert.assertTrue(GetAccEnquiry.PhoneNumber.contains(data.get("P_PHONE")));	

    }
 

    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GetACCEnquiry_InvalidInput", dataProviderClass = DataProviderSource.class)
    public void getAccEnquiry_InvalidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	PhoneNumberPojo PhoneNumberPojo = new PhoneNumberPojo(data.get("P_PHONE"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, PhoneNumberPojo);
        String bodyData=sw.toString();   
        GetAccEnquiry.invalidInput(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(GetAccEnquiry.code, 200);
        Assert.assertTrue(GetAccEnquiry.Status.contains("200"));	
        Assert.assertTrue(GetAccEnquiry.message.contains("SUCCESS"));	

    }
 
}
