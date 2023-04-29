package com.ttn.MSGA.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Deepanshu Tyagi
 *
 */

public class PhoneNumberPojo {

	private String P_PHONE;

	/**
	 * 
	 * @param date
	 * 
	 */

	public PhoneNumberPojo(String P_PHONE) {
		this.P_PHONE = P_PHONE;

	}

	// date

	public String getP_PHONE() {
		return P_PHONE;
	}

	public void setP_PHONE(String P_PHONE) {
		this.P_PHONE = P_PHONE;
	}

}
