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
import com.ttn.MSGA.businesslogic.GetEscDataAcc;
import com.ttn.MSGA.pojo.GET_ESC_DATA_ACCpojo;
import com.ttn.builder.BaseTest;

/**
 * @author Deepanshu Tyagi
 * This class is used to verify GET_ESC_DATA_ACC API details functionality.
 */


public class GetEscDataAccTest extends BaseTest {
	
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_Get_ESC_DATA_ACC_ValidInput", dataProviderClass = DataProviderSource.class)
    public void getEscDataAcc_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	GET_ESC_DATA_ACCpojo GET_ESC_DATA_ACCpojo = new GET_ESC_DATA_ACCpojo(data.get("P_PMC") , data.get("P_DLR_CD"), data.get("P_LOC_CD"));	 	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, GET_ESC_DATA_ACCpojo);
        String bodyData=sw.toString();           
        GetEscDataAcc.validInput(bodyData); 
        Assert.assertEquals(GetEscDataAcc.code, 200);
        Assert.assertTrue(GetEscDataAcc.Status.contains("200"));	
        Assert.assertTrue(GetEscDataAcc.message.contains("SUCCESS"));	
        Assert.assertTrue(GetEscDataAcc.DealerCode.contains(data.get("P_DLR_CD")));	

    }

    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GetESCDATAACC_Blank_PMC", dataProviderClass = DataProviderSource.class)
    public void getEscDataAcc_Blank_PMC(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	GET_ESC_DATA_ACCpojo GET_ESC_DATA_ACCpojo = new GET_ESC_DATA_ACCpojo(data.get("P_PMC") , data.get("P_DLR_CD"), data.get("P_LOC_CD"));	 	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, GET_ESC_DATA_ACCpojo);
        String bodyData=sw.toString();           
        GetEscDataAcc.blank_PMC(bodyData); 
        Assert.assertEquals(GetEscDataAcc.code, 200);
        Assert.assertTrue(GetEscDataAcc.Status.contains("202"));	
        Assert.assertTrue(GetEscDataAcc.message.contains("Input string was not in a correct format."));	

    }
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GetESCDATAACC_Invalid_PMC", dataProviderClass = DataProviderSource.class)
    public void getEscDataAcc_Invalid_PMC(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	GET_ESC_DATA_ACCpojo GET_ESC_DATA_ACCpojo = new GET_ESC_DATA_ACCpojo(data.get("P_PMC") , data.get("P_DLR_CD"), data.get("P_LOC_CD"));	 	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, GET_ESC_DATA_ACCpojo);
        String bodyData=sw.toString();           
        GetEscDataAcc.invalid_PMC(bodyData); 
        Assert.assertEquals(GetEscDataAcc.code, 200);
        Assert.assertTrue(GetEscDataAcc.Status.contains("202"));	
        Assert.assertTrue(GetEscDataAcc.message.contains("Input string was not in a correct format."));	

    }

    
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_GetESCDATAACC_Blank_P_LOC_CD", dataProviderClass = DataProviderSource.class)
    public void getEscDataAcc_Blank_P_LOC_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	GET_ESC_DATA_ACCpojo GET_ESC_DATA_ACCpojo = new GET_ESC_DATA_ACCpojo(data.get("P_PMC") , data.get("P_DLR_CD"), data.get("P_LOC_CD"));	 	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, GET_ESC_DATA_ACCpojo);
        String bodyData=sw.toString();   
        GetEscDataAcc.blank_P_LOC_CD(bodyData); 
        Assert.assertEquals(GetEscDataAcc.code, 200);
        Assert.assertTrue(GetEscDataAcc.Status.contains("202"));	
        Assert.assertTrue(GetEscDataAcc.message.contains("ORA-24338: statement handle not executed\n"));	

    }
}
