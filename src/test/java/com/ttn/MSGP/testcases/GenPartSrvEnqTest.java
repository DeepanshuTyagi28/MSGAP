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
import com.ttn.MSGA.businesslogic.InsertAccEnquiry;
import com.ttn.MSGA.businesslogic.InsertAccOrd;
import com.ttn.MSGA.pojo.CityMasterPojo;
import com.ttn.MSGA.pojo.DealerDetailsPojo;
import com.ttn.MSGP.businesslogic.GenPartSrvEnq;
import com.ttn.MSGP.businesslogic.GetEspData;
import com.ttn.MSGP.pojo.GenPartSrvEnqPojo;
import com.ttn.MSGP.pojo.Get_Esp_Datapojo;
import com.ttn.builder.BaseTest;

/**
 * @author Deepanshu Tyagi
 * This class is used to verify MSGP API -GEN Part Srv Enq.
 */

public class GenPartSrvEnqTest extends BaseTest {
	

@Test( groups = {"Sanity", "Regression", "MSGP","Pre_Prod" }, dataProvider = "MSGP_GenPartSrvEnq_ValidInput", dataProviderClass = DataProviderSource.class)
public void GenPartSrvEnq_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	GenPartSrvEnqPojo GenPartSrvEnqPojo = new GenPartSrvEnqPojo(data.get("P_PARENT_GROUP")  , data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD")  , data.get("P_CUST_NAME"),data.get("P_PHONE")  , data.get("P_EMAIL"),data.get("P_STATE")  , data.get("P_REG_NUM"),data.get("P_CITY"), data.get("P_STATUS"),data.get("P_ACC_PART_DTL"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, GenPartSrvEnqPojo);
    String bodyData=sw.toString();   
    GenPartSrvEnq.validInput(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(GenPartSrvEnq.code, 200);
    Assert.assertTrue(GenPartSrvEnq.Status.contains("200"));	
    Assert.assertTrue(GenPartSrvEnq.message.contains("SUCCESS"));	
    Assert.assertTrue(GenPartSrvEnq.P_ENQ_NUM.contains("SPE"),"Enquiry Number is Not Generated ");	
}



@Test( groups = {"Sanity", "Regression", "MSGP" }, dataProvider = "MSGP_GenPartSrvEnq_Blank_P_PARENT_GROUP", dataProviderClass = DataProviderSource.class)
public void GenPartSrvEnq_Blank_P_PARENT_GROUP(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	GenPartSrvEnqPojo GenPartSrvEnqPojo = new GenPartSrvEnqPojo(data.get("P_PARENT_GROUP")  , data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD")  , data.get("P_CUST_NAME"),data.get("P_PHONE")  , data.get("P_EMAIL"),data.get("P_STATE")  , data.get("P_REG_NUM"),data.get("P_CITY"), data.get("P_STATUS"),data.get("P_ACC_PART_DTL"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, GenPartSrvEnqPojo);
    String bodyData=sw.toString();   
    GenPartSrvEnq.blank_P_PARENT_GROUP(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(GenPartSrvEnq.code, 200);
    Assert.assertTrue(GenPartSrvEnq.Status.contains("1"));	
    Assert.assertTrue(GenPartSrvEnq.message.contains(" PARENT CAN NOT BE NULL Not a Valid Dealer"));	
}


@Test( groups = {"Sanity", "Regression", "MSGP" }, dataProvider = "MSGP_GenPartSrvEnq_Invalid_P_PARENT_GROUP", dataProviderClass = DataProviderSource.class)
public void GenPartSrvEnq_Invalid_P_PARENT_GROUP(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	GenPartSrvEnqPojo GenPartSrvEnqPojo = new GenPartSrvEnqPojo(data.get("P_PARENT_GROUP")  , data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD")  , data.get("P_CUST_NAME"),data.get("P_PHONE")  , data.get("P_EMAIL"),data.get("P_STATE")  , data.get("P_REG_NUM"),data.get("P_CITY"), data.get("P_STATUS"),data.get("P_ACC_PART_DTL"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, GenPartSrvEnqPojo);
    String bodyData=sw.toString();   
    GenPartSrvEnq.invalid_P_PARENT_GROUP(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(GenPartSrvEnq.code, 200);
    Assert.assertTrue(GenPartSrvEnq.Status.contains("1"));	
    Assert.assertTrue(GenPartSrvEnq.message.contains(" Not a Valid Dealer"));	
}



@Test( groups = {"Sanity", "Regression", "MSGP" }, dataProvider = "MSGP_GenPartSrvEnq_Blank_P_DEALER_MAP_CD", dataProviderClass = DataProviderSource.class)
public void GenPartSrvEnq_Blank_P_DEALER_MAP_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	GenPartSrvEnqPojo GenPartSrvEnqPojo = new GenPartSrvEnqPojo(data.get("P_PARENT_GROUP")  , data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD")  , data.get("P_CUST_NAME"),data.get("P_PHONE")  , data.get("P_EMAIL"),data.get("P_STATE")  , data.get("P_REG_NUM"),data.get("P_CITY"), data.get("P_STATUS"),data.get("P_ACC_PART_DTL"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, GenPartSrvEnqPojo);
    String bodyData=sw.toString();   
    GenPartSrvEnq.blank_P_DEALER_MAP_CD(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(GenPartSrvEnq.code, 200);
    Assert.assertTrue(GenPartSrvEnq.Status.contains("1"));	
    Assert.assertTrue(GenPartSrvEnq.message.contains("Input string was not in a correct format."));	
}


@Test( groups = {"Sanity", "Regression", "MSGP" }, dataProvider = "MSGP_GenPartSrvEnq_Invalid_P_DEALER_MAP_CD", dataProviderClass = DataProviderSource.class)
public void GenPartSrvEnq_Invalid_P_DEALER_MAP_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	GenPartSrvEnqPojo GenPartSrvEnqPojo = new GenPartSrvEnqPojo(data.get("P_PARENT_GROUP")  , data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD")  , data.get("P_CUST_NAME"),data.get("P_PHONE")  , data.get("P_EMAIL"),data.get("P_STATE")  , data.get("P_REG_NUM"),data.get("P_CITY"), data.get("P_STATUS"),data.get("P_ACC_PART_DTL"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, GenPartSrvEnqPojo);
    String bodyData=sw.toString();   
    GenPartSrvEnq.invalid_P_DEALER_MAP_CD(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(GenPartSrvEnq.code, 200);
    Assert.assertTrue(GenPartSrvEnq.Status.contains("1"));	
    Assert.assertTrue(GenPartSrvEnq.message.contains(" Not a Valid Dealer"));	
}



@Test( groups = {"Sanity", "Regression", "MSGP" }, dataProvider = "MSGP_GenPartSrvEnq_Blank_P_LOC_CD", dataProviderClass = DataProviderSource.class)
public void GenPartSrvEnq_Blank_P_LOC_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	GenPartSrvEnqPojo GenPartSrvEnqPojo = new GenPartSrvEnqPojo(data.get("P_PARENT_GROUP")  , data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD")  , data.get("P_CUST_NAME"),data.get("P_PHONE")  , data.get("P_EMAIL"),data.get("P_STATE")  , data.get("P_REG_NUM"),data.get("P_CITY"), data.get("P_STATUS"),data.get("P_ACC_PART_DTL"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, GenPartSrvEnqPojo);
    String bodyData=sw.toString();   
    GenPartSrvEnq.blank_P_LOC_CD(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(GenPartSrvEnq.code, 200);
    Assert.assertTrue(GenPartSrvEnq.Status.contains("1"));	
    Assert.assertTrue(GenPartSrvEnq.message.contains("LOC CODE CAN NOT BE BLANK Not a Valid Dealer"));	
}


@Test( groups = {"Sanity", "Regression", "MSGP" }, dataProvider = "MSGP_GenPartSrvEnq_Invalid_P_LOC_CD", dataProviderClass = DataProviderSource.class)
public void GenPartSrvEnq_Invalid_P_LOC_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	GenPartSrvEnqPojo GenPartSrvEnqPojo = new GenPartSrvEnqPojo(data.get("P_PARENT_GROUP")  , data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD")  , data.get("P_CUST_NAME"),data.get("P_PHONE")  , data.get("P_EMAIL"),data.get("P_STATE")  , data.get("P_REG_NUM"),data.get("P_CITY"), data.get("P_STATUS"),data.get("P_ACC_PART_DTL"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, GenPartSrvEnqPojo);
    String bodyData=sw.toString();   
    GenPartSrvEnq.invalid_P_DEALER_MAP_CD(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(GenPartSrvEnq.code, 200);
    Assert.assertTrue(GenPartSrvEnq.Status.contains("1"));	
    Assert.assertTrue(GenPartSrvEnq.message.contains(" Not a Valid Dealer"));	
}




@Test( groups = {"Sanity", "Regression", "MSGP" }, dataProvider = "MSGP_GenPartSrvEnq_Blank_P_PHONE", dataProviderClass = DataProviderSource.class)
public void GenPartSrvEnq_Blank_P_PHONE(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	GenPartSrvEnqPojo GenPartSrvEnqPojo = new GenPartSrvEnqPojo(data.get("P_PARENT_GROUP")  , data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD")  , data.get("P_CUST_NAME"),data.get("P_PHONE")  , data.get("P_EMAIL"),data.get("P_STATE")  , data.get("P_REG_NUM"),data.get("P_CITY"), data.get("P_STATUS"),data.get("P_ACC_PART_DTL"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, GenPartSrvEnqPojo);
    String bodyData=sw.toString();   
    GenPartSrvEnq.blank_PhoneNumber(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(GenPartSrvEnq.code, 200);
    Assert.assertTrue(GenPartSrvEnq.Status.contains("1"));	
    Assert.assertTrue(GenPartSrvEnq.message.contains(" PHONE CAN NOT BE BLANK"));	
}

@Test( groups = {"Sanity", "Regression", "MSGP" }, dataProvider = "MSGP_GenPartSrvEnq_Blank_P_REG_NUM", dataProviderClass = DataProviderSource.class)
public void GenPartSrvEnq_Blank_P_REG_NUM(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	GenPartSrvEnqPojo GenPartSrvEnqPojo = new GenPartSrvEnqPojo(data.get("P_PARENT_GROUP")  , data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD")  , data.get("P_CUST_NAME"),data.get("P_PHONE")  , data.get("P_EMAIL"),data.get("P_STATE")  , data.get("P_REG_NUM"),data.get("P_CITY"), data.get("P_STATUS"),data.get("P_ACC_PART_DTL"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, GenPartSrvEnqPojo);
    String bodyData=sw.toString();   
    GenPartSrvEnq.blank_RegNum(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(GenPartSrvEnq.code, 200);
    Assert.assertTrue(GenPartSrvEnq.Status.contains("1"));	
    Assert.assertTrue(GenPartSrvEnq.message.contains(" Registration Number can not be blank Not a Valid Registration Number"));	
}

@Test( groups = {"Sanity", "Regression", "MSGP" }, dataProvider = "MSGP_GenPartSrvEnq_Invalid_P_REG_NUM", dataProviderClass = DataProviderSource.class)
public void GenPartSrvEnq_invalid_P_REG_NUM(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	GenPartSrvEnqPojo GenPartSrvEnqPojo = new GenPartSrvEnqPojo(data.get("P_PARENT_GROUP")  , data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD")  , data.get("P_CUST_NAME"),data.get("P_PHONE")  , data.get("P_EMAIL"),data.get("P_STATE")  , data.get("P_REG_NUM"),data.get("P_CITY"), data.get("P_STATUS"),data.get("P_ACC_PART_DTL"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, GenPartSrvEnqPojo);
    String bodyData=sw.toString();   
    GenPartSrvEnq.invalid_RegNum(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(GenPartSrvEnq.code, 200);
    Assert.assertTrue(GenPartSrvEnq.Status.contains("1"));	
    Assert.assertTrue(GenPartSrvEnq.message.contains(" Not a Valid Registration Number"));	
}

@Test( groups = {"Sanity", "Regression", "MSGP" }, dataProvider = "MSGP_GenPartSrvEnq_Blank_PartNumber", dataProviderClass = DataProviderSource.class)
public void GenPartSrvEnq_Blank_PartNumber(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	GenPartSrvEnqPojo GenPartSrvEnqPojo = new GenPartSrvEnqPojo(data.get("P_PARENT_GROUP")  , data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD")  , data.get("P_CUST_NAME"),data.get("P_PHONE")  , data.get("P_EMAIL"),data.get("P_STATE")  , data.get("P_REG_NUM"),data.get("P_CITY"), data.get("P_STATUS"),data.get("P_ACC_PART_DTL"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, GenPartSrvEnqPojo);
    String bodyData=sw.toString();   
    GenPartSrvEnq.blank_PartNumber(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(GenPartSrvEnq.code, 200);
    Assert.assertTrue(GenPartSrvEnq.Status.contains("1"));	
    Assert.assertTrue(GenPartSrvEnq.message.contains(" Part Details cannot be blank"));	
}

@Test( groups = {"Sanity", "Regression", "MSGP" }, dataProvider = "MSGP_GenPartSrvEnq_Invalid_PartNumber", dataProviderClass = DataProviderSource.class)
public void GenPartSrvEnq_Invalid_PartNumber(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	GenPartSrvEnqPojo GenPartSrvEnqPojo = new GenPartSrvEnqPojo(data.get("P_PARENT_GROUP")  , data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD")  , data.get("P_CUST_NAME"),data.get("P_PHONE")  , data.get("P_EMAIL"),data.get("P_STATE")  , data.get("P_REG_NUM"),data.get("P_CITY"), data.get("P_STATUS"),data.get("P_ACC_PART_DTL"));
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, GenPartSrvEnqPojo);
    String bodyData=sw.toString();   
    GenPartSrvEnq.invalid_PartNumber(bodyData); 
	System.out.println(bodyData);
    Assert.assertEquals(GenPartSrvEnq.code, 200);
    Assert.assertTrue(GenPartSrvEnq.Status.contains("1"));	
    Assert.assertTrue(GenPartSrvEnq.message.contains(" Part Number Not Found"));	
}

}


