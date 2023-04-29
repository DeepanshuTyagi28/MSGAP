package com.ttn.MSGA.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * @author Deepanshu Tyagi
 *
 */

public class DealerDetailsPojo {

	private String P_DATE;
	private String P_PMC;

	/* 
	 * @param P_PMC
	 */

	public DealerDetailsPojo(String P_PMC  , String P_DATE) {
		this.P_PMC = P_PMC;
		this.P_DATE = P_DATE;

	}

	// P_PMC

	public String getP_PMC() {
		return P_PMC;
	}

	public void setP_PMC(String P_PMC) {
		this.P_PMC = P_PMC;
	}

	
	
	
	// P_DATE

	public String getP_DATE() {
		return P_DATE;
	}

	public void setP_DATE(String P_DATE) {
		this.P_DATE = P_DATE;
	}

}
