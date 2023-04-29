package com.ttn.commonutils;

import com.ttn.builder.RequestBuilder_new;

import io.restassured.http.Method;
import io.restassured.response.Response;

public class HttpMethodSelector {
	
	public static Response response;
	
	public static void httpMethodSelector(String httpMethod, String endpoint)
	{
	
	switch(httpMethod) {
	
	case "GET":
		response = RequestBuilder_new.request.request(Method.GET, endpoint);
		break;
		
	case "POST":
		response = RequestBuilder_new.request.request(Method.POST, endpoint);
		break;	
		
	case "PUT":
		response = RequestBuilder_new.request.request(Method.PUT, endpoint);
		break;	
		
	case "DELETE":
		response = RequestBuilder_new.request.request(Method.DELETE, endpoint);
		break;	
		
	case "PATCH":
		response = RequestBuilder_new.request.request(Method.PATCH, endpoint);
		break;	
		
	}
	}

}
