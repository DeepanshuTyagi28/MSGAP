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

//        public class BookingCancel  {
//	
//	    protected static Logger logger = LoggerFactory.getLogger(BookingCancel.class);
//	    private static JSONObject requestParam;
//	    public static Response response;
//	    public static int  statusCode;
//	    public static String  message;
//	    public static String  responseBody;
//	    public static int code;
//	    public static String  Status;
//	    public static String  StateCode;
//	    public static String  PhoneNumber;
//
//	    
//	    //Replace below end point as per need.
//	    
//	    private static String  endpoint = "/BOOKING_CANCEL";
//	    
///*
//	 @param bodyData
//	 Method is used to Verify Functionality of MSGA API -BOOKING_CANCEL with all Valid Inputs */
//	    
//		   public static void validInput(String bodyData) {	
//			try {
//	    	RequestBuilder_new.getBase_URL();	    	
//	        RequestBuilder_new.request.header("Content-Type", "application/json");
//	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
//	        logger.info("Execution Started");
//	        logger.info("Endpoint for MSGA API-BOOKING_CANCEL "+endpoint);
//	        logger.info("Body is "+bodyData);
//	        RequestBuilder_new.request.body(bodyData);	        
//	        response =  RequestBuilder_new.request.post(endpoint);
//	        ExtentManager.responseBody = response.getBody().asString();
//	        ExtentManager.ApiInfo = endpoint;
//	        logger.info("Response is "+response.prettyPrint());
//	        code =   response.getStatusCode();	        
//	        responseBody = response.getBody().asString();	        
//	        JsonPath jsonPathEvaluator = response.jsonPath();	        
//	        message = jsonPathEvaluator.get("message");
//	        Status = response.jsonPath().get("code").toString();      
//			logger.info("Expected status code 200");
//			logger.info("Actual status code :"+" "  +BookingCancel.code);
//			logger.info("Test case executed successfully");
//			}			
//			catch(Exception e)
//			{
//				logger.info("Exeption While Executing MSGA BOOKING_CANCEL API with Valid Input" + e);
//				e.printStackTrace();
//			}
//	    }
//		   
//		   
//	//	   Method is used to Verify Functionality of MSGA API -BOOKING_CANCEL with  Blank P_DEALER_MAP_CD */
//		    
//		   public static void blank_P_DEALER_MAP_CD(String bodyData) {	
//			try {
//	    	RequestBuilder_new.getBase_URL();	    	
//	        RequestBuilder_new.request.header("Content-Type", "application/json");
//	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
//	        logger.info("Execution Started");
//	        logger.info("Endpoint for MSGA API-BOOKING_CANCEL "+endpoint);
//	        logger.info("Body is "+bodyData);
//	        RequestBuilder_new.request.body(bodyData);	        
//	        response =  RequestBuilder_new.request.post(endpoint);
//	        ExtentManager.responseBody = response.getBody().asString();
//	        ExtentManager.ApiInfo = endpoint;
//	        logger.info("Response is "+response.prettyPrint());
//	        code =   response.getStatusCode();	        
//	        responseBody = response.getBody().asString();	        
//	        JsonPath jsonPathEvaluator = response.jsonPath();	        
//	        message = jsonPathEvaluator.get("message");
//	        Status = response.jsonPath().get("code").toString();      
//			logger.info("Expected status code 200");
//			logger.info("Actual status code :"+" "  +BookingCancel.code);
//			logger.info("Test case executed successfully");
//			}			
//			catch(Exception e)
//			{
//				logger.info("Exeption While Executing MSGA BOOKING_CANCEL API with Blank P_DEALER_MAP_CD" + e);
//				e.printStackTrace();
//			}
//	    }
//		   
////		   Method is used to Verify Functionality of MSGA API -BOOKING_CANCEL with  Invalid P_DEALER_MAP_CD */
//		    
//			   public static void invalid_P_DEALER_MAP_CD(String bodyData) {	
//				try {
//		    	RequestBuilder_new.getBase_URL();	    	
//		        RequestBuilder_new.request.header("Content-Type", "application/json");
//		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
//		        logger.info("Execution Started");
//		        logger.info("Endpoint for MSGA API-BOOKING_CANCEL "+endpoint);
//		        logger.info("Body is "+bodyData);
//		        RequestBuilder_new.request.body(bodyData);	        
//		        response =  RequestBuilder_new.request.post(endpoint);
//		        ExtentManager.responseBody = response.getBody().asString();
//		        ExtentManager.ApiInfo = endpoint;
//		        logger.info("Response is "+response.prettyPrint());
//		        code =   response.getStatusCode();	        
//		        responseBody = response.getBody().asString();	        
//		        JsonPath jsonPathEvaluator = response.jsonPath();	        
//		        message = jsonPathEvaluator.get("message");
//		        Status = response.jsonPath().get("code").toString();      
//				logger.info("Expected status code 200");
//				logger.info("Actual status code :"+" "  +BookingCancel.code);
//				logger.info("Test case executed successfully");
//				}			
//				catch(Exception e)
//				{
//					logger.info("Exeption While Executing MSGA BOOKING_CANCEL API with Invalid P_DEALER_MAP_CD" + e);
//					e.printStackTrace();
//				}
//		    }	   
//			   
////			   Method is used to Verify Functionality of MSGA API -BOOKING_CANCEL with  Blank P_REFUND_AMT */
//			    
//			   public static void blank_P_REFUND_AMT(String bodyData) {	
//				try {
//		    	RequestBuilder_new.getBase_URL();	    	
//		        RequestBuilder_new.request.header("Content-Type", "application/json");
//		        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
//		        logger.info("Execution Started");
//		        logger.info("Endpoint for MSGA API-BOOKING_CANCEL "+endpoint);
//		        logger.info("Body is "+bodyData);
//		        RequestBuilder_new.request.body(bodyData);	        
//		        response =  RequestBuilder_new.request.post(endpoint);
//		        ExtentManager.responseBody = response.getBody().asString();
//		        ExtentManager.ApiInfo = endpoint;
//		        logger.info("Response is "+response.prettyPrint());
//		        code =   response.getStatusCode();	        
//		        responseBody = response.getBody().asString();	        
//		        JsonPath jsonPathEvaluator = response.jsonPath();	        
//		        message = jsonPathEvaluator.get("message");
//		        Status = response.jsonPath().get("code").toString();      
//				logger.info("Expected status code 200");
//				logger.info("Actual status code :"+" "  +BookingCancel.code);
//				logger.info("Test case executed successfully");
//				}			
//				catch(Exception e)
//				{
//					logger.info("Exeption While Executing MSGA BOOKING_CANCEL API with Blank P_REFUND_AMT" + e);
//					e.printStackTrace();
//				}
//		    }
//			   
////			   Method is used to Verify Functionality of MSGA API -BOOKING_CANCEL with  Invalid P_REFUND_AMT */
//			    
//				   public static void invalid_P_REFUND_AMT(String bodyData) {	
//					try {
//			    	RequestBuilder_new.getBase_URL();	    	
//			        RequestBuilder_new.request.header("Content-Type", "application/json");
//			        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
//			        logger.info("Execution Started");
//			        logger.info("Endpoint for MSGA API-BOOKING_CANCEL "+endpoint);
//			        logger.info("Body is "+bodyData);
//			        RequestBuilder_new.request.body(bodyData);	        
//			        response =  RequestBuilder_new.request.post(endpoint);
//			        ExtentManager.responseBody = response.getBody().asString();
//			        ExtentManager.ApiInfo = endpoint;
//			        logger.info("Response is "+response.prettyPrint());
//			        code =   response.getStatusCode();	        
//			        responseBody = response.getBody().asString();	        
//			        JsonPath jsonPathEvaluator = response.jsonPath();	        
//			        message = jsonPathEvaluator.get("message");
//			        Status = response.jsonPath().get("code").toString();      
//					logger.info("Expected status code 200");
//					logger.info("Actual status code :"+" "  +BookingCancel.code);
//					logger.info("Test case executed successfully");
//					}			
//					catch(Exception e)
//					{
//						logger.info("Exeption While Executing MSGA BOOKING_CANCEL API with Invalid P_REFUND_AMT" + e);
//						e.printStackTrace();
//					}
//			    }	   
//		   
//}
