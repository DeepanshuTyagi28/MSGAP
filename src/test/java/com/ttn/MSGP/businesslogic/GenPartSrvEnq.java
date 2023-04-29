package com.ttn.MSGP.businesslogic;


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

        public class GenPartSrvEnq  {
	
	    protected static Logger logger = LoggerFactory.getLogger(GenPartSrvEnq.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String  StateCode;
	    public static String  DealerCode;
	    public static String  P_ENQ_NUM;

	    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/GEN_PART_SRV_ENQ";
	    
/*
	 @param bodyData
	 Method is used to Verify Functionality of MSGP API - GEN_PART_SRV_ENQ with all Valid Inputs   */
	   

		   public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.msgp_getBase_URL2();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGP API-GEN_PART_SRV_ENQ " +endpoint);
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
			logger.info("Actual status code :"+" " +GenPartSrvEnq.code);
			logger.info("Enquiry Number Generated is "+" " +GenPartSrvEnq.P_ENQ_NUM);
			logger.info("Test case executed successfully");
			}			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGP GEN_PART_SRV_ENQ API with Valid Input" + e);
				e.printStackTrace();
			}
	    }
		
		   
		   
//		   Method is used to Verify Functionality of MSGP API - GEN_PART_SRV_ENQ with all Blank P_PARENT_GROUP   */
		   
		   public static void blank_P_PARENT_GROUP(String bodyData) {
	
			try {
	    	RequestBuilder_new.msgp_getBase_URL2();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGP API-GEN_PART_SRV_ENQ " +endpoint);
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
			logger.info("Actual status code :"+" " +GenPartSrvEnq.code);
			logger.info("Test case executed successfully");
			}			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGP GEN_PART_SRV_ENQ API with Blank P_PARENT_GROUP " + e);
				e.printStackTrace();
			}
	    }
		  
		   
//		   Method is used to Verify Functionality of MSGP API - GEN_PART_SRV_ENQ with all Invalid P_PARENT_GROUP   */
		   
		   public static void invalid_P_PARENT_GROUP(String bodyData) {
	
			try {
	    	RequestBuilder_new.msgp_getBase_URL2();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGP API-GEN_PART_SRV_ENQ " +endpoint);
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
			logger.info("Actual status code :"+" " +GenPartSrvEnq.code);
			logger.info("Test case executed successfully");
			}			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGP GEN_PART_SRV_ENQ API with Invalid P_PARENT_GROUP " + e);
				e.printStackTrace();
			}
	    }
		   
		   
//		   Method is used to Verify Functionality of MSGP API - GEN_PART_SRV_ENQ with all Blank P_DEALER_MAP_CD   */
		   
		   public static void blank_P_DEALER_MAP_CD(String bodyData) {
	
			try {
	    	RequestBuilder_new.msgp_getBase_URL2();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGP API-GEN_PART_SRV_ENQ " +endpoint);
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
			logger.info("Actual status code :"+" " +GenPartSrvEnq.code);
			logger.info("Test case executed successfully");
			}			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGP GEN_PART_SRV_ENQ API with Blank P_DEALER_MAP_CD " + e);
				e.printStackTrace();
			}
	    }
		  
		   
//		   Method is used to Verify Functionality of MSGP API - GEN_PART_SRV_ENQ with all Invalid P_DEALER_MAP_CD   */
		   
		   public static void invalid_P_DEALER_MAP_CD(String bodyData) {
	
			try {
	    	RequestBuilder_new.msgp_getBase_URL2();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGP API-GEN_PART_SRV_ENQ " +endpoint);
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
			logger.info("Actual status code :"+" " +GenPartSrvEnq.code);
			logger.info("Test case executed successfully");
			}			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGP GEN_PART_SRV_ENQ API with Invalid P_DEALER_MAP_CD " + e);
				e.printStackTrace();
			}
	    }
		   
//		   Method is used to Verify Functionality of MSGP API - GEN_PART_SRV_ENQ with all Blank P_LOC_CD   */
		   
		   public static void blank_P_LOC_CD(String bodyData) {
	
			try {
	    	RequestBuilder_new.msgp_getBase_URL2();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGP API-GEN_PART_SRV_ENQ " +endpoint);
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
			logger.info("Actual status code :"+" " +GenPartSrvEnq.code);
			logger.info("Test case executed successfully");
			}			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGP GEN_PART_SRV_ENQ API with Blank P_LOC_CD " + e);
				e.printStackTrace();
			}
	    }
		  
		   
//		   Method is used to Verify Functionality of MSGP API - GEN_PART_SRV_ENQ with all Invalid P_LOC_CD   */
		   
		   public static void invalid_P_LOC_CD(String bodyData) {
	
			try {
	    	RequestBuilder_new.msgp_getBase_URL2();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGP API-GEN_PART_SRV_ENQ " +endpoint);
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
			logger.info("Actual status code :"+" " +GenPartSrvEnq.code);
			logger.info("Test case executed successfully");
			}			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGP GEN_PART_SRV_ENQ API with Invalid P_LOC_CD " + e);
				e.printStackTrace();
			}
	    }
		   
//		   Method is used to Verify Functionality of MSGP API - GEN_PART_SRV_ENQ with all Blank Phone Number   */
		   
		   public static void blank_PhoneNumber(String bodyData) {
	
			try {
	    	RequestBuilder_new.msgp_getBase_URL2();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGP API-GEN_PART_SRV_ENQ " +endpoint);
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
			logger.info("Actual status code :"+" " +GenPartSrvEnq.code);
			logger.info("Test case executed successfully");
			}			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGP GEN_PART_SRV_ENQ API with Blank Phone Number" + e);
				e.printStackTrace();
			}
	    }
	
//		   Method is used to Verify Functionality of MSGP API - GEN_PART_SRV_ENQ with all Blank Registration Number   */
		   
		   public static void blank_RegNum(String bodyData) {
	
			try {
	    	RequestBuilder_new.msgp_getBase_URL2();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGP API-GEN_PART_SRV_ENQ " +endpoint);
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
			logger.info("Actual status code :"+" " +GenPartSrvEnq.code);
			logger.info("Test case executed successfully");
			}			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGP GEN_PART_SRV_ENQ API with Blank Registration Number" + e);
				e.printStackTrace();
			}
	    }
		   
		   
//		   Method is used to Verify Functionality of MSGP API - GEN_PART_SRV_ENQ with all Invalid Registration Number   */
		   
		   public static void invalid_RegNum(String bodyData) {
	
			try {
	    	RequestBuilder_new.msgp_getBase_URL2();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGP API-GEN_PART_SRV_ENQ " +endpoint);
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
			logger.info("Actual status code :"+" " +GenPartSrvEnq.code);
			logger.info("Test case executed successfully");
			}			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGP GEN_PART_SRV_ENQ API with Invalid Registration Number" + e);
				e.printStackTrace();
			}
	    }
		   
		   
//		   Method is used to Verify Functionality of MSGP API - GEN_PART_SRV_ENQ with all Blank Part Number   */
		   
		   public static void blank_PartNumber(String bodyData) {
	
			try {
	    	RequestBuilder_new.msgp_getBase_URL2();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGP API-GEN_PART_SRV_ENQ " +endpoint);
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
			logger.info("Actual status code :"+" " +GenPartSrvEnq.code);
			logger.info("Test case executed successfully");
			}			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGP GEN_PART_SRV_ENQ API with Blank Part Number" + e);
				e.printStackTrace();
			}
	    }
		   
		   
//		   Method is used to Verify Functionality of MSGP API - GEN_PART_SRV_ENQ with all Invalid Part Number   */
		   
		   public static void invalid_PartNumber(String bodyData) {
	
			try {
	    	RequestBuilder_new.msgp_getBase_URL2();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGP API-GEN_PART_SRV_ENQ " +endpoint);
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
			logger.info("Actual status code :"+" " +GenPartSrvEnq.code);
			logger.info("Test case executed successfully");
			}			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGP GEN_PART_SRV_ENQ API with Invalid Part Number" + e);
				e.printStackTrace();
			}
	    }
		   
}
