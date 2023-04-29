package com.ttn.MSGP.pojo;

/*
 * @author Deepanshu Tyagi
 *
 */

public class Get_Esp_Datapojo {

	private String P_PMC;
	private String P_DLR_CD;

	/* 
	 * @param P_PMC
	 */

	public Get_Esp_Datapojo(String P_PMC , String P_DLR_CD ) {
		this.P_PMC = P_PMC;
		this.P_DLR_CD = P_DLR_CD;

	}

	// p_PMC

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
	
	

}
