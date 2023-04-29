package com.ttn.commonutils;

import org.json.simple.JSONObject;
import com.ttn.builder.RequestBuilder_new;
import io.restassured.response.Response;

public class Login_AccessTokenGeneration {

	private static JSONObject requestParam;
	private static Response response;
	public static int statusCode;
	private static String user;
	private static String pass;
	
	public static void login() {

		try {
	//	RequestBuilder_new.getBase_URL_Login();
		requestParam = new JSONObject();
		user = PropertyReader.getProperty("USERNAME");
		pass = PropertyReader.getProperty("PASSWORD");
		requestParam.put("userName", user);
		requestParam.put("password", pass);
		RequestBuilder_new.request.header("Content-Type", "application/json");
		RequestBuilder_new.request.body(requestParam.toJSONString());
		// Replace below end point as per need.
		response = RequestBuilder_new.request.post("/api/user/login");
		String token = response.jsonPath().get("token").toString();
		Constants.setAccessToken(token);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
