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

        public class DealerDetails  {
	
	    protected static Logger logger = LoggerFactory.getLogger(DealerDetails.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String  StateCode;
	    public static String  CreatedDate;

	    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/DEALER_DETAILS";
	    
/*
	 @param bodyData
	 Method is used to Verify Functionality of MSGA API -DEALER_DETAILS with all Valid Inputs   */
	   

		   public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.getBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGA API-DEALER DETAILS" +endpoint);
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
			logger.info("Actual status code :"+" " +DealerDetails.code);
			logger.info("Test case executed successfully");

			}
			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGA DEALER_DETAILS API with Valid Input" + e);
				e.printStackTrace();
			}
	    }
		

		   
	//		 Method is used to Verify Functionality of MSGA API -DEALER_DETAILS with all Invalid PMC Inputs   */

		   public static void invalid_P_PMC(String bodyData) {
	
			try {
	    	RequestBuilder_new.getBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGA API-DEALER DETAILS" +endpoint);
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
			logger.info("Actual status code :"+" " +DealerDetails.code);
			logger.info("Test case executed successfully");

			}
			
			catch(Exception e)
			{
				logger.info("Exeption While Executing MSGA DEALER_DETAILS API with Invalid PMC Input" + e);
				e.printStackTrace();
			}
	    }
		   
//	Method is used to Verify Functionality of MSGA API -DEALER_DETAILS with all Invalid P_DATE Inputs   */

			   public static void invalid_P_DATE(String bodyData) {
		
				try {
		    	RequestBuilder_new.getBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
		        logger.info("Execution Started");
		        logger.info("Endpoint for MSGA API-DEALER DETAILS" +endpoint);
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
				logger.info("Actual status code :"+" " +DealerDetails.code);
				logger.info("Test case executed successfully");

				}
				
				catch(Exception e)
				{
					logger.info("Exeption While Executing MSGA DEALER_DETAILS API with Invalid P_DATE Input" + e);
					e.printStackTrace();
				}
		    }
			   
			   
			   
//	Method is used to Verify Functionality of MSGA API -DEALER_DETAILS with all valid P_DATE Inputs   */

				   public static void valid_P_DATE(String bodyData) {
			
					try {
			    	RequestBuilder_new.getBase_URL();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
			        logger.info("Execution Started");
			        logger.info("Endpoint for MSGA API-DEALER DETAILS" +endpoint);
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
					logger.info("Actual status code :"+" " +DealerDetails.code);
					logger.info("Test case executed successfully");

					}
					
					catch(Exception e)
					{
						logger.info("Exeption While Executing MSGA DEALER_DETAILS API with valid P_DATE Input" + e);
						e.printStackTrace();
					}
			    }
			   
}
