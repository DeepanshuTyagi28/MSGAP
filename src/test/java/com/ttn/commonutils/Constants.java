package com.ttn.commonutils;

public class Constants {

    private static String accessToken;
    private static int ChannelID;                 
	
    

    public static String getAccessToken() {
        return accessToken;
    }

    public static void setAccessToken(String accessToken) {
        Constants.accessToken = accessToken;
    }


	
	public static int getChannelID() {
		return ChannelID;
	}

	public static void setChannelID(int channelID) {
		Constants.ChannelID = channelID;
	}

	

	


	
}