package com.ttn.builder;
/**
 * 
 * @author TTN
 */

import com.ttn.commonutils.PropertyReader;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RequestBuilder_new {
	
	public static RequestSpecification request;
	public static String client_id;
	public static String client_secret;


	public static String Environment=PropertyReader.getProperty_for_baseconfig("Environment");
	
	
    //  MSGA EndPoint
    public static String Prod_Base_Url=PropertyReader.getProperty_for_baseconfig("Prod_Base_Url");
    public static String Stage_Base_Url=PropertyReader.getProperty_for_baseconfig("Stage_Base_Url");
    public static String UAT_Base_Url=PropertyReader.getProperty_for_baseconfig("UAT_Base_Url");
    
    public static String Prod_Base_Url2=PropertyReader.getProperty_for_baseconfig("Prod_Base_Url2");
    public static String Stage_Base_Url2=PropertyReader.getProperty_for_baseconfig("Stage_Base_Url2");
    public static String UAT_Base_Url2=PropertyReader.getProperty_for_baseconfig("UAT_Base_Url2");
    
    
    //MSGP EndPoint
    public static String MSGP_Prod_Base_Url=PropertyReader.getProperty_for_baseconfig("MSGP_Prod_Base_Url");
    public static String MSGP_Stage_Base_Url=PropertyReader.getProperty_for_baseconfig("MSGP_Stage_Base_Url");
    public static String MSGP_UAT_Base_Url=PropertyReader.getProperty_for_baseconfig("MSGP_UAT_Base_Url");
    
    public static String MSGP_Prod_Base_Url2=PropertyReader.getProperty_for_baseconfig("MSGP_Prod_Base_Url2");
    public static String MSGP_Stage_Base_Url2=PropertyReader.getProperty_for_baseconfig("MSGP_Stage_Base_Url2");
    public static String MSGP_UAT_Base_Url2=PropertyReader.getProperty_for_baseconfig("MSGP_UAT_Base_Url2");


    
    public static String MSGA_UAT_AccessToken=PropertyReader.getProperty_for_baseconfig("MSGA_UAT_AccessToken");
    public static String MSGA_Prod_AccessToken=PropertyReader.getProperty_for_baseconfig("MSGA_Prod_AccessToken");
    public static String MSGA_Stage_AccessToken=PropertyReader.getProperty_for_baseconfig("MSGA_Stage_AccessToken");
   
    
  //BASE URL 1- MSGA  
    public static void getBase_URL() {
    	
    	if(Environment.equalsIgnoreCase("UAT"))
    	{
        	RestAssured.baseURI = UAT_Base_Url;
      	    request = RestAssured.given();   	
      	
    	}
    	else if(Environment.equalsIgnoreCase("Stage"))
    	{
        	RestAssured.baseURI = Stage_Base_Url;
      	    request = RestAssured.given(); 
      	  
      	
    	}
    	else if(Environment.equalsIgnoreCase("prod"))
    	{
        	RestAssured.baseURI = Prod_Base_Url;
      	    request = RestAssured.given();   
      	 
    	}

  	   }
    
//BASE URL 2 - MSGA
    public static void getBase_URL2() {
    	
    	if(Environment.equalsIgnoreCase("UAT"))
    	{
        	RestAssured.baseURI = UAT_Base_Url2;
      	    request = RestAssured.given();   	
      	
    	}
    	else if(Environment.equalsIgnoreCase("Stage"))
    	{
        	RestAssured.baseURI = Stage_Base_Url2;
      	    request = RestAssured.given(); 
      	  
      	
    	}
    	else if(Environment.equalsIgnoreCase("prod"))
    	{
        	RestAssured.baseURI = Prod_Base_Url2;
      	    request = RestAssured.given();   
      	 
    	}

  	   }
  
    
    // MSGP Endpoint 
    public static void msgp_getBase_URL() {
    	
    	if(Environment.equalsIgnoreCase("UAT"))
    	{
        	RestAssured.baseURI = MSGP_UAT_Base_Url;
      	    request = RestAssured.given();   	
      	
    	}
    	else if(Environment.equalsIgnoreCase("Stage"))
    	{
        	RestAssured.baseURI = MSGP_Stage_Base_Url;
      	    request = RestAssured.given(); 
      	  
      	
    	}
    	else if(Environment.equalsIgnoreCase("prod"))
    	{
        	RestAssured.baseURI = MSGP_Prod_Base_Url;
      	    request = RestAssured.given();   
      	 
    	}

  	   }
    
    
    //MSGP Base URL 2    
    public static void msgp_getBase_URL2() {
    	
    	if(Environment.equalsIgnoreCase("UAT"))
    	{
        	RestAssured.baseURI = MSGP_UAT_Base_Url2;
      	    request = RestAssured.given();   	
      	
    	}
    	else if(Environment.equalsIgnoreCase("Stage"))
    	{
        	RestAssured.baseURI = MSGP_Stage_Base_Url2;
      	    request = RestAssured.given(); 
      	  
      	
    	}
    	else if(Environment.equalsIgnoreCase("prod"))
    	{
        	RestAssured.baseURI = MSGP_Prod_Base_Url2;
      	    request = RestAssured.given();   
      	 
    	}

  	   }
    
    
    
  
 //MSGA TOKEN Value : Header Value
  
 public static String getAccessToken() {
 	
 	if(Environment.equalsIgnoreCase("UAT"))
 	{
 		 client_id = MSGA_UAT_AccessToken; 
   	
 	}
 	else if(Environment.equalsIgnoreCase("Stage"))
 	{
 		 client_id = MSGA_Stage_AccessToken; 	

   	
 	}
 	else if(Environment.equalsIgnoreCase("prod"))
 	{
     
 		 client_id = MSGA_Prod_AccessToken; 	

 	}
		return client_id ;

 	
	   }
 
    
}