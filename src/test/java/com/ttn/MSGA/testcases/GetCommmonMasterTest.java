package com.ttn.MSGA.testcases;

import java.io.IOException;
import java.util.Hashtable;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ttn.commonutils.DataProviderSource;
import com.ttn.MSGA.businesslogic.GetCommmonMaster;
import com.ttn.MSGA.businesslogic.StateMaster;
import com.ttn.MSGA.pojo.DatePojo;
import com.ttn.MSGA.pojo.StateMasterpojo;
import com.ttn.builder.BaseTest;

/**
 * @author Deepanshu Tyagi
 * This class is used to verify MSGA -Get Commmon Master functionality.
 */

public class GetCommmonMasterTest extends BaseTest {
	
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GetCommmonMaster_ValidInput", dataProviderClass = DataProviderSource.class)
    public void getCommmonMaster_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	DatePojo DatePojo = new DatePojo(data.get("date"));
    	String bodyData=jsonSerializer.serialize(DatePojo);
    	GetCommmonMaster.validInput(bodyData); 
        Assert.assertEquals(GetCommmonMaster.code, 200);
        Assert.assertTrue(GetCommmonMaster.Status.contains("200"));	
        Assert.assertTrue(GetCommmonMaster.message.contains("SUCCESS"));	


    }
    
	
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GetCommmonMaster_BlankAuthToken", dataProviderClass = DataProviderSource.class)
    public void getCommmonMaster_Blank_AuthToken(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	DatePojo DatePojo = new DatePojo(data.get("date"));
    	String bodyData=jsonSerializer.serialize(DatePojo);
    	GetCommmonMaster.blank_AuthToken(bodyData); 
        Assert.assertEquals(GetCommmonMaster.code, 200);
        Assert.assertTrue(GetCommmonMaster.Status.contains("205"));	
        Assert.assertTrue(GetCommmonMaster.message.contains("ERROR"));	


    }
    
	
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GetCommmonMaster_InvalidAuthToken", dataProviderClass = DataProviderSource.class)
    public void getCommmonMaster_Invalid_AuthToken(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	DatePojo DatePojo = new DatePojo(data.get("date"));
    	String bodyData=jsonSerializer.serialize(DatePojo);
    	GetCommmonMaster.invalid_AuthToken(bodyData); 
        Assert.assertEquals(GetCommmonMaster.code, 200);
        Assert.assertTrue(GetCommmonMaster.Status.contains("205"));	
        Assert.assertTrue(GetCommmonMaster.message.contains("ERROR"));	


    }
    
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GetCommmonMaster_InvalidDateFormat", dataProviderClass = DataProviderSource.class)
    public void getCommmonMaster_Invalid_Date(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	DatePojo DatePojo = new DatePojo(data.get("date"));
    	String bodyData=jsonSerializer.serialize(DatePojo);
    	GetCommmonMaster.invalid_DateFormat(bodyData); 
        Assert.assertEquals(GetCommmonMaster.code, 200);
        Assert.assertTrue(GetCommmonMaster.Status.contains("202"));	
        Assert.assertTrue(GetCommmonMaster.message.contains("Failed to convert parameter value from a String to a DateTime."));	


    }

}
