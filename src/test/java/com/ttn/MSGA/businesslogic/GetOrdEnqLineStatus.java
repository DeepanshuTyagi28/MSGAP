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

        public class GetOrdEnqLineStatus  {
	
	    protected static Logger logger = LoggerFactory.getLogger(GetOrdEnqLineStatus.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String  StateCode;
	    public static String  PART_NUM;

	     
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/GET_ORD_ENQ_LINE_STATUS";
	    
/*
	 @param bodyData
	 Method is used to Verify Functionality of MSGA API -GET_ORD_ENQ_LINE_STATUS with all Valid Inputs   */
	    
		   public static void validInput(String bodyData) {	
			try {
	    	RequestBuilder_new.getBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGA API- GET_ORD_ENQ_LINE_STATUS "+endpoint);
	        logger.info("Body is "+bodyData);
	        RequestBuilder_new.request.body(bodyData);	        
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	
	        Status = response.jsonPath().get("code").toString();      
	        message = jsonPathEvaluator.get("message");
	        PART_NUM = jsonPathEvaluator.get("result.GET_ORD_ENQ_LINE_STATUS_LIST[0].PART_NUM");
			logger.info("Expected status code 200");
			logger.info("Actual status code :" +" "  +GetOrdEnqLineStatus.code);
			logger.info("Test case executed successfully");
			logger.info("PART_NUM is generated as " + PART_NUM);

			}			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGA GET_ORD_ENQ_LINE_STATUS API with Valid Input" + e);
				e.printStackTrace();
			}
	    }
		   
	   
		   
	 //	  Method is used to Verify Functionality of  MSGA API -INSERT_ACC_ORD with Blank P_PARENT_GROUP 
		   
		   public static void blank_P_PARENT_GROUP(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- GET_ORD_ENQ_LINE_STATUS "+endpoint);
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
				logger.info("Actual status code :"+" "  +GetOrdEnqLineStatus.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA GET_ORD_ENQ_LINE_STATUS API with Blank P_PARENT_GROUP " + e);
					e.printStackTrace();
				}
		    }
		   
	//	  Method is used to Verify Functionality of  MSGA API -GET_ORD_ENQ_LINE_STATUS with Invalid P_PARENT_GROUP 
		   
		   public static void invalid_P_PARENT_GROUP(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- GET_ORD_ENQ_LINE_STATUS "+endpoint);
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
				logger.info("Actual status code :"+" "  +GetOrdEnqLineStatus.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA GET_ORD_ENQ_LINE_STATUS API with Invalid P_PARENT_GROUP " + e);
					e.printStackTrace();
				}
		    }
		
		   
	 //	 Method is used to Verify Functionality of MSGA API -GET_ORD_ENQ_LINE_STATUS with Blank P_DEALER_MAP_CD 
		   
		   public static void blank_P_DEALER_MAP_CD(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- GET_ORD_ENQ_LINE_STATUS "+endpoint);
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
				logger.info("Actual status code :"+" "  +GetOrdEnqLineStatus.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA Insert GET_ORD_ENQ_LINE_STATUS with Blank P_DEALER_MAP_CD " + e);
					e.printStackTrace();
				}
		    }
		   
	//	 Method is used to Verify Functionality of MSGA API -GET_ORD_ENQ_LINE_STATUS with Invalid P_DEALER_MAP_CD 	
		   
		   public static void invalid_P_DEALER_MAP_CD(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- GET_ORD_ENQ_LINE_STATUS "+endpoint);
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
				logger.info("Actual status code :"+" "  +GetOrdEnqLineStatus.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA GET_ORD_ENQ_LINE_STATUS API with Invalid P_DEALER_MAP_CD " + e);
					e.printStackTrace();
				}
		    }
		    
		   	    	
		   
 //	 Method is used to Verify Functionality of MSGA API -GET_ORD_ENQ_LINE_STATUS with Blank P_LOC_CD 
		   
		   public static void blank_P_LOC_CD(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- GET_ORD_ENQ_LINE_STATUS "+endpoint);
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
				logger.info("Actual status code :"+" "  +GetOrdEnqLineStatus.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA GET_ORD_ENQ_LINE_STATUS API with Blank P_LOC_CD " + e);
					e.printStackTrace();
				}
		    }
		   
	//	 Method is used to Verify Functionality of MSGA API -GET_ORD_ENQ_LINE_STATUS with Invalid P_LOC_CD 	
		   
		   public static void invalid_P_LOC_CD(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- GET_ORD_ENQ_LINE_STATUS "+endpoint);
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
				logger.info("Actual status code :"+" "  +GetOrdEnqLineStatus.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA GET_ORD_ENQ_LINE_STATUS API with Invalid P_LOC_CD " + e);
					e.printStackTrace();
				}
		    }
		
   		
		   
		   
		   
 //	 Method is used to Verify Functionality of MSGA API -GET_ORD_ENQ_LINE_STATUS with Blank P_ENQ_ORDER_NUM 
		   
		   public static void blank_P_ENQ_ORDER_NUM(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- GET_ORD_ENQ_LINE_STATUS "+endpoint);
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
				logger.info("Actual status code :"+" "  +GetOrdEnqLineStatus.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA GET_ORD_ENQ_LINE_STATUS API with Blank P_ENQ_ORDER_NUM " + e);
					e.printStackTrace();
				}
		    }
		   
	//	 Method is used to Verify Functionality of MSGA API -GET_ORD_ENQ_LINE_STATUS with Invalid P_ENQ_ORDER_NUM 	
		   
		   public static void invalid_P_ENQ_ORDER_NUM(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- GET_ORD_ENQ_LINE_STATUS "+endpoint);
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
				logger.info("Actual status code :"+" "  +GetOrdEnqLineStatus.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA GET_ORD_ENQ_LINE_STATUS API with Invalid P_ENQ_ORDER_NUM " + e);
					e.printStackTrace();
				}
		    }
		   
		   
 //	 Method is used to Verify Functionality of MSGA API -GET_ORD_ENQ_LINE_STATUS with Blank P_FLAG 
		   
		   public static void blank_P_FLAG(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- GET_ORD_ENQ_LINE_STATUS "+endpoint);
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
				logger.info("Actual status code :"+" "  +GetOrdEnqLineStatus.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA GET_ORD_ENQ_LINE_STATUS API with Blank P_FLAG " + e);
					e.printStackTrace();
				}
		    }
		   
	//	 Method is used to Verify Functionality of MSGA API -GET_ORD_ENQ_LINE_STATUS with Invalid P_FLAG 	
		   
		   public static void invalid_P_FLAG(String bodyData) {	
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API- GET_ORD_ENQ_LINE_STATUS "+endpoint);
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
				logger.info("Actual status code :"+" "  +GetOrdEnqLineStatus.code);
				logger.info("Test case executed successfully");
				}			
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA GET_ORD_ENQ_LINE_STATUS API with Invalid P_FLAG " + e);
					e.printStackTrace();
				}
		    }
}
