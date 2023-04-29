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
import com.ttn.MSGA.businesslogic.StateMaster;
import com.ttn.MSGA.pojo.CityMasterPojo;
import com.ttn.MSGA.pojo.DatePojo;
import com.ttn.MSGA.pojo.StateMasterpojo;
import com.ttn.builder.BaseTest;

/**
 * @author Deepanshu Tyagi
 * This class is used to verify MSGA -Get City Master functionality.
 */

public class CityMasterTest extends BaseTest {
	
    @Test( groups = {"Sanity", "Regression", "MSGA","MSGP"}, dataProvider = "MSGA_CityMaster_ValidInput", dataProviderClass = DataProviderSource.class)
    public void cityMaster_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CityMasterPojo CityMasterPojo = new CityMasterPojo(data.get("p_PMC") , data.get("p_state_CD") , data.get("p_date"));
    	String bodyData=jsonSerializer.serialize(CityMasterPojo);
    	CityMaster.validInput(bodyData); 
        Assert.assertEquals(CityMaster.code, 200);
        Assert.assertTrue(CityMaster.Status.contains("200"));	
        Assert.assertTrue(CityMaster.message.contains("SUCCESS"));	


    }

	
    @Test( groups = {"Sanity", "Regression", "MSGA","MSGP"}, dataProvider = "MSGA_CityMaster_ValidStateCode", dataProviderClass = DataProviderSource.class)
    public void cityMaster_ValidStateCode(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CityMasterPojo CityMasterPojo = new CityMasterPojo(data.get("p_PMC") , data.get("p_state_CD") , data.get("p_date"));
    	String bodyData=jsonSerializer.serialize(CityMasterPojo);
    	CityMaster.validStateCode(bodyData); 
        Assert.assertEquals(CityMaster.code, 200);
        Assert.assertTrue(CityMaster.Status.contains("200"));	
        Assert.assertTrue(CityMaster.message.contains("SUCCESS"));	
        Assert.assertTrue(CityMaster.StateCode.contains(data.get("p_state_CD")));	

    }

    
    @Test( groups = {"Sanity", "Regression", "MSGA","MSGP"}, dataProvider = "MSGA_CityMaster_InvalidStateCode", dataProviderClass = DataProviderSource.class)
    public void cityMaster_InvalidStatecode(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CityMasterPojo CityMasterPojo = new CityMasterPojo(data.get("p_PMC") , data.get("p_state_CD") , data.get("p_date"));
    	String bodyData=jsonSerializer.serialize(CityMasterPojo);
    	CityMaster.invalidStateCode(bodyData); 
        Assert.assertEquals(CityMaster.code, 200);
        Assert.assertTrue(CityMaster.Status.contains("0"));	


    }
    
    @Test( groups = {"Sanity", "Regression", "MSGA","MSGP"}, dataProvider = "MSGA_CityMaster_InvalidDate", dataProviderClass = DataProviderSource.class)
    public void cityMaster_InvalidDate(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CityMasterPojo CityMasterPojo = new CityMasterPojo(data.get("p_PMC") , data.get("p_state_CD") , data.get("p_date"));
    	String bodyData=jsonSerializer.serialize(CityMasterPojo);
    	CityMaster.invalidDateFormat(bodyData); 
        Assert.assertEquals(CityMaster.code, 200);
        Assert.assertTrue(CityMaster.Status.contains("202"));	


    }
}
