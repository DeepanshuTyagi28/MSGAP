package com.ttn.commonutils;

/**
 
 *
 * @author TTN
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public static String path;
	public static String Environment=PropertyReader.getProperty_for_baseconfig("Environment");
	
    public static String getProperty(String propertyName) {
    	
    	 if(Environment.equalsIgnoreCase("UAT"))
	    	{
    		 path = "/src/test/resources/DataSet_UAT.properties";
	    	}
	    	else if(Environment.equalsIgnoreCase("Stage"))
	    	{
	    		path = "/src/test/resources/DataSet_Stage.properties";
	    	}
	    	else if(Environment.equalsIgnoreCase("prod"))
	    	{
	    		path = "/src/test/resources/DataSet_Prod.properties";
	    	}
    	
        FileReader reader = null;
        try {
            reader = new FileReader(ResourceHelper.getResourcePath(path));
            Properties p = new Properties();
            p.load(reader);
            propertyName = p.getProperty(propertyName);
        } catch (FileNotFoundException e) {
            System.out.println("Properties file not found at given path.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return propertyName;
    }
    
 public static String getProperty_for_baseconfig(String propertyName) {
    	
        FileReader reader = null;
        try {
            reader = new FileReader(ResourceHelper.getResourcePath("/src/test/resources/config.properties"));
            Properties p = new Properties();
            p.load(reader);
            propertyName = p.getProperty(propertyName);
        } catch (FileNotFoundException e) {
            System.out.println("Properties file not found at given path.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return propertyName;
    }
    
   
    
}
