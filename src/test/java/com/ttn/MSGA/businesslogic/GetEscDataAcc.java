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

        public class GetEscDataAcc  {
	
	    protected static Logger logger = LoggerFactory.getLogger(GetEscDataAcc.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  VIN;
	    public static String  Status;
	    public static String  DealerCode;


	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/GET_ESC_DATA_ACC";
	    
	    
	    /*
	 		  @param bodyData
	 		  Method is used to Verify Functionality of GET_ESC_DATA_ACC Functionality With all valid Inputs 
	   */

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.getBase_URL2();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGA API-Get Esc Data ACC "+endpoint);
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
	        logger.info("Actual Status code is"+" "  +GetEscDataAcc.code);
	        logger.info("Expected Status code is 200" );
	        logger.info("Successfully got result");
			}
			catch(Exception e)
			{
				logger.info("Exception occured With MSGA-Get ESC DATA ACC API with Valid Input Details" +e);
				e.printStackTrace();
			}
	    }
		
		
	//	Method is used to Verify Functionality of GET_ESC_DATA_ACC Functionality with Blank P_PMC
		public static void blank_PMC(String bodyData) {
			
			try {
	    	RequestBuilder_new.getBase_URL2();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGA API-Get Esc Data ACC "+endpoint);
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
	        logger.info("Actual Status code is"+" "  +GetEscDataAcc.code);
	        logger.info("Expected Status code is 200" );
	        logger.info("Successfully got result");
			}
			catch(Exception e)
			{
				logger.info("Exception occured With MSGA-Get ESC DATA ACC API with Blank P_PMC" +e);
				e.printStackTrace();
			}
	    }
		

		
		
	//	Method is used to Verify Functionality of GET_ESC_DATA_ACC Functionality with Invalid P_PMC
		public static void invalid_PMC(String bodyData) {
			
			try {
	    	RequestBuilder_new.getBase_URL2();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGA API-Get Esc Data ACC "+endpoint);
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
	        logger.info("Actual Status code is"+" "  +GetEscDataAcc.code);
	        logger.info("Expected Status code is 200" );
	        logger.info("Successfully got result");
			}
			catch(Exception e)
			{
				logger.info("Exception occured With MSGA-Get ESC DATA ACC API with Invalid P_PMC" +e);
				e.printStackTrace();
			}
	    }

		
		//	Method is used to Verify Functionality of GET_ESC_DATA_ACC Functionality with Blank P_LOC_CD
		public static void blank_P_LOC_CD(String bodyData) {
			
			try {
	    	RequestBuilder_new.getBase_URL2();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("token",     RequestBuilder_new.getAccessToken());
	        logger.info("Execution Started");
	        logger.info("Endpoint for MSGA API-Get Esc Data ACC "+endpoint);
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
	        logger.info("Actual Status code is"+" "  +GetEscDataAcc.code);
	        logger.info("Expected Status code is 200" );
	        logger.info("Successfully got result");
			}
			catch(Exception e)
			{
				logger.info("Exception occured With MSGA-Get ESC DATA ACC API with Blank P_LOC_CD" +e);
				e.printStackTrace();
			}
	    }
		
		
		
		
}
