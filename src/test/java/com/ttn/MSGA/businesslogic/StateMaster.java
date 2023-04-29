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

        public class StateMaster  {
	
	    protected static Logger logger = LoggerFactory.getLogger(StateMaster.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  VIN;
	    public static String  Status;
	    public static String  StateDescription;


	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/STATE_MASTER";
	    
	    
	    
/* 	 @param bodyData
	 Method is used to Verify Functionality of MSGA-STATE MASTER API With Valid Authentication and Valid Input Details(PMC & DATE)      */
	 

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.getBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGA API-State Master "+endpoint);
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
	        StateDescription = jsonPathEvaluator.get("result.state_desc[0]");

	        Status = response.jsonPath().get("code").toString();
	        logger.info("Actual Status code is"+" "  + StateMaster.code);
	        logger.info("Expected Status code is 200" );
	        logger.info("Successfully got result");
			}
			catch(Exception e)
			{
				logger.info("Exception occured With MSGA-StateMaster API with Valid Input Details" +e);
				e.printStackTrace();
			}
	    }
		
		
		
	// Method is used to Verify Functionality of MSGA-STATE MASTER API With Valid Authentication But Invalid Input Details(PMC/ DATE)
		public static void invalid_DateFormat(String bodyData) {
			
			try {
	    	RequestBuilder_new.getBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGA API-State Master "+endpoint);
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
	        logger.info("Actual Status code is"+" "  +StateMaster.code);
	        logger.info("Expected Status code is 200" );
	        logger.info("Successfully got result");
			}
			catch(Exception e)
			{
				logger.info("Exception occured With MSGA-StateMaster API with Invalid Date Format" +e);
				e.printStackTrace();
			}
	    }
		
		// Method is used to Verify Functionality of MSGA-STATE MASTER API With Valid Authentication But Invalid PMC Detail(PMC)
				public static void invalid_P_PMC(String bodyData) {
					
					try {
			    	RequestBuilder_new.getBase_URL();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
			        logger.info("Execution Started");
			        logger.info("Endpoint for MSGA API-State Master "+endpoint);
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
			        logger.info("Actual Status code is"+" "  +StateMaster.code);
			        logger.info("Expected Status code is 200" );
			        logger.info("Successfully got result");
					}
					catch(Exception e)
					{
						logger.info("Exception occured With MSGA-StateMaster API with Invalid P_PMC" +e);
						e.printStackTrace();
					}
			    }

}
