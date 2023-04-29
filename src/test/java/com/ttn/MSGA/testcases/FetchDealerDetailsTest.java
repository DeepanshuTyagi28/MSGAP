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
import com.ttn.MSGA.businesslogic.FetchDealerDetails;
import com.ttn.MSGA.businesslogic.GetCommmonMaster;
import com.ttn.MSGA.businesslogic.StateMaster;
import com.ttn.MSGA.pojo.CityMasterPojo;
import com.ttn.MSGA.pojo.DatePojo;
import com.ttn.MSGA.pojo.FetchDealerDetailsPojo;
import com.ttn.MSGA.pojo.StateMasterpojo;
import com.ttn.builder.BaseTest;

/**
 * @author Deepanshu Tyagi
 * This class is used to verify MSGA -Get City Master functionality.
 */

public class FetchDealerDetailsTest extends BaseTest {
	
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_FetchDealerDetails_ValidInput", dataProviderClass = DataProviderSource.class)
    public void fetchDealerDetails_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	FetchDealerDetailsPojo FetchDealerDetailsPojo = new FetchDealerDetailsPojo(data.get("p_pmc") , data.get("p_for_Cd") , data.get("p_mul_dealer_Cd"));
    	String bodyData=jsonSerializer.serialize(FetchDealerDetailsPojo);
    	FetchDealerDetails.validInput(bodyData); 
        Assert.assertEquals(FetchDealerDetails.code, 200);
        Assert.assertTrue(FetchDealerDetails.Status.contains("200"));	
        Assert.assertTrue(FetchDealerDetails.message.contains("SUCCESS"));	
        Assert.assertTrue(FetchDealerDetails.DealerMappedCode.contains(data.get("p_dealer_map_cd")),"Dealer Map code doesnt Matched");	
    }
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_FetchDealerDetails_Blank_P_mul_dealer_Cd", dataProviderClass = DataProviderSource.class)
    public void fetchDealerDetails_Blank_P_mul_dealer_Cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	FetchDealerDetailsPojo FetchDealerDetailsPojo = new FetchDealerDetailsPojo(data.get("p_pmc") , data.get("p_for_Cd") , data.get("p_mul_dealer_Cd"));
    	String bodyData=jsonSerializer.serialize(FetchDealerDetailsPojo);
    	FetchDealerDetails.blank_p_mul_dealer_Cd(bodyData); 
        Assert.assertEquals(FetchDealerDetails.code, 200);
        Assert.assertTrue(FetchDealerDetails.Status.contains("1"));	
        Assert.assertTrue(FetchDealerDetails.message.contains("ORA-01403: no data found"));	
    }
	
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_FetchDealerDetails_Invalid_P_mul_dealer_Cd", dataProviderClass = DataProviderSource.class)
    public void fetchDealerDetails_Invalid_P_mul_dealer_Cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	FetchDealerDetailsPojo FetchDealerDetailsPojo = new FetchDealerDetailsPojo(data.get("p_pmc") , data.get("p_for_Cd") , data.get("p_mul_dealer_Cd"));
    	String bodyData=jsonSerializer.serialize(FetchDealerDetailsPojo);
    	FetchDealerDetails.invalid_p_mul_dealer_Cd(bodyData); 
        Assert.assertEquals(FetchDealerDetails.code, 200);
        Assert.assertTrue(FetchDealerDetails.Status.contains("1"));	
        Assert.assertTrue(FetchDealerDetails.message.contains("ORA-01403: no data found"));	
    }
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_FetchDealerDetails_Blank_p_for_Cd", dataProviderClass = DataProviderSource.class)
    public void fetchDealerDetails_Blank_p_for_Cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	FetchDealerDetailsPojo FetchDealerDetailsPojo = new FetchDealerDetailsPojo(data.get("p_pmc") , data.get("p_for_Cd") , data.get("p_mul_dealer_Cd"));
    	String bodyData=jsonSerializer.serialize(FetchDealerDetailsPojo);
    	FetchDealerDetails.blank_p_for_Cd(bodyData); 
        Assert.assertEquals(FetchDealerDetails.code, 200);
        Assert.assertTrue(FetchDealerDetails.Status.contains("1"));	
        Assert.assertTrue(FetchDealerDetails.message.contains("ORA-01403: no data found"));	
    }
	
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_FetchDealerDetails_Invalid_p_for_Cd", dataProviderClass = DataProviderSource.class)
    public void fetchDealerDetails_p_for_Cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	FetchDealerDetailsPojo FetchDealerDetailsPojo = new FetchDealerDetailsPojo(data.get("p_pmc") , data.get("p_for_Cd") , data.get("p_mul_dealer_Cd"));
    	String bodyData=jsonSerializer.serialize(FetchDealerDetailsPojo);
    	FetchDealerDetails.invalid_p_for_Cd(bodyData); 
        Assert.assertEquals(FetchDealerDetails.code, 200);
        Assert.assertTrue(FetchDealerDetails.Status.contains("1"));	
        Assert.assertTrue(FetchDealerDetails.message.contains("ORA-01403: no data found"));	
    }
    
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_FetchDealerDetails_Blank_p_pmc", dataProviderClass = DataProviderSource.class)
    public void fetchDealerDetails_Blank_p_pmc(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	FetchDealerDetailsPojo FetchDealerDetailsPojo = new FetchDealerDetailsPojo(data.get("p_pmc") , data.get("p_for_Cd") , data.get("p_mul_dealer_Cd"));
    	String bodyData=jsonSerializer.serialize(FetchDealerDetailsPojo);
    	FetchDealerDetails.blank_p_pmc(bodyData); 
        Assert.assertEquals(FetchDealerDetails.code, 200);
        Assert.assertTrue(FetchDealerDetails.Status.contains("100"));	
        Assert.assertTrue(FetchDealerDetails.message.contains("Input string was not in a correct format."));	
    }
	
    @Test( groups = {"Sanity", "Regression", "MSGA"}, dataProvider = "MSGA_FetchDealerDetails_Invalid_p_pmc", dataProviderClass = DataProviderSource.class)
    public void fetchDealerDetails_Invalid_p_pmc(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	FetchDealerDetailsPojo FetchDealerDetailsPojo = new FetchDealerDetailsPojo(data.get("p_pmc") , data.get("p_for_Cd") , data.get("p_mul_dealer_Cd"));
    	String bodyData=jsonSerializer.serialize(FetchDealerDetailsPojo);
    	FetchDealerDetails.invalid_p_pmc(bodyData); 
        Assert.assertEquals(FetchDealerDetails.code, 200);
        Assert.assertTrue(FetchDealerDetails.Status.contains("100"));	
        Assert.assertTrue(FetchDealerDetails.message.contains("Input string was not in a correct format."));	
    }
}
