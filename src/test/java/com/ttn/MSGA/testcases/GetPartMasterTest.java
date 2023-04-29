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
import com.ttn.MSGA.businesslogic.GetPartMaster;
import com.ttn.MSGA.businesslogic.GetPartModelMapping;
import com.ttn.MSGA.businesslogic.StateMaster;
import com.ttn.MSGA.pojo.CityMasterPojo;
import com.ttn.MSGA.pojo.DatePojo;
import com.ttn.MSGA.pojo.StateMasterpojo;
import com.ttn.builder.BaseTest;

/**
 * @author Deepanshu Tyagi
 * This class is used to verify MSGA -Get PART Master functionality.
 */

public class GetPartMasterTest extends BaseTest {
	
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GetPartMaster_ValidInput", dataProviderClass = DataProviderSource.class)
    public void getPartMaster_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	DatePojo DatePojo = new DatePojo(data.get("date") );
    	String bodyData=jsonSerializer.serialize(DatePojo);
    	GetPartMaster.validInput(bodyData); 
        Assert.assertEquals(GetPartMaster.code, 200);
        Assert.assertTrue(GetPartMaster.Status.contains("200"));	
        Assert.assertTrue(GetPartMaster.message.contains("SUCCESS"));	
    }
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GetPartMaster_InvalidDate", dataProviderClass = DataProviderSource.class)
    public void getPartMaster_Invalid_DateFormat(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	DatePojo DatePojo = new DatePojo(data.get("date") );
    	String bodyData=jsonSerializer.serialize(DatePojo);
    	GetPartMaster.invalid_DateFormat(bodyData); 
        Assert.assertEquals(GetPartMaster.code, 200);
        Assert.assertTrue(GetPartMaster.Status.contains("202"));	
        Assert.assertTrue(GetPartMaster.message.contains("The string was not recognized as a valid DateTime. There is an unknown word starting at index 0."));	
    }

    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GetPartMaster_FutureDate", dataProviderClass = DataProviderSource.class)
    public void getPartMaster_FutureDate(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	DatePojo DatePojo = new DatePojo(data.get("date") );
    	String bodyData=jsonSerializer.serialize(DatePojo);
    	GetPartMaster.futureDates(bodyData); 
        Assert.assertEquals(GetPartMaster.code, 200);
        Assert.assertTrue(GetPartMaster.Status.contains("200"));	
        Assert.assertTrue(GetPartMaster.message.contains("SUCCESS"));	
    }
}
