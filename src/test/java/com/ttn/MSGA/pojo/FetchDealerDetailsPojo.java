package com.ttn.MSGA.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * @author Deepanshu Tyagi
 *
 */

public class FetchDealerDetailsPojo {

	private String p_pmc;
	private String p_for_Cd;
	private String p_mul_dealer_Cd;

	/* 
	 * @param P_PMC
	 */

	public FetchDealerDetailsPojo(String p_pmc , String p_for_Cd , String p_mul_dealer_Cd) {
		this.p_pmc = p_pmc;
		this.p_for_Cd = p_for_Cd;
		this.p_mul_dealer_Cd = p_mul_dealer_Cd;

	}

	// p_pmc

	public String getp_pmc() {
		return p_pmc;
	}

	public void setp_pmc(String p_pmc) {
		this.p_pmc = p_pmc;
	}

	
	
	// p_for_Cd

	public String getp_for_Cd() {
		return p_for_Cd;
	}

	public void setp_for_Cd(String p_for_Cd) {
		this.p_for_Cd = p_for_Cd;
	}
	
	
	// p_mul_dealer_Cd

	public String getp_mul_dealer_Cd() {
		return p_mul_dealer_Cd;
	}

	public void setp_mul_dealer_Cd(String p_mul_dealer_Cd) {
		this.p_mul_dealer_Cd = p_mul_dealer_Cd;
	}

}
