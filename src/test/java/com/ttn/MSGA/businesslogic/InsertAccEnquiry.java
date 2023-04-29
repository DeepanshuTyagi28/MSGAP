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

        public class InsertAccEnquiry  {
	
	    protected static Logger logger = LoggerFactory.getLogger(InsertAccEnquiry.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String  StateCode;
	    public static String  P_ENQ_NUM;

	     
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/INSERT_ACC_ENQ";
	    
/*
	 @param bodyData
	 Method is used to Verify Functionality of MSGA API -InsertACCEnquiry with all Valid Inputs   */
	    
		   public static void validInput(String bodyData) {	
			try {
	    	RequestBuilder_new.getBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGA API- Insert ACC Enquiry "+endpoint);
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
	        P_ENQ_NUM = jsonPathEvaluator.get("result.P_ENQ_NUM");
	        Status = response.jsonPath().get("code").toString();      
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" "  +InsertAccEnquiry.code);
			logger.info("Test case executed successfully");
			logger.info("P_ENQ_NUM is generated as " +P_ENQ_NUM);

			}			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGA Insert ACC Enquiry API with Valid Input" + e);
				e.printStackTrace();
			}
	    }
		   
	 //	 Method is used to Verify Functionality of MSGA API -InsertACCEnquiry with Blank P_PARENT_GROUP 
		   
		   public static void blank_P_PARENT_GROUP(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- Insert ACC Enquiry "+endpoint);
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
		        Status = response.jsonPath().get("code").toString();      
				logger.info("Expected status code 200");
				logger.info("Actual status code :"+" "  +InsertAccEnquiry.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA Insert ACC Enquiry API with Blank P_PARENT_GROUP " + e);
					e.printStackTrace();
				}
		    }
		   
	//	 Method is used to Verify Functionality of MSGA API -InsertACCEnquiry with Invalid P_PARENT_GROUP 	
		   
		   public static void invalid_P_PARENT_GROUP(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- Insert ACC Enquiry "+endpoint);
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
		        Status = response.jsonPath().get("code").toString();      
				logger.info("Expected status code 200");
				logger.info("Actual status code :"+" "  +InsertAccEnquiry.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA Insert ACC Enquiry API with Invalid P_PARENT_GROUP " + e);
					e.printStackTrace();
				}
		    }
		
		   
	 //	 Method is used to Verify Functionality of MSGA API -InsertACCEnquiry with Blank P_DEALER_MAP_CD 
		   
		   public static void blank_P_DEALER_MAP_CD(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- Insert ACC Enquiry "+endpoint);
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
		        Status = response.jsonPath().get("code").toString();      
				logger.info("Expected status code 200");
				logger.info("Actual status code :"+" "  +InsertAccEnquiry.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA Insert ACC Enquiry API with Blank P_DEALER_MAP_CD " + e);
					e.printStackTrace();
				}
		    }
		   
	//	 Method is used to Verify Functionality of MSGA API -InsertACCEnquiry with Invalid P_DEALER_MAP_CD 	
		   
		   public static void invalid_P_DEALER_MAP_CD(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- Insert ACC Enquiry "+endpoint);
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
		        Status = response.jsonPath().get("code").toString();      
				logger.info("Expected status code 200");
				logger.info("Actual status code :"+" "  +InsertAccEnquiry.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA Insert ACC Enquiry API with Invalid P_DEALER_MAP_CD " + e);
					e.printStackTrace();
				}
		    }
		   
 //	 Method is used to Verify Functionality of MSGA API -InsertACCEnquiry with Blank P_LOC_CD 
		   
		   public static void blank_P_LOC_CD(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- Insert ACC Enquiry "+endpoint);
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
		        Status = response.jsonPath().get("code").toString();      
				logger.info("Expected status code 200");
				logger.info("Actual status code :"+" "  +InsertAccEnquiry.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA Insert ACC Enquiry API with Blank P_LOC_CD " + e);
					e.printStackTrace();
				}
		    }
		   
	//	 Method is used to Verify Functionality of MSGA API -InsertACCEnquiry with Invalid P_LOC_CD 	
		   
		   public static void invalid_P_LOC_CD(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- Insert ACC Enquiry "+endpoint);
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
		        Status = response.jsonPath().get("code").toString();      
				logger.info("Expected status code 200");
				logger.info("Actual status code :"+" "  +InsertAccEnquiry.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA Insert ACC Enquiry API with Invalid P_LOC_CD " + e);
					e.printStackTrace();
				}
		    }
		
		   
	 //	 Method is used to Verify Functionality of MSGA API -InsertACCEnquiry with Blank P_ENQ_DATE 
		   
		   public static void blank_P_ENQ_DATE(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- Insert ACC Enquiry "+endpoint);
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
		        Status = response.jsonPath().get("code").toString();      
				logger.info("Expected status code 200");
				logger.info("Actual status code :"+" "  +InsertAccEnquiry.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA Insert ACC Enquiry API with Blank P_ENQ_DATE " + e);
					e.printStackTrace();
				}
		    }
		   
	//	 Method is used to Verify Functionality of MSGA API -InsertACCEnquiry with Invalid P_ENQ_DATE 	
		   
		   public static void invalid_P_ENQ_DATE(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- Insert ACC Enquiry "+endpoint);
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
		        Status = response.jsonPath().get("code").toString();      
				logger.info("Expected status code 200");
				logger.info("Actual status code :"+" "  +InsertAccEnquiry.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA Insert ACC Enquiry API with Invalid P_ENQ_DATE " + e);
					e.printStackTrace();
				}
		    }
		   
	//	 Method is used to Verify Functionality of MSGA API -InsertACCEnquiry with Blank P_CUST_FNAME 	
		   
		   public static void blank_P_CUST_FNAME(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- Insert ACC Enquiry "+endpoint);
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
		        Status = response.jsonPath().get("code").toString();      
				logger.info("Expected status code 200");
				logger.info("Actual status code :" +" " +InsertAccEnquiry.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA Insert ACC Enquiry API with Blank P_CUST_FNAME " + e);
					e.printStackTrace();
				}
		    }
		   
	//	 Method is used to Verify Functionality of MSGA API -InsertACCEnquiry with Blank P_PHONE 	
		   
		   public static void blank_P_PHONE(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- Insert ACC Enquiry "+endpoint);
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
		        Status = response.jsonPath().get("code").toString();      
				logger.info("Expected status code 200");
				logger.info("Actual status code :" +" " +InsertAccEnquiry.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA Insert ACC Enquiry API with Blank P_PHONE " + e);
					e.printStackTrace();
				}
		    }
		   
	//	 Method is used to Verify Functionality of MSGA API -InsertACCEnquiry with Blank P_SOURCE 	
		   
		   public static void blank_P_SOURCE(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- Insert ACC Enquiry "+endpoint);
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
		        Status = response.jsonPath().get("code").toString();      
				logger.info("Expected status code 200");
				logger.info("Actual status code :"+" "  +InsertAccEnquiry.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA Insert ACC Enquiry API with Blank P_SOURCE " + e);
					e.printStackTrace();
				}
		    }
		   
	//	 Method is used to Verify Functionality of MSGA API -InsertACCEnquiry with Blank P_MODE 	
		   
		   public static void blank_P_MODE(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- Insert ACC Enquiry "+endpoint);
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
		        Status = response.jsonPath().get("code").toString();      
				logger.info("Expected status code 200");
				logger.info("Actual status code :"+" "  +InsertAccEnquiry.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA Insert ACC Enquiry API with Blank P_MODE " + e);
					e.printStackTrace();
				}
		    }
		   
	//	 Method is used to Verify Functionality of MSGA API -InsertACCEnquiry with Blank P_APPOINT_TIME 	
		   
		   public static void blank_P_APPOINT_TIME(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- Insert ACC Enquiry "+endpoint);
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
		        Status = response.jsonPath().get("code").toString();      
				logger.info("Expected status code 200");
				logger.info("Actual status code :"+" "  +InsertAccEnquiry.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA Insert ACC Enquiry API with Blank P_APPOINT_TIME " + e);
					e.printStackTrace();
				}
		    }
		   
}
