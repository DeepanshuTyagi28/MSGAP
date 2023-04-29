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
import com.ttn.MSGA.businesslogic.GetAccOrd;
import com.ttn.MSGA.pojo.PhoneNumberPojo;
import com.ttn.builder.BaseTest;

/**
 * @author Deepanshu Tyagi
 * This class is used to verify MSGA Get ACC ORD API functionality.
 */


public class GetAccOrdTest extends BaseTest {
	
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GetACCORD_ValidInput", dataProviderClass = DataProviderSource.class)
    public void getAccOrd_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	PhoneNumberPojo PhoneNumberPojo = new PhoneNumberPojo(data.get("P_PHONE"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, PhoneNumberPojo);
        String bodyData=sw.toString();   
        GetAccOrd.validInput(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(GetAccOrd.code, 200);
        Assert.assertTrue(GetAccOrd.Status.contains("200"));	
        Assert.assertTrue(GetAccOrd.message.contains("SUCCESS"));	
        Assert.assertTrue(GetAccOrd.PhoneNumber.contains(data.get("P_PHONE")));	

    }
 

    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GetACCORD_InvalidInput", dataProviderClass = DataProviderSource.class)
    public void getAccOrd_InvalidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	PhoneNumberPojo PhoneNumberPojo = new PhoneNumberPojo(data.get("P_PHONE"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, PhoneNumberPojo);
        String bodyData=sw.toString();   
        GetAccOrd.invalidInput(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(GetAccOrd.code, 200);
        Assert.assertTrue(GetAccOrd.Status.contains("200"));	
        Assert.assertTrue(GetAccOrd.message.contains("SUCCESS"));	

    }
 
}
