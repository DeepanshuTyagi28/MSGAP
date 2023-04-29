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
import com.ttn.MSGA.businesslogic.DealerDetails;
import com.ttn.MSGA.businesslogic.InsertAccOrd;
import com.ttn.MSGA.pojo.CityMasterPojo;
import com.ttn.MSGA.pojo.DealerDetailsPojo;
import com.ttn.builder.BaseTest;

/**
 * @author Deepanshu Tyagi
 * This class is used to verify MSGA -Dealer Details functionality.
 */

public class DealerDetailsTest extends BaseTest {
	

@Test( groups = {"Sanity", "Regression", "MSGA" }, dataProvider = "MSGA_DealerDetails_ValidInput", dataProviderClass = DataProviderSource.class)
public void dealerDetails_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	DealerDetailsPojo DealerDetailsPojo = new DealerDetailsPojo(data.get("P_PMC")  , data.get("P_DATE"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, DealerDetailsPojo);
    String bodyData=sw.toString();   
    DealerDetails.validInput(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(DealerDetails.code, 200);
    Assert.assertTrue(DealerDetails.Status.contains("200"));	
    Assert.assertTrue(DealerDetails.message.contains("SUCCESS"));	
}



@Test( groups = {"Sanity", "Regression", "MSGA" }, dataProvider = "MSGA_DealerDetails_Invalid_P_PMC", dataProviderClass = DataProviderSource.class)
public void dealerDetails_Invalid_P_PMC(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	DealerDetailsPojo DealerDetailsPojo = new DealerDetailsPojo(data.get("P_PMC")  , data.get("P_DATE"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, DealerDetailsPojo);
    String bodyData=sw.toString();   
    DealerDetails.invalid_P_PMC(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(DealerDetails.code, 200);
    Assert.assertTrue(DealerDetails.Status.contains("202"));	
    Assert.assertTrue(DealerDetails.message.contains("Input string was not in a correct format."));	
}



@Test( groups = {"Sanity", "Regression", "MSGA" }, dataProvider = "MSGA_DealerDetails_Invalid_P_DATE", dataProviderClass = DataProviderSource.class)
public void dealerDetails_Invalid_P_DATE(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	DealerDetailsPojo DealerDetailsPojo = new DealerDetailsPojo(data.get("P_PMC")  , data.get("P_DATE"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, DealerDetailsPojo);
    String bodyData=sw.toString();   
    DealerDetails.invalid_P_DATE(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(DealerDetails.code, 200);
    Assert.assertTrue(DealerDetails.Status.contains("202"));	
    Assert.assertTrue(DealerDetails.message.contains("ORA-01861: literal does not match format string\n"));	
}



@Test( groups = {"Sanity", "Regression", "MSGA" }, dataProvider = "MSGA_DealerDetails_valid_P_DATE", dataProviderClass = DataProviderSource.class)
public void dealerDetails_valid_P_DATE(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	DealerDetailsPojo DealerDetailsPojo = new DealerDetailsPojo(data.get("P_PMC")  , data.get("P_DATE"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, DealerDetailsPojo);
    String bodyData=sw.toString();   
    DealerDetails.invalid_P_DATE(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(DealerDetails.code, 200);
    Assert.assertTrue(DealerDetails.Status.contains("200"));	
    Assert.assertTrue(DealerDetails.message.contains("SUCCESS"));	

}

}


