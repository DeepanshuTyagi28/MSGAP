package com.ttn.MSGA.businesslogic;


import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ttn.builder.RequestBuilder_new;
import com.ttn.commonutils.Constants;
import com.ttn.commonutils.ExtentManager;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


/*
 * @author- Deepanshu Tyagi
 */

        public class GetAccEnquiry  {
	
	    protected static Logger logger = LoggerFactory.getLogger(GetAccEnquiry.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String  StateCode;
	    public static String  PhoneNumber;

	    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/GET_ACC_ENQ";
	    
/*
	 @param bodyData
	 Method is used to Verify Functionality of MSGA API -GET_ACC_ENQ with all Valid Inputs or Number having some open enquiry  */
	    
		   public static void validInput(String bodyData) {	
			try {
	    	RequestBuilder_new.getBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGA API- GET_ACC_ENQ "+endpoint);
	        logger.info("Body is "+bodyData);
	        RequestBuilder_new.request.body(bodyData);	        
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        message = jsonPathEvaluator.get("message");
	        PhoneNumber = response.jsonPath().get("result.FOLLOWUPDetail.CUST_PHONE[0]").toString();
	        Status = response.jsonPath().get("code").toString();      
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" "  +GetAccEnquiry.code);
			logger.info("Test case executed successfully");
			}			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGA GET_ACC_ENQ API with Valid Input" + e);
				e.printStackTrace();
			}
	    }
		   
	//  Method is used to Verify Functionality of MSGA API -GET_ACC_ENQ with all Invalid Inputs or Number not having any open enquiry   */
		    
		   public static void invalidInput(String bodyData) {	
			try {
	    	RequestBuilder_new.getBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGA API- GET_ACC_ENQ "+endpoint);
	        logger.info("Body is "+bodyData);
	        RequestBuilder_new.request.body(bodyData);	        
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        message = jsonPathEvaluator.get("message");
	        PhoneNumber = response.jsonPath().get("result.FOLLOWUPDetail.CUST_PHONE[0]").toString();
	        Status = response.jsonPath().get("code").toString();      
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" "  +GetAccEnquiry.code);
			logger.info("Test case executed successfully");
			}			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGA GET_ACC_ENQ API with invalid Input" + e);
				e.printStackTrace();
			}
	    }
		   
	
}
