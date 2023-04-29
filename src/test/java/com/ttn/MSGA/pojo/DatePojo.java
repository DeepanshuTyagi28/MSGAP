package com.ttn.MSGA.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Deepanshu Tyagi
 *
 */

public class DatePojo {

	private String date;

	/**
	 * 
	 * @param date
	 * 
	 */

	public DatePojo(String date) {
		this.date = date;

	}

	// date

	public String getdate() {
		return date;
	}

	public void setdate(String date) {
		this.date = date;
	}

}
