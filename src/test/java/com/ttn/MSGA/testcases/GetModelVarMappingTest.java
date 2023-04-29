package com.ttn.MSGA.testcases;

import java.io.IOException;
import java.util.Hashtable;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ttn.commonutils.DataProviderSource;
import com.ttn.MSGA.businesslogic.CityMaster;
import com.ttn.MSGA.businesslogic.GetCommmonMaster;
import com.ttn.MSGA.businesslogic.GetModelVarMapping;
import com.ttn.MSGA.businesslogic.StateMaster;
import com.ttn.MSGA.pojo.CityMasterPojo;
import com.ttn.MSGA.pojo.DatePojo;
import com.ttn.MSGA.pojo.StateMasterpojo;
import com.ttn.builder.BaseTest;

/**
 * @author Deepanshu Tyagi
 * This class is used to verify MSGA -Get Model VAR Mapping Test functionality.
 */

public class GetModelVarMappingTest extends BaseTest {
	
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GetModelVarMapping_ValidInput", dataProviderClass = DataProviderSource.class)
    public void getModelVarMapping_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	DatePojo DatePojo = new DatePojo(data.get("date") );
    	String bodyData=jsonSerializer.serialize(DatePojo);
    	GetModelVarMapping.validInput(bodyData); 
        Assert.assertEquals(GetModelVarMapping.code, 200);
        Assert.assertTrue(GetModelVarMapping.Status.contains("200"));	
        Assert.assertTrue(GetModelVarMapping.message.contains("SUCCESS"));	
    }



    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GetModelVarMapping_InvalidDate", dataProviderClass = DataProviderSource.class)
    public void getModelVarMapping_Invalid_DateFormat(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	DatePojo DatePojo = new DatePojo(data.get("date") );
    	String bodyData=jsonSerializer.serialize(DatePojo);
    	GetModelVarMapping.invalid_DateFormat(bodyData); 
        Assert.assertEquals(GetModelVarMapping.code, 200);
        Assert.assertTrue(GetModelVarMapping.Status.contains("202"));	
        Assert.assertTrue(GetModelVarMapping.message.contains("Failed to convert parameter value from a String to a DateTime."));	
    }

    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GetModelVarMapping_FutureDate", dataProviderClass = DataProviderSource.class)
    public void getModelVarMapping_FutureDate(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	DatePojo DatePojo = new DatePojo(data.get("date") );
    	String bodyData=jsonSerializer.serialize(DatePojo);
    	GetModelVarMapping.futureDates(bodyData); 
        Assert.assertEquals(GetModelVarMapping.code, 200);
        Assert.assertTrue(GetModelVarMapping.Status.contains("200"));	
        Assert.assertTrue(GetModelVarMapping.message.contains("SUCCESS"));	
    }
}
