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

        public class GetEspData  {
	
	    protected static Logger logger = LoggerFactory.getLogger(GetEspData.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String  StateCode;
	    public static String  DealerCode;

	    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/GET_ESC_DATA";
	    
/*
	 @param bodyData
	 Method is used to Verify Functionality of MSGP API - GET_ESC_DATA with all Valid Inputs   */
	   

		   public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.msgp_getBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGP API- GET_ESC_DATA " +endpoint);
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
	        DealerCode = jsonPathEvaluator.get("result.DEALER_CD[0]");
	        Status = response.jsonPath().get("code").toString();      
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +GetEspData.code);
			logger.info("Test case executed successfully");

			}
			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGP GET_ESC_DATA API with Valid Input" + e);
				e.printStackTrace();
			}
	    }
		
		   
		// Method is used to Verify Functionality of MSGP API - GET_ESC_DATA with all Blank P_PMC    

		   public static void blank_P_PMC(String bodyData) {
	
			try {
	    	RequestBuilder_new.msgp_getBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGP API- GET_ESC_DATA " +endpoint);
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
			logger.info("Actual status code :"+" " +GetEspData.code);
			logger.info("Test case executed successfully");

			}
			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGP GET_ESC_DATA API with Blank P_PMC " + e);
				e.printStackTrace();
			}
	    }
		   
	// Method is used to Verify Functionality of MSGP API - GET_ESC_DATA with all Invalid P_PMC    

		   public static void invalid_P_PMC(String bodyData) {
	
			try {
	    	RequestBuilder_new.msgp_getBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGP API- GET_ESC_DATA " +endpoint);
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
			logger.info("Actual status code :"+" " +GetEspData.code);
			logger.info("Test case executed successfully");

			}
			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGP GET_ESC_DATA API with Invalid P_PMC " + e);
				e.printStackTrace();
			}
	    }
		   
		// Method is used to Verify Functionality of MSGP API - GET_ESC_DATA with all Non-Existing P_PMC    

		   public static void non_Existing_P_PMC(String bodyData) {
	
			try {
	    	RequestBuilder_new.msgp_getBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGP API- GET_ESC_DATA " +endpoint);
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
			logger.info("Actual status code :"+" " +GetEspData.code);
			logger.info("Test case executed successfully");

			}
			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGP GET_ESC_DATA API with Non-Existing P_PMC " + e);
				e.printStackTrace();
			}
	    }
		   
		   
	// Method is used to Verify Functionality of MSGP API - GET_ESC_DATA with all Invalid P_DLR_CD    

		   public static void invalid_P_DLR_CD(String bodyData) {
	
			try {
	    	RequestBuilder_new.msgp_getBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGP API- GET_ESC_DATA " +endpoint);
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
			logger.info("Actual status code :"+" " +GetEspData.code);
			logger.info("Test case executed successfully");

			}
			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGP GET_ESC_DATA API with Invalid P_DLR_CD " + e);
				e.printStackTrace();
			}
	    }
		

}
