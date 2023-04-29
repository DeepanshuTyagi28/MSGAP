package com.ttn.MSGP.testcases;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Hashtable;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ttn.commonutils.DataProviderSource;
import com.ttn.commonutils.MyPropertyNamingStrategy;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ttn.MSGP.businesslogic.GetEspData;
import com.ttn.MSGP.businesslogic.InsertAccEnquiry;
import com.ttn.MSGP.pojo.InsertAccEnquiryPojo;
import com.ttn.builder.BaseTest;

/**
 * @author Deepanshu Tyagi This class is used to verify MSGP API - Insert Acc Enquiry functionality.
 */

public class InsertAccEnquiryTest extends BaseTest {

	@Test(groups = { "Sanity", "Regression", "MSGP" ,"Pre_Prod"}, dataProvider = "MSGP_InsertAccEnquiry_ValidInput", dataProviderClass = DataProviderSource.class)
	public void insertAccEnquiry_ValidInput(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		InsertAccEnquiryPojo InsertAccEnquiryPojo = new InsertAccEnquiryPojo(data.get("P_PARENT_GROUP"),
				data.get("P_DEALER_MAP_CD"), data.get("P_LOC_CD"), data.get("P_ENQ_NUM"), data.get("P_ENQ_DATE"),
				data.get("P_CUST_FNAME"), data.get("P_CUST_MNAME"), data.get("P_CUST_LNAME"), data.get("P_PHONE"),
				data.get("P_EMAIL"), data.get("P_ADDRESS1"), data.get("P_ADDRESS2"), data.get("P_ADDRESS3"),
				data.get("P_STATE"), data.get("P_CITY"), data.get("P_PIN"), data.get("P_REMARKS"), data.get("P_SOURCE"),
				data.get("P_MODE"), data.get("P_APPOINT_DATE"), data.get("P_APPOINT_TIME"), data.get("P_STATUS"),
				data.get("P_MODEL"), data.get("P_VARIANT"), data.get("P_COLOR"), data.get("P_ACC_PART_DTL"),
				data.get("P_WEB_ENQ_NUM"), data.get("P_MSPIN"), data.get("P_ACTION_PLANED"), data.get("P_ACTION_STAGE"),
				data.get("P_CUST_ENQ_DESC"), data.get("P_CUST_VIN"), data.get("P_ENQ_CATG"), data.get("P_GSTIN"),
				data.get("P_PARTY_CD"), data.get("P_PARTY_TYPE"), data.get("P_REGISTRATION_NO"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, InsertAccEnquiryPojo);
		String bodyData = sw.toString();
		InsertAccEnquiry.validInput(bodyData);
		System.out.println(bodyData);
		Assert.assertEquals(InsertAccEnquiry.code, 200);
		Assert.assertTrue(InsertAccEnquiry.Status.contains("200"));
		Assert.assertTrue(InsertAccEnquiry.message.contains("SUCCESS"));
		Assert.assertTrue(InsertAccEnquiry.P_ENQ_NUM.contains("ENQP"));

	}

	@Test(groups = { "Sanity", "Regression",
			"MSGP" }, dataProvider = "MSGP_InsertAccEnquiry_blank_P_PARENT_GROUP", dataProviderClass = DataProviderSource.class)
	public void insertAccEnquiry_Blank_P_PARENT_GROUP(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		InsertAccEnquiryPojo InsertAccEnquiryPojo = new InsertAccEnquiryPojo(data.get("P_PARENT_GROUP"),
				data.get("P_DEALER_MAP_CD"), data.get("P_LOC_CD"), data.get("P_ENQ_NUM"), data.get("P_ENQ_DATE"),
				data.get("P_CUST_FNAME"), data.get("P_CUST_MNAME"), data.get("P_CUST_LNAME"), data.get("P_PHONE"),
				data.get("P_EMAIL"), data.get("P_ADDRESS1"), data.get("P_ADDRESS2"), data.get("P_ADDRESS3"),
				data.get("P_STATE"), data.get("P_CITY"), data.get("P_PIN"), data.get("P_REMARKS"), data.get("P_SOURCE"),
				data.get("P_MODE"), data.get("P_APPOINT_DATE"), data.get("P_APPOINT_TIME"), data.get("P_STATUS"),
				data.get("P_MODEL"), data.get("P_VARIANT"), data.get("P_COLOR"), data.get("P_ACC_PART_DTL"),
				data.get("P_WEB_ENQ_NUM"), data.get("P_MSPIN"), data.get("P_ACTION_PLANED"), data.get("P_ACTION_STAGE"),
				data.get("P_CUST_ENQ_DESC"), data.get("P_CUST_VIN"), data.get("P_ENQ_CATG"), data.get("P_GSTIN"),
				data.get("P_PARTY_CD"), data.get("P_PARTY_TYPE"), data.get("P_REGISTRATION_NO"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, InsertAccEnquiryPojo);
		String bodyData = sw.toString();
		InsertAccEnquiry.blank_P_PARENT_GROUP(bodyData);
		System.out.println(bodyData);
		Assert.assertEquals(InsertAccEnquiry.code, 200);
		Assert.assertTrue(InsertAccEnquiry.Status.contains("1"));
		Assert.assertTrue(InsertAccEnquiry.message.contains("DEALER DETAILS CAN NOT BE BLANK"));

	}

	@Test(groups = { "Sanity", "Regression",
			"MSGP" }, dataProvider = "MSGP_InsertAccEnquiry_Invalid_P_PARENT_GROUP", dataProviderClass = DataProviderSource.class)
	public void insertAccEnquiry_Invalid_P_PARENT_GROUP(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		InsertAccEnquiryPojo InsertAccEnquiryPojo = new InsertAccEnquiryPojo(data.get("P_PARENT_GROUP"),
				data.get("P_DEALER_MAP_CD"), data.get("P_LOC_CD"), data.get("P_ENQ_NUM"), data.get("P_ENQ_DATE"),
				data.get("P_CUST_FNAME"), data.get("P_CUST_MNAME"), data.get("P_CUST_LNAME"), data.get("P_PHONE"),
				data.get("P_EMAIL"), data.get("P_ADDRESS1"), data.get("P_ADDRESS2"), data.get("P_ADDRESS3"),
				data.get("P_STATE"), data.get("P_CITY"), data.get("P_PIN"), data.get("P_REMARKS"), data.get("P_SOURCE"),
				data.get("P_MODE"), data.get("P_APPOINT_DATE"), data.get("P_APPOINT_TIME"), data.get("P_STATUS"),
				data.get("P_MODEL"), data.get("P_VARIANT"), data.get("P_COLOR"), data.get("P_ACC_PART_DTL"),
				data.get("P_WEB_ENQ_NUM"), data.get("P_MSPIN"), data.get("P_ACTION_PLANED"), data.get("P_ACTION_STAGE"),
				data.get("P_CUST_ENQ_DESC"), data.get("P_CUST_VIN"), data.get("P_ENQ_CATG"), data.get("P_GSTIN"),
				data.get("P_PARTY_CD"), data.get("P_PARTY_TYPE"), data.get("P_REGISTRATION_NO"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, InsertAccEnquiryPojo);
		String bodyData = sw.toString();
		InsertAccEnquiry.invalid_P_PARENT_GROUP(bodyData);
		System.out.println(bodyData);
		Assert.assertEquals(InsertAccEnquiry.code, 200);
		Assert.assertTrue(InsertAccEnquiry.Status.contains("1"));

	}

	@Test(groups = { "Sanity", "Regression",
			"MSGP" }, dataProvider = "MSGP_InsertAccEnquiry_blank_P_DEALER_MAP_CD", dataProviderClass = DataProviderSource.class)
	public void insertAccEnquiry_Blank_P_DEALER_MAP_CD(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		InsertAccEnquiryPojo InsertAccEnquiryPojo = new InsertAccEnquiryPojo(data.get("P_PARENT_GROUP"),
				data.get("P_DEALER_MAP_CD"), data.get("P_LOC_CD"), data.get("P_ENQ_NUM"), data.get("P_ENQ_DATE"),
				data.get("P_CUST_FNAME"), data.get("P_CUST_MNAME"), data.get("P_CUST_LNAME"), data.get("P_PHONE"),
				data.get("P_EMAIL"), data.get("P_ADDRESS1"), data.get("P_ADDRESS2"), data.get("P_ADDRESS3"),
				data.get("P_STATE"), data.get("P_CITY"), data.get("P_PIN"), data.get("P_REMARKS"), data.get("P_SOURCE"),
				data.get("P_MODE"), data.get("P_APPOINT_DATE"), data.get("P_APPOINT_TIME"), data.get("P_STATUS"),
				data.get("P_MODEL"), data.get("P_VARIANT"), data.get("P_COLOR"), data.get("P_ACC_PART_DTL"),
				data.get("P_WEB_ENQ_NUM"), data.get("P_MSPIN"), data.get("P_ACTION_PLANED"), data.get("P_ACTION_STAGE"),
				data.get("P_CUST_ENQ_DESC"), data.get("P_CUST_VIN"), data.get("P_ENQ_CATG"), data.get("P_GSTIN"),
				data.get("P_PARTY_CD"), data.get("P_PARTY_TYPE"), data.get("P_REGISTRATION_NO"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, InsertAccEnquiryPojo);
		String bodyData = sw.toString();
		InsertAccEnquiry.blank_P_DEALER_MAP_CD(bodyData);
		System.out.println(bodyData);
		Assert.assertEquals(InsertAccEnquiry.code, 200);
		Assert.assertTrue(InsertAccEnquiry.Status.contains("100"));
		Assert.assertTrue(
				InsertAccEnquiry.message.contains("Failed to convert parameter value from a String to a Decimal."));

	}

	@Test(groups = { "Sanity", "Regression",
			"MSGP" }, dataProvider = "MSGP_InsertAccEnquiry_Invalid_P_DEALER_MAP_CD", dataProviderClass = DataProviderSource.class)
	public void insertAccEnquiry_Invalid_P_DEALER_MAP_CD(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		InsertAccEnquiryPojo InsertAccEnquiryPojo = new InsertAccEnquiryPojo(data.get("P_PARENT_GROUP"),
				data.get("P_DEALER_MAP_CD"), data.get("P_LOC_CD"), data.get("P_ENQ_NUM"), data.get("P_ENQ_DATE"),
				data.get("P_CUST_FNAME"), data.get("P_CUST_MNAME"), data.get("P_CUST_LNAME"), data.get("P_PHONE"),
				data.get("P_EMAIL"), data.get("P_ADDRESS1"), data.get("P_ADDRESS2"), data.get("P_ADDRESS3"),
				data.get("P_STATE"), data.get("P_CITY"), data.get("P_PIN"), data.get("P_REMARKS"), data.get("P_SOURCE"),
				data.get("P_MODE"), data.get("P_APPOINT_DATE"), data.get("P_APPOINT_TIME"), data.get("P_STATUS"),
				data.get("P_MODEL"), data.get("P_VARIANT"), data.get("P_COLOR"), data.get("P_ACC_PART_DTL"),
				data.get("P_WEB_ENQ_NUM"), data.get("P_MSPIN"), data.get("P_ACTION_PLANED"), data.get("P_ACTION_STAGE"),
				data.get("P_CUST_ENQ_DESC"), data.get("P_CUST_VIN"), data.get("P_ENQ_CATG"), data.get("P_GSTIN"),
				data.get("P_PARTY_CD"), data.get("P_PARTY_TYPE"), data.get("P_REGISTRATION_NO"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, InsertAccEnquiryPojo);
		String bodyData = sw.toString();
		InsertAccEnquiry.invalid_P_DEALER_MAP_CD(bodyData);
		System.out.println(bodyData);
		Assert.assertEquals(InsertAccEnquiry.code, 200);
		Assert.assertTrue(InsertAccEnquiry.Status.contains("100"));

	}

	@Test(groups = { "Sanity", "Regression",
			"MSGP" }, dataProvider = "MSGP_InsertAccEnquiry_blank_P_LOC_CD", dataProviderClass = DataProviderSource.class)
	public void insertAccEnquiry_Blank_P_LOC_CD(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		InsertAccEnquiryPojo InsertAccEnquiryPojo = new InsertAccEnquiryPojo(data.get("P_PARENT_GROUP"),
				data.get("P_DEALER_MAP_CD"), data.get("P_LOC_CD"), data.get("P_ENQ_NUM"), data.get("P_ENQ_DATE"),
				data.get("P_CUST_FNAME"), data.get("P_CUST_MNAME"), data.get("P_CUST_LNAME"), data.get("P_PHONE"),
				data.get("P_EMAIL"), data.get("P_ADDRESS1"), data.get("P_ADDRESS2"), data.get("P_ADDRESS3"),
				data.get("P_STATE"), data.get("P_CITY"), data.get("P_PIN"), data.get("P_REMARKS"), data.get("P_SOURCE"),
				data.get("P_MODE"), data.get("P_APPOINT_DATE"), data.get("P_APPOINT_TIME"), data.get("P_STATUS"),
				data.get("P_MODEL"), data.get("P_VARIANT"), data.get("P_COLOR"), data.get("P_ACC_PART_DTL"),
				data.get("P_WEB_ENQ_NUM"), data.get("P_MSPIN"), data.get("P_ACTION_PLANED"), data.get("P_ACTION_STAGE"),
				data.get("P_CUST_ENQ_DESC"), data.get("P_CUST_VIN"), data.get("P_ENQ_CATG"), data.get("P_GSTIN"),
				data.get("P_PARTY_CD"), data.get("P_PARTY_TYPE"), data.get("P_REGISTRATION_NO"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, InsertAccEnquiryPojo);
		String bodyData = sw.toString();
		InsertAccEnquiry.blank_P_LOC_CD(bodyData);
		System.out.println(bodyData);
		Assert.assertEquals(InsertAccEnquiry.code, 200);
		Assert.assertTrue(InsertAccEnquiry.Status.contains("1"));
		Assert.assertTrue(InsertAccEnquiry.message.contains("DEALER DETAILS CAN NOT BE BLANK"));

	}

	@Test(groups = { "Sanity", "Regression",
			"MSGP" }, dataProvider = "MSGP_InsertAccEnquiry_Invalid_P_LOC_CD", dataProviderClass = DataProviderSource.class)
	public void insertAccEnquiry_Invalid_P_LOC_CD(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		InsertAccEnquiryPojo InsertAccEnquiryPojo = new InsertAccEnquiryPojo(data.get("P_PARENT_GROUP"),
				data.get("P_DEALER_MAP_CD"), data.get("P_LOC_CD"), data.get("P_ENQ_NUM"), data.get("P_ENQ_DATE"),
				data.get("P_CUST_FNAME"), data.get("P_CUST_MNAME"), data.get("P_CUST_LNAME"), data.get("P_PHONE"),
				data.get("P_EMAIL"), data.get("P_ADDRESS1"), data.get("P_ADDRESS2"), data.get("P_ADDRESS3"),
				data.get("P_STATE"), data.get("P_CITY"), data.get("P_PIN"), data.get("P_REMARKS"), data.get("P_SOURCE"),
				data.get("P_MODE"), data.get("P_APPOINT_DATE"), data.get("P_APPOINT_TIME"), data.get("P_STATUS"),
				data.get("P_MODEL"), data.get("P_VARIANT"), data.get("P_COLOR"), data.get("P_ACC_PART_DTL"),
				data.get("P_WEB_ENQ_NUM"), data.get("P_MSPIN"), data.get("P_ACTION_PLANED"), data.get("P_ACTION_STAGE"),
				data.get("P_CUST_ENQ_DESC"), data.get("P_CUST_VIN"), data.get("P_ENQ_CATG"), data.get("P_GSTIN"),
				data.get("P_PARTY_CD"), data.get("P_PARTY_TYPE"), data.get("P_REGISTRATION_NO"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, InsertAccEnquiryPojo);
		String bodyData = sw.toString();
		InsertAccEnquiry.invalid_P_LOC_CD(bodyData);
		System.out.println(bodyData);
		Assert.assertEquals(InsertAccEnquiry.code, 200);
		Assert.assertTrue(InsertAccEnquiry.Status.contains("100"));

	}

	@Test(groups = { "Sanity", "Regression",
			"MSGP" }, dataProvider = "MSGP_InsertAccEnquiry_Blank_P_ENQ_DATE", dataProviderClass = DataProviderSource.class)
	public void insertAccEnquiry_Blank_P_ENQ_DATE(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		InsertAccEnquiryPojo InsertAccEnquiryPojo = new InsertAccEnquiryPojo(data.get("P_PARENT_GROUP"),
				data.get("P_DEALER_MAP_CD"), data.get("P_LOC_CD"), data.get("P_ENQ_NUM"), data.get("P_ENQ_DATE"),
				data.get("P_CUST_FNAME"), data.get("P_CUST_MNAME"), data.get("P_CUST_LNAME"), data.get("P_PHONE"),
				data.get("P_EMAIL"), data.get("P_ADDRESS1"), data.get("P_ADDRESS2"), data.get("P_ADDRESS3"),
				data.get("P_STATE"), data.get("P_CITY"), data.get("P_PIN"), data.get("P_REMARKS"), data.get("P_SOURCE"),
				data.get("P_MODE"), data.get("P_APPOINT_DATE"), data.get("P_APPOINT_TIME"), data.get("P_STATUS"),
				data.get("P_MODEL"), data.get("P_VARIANT"), data.get("P_COLOR"), data.get("P_ACC_PART_DTL"),
				data.get("P_WEB_ENQ_NUM"), data.get("P_MSPIN"), data.get("P_ACTION_PLANED"), data.get("P_ACTION_STAGE"),
				data.get("P_CUST_ENQ_DESC"), data.get("P_CUST_VIN"), data.get("P_ENQ_CATG"), data.get("P_GSTIN"),
				data.get("P_PARTY_CD"), data.get("P_PARTY_TYPE"), data.get("P_REGISTRATION_NO"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, InsertAccEnquiryPojo);
		String bodyData = sw.toString();
		InsertAccEnquiry.blank_P_ENQ_DATE(bodyData);
		System.out.println(bodyData);
		Assert.assertEquals(InsertAccEnquiry.code, 200);
		Assert.assertTrue(InsertAccEnquiry.Status.contains("1"));
		Assert.assertTrue(InsertAccEnquiry.message.contains("ENQUIRY DATE CAN NOT BE BLANK"));

	}

	@Test(groups = { "Sanity", "Regression",
			"MSGP" }, dataProvider = "MSGP_InsertAccEnquiry_Blank_P_CUST_FNAME", dataProviderClass = DataProviderSource.class)
	public void insertAccEnquiry_Blank_P_CUST_FNAME(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		InsertAccEnquiryPojo InsertAccEnquiryPojo = new InsertAccEnquiryPojo(data.get("P_PARENT_GROUP"),
				data.get("P_DEALER_MAP_CD"), data.get("P_LOC_CD"), data.get("P_ENQ_NUM"), data.get("P_ENQ_DATE"),
				data.get("P_CUST_FNAME"), data.get("P_CUST_MNAME"), data.get("P_CUST_LNAME"), data.get("P_PHONE"),
				data.get("P_EMAIL"), data.get("P_ADDRESS1"), data.get("P_ADDRESS2"), data.get("P_ADDRESS3"),
				data.get("P_STATE"), data.get("P_CITY"), data.get("P_PIN"), data.get("P_REMARKS"), data.get("P_SOURCE"),
				data.get("P_MODE"), data.get("P_APPOINT_DATE"), data.get("P_APPOINT_TIME"), data.get("P_STATUS"),
				data.get("P_MODEL"), data.get("P_VARIANT"), data.get("P_COLOR"), data.get("P_ACC_PART_DTL"),
				data.get("P_WEB_ENQ_NUM"), data.get("P_MSPIN"), data.get("P_ACTION_PLANED"), data.get("P_ACTION_STAGE"),
				data.get("P_CUST_ENQ_DESC"), data.get("P_CUST_VIN"), data.get("P_ENQ_CATG"), data.get("P_GSTIN"),
				data.get("P_PARTY_CD"), data.get("P_PARTY_TYPE"), data.get("P_REGISTRATION_NO"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, InsertAccEnquiryPojo);
		String bodyData = sw.toString();
		InsertAccEnquiry.blank_CustomerName(bodyData);
		System.out.println(bodyData);
		Assert.assertEquals(InsertAccEnquiry.code, 200);
		Assert.assertTrue(InsertAccEnquiry.Status.contains("1"));
		Assert.assertTrue(InsertAccEnquiry.message.contains("CUSTOMER NAME CAN NOT BE BLANK"));

	}

	@Test(groups = { "Sanity", "Regression","MSGP" }, dataProvider = "MSGP_InsertAccEnquiry_Blank_P_PHONE", dataProviderClass = DataProviderSource.class)
	public void insertAccEnquiry_Blank_P_PHONE(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		InsertAccEnquiryPojo InsertAccEnquiryPojo = new InsertAccEnquiryPojo(data.get("P_PARENT_GROUP"),
				data.get("P_DEALER_MAP_CD"), data.get("P_LOC_CD"), data.get("P_ENQ_NUM"), data.get("P_ENQ_DATE"),
				data.get("P_CUST_FNAME"), data.get("P_CUST_MNAME"), data.get("P_CUST_LNAME"), data.get("P_PHONE"),
				data.get("P_EMAIL"), data.get("P_ADDRESS1"), data.get("P_ADDRESS2"), data.get("P_ADDRESS3"),
				data.get("P_STATE"), data.get("P_CITY"), data.get("P_PIN"), data.get("P_REMARKS"), data.get("P_SOURCE"),
				data.get("P_MODE"), data.get("P_APPOINT_DATE"), data.get("P_APPOINT_TIME"), data.get("P_STATUS"),
				data.get("P_MODEL"), data.get("P_VARIANT"), data.get("P_COLOR"), data.get("P_ACC_PART_DTL"),
				data.get("P_WEB_ENQ_NUM"), data.get("P_MSPIN"), data.get("P_ACTION_PLANED"), data.get("P_ACTION_STAGE"),
				data.get("P_CUST_ENQ_DESC"), data.get("P_CUST_VIN"), data.get("P_ENQ_CATG"), data.get("P_GSTIN"),
				data.get("P_PARTY_CD"), data.get("P_PARTY_TYPE"), data.get("P_REGISTRATION_NO"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, InsertAccEnquiryPojo);
		String bodyData = sw.toString();
		InsertAccEnquiry.blank_CustomerPhoneNumber(bodyData);
		System.out.println(bodyData);
		Assert.assertEquals(InsertAccEnquiry.code, 200);
		Assert.assertTrue(InsertAccEnquiry.Status.contains("1"));
		Assert.assertTrue(InsertAccEnquiry.message.contains("MOBILE NUMBER CAN NOT BE BLANK"));

	}
	
	@Test(groups = { "Sanity", "Regression","MSGP" }, dataProvider = "MSGP_InsertAccEnquiry_Blank_P_SOURCE", dataProviderClass = DataProviderSource.class)
	public void insertAccEnquiry_Blank_P_SOURCE(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		InsertAccEnquiryPojo InsertAccEnquiryPojo = new InsertAccEnquiryPojo(data.get("P_PARENT_GROUP"),
				data.get("P_DEALER_MAP_CD"), data.get("P_LOC_CD"), data.get("P_ENQ_NUM"), data.get("P_ENQ_DATE"),
				data.get("P_CUST_FNAME"), data.get("P_CUST_MNAME"), data.get("P_CUST_LNAME"), data.get("P_PHONE"),
				data.get("P_EMAIL"), data.get("P_ADDRESS1"), data.get("P_ADDRESS2"), data.get("P_ADDRESS3"),
				data.get("P_STATE"), data.get("P_CITY"), data.get("P_PIN"), data.get("P_REMARKS"), data.get("P_SOURCE"),
				data.get("P_MODE"), data.get("P_APPOINT_DATE"), data.get("P_APPOINT_TIME"), data.get("P_STATUS"),
				data.get("P_MODEL"), data.get("P_VARIANT"), data.get("P_COLOR"), data.get("P_ACC_PART_DTL"),
				data.get("P_WEB_ENQ_NUM"), data.get("P_MSPIN"), data.get("P_ACTION_PLANED"), data.get("P_ACTION_STAGE"),
				data.get("P_CUST_ENQ_DESC"), data.get("P_CUST_VIN"), data.get("P_ENQ_CATG"), data.get("P_GSTIN"),
				data.get("P_PARTY_CD"), data.get("P_PARTY_TYPE"), data.get("P_REGISTRATION_NO"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, InsertAccEnquiryPojo);
		String bodyData = sw.toString();
		InsertAccEnquiry.blank_P_SOURCE(bodyData);
		System.out.println(bodyData);
		Assert.assertEquals(InsertAccEnquiry.code, 200);
		Assert.assertTrue(InsertAccEnquiry.Status.contains("1"));
		Assert.assertTrue(InsertAccEnquiry.message.contains("ENQUIRY SOURCE AND MODE CAN NOT BE BLANK"));

	}
	
	@Test(groups = { "Sanity", "Regression","MSGP" }, dataProvider = "MSGP_InsertAccEnquiry_Blank_P_MODE", dataProviderClass = DataProviderSource.class)
	public void insertAccEnquiry_Blank_P_MODE(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException {
		InsertAccEnquiryPojo InsertAccEnquiryPojo = new InsertAccEnquiryPojo(data.get("P_PARENT_GROUP"),
				data.get("P_DEALER_MAP_CD"), data.get("P_LOC_CD"), data.get("P_ENQ_NUM"), data.get("P_ENQ_DATE"),
				data.get("P_CUST_FNAME"), data.get("P_CUST_MNAME"), data.get("P_CUST_LNAME"), data.get("P_PHONE"),
				data.get("P_EMAIL"), data.get("P_ADDRESS1"), data.get("P_ADDRESS2"), data.get("P_ADDRESS3"),
				data.get("P_STATE"), data.get("P_CITY"), data.get("P_PIN"), data.get("P_REMARKS"), data.get("P_SOURCE"),
				data.get("P_MODE"), data.get("P_APPOINT_DATE"), data.get("P_APPOINT_TIME"), data.get("P_STATUS"),
				data.get("P_MODEL"), data.get("P_VARIANT"), data.get("P_COLOR"), data.get("P_ACC_PART_DTL"),
				data.get("P_WEB_ENQ_NUM"), data.get("P_MSPIN"), data.get("P_ACTION_PLANED"), data.get("P_ACTION_STAGE"),
				data.get("P_CUST_ENQ_DESC"), data.get("P_CUST_VIN"), data.get("P_ENQ_CATG"), data.get("P_GSTIN"),
				data.get("P_PARTY_CD"), data.get("P_PARTY_TYPE"), data.get("P_REGISTRATION_NO"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, InsertAccEnquiryPojo);
		String bodyData = sw.toString();
		InsertAccEnquiry.blank_P_MODE(bodyData);
		System.out.println(bodyData);
		Assert.assertEquals(InsertAccEnquiry.code, 200);
		Assert.assertTrue(InsertAccEnquiry.Status.contains("1"));
		Assert.assertTrue(InsertAccEnquiry.message.contains("ENQUIRY SOURCE AND MODE CAN NOT BE BLANK"));

	}
	
	@Test(groups = { "Sanity", "Regression","MSGP" }, dataProvider = "MSGP_InsertAccEnquiry_Blank_P_APPOINT_TIME", dataProviderClass = DataProviderSource.class)
	public void insertAccEnquiry_Blank_P_APPOINT_TIME(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException {
		InsertAccEnquiryPojo InsertAccEnquiryPojo = new InsertAccEnquiryPojo(data.get("P_PARENT_GROUP"),
				data.get("P_DEALER_MAP_CD"), data.get("P_LOC_CD"), data.get("P_ENQ_NUM"), data.get("P_ENQ_DATE"),
				data.get("P_CUST_FNAME"), data.get("P_CUST_MNAME"), data.get("P_CUST_LNAME"), data.get("P_PHONE"),
				data.get("P_EMAIL"), data.get("P_ADDRESS1"), data.get("P_ADDRESS2"), data.get("P_ADDRESS3"),
				data.get("P_STATE"), data.get("P_CITY"), data.get("P_PIN"), data.get("P_REMARKS"), data.get("P_SOURCE"),
				data.get("P_MODE"), data.get("P_APPOINT_DATE"), data.get("P_APPOINT_TIME"), data.get("P_STATUS"),
				data.get("P_MODEL"), data.get("P_VARIANT"), data.get("P_COLOR"), data.get("P_ACC_PART_DTL"),
				data.get("P_WEB_ENQ_NUM"), data.get("P_MSPIN"), data.get("P_ACTION_PLANED"), data.get("P_ACTION_STAGE"),
				data.get("P_CUST_ENQ_DESC"), data.get("P_CUST_VIN"), data.get("P_ENQ_CATG"), data.get("P_GSTIN"),
				data.get("P_PARTY_CD"), data.get("P_PARTY_TYPE"), data.get("P_REGISTRATION_NO"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, InsertAccEnquiryPojo);
		String bodyData = sw.toString();
		InsertAccEnquiry.blank_P_APPOINT_TIME(bodyData);
		System.out.println(bodyData);
		Assert.assertEquals(InsertAccEnquiry.code, 200);
		Assert.assertTrue(InsertAccEnquiry.Status.contains("1"));
		Assert.assertTrue(InsertAccEnquiry.message.contains("Input string was not in a correct format."));

	}
	
	@Test(groups = { "Sanity", "Regression","MSGP" }, dataProvider = "MSGP_InsertAccEnquiry_Invalid_P_APPOINT_TIME", dataProviderClass = DataProviderSource.class)
	public void insertAccEnquiry_Invalid_P_APPOINT_TIME(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException {
		InsertAccEnquiryPojo InsertAccEnquiryPojo = new InsertAccEnquiryPojo(data.get("P_PARENT_GROUP"),
				data.get("P_DEALER_MAP_CD"), data.get("P_LOC_CD"), data.get("P_ENQ_NUM"), data.get("P_ENQ_DATE"),
				data.get("P_CUST_FNAME"), data.get("P_CUST_MNAME"), data.get("P_CUST_LNAME"), data.get("P_PHONE"),
				data.get("P_EMAIL"), data.get("P_ADDRESS1"), data.get("P_ADDRESS2"), data.get("P_ADDRESS3"),
				data.get("P_STATE"), data.get("P_CITY"), data.get("P_PIN"), data.get("P_REMARKS"), data.get("P_SOURCE"),
				data.get("P_MODE"), data.get("P_APPOINT_DATE"), data.get("P_APPOINT_TIME"), data.get("P_STATUS"),
				data.get("P_MODEL"), data.get("P_VARIANT"), data.get("P_COLOR"), data.get("P_ACC_PART_DTL"),
				data.get("P_WEB_ENQ_NUM"), data.get("P_MSPIN"), data.get("P_ACTION_PLANED"), data.get("P_ACTION_STAGE"),
				data.get("P_CUST_ENQ_DESC"), data.get("P_CUST_VIN"), data.get("P_ENQ_CATG"), data.get("P_GSTIN"),
				data.get("P_PARTY_CD"), data.get("P_PARTY_TYPE"), data.get("P_REGISTRATION_NO"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, InsertAccEnquiryPojo);
		String bodyData = sw.toString();
		InsertAccEnquiry.invalid_P_APPOINT_TIME(bodyData);
		System.out.println(bodyData);
		Assert.assertEquals(InsertAccEnquiry.code, 200);
		Assert.assertTrue(InsertAccEnquiry.Status.contains("1"));
		Assert.assertTrue(InsertAccEnquiry.message.contains("Input string was not in a correct format."));

	}
	
	@Test(groups = { "Sanity", "Regression","MSGP" }, dataProvider = "MSGP_InsertAccEnquiry_Blank_P_ENQ_CATG", dataProviderClass = DataProviderSource.class)
	public void insertAccEnquiry_Blank_P_ENQ_CATG(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException {
		InsertAccEnquiryPojo InsertAccEnquiryPojo = new InsertAccEnquiryPojo(data.get("P_PARENT_GROUP"),
				data.get("P_DEALER_MAP_CD"), data.get("P_LOC_CD"), data.get("P_ENQ_NUM"), data.get("P_ENQ_DATE"),
				data.get("P_CUST_FNAME"), data.get("P_CUST_MNAME"), data.get("P_CUST_LNAME"), data.get("P_PHONE"),
				data.get("P_EMAIL"), data.get("P_ADDRESS1"), data.get("P_ADDRESS2"), data.get("P_ADDRESS3"),
				data.get("P_STATE"), data.get("P_CITY"), data.get("P_PIN"), data.get("P_REMARKS"), data.get("P_SOURCE"),
				data.get("P_MODE"), data.get("P_APPOINT_DATE"), data.get("P_APPOINT_TIME"), data.get("P_STATUS"),
				data.get("P_MODEL"), data.get("P_VARIANT"), data.get("P_COLOR"), data.get("P_ACC_PART_DTL"),
				data.get("P_WEB_ENQ_NUM"), data.get("P_MSPIN"), data.get("P_ACTION_PLANED"), data.get("P_ACTION_STAGE"),
				data.get("P_CUST_ENQ_DESC"), data.get("P_CUST_VIN"), data.get("P_ENQ_CATG"), data.get("P_GSTIN"),
				data.get("P_PARTY_CD"), data.get("P_PARTY_TYPE"), data.get("P_REGISTRATION_NO"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, InsertAccEnquiryPojo);
		String bodyData = sw.toString();
		InsertAccEnquiry.blank_P_ENQ_CATG(bodyData);
		System.out.println(bodyData);
		Assert.assertEquals(InsertAccEnquiry.code, 200);
		Assert.assertTrue(InsertAccEnquiry.Status.contains("1"));
		Assert.assertTrue(InsertAccEnquiry.message.contains("ERROR WHILE CREATING ENQUIRY ORA-01400: cannot insert NULL into (\"MULDMS\".\"PH_ENQ\".\"ENQ_NUM\")"));

	}
	
	@Test(groups = { "Sanity", "Regression","MSGP" }, dataProvider = "MSGP_InsertAccEnquiry_Invalid_P_ENQ_CATG", dataProviderClass = DataProviderSource.class)
	public void insertAccEnquiry_Invalid_P_ENQ_CATG(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException {
		InsertAccEnquiryPojo InsertAccEnquiryPojo = new InsertAccEnquiryPojo(data.get("P_PARENT_GROUP"),
				data.get("P_DEALER_MAP_CD"), data.get("P_LOC_CD"), data.get("P_ENQ_NUM"), data.get("P_ENQ_DATE"),
				data.get("P_CUST_FNAME"), data.get("P_CUST_MNAME"), data.get("P_CUST_LNAME"), data.get("P_PHONE"),
				data.get("P_EMAIL"), data.get("P_ADDRESS1"), data.get("P_ADDRESS2"), data.get("P_ADDRESS3"),
				data.get("P_STATE"), data.get("P_CITY"), data.get("P_PIN"), data.get("P_REMARKS"), data.get("P_SOURCE"),
				data.get("P_MODE"), data.get("P_APPOINT_DATE"), data.get("P_APPOINT_TIME"), data.get("P_STATUS"),
				data.get("P_MODEL"), data.get("P_VARIANT"), data.get("P_COLOR"), data.get("P_ACC_PART_DTL"),
				data.get("P_WEB_ENQ_NUM"), data.get("P_MSPIN"), data.get("P_ACTION_PLANED"), data.get("P_ACTION_STAGE"),
				data.get("P_CUST_ENQ_DESC"), data.get("P_CUST_VIN"), data.get("P_ENQ_CATG"), data.get("P_GSTIN"),
				data.get("P_PARTY_CD"), data.get("P_PARTY_TYPE"), data.get("P_REGISTRATION_NO"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, InsertAccEnquiryPojo);
		String bodyData = sw.toString();
		InsertAccEnquiry.invalid_P_ENQ_CATG(bodyData);
		System.out.println(bodyData);
		Assert.assertEquals(InsertAccEnquiry.code, 200);
		Assert.assertTrue(InsertAccEnquiry.Status.contains("1"));
		Assert.assertTrue(InsertAccEnquiry.message.contains("ERROR WHILE CREATING ENQUIRY ORA-01400: cannot insert NULL into (\"MULDMS\".\"PH_ENQ\".\"ENQ_NUM\")"));

	}

}
