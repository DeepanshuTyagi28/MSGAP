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
import com.ttn.MSGA.businesslogic.GetOrdEnqLineStatus;
import com.ttn.MSGA.pojo.Get_ORD_ENQLineStatusPojo;
import com.ttn.builder.BaseTest;

/**
 * @author Deepanshu Tyagi
 * This class is used to verify MSGA GET_ORD_ENQ_LINE_STATUS API functionality.
 */


public class GetOrdEnqLineStatusTest extends BaseTest {
	
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GETORDENQLINESTATUS_ValidInput", dataProviderClass = DataProviderSource.class)
    public void getOrdEnqLineStatus_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	Get_ORD_ENQLineStatusPojo Get_ORD_ENQLineStatusPojo = new Get_ORD_ENQLineStatusPojo(data.get("P_PARENT_GROUP") ,data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD"),data.get("P_ENQ_ORDER_NUM"),data.get("P_FLAG"),data.get("P_START_DATE"),data.get("P_END_DATE"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, Get_ORD_ENQLineStatusPojo);
        String bodyData=sw.toString();   
        GetOrdEnqLineStatus.validInput(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(GetOrdEnqLineStatus.code, 200);
        Assert.assertTrue(GetOrdEnqLineStatus.Status.contains("200"),"Status code doesnt Matched");	
        Assert.assertTrue(GetOrdEnqLineStatus.message.contains("SUCCESS"),"Message Doent Matched");	
        Assert.assertTrue(GetOrdEnqLineStatus.PART_NUM.contains(data.get("PartNumber")));	

    }
    

    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GETORDENQLINESTATUS_Blank_P_PARENT_GROUP", dataProviderClass = DataProviderSource.class)
    public void getOrdEnqLineStatus_Blank_P_PARENT_GROUP(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	Get_ORD_ENQLineStatusPojo Get_ORD_ENQLineStatusPojo = new Get_ORD_ENQLineStatusPojo(data.get("P_PARENT_GROUP") ,data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD"),data.get("P_ENQ_ORDER_NUM"),data.get("P_FLAG"),data.get("P_START_DATE"),data.get("P_END_DATE"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, Get_ORD_ENQLineStatusPojo);
        String bodyData=sw.toString();   
        GetOrdEnqLineStatus.blank_P_PARENT_GROUP(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(GetOrdEnqLineStatus.code, 200);
        Assert.assertTrue(GetOrdEnqLineStatus.Status.contains("202"),"Status code doesnt Matched");	

    }
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GETORDENQLINESTATUS_Invalid_P_PARENT_GROUP", dataProviderClass = DataProviderSource.class)
    public void getOrdEnqLineStatus_Invalid_P_PARENT_GROUP(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	Get_ORD_ENQLineStatusPojo Get_ORD_ENQLineStatusPojo = new Get_ORD_ENQLineStatusPojo(data.get("P_PARENT_GROUP") ,data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD"),data.get("P_ENQ_ORDER_NUM"),data.get("P_FLAG"),data.get("P_START_DATE"),data.get("P_END_DATE"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, Get_ORD_ENQLineStatusPojo);
        String bodyData=sw.toString();   
        GetOrdEnqLineStatus.invalid_P_PARENT_GROUP(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(GetOrdEnqLineStatus.code, 200);
        Assert.assertTrue(GetOrdEnqLineStatus.Status.contains("202"),"Status code doesnt Matched");	

    }
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GETORDENQLINESTATUS_Blank_P_DEALER_MAP_CD", dataProviderClass = DataProviderSource.class)
    public void getOrdEnqLineStatus_Blank_P_DEALER_MAP_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	Get_ORD_ENQLineStatusPojo Get_ORD_ENQLineStatusPojo = new Get_ORD_ENQLineStatusPojo(data.get("P_PARENT_GROUP") ,data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD"),data.get("P_ENQ_ORDER_NUM"),data.get("P_FLAG"),data.get("P_START_DATE"),data.get("P_END_DATE"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, Get_ORD_ENQLineStatusPojo);
        String bodyData=sw.toString();   
        GetOrdEnqLineStatus.blank_P_DEALER_MAP_CD(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(GetOrdEnqLineStatus.code, 200);
        Assert.assertTrue(GetOrdEnqLineStatus.Status.contains("202"),"Status code doesnt Matched");	

    }
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GETORDENQLINESTATUS_Invalid_P_DEALER_MAP_CD", dataProviderClass = DataProviderSource.class)
    public void getOrdEnqLineStatus_Invalid_P_DEALER_MAP_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	Get_ORD_ENQLineStatusPojo Get_ORD_ENQLineStatusPojo = new Get_ORD_ENQLineStatusPojo(data.get("P_PARENT_GROUP") ,data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD"),data.get("P_ENQ_ORDER_NUM"),data.get("P_FLAG"),data.get("P_START_DATE"),data.get("P_END_DATE"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, Get_ORD_ENQLineStatusPojo);
        String bodyData=sw.toString();   
        GetOrdEnqLineStatus.invalid_P_DEALER_MAP_CD(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(GetOrdEnqLineStatus.code, 200);
        Assert.assertTrue(GetOrdEnqLineStatus.Status.contains("202"),"Status code doesnt Matched");	

    }
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GETORDENQLINESTATUS_Blank_P_LOC_CD", dataProviderClass = DataProviderSource.class)
    public void getOrdEnqLineStatus_Blank_P_LOC_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	Get_ORD_ENQLineStatusPojo Get_ORD_ENQLineStatusPojo = new Get_ORD_ENQLineStatusPojo(data.get("P_PARENT_GROUP") ,data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD"),data.get("P_ENQ_ORDER_NUM"),data.get("P_FLAG"),data.get("P_START_DATE"),data.get("P_END_DATE"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, Get_ORD_ENQLineStatusPojo);
        String bodyData=sw.toString();   
        GetOrdEnqLineStatus.blank_P_LOC_CD(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(GetOrdEnqLineStatus.code, 200);
        Assert.assertTrue(GetOrdEnqLineStatus.Status.contains("202"),"Status code doesnt Matched");	

    }
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GETORDENQLINESTATUS_Invalid_P_LOC_CD", dataProviderClass = DataProviderSource.class)
    public void getOrdEnqLineStatus_Invalid_P_LOC_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	Get_ORD_ENQLineStatusPojo Get_ORD_ENQLineStatusPojo = new Get_ORD_ENQLineStatusPojo(data.get("P_PARENT_GROUP") ,data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD"),data.get("P_ENQ_ORDER_NUM"),data.get("P_FLAG"),data.get("P_START_DATE"),data.get("P_END_DATE"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, Get_ORD_ENQLineStatusPojo);
        String bodyData=sw.toString();   
        GetOrdEnqLineStatus.invalid_P_LOC_CD(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(GetOrdEnqLineStatus.code, 200);
        Assert.assertTrue(GetOrdEnqLineStatus.Status.contains("202"),"Status code doesnt Matched");	

    }
    
    
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GETORDENQLINESTATUS_Blank_P_ENQ_ORDER_NUM", dataProviderClass = DataProviderSource.class)
    public void getOrdEnqLineStatus_Blank_P_ENQ_ORDER_NUM(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	Get_ORD_ENQLineStatusPojo Get_ORD_ENQLineStatusPojo = new Get_ORD_ENQLineStatusPojo(data.get("P_PARENT_GROUP") ,data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD"),data.get("P_ENQ_ORDER_NUM"),data.get("P_FLAG"),data.get("P_START_DATE"),data.get("P_END_DATE"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, Get_ORD_ENQLineStatusPojo);
        String bodyData=sw.toString();   
        GetOrdEnqLineStatus.blank_P_ENQ_ORDER_NUM(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(GetOrdEnqLineStatus.code, 200);
        Assert.assertTrue(GetOrdEnqLineStatus.Status.contains("202"),"Status code doesnt Matched");	

    }
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GETORDENQLINESTATUS_Invalid_P_ENQ_ORDER_NUM", dataProviderClass = DataProviderSource.class)
    public void getOrdEnqLineStatus_Invalid_P_ENQ_ORDER_NUM(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	Get_ORD_ENQLineStatusPojo Get_ORD_ENQLineStatusPojo = new Get_ORD_ENQLineStatusPojo(data.get("P_PARENT_GROUP") ,data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD"),data.get("P_ENQ_ORDER_NUM"),data.get("P_FLAG"),data.get("P_START_DATE"),data.get("P_END_DATE"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, Get_ORD_ENQLineStatusPojo);
        String bodyData=sw.toString();   
        GetOrdEnqLineStatus.invalid_P_ENQ_ORDER_NUM(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(GetOrdEnqLineStatus.code, 200);
        Assert.assertTrue(GetOrdEnqLineStatus.Status.contains("202"),"Status code doesnt Matched");	

    }
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GETORDENQLINESTATUS_Blank_P_FLAG", dataProviderClass = DataProviderSource.class)
    public void getOrdEnqLineStatus_Blank_P_FLAG(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	Get_ORD_ENQLineStatusPojo Get_ORD_ENQLineStatusPojo = new Get_ORD_ENQLineStatusPojo(data.get("P_PARENT_GROUP") ,data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD"),data.get("P_ENQ_ORDER_NUM"),data.get("P_FLAG"),data.get("P_START_DATE"),data.get("P_END_DATE"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, Get_ORD_ENQLineStatusPojo);
        String bodyData=sw.toString();   
        GetOrdEnqLineStatus.blank_P_FLAG(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(GetOrdEnqLineStatus.code, 200);
        Assert.assertTrue(GetOrdEnqLineStatus.Status.contains("0"),"Status code doesnt Matched");	

    }
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GETORDENQLINESTATUS_Invalid_P_FLAG", dataProviderClass = DataProviderSource.class)
    public void getOrdEnqLineStatus_Invalid_P_FLAG(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	Get_ORD_ENQLineStatusPojo Get_ORD_ENQLineStatusPojo = new Get_ORD_ENQLineStatusPojo(data.get("P_PARENT_GROUP") ,data.get("P_DEALER_MAP_CD"),data.get("P_LOC_CD"),data.get("P_ENQ_ORDER_NUM"),data.get("P_FLAG"),data.get("P_START_DATE"),data.get("P_END_DATE"));	   	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, Get_ORD_ENQLineStatusPojo);
        String bodyData=sw.toString();   
        GetOrdEnqLineStatus.invalid_P_FLAG(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(GetOrdEnqLineStatus.code, 200);
        Assert.assertTrue(GetOrdEnqLineStatus.Status.contains("0"),"Status code doesnt Matched");	

    }
    
}
