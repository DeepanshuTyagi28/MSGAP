package com.ttn.MSGA.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * @author Deepanshu Tyagi
 *
 */

public class GET_ESC_DATA_ACCpojo {

	private String P_PMC;
	private String P_DLR_CD;
	private String P_LOC_CD;

	/* 
	 * @param P_PMC
	 */

	public GET_ESC_DATA_ACCpojo(String P_PMC , String P_DLR_CD , String P_LOC_CD) {
		this.P_PMC = P_PMC;
		this.P_DLR_CD = P_DLR_CD;
		this.P_LOC_CD = P_LOC_CD;

	}

	// P_DATE

	public String getP_PMC() {
		return P_PMC;
	}

	public void setP_PMC(String P_PMC) {
		this.P_PMC = P_PMC;
	}

	
	
	// P_DLR_CD

	public String getP_DLR_CD() {
		return P_DLR_CD;
	}

	public void setP_DLR_CD(String P_DLR_CD) {
		this.P_DLR_CD = P_DLR_CD;
	}
	
	
	// P_LOC_CD

	public String getP_LOC_CD() {
		return P_LOC_CD;
	}

	public void setP_LOC_CD(String P_LOC_CD) {
		this.P_LOC_CD = P_LOC_CD;
	}

}
