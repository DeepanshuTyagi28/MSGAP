package com.ttn.MSGP.testcases;

import java.io.IOException;
import java.util.Hashtable;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ttn.commonutils.DataProviderSource;
import com.ttn.MSGA.businesslogic.CityMaster;
import com.ttn.MSGA.pojo.DatePojo;
import com.ttn.MSGP.businesslogic.GetModelMaster;
import com.ttn.MSGP.pojo.ModelMasterPojo;
import com.ttn.builder.BaseTest;

/**
 * @author Deepanshu Tyagi
 * This class is used to verify MSGP API - GET_MODEL_MASTER  functionality.
 */

public class GetModelMasterTest extends BaseTest {
	

@Test( groups = {"Sanity", "Regression", "MSGP" }, dataProvider = "MSGP_GetModelMaster_ValidInput", dataProviderClass = DataProviderSource.class)
public void getModelMaster_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
	ModelMasterPojo ModelMasterPojo = new ModelMasterPojo(data.get("p_date") );
	String bodyData=jsonSerializer.serialize(ModelMasterPojo);
	GetModelMaster.validInput(bodyData); 
    Assert.assertEquals(GetModelMaster.code, 200);
    Assert.assertTrue(GetModelMaster.Status.contains("200"));	
    Assert.assertTrue(GetModelMaster.message.contains("SUCCESS"));	
}



@Test( groups = {"Sanity", "Regression", "MSGP" }, dataProvider = "MSGP_GetModelMaster_invalidInput", dataProviderClass = DataProviderSource.class)
public void getModelMaster_InvalidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
	ModelMasterPojo ModelMasterPojo = new ModelMasterPojo(data.get("p_date") );
	String bodyData=jsonSerializer.serialize(ModelMasterPojo);
	GetModelMaster.invalidInput(bodyData); 
    Assert.assertEquals(GetModelMaster.code, 200);
    Assert.assertTrue(GetModelMaster.Status.contains("202"));	
    Assert.assertTrue(GetModelMaster.message.contains("ORA-01858: a non-numeric character was found where a numeric was expected\n"));	
}



@Test( groups = {"Sanity", "Regression", "MSGP" }, dataProvider = "MSGP_GetModelMaster_FutureDate", dataProviderClass = DataProviderSource.class)
public void getModelMaster_futureDate(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
	ModelMasterPojo ModelMasterPojo = new ModelMasterPojo(data.get("p_date") );
	String bodyData=jsonSerializer.serialize(ModelMasterPojo);
	GetModelMaster.futureDate(bodyData); 
    Assert.assertEquals(GetModelMaster.code, 200);
    Assert.assertTrue(GetModelMaster.Status.contains("0"));	
}



}


