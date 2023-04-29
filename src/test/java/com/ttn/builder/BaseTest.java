package com.ttn.builder;

/**
 * This Java program demonstrates Base Class of PRISM-API.
 *
 * @author TTN
 */


import java.lang.reflect.Method;
import java.net.MalformedURLException;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.ttn.commonutils.ExtentManager;
import com.ttn.commonutils.Login_AccessTokenGeneration;

public class BaseTest

{
	public static  ExtentReports extent;
	public static  ExtentHtmlReporter htmlReporter;
	public  ExtentTest test;
	public static  String extentpath;


	@BeforeSuite(groups = {"Sanity", "Regression"}) 
	public void setAccessToken()
	{
		// Use below code if you want to set access token before any test run, so that same can be used throughout suite
	//	Login_AccessTokenGeneration.login();
	}


	@BeforeSuite(groups = {"Sanity", "Regression"}) 
	public static ExtentReports before() throws MalformedURLException 

	{ 
		String workingDir = System.getProperty("user.dir");
		extentpath = workingDir + "/ExtentReports/" +"ExtentReport.html";
		htmlReporter = new ExtentHtmlReporter(extentpath);
		htmlReporter.config().setDocumentTitle("MSGA API Automation Result");
		htmlReporter.config().setReportName("MSGA API Automation Result");

		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().enableTimeline(false);
		htmlReporter.config().setAutoCreateRelativePathMedia(true);

		extent = new ExtentReports(); 
		extent.attachReporter(htmlReporter);
	    extent.setSystemInfo("Host Name", "TTN-PC");
        extent.setSystemInfo("User Name", "TTN_PRISM");
		extent.setAnalysisStrategy(AnalysisStrategy.CLASS); 
		return extent;

	}

	@BeforeMethod(groups = {"Sanity", "Regression"}) 
	protected void startReporting(Method method) {
		String testName;

		testName = this.getClass().getSimpleName() + " : " + method.getName();
		test = extent.createTest(testName, method.getAnnotation(Test.class).description());
	}

	@AfterMethod(groups = {"Sanity", "Regression"}) 
	public void reportClosure(ITestResult result) {

		test.log(Status.INFO, "API information:  "+ExtentManager.getApiInfo());
		test.log(Status.INFO, "Test execution started.");

		if(result.getStatus()==ITestResult.FAILURE){

			StackTraceElement[] st = result.getThrowable().getStackTrace();
			String printErrorLog = result.getThrowable().toString();
			for(int i = 0; i < st.length; i++) {
				printErrorLog += st[i];
				printErrorLog += "<br>";
			}
			test.log(Status.FAIL,  "Test Case '"+"<font color=\"red\">"+ result.getName()+"</font>"+"' got fail" +"<a class='exception' style='display:block; cursor:pointer; user-select:none' onclick='($(\".exception\").click(function(){ $(this).next().toggle()}))'>Double click to see details of failure </a>"

                  + "<pre style='display:none'>" + printErrorLog + "</pre>");

			test.log(Status.FAIL, "<a class='exception' style='display:block; cursor:pointer; user-select:none' onclick='($(\".exception\").click(function(){ $(this).next().toggle()}))'>Double click to see respone body </a>"

                + "<pre style='display:none'>" + ExtentManager.getResponseBody() + "</pre>");
		}

		else if(result.getStatus() == ITestResult.SUCCESS) 
		{ 

			// test.log(Status.PASS, "Name of Passed Test case is:  "+ result.getName());
			test.log(Status.PASS, "Test Case '"+"<font color=\"green\">"+ result.getName()+"</font>"+"' got pass" +"<a class='exception' style='display:block; cursor:pointer; user-select:none' onclick='($(\".exception\").click(function(){ $(this).next().toggle()}))'>Double click to see respone body </a>"

                + "<pre style='display:none'>" + ExtentManager.getResponseBody() + "</pre>");

		}

		else if (result.getStatus() == ITestResult.SKIP) 

		{ 
			test.log(Status.SKIP,"Name of Skipped Test case is:  "+ result.getName()); 
		}
		test.log(Status.INFO, "Test execution completed.");
	}

	@AfterTest(groups = {"Sanity", "Regression"}) 

	public void tearDown() 

	{ 
		extent.flush();

	}

	@AfterSuite(groups = {"Sanity", "Regression"}) 
	public void setPassword()
	{
		System.out.println("Tear down---");
		//Please add Code to restore any data or state of any feature here

	}
}