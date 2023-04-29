package com.ttn.MSGP.testcases;

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
import com.ttn.MSGP.businesslogic.GetEspData;
import com.ttn.MSGP.pojo.Get_Esp_Datapojo;
import com.ttn.builder.BaseTest;

/**
 * @author Deepanshu Tyagi
 * This class is used to verify MSGP API - GET_ESC_DATA  functionality.
 */

public class GetEspDataTest extends BaseTest {
	

@Test( groups = {"Sanity", "Regression", "MSGP" }, dataProvider = "MSGP_GetEscData_ValidInput", dataProviderClass = DataProviderSource.class)
public void getEscData_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	Get_Esp_Datapojo Get_Esp_Datapojo = new Get_Esp_Datapojo(data.get("P_PMC")  , data.get("P_DLR_CD"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, Get_Esp_Datapojo);
    String bodyData=sw.toString();   
    GetEspData.validInput(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(GetEspData.code, 200);
    Assert.assertTrue(GetEspData.Status.contains("200"));	
    Assert.assertTrue(GetEspData.message.contains("SUCCESS"));	
    Assert.assertTrue(GetEspData.DealerCode.contains(data.get("P_DLR_CD")) , "Dealer code doesnt Matched ");	

}



@Test( groups = {"Sanity", "Regression", "MSGP" }, dataProvider = "MSGP_GetEscData_Blank_P_PMC", dataProviderClass = DataProviderSource.class)
public void getEscData_Blank_P_PMC(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	Get_Esp_Datapojo Get_Esp_Datapojo = new Get_Esp_Datapojo(data.get("P_PMC")  , data.get("P_DLR_CD"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, Get_Esp_Datapojo);
    String bodyData=sw.toString();   
    GetEspData.blank_P_PMC(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(GetEspData.code, 200);
    Assert.assertTrue(GetEspData.Status.contains("202"));	
    Assert.assertTrue(GetEspData.message.contains("Input string was not in a correct format."));	

}


@Test( groups = {"Sanity", "Regression", "MSGP" }, dataProvider = "MSGP_GetEscData_Invalid_P_PMC", dataProviderClass = DataProviderSource.class)
public void getEscData_Invalid_P_PMC(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	Get_Esp_Datapojo Get_Esp_Datapojo = new Get_Esp_Datapojo(data.get("P_PMC")  , data.get("P_DLR_CD"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, Get_Esp_Datapojo);
    String bodyData=sw.toString();   
    GetEspData.invalid_P_PMC(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(GetEspData.code, 200);
    Assert.assertTrue(GetEspData.Status.contains("202"));	
    Assert.assertTrue(GetEspData.message.contains("Input string was not in a correct format."));	

}


@Test( groups = {"Sanity", "Regression", "MSGP" }, dataProvider = "MSGP_GetEscData_Non_Existing_P_PMC", dataProviderClass = DataProviderSource.class)
public void getEscData_Non_Existing_P_PMC(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	Get_Esp_Datapojo Get_Esp_Datapojo = new Get_Esp_Datapojo(data.get("P_PMC")  , data.get("P_DLR_CD"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, Get_Esp_Datapojo);
    String bodyData=sw.toString();   
    GetEspData.non_Existing_P_PMC(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(GetEspData.code, 200);
    Assert.assertTrue(GetEspData.Status.contains("200"));	
    Assert.assertTrue(GetEspData.message.contains("SUCCESS"));	

}


@Test( groups = {"Sanity", "Regression", "MSGP" }, dataProvider = "MSGP_GetEscData_Invalid_P_DLR_CD", dataProviderClass = DataProviderSource.class)
public void getEscData_Invalid_P_DLR_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	Get_Esp_Datapojo Get_Esp_Datapojo = new Get_Esp_Datapojo(data.get("P_PMC")  , data.get("P_DLR_CD"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, Get_Esp_Datapojo);
    String bodyData=sw.toString();   
    GetEspData.invalid_P_DLR_CD(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(GetEspData.code, 200);
    Assert.assertTrue(GetEspData.Status.contains("200"));	
    Assert.assertTrue(GetEspData.message.contains("SUCCESS"));	

}
}


