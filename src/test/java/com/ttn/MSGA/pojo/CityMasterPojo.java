package com.ttn.MSGA.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * @author Deepanshu Tyagi
 *
 */

public class CityMasterPojo {

	private String p_PMC;
	private String p_state_CD;
	private String p_date;

	/* 
	 * @param P_PMC
	 */

	public CityMasterPojo(String p_PMC , String p_state_CD , String p_date) {
		this.p_PMC = p_PMC;
		this.p_state_CD = p_state_CD;
		this.p_date = p_date;

	}

	// p_PMC

	public String getp_PMC() {
		return p_PMC;
	}

	public void setp_PMC(String p_PMC) {
		this.p_PMC = p_PMC;
	}

	
	
	// p_state_CD

	public String getp_state_CD() {
		return p_state_CD;
	}

	public void setp_state_CD(String p_state_CD) {
		this.p_state_CD = p_state_CD;
	}
	
	
	// p_date

	public String getp_date() {
		return p_date;
	}

	public void setp_date(String p_date) {
		this.p_date = p_date;
	}

}
