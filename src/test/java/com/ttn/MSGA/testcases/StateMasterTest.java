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
import com.ttn.MSGA.businesslogic.GetCommmonMaster;
import com.ttn.MSGA.businesslogic.StateMaster;
import com.ttn.MSGA.pojo.StateMasterpojo;
import com.ttn.builder.BaseTest;

/**
 * @author Deepanshu Tyagi
 * This class is used to verify MSGA STATE MASTER API functionality.
 */


public class StateMasterTest extends BaseTest {
	
    @Test( groups = {"Sanity", "Regression", "MSGA" ,"MSGP"}, dataProvider = "MSGA_Statemaster_ValidInput", dataProviderClass = DataProviderSource.class)
    public void stateMaster_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	StateMasterpojo StateMasterpojo = new StateMasterpojo(data.get("P_DATE") , data.get("P_PMC"));	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, StateMasterpojo);
        String bodyData=sw.toString();   
    	StateMaster.validInput(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(StateMaster.code, 200);
        Assert.assertTrue(StateMaster.Status.contains("200"));	
        Assert.assertTrue(StateMaster.message.contains("SUCCESS"));	
        Assert.assertTrue(StateMaster.StateDescription.contains("ANDAMAN AND NICOBAR ISLANDS"),"No state Found in StateMaster API");	

    }
    	
    @Test( groups = {"Sanity", "Regression", "MSGA","MSGP"}, dataProvider = "MSGA_Statemaster_InvalidDate", dataProviderClass = DataProviderSource.class)
    public void stateMaster_Invalid_Date(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	StateMasterpojo StateMasterpojo = new StateMasterpojo(data.get("P_DATE") , data.get("P_PMC")); 	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, StateMasterpojo);
        String bodyData=sw.toString();   
    	StateMaster.invalid_DateFormat(bodyData); 
        Assert.assertEquals(StateMaster.code, 200);
        Assert.assertTrue(StateMaster.Status.contains("202"));	
        Assert.assertTrue(StateMaster.message.contains("ORA-01858: a non-numeric character was found where a numeric was expected\n"));	

    }
    
    
    @Test( groups = {"Sanity", "Regression", "MSGA","MSGP"}, dataProvider = "MSGA_Statemaster_InvalidPMC", dataProviderClass = DataProviderSource.class)
    public void stateMaster_Invalid_P_PMC(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	StateMasterpojo StateMasterpojo = new StateMasterpojo(data.get("P_DATE") , data.get("P_PMC")); 	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, StateMasterpojo);
        String bodyData=sw.toString();   
    	StateMaster.invalid_P_PMC(bodyData); 
        Assert.assertEquals(StateMaster.code, 200);
        Assert.assertTrue(StateMaster.Status.contains("202"));	
        Assert.assertTrue(StateMaster.message.contains("Input string was not in a correct format."));	

    }

}
