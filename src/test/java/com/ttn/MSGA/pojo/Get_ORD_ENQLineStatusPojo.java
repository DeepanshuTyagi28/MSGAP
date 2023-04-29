package com.ttn.MSGA.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * @author Deepanshu Tyagi
 *
 */

public class Get_ORD_ENQLineStatusPojo {

	private String P_PARENT_GROUP;
	private String P_DEALER_MAP_CD;
	private String P_LOC_CD;
	private String P_ENQ_ORDER_NUM;
	private String P_FLAG;
	private String P_START_DATE;	
	private String P_END_DATE;
	
	/* 
	 * @param P_PMC
	 */

	public Get_ORD_ENQLineStatusPojo(String P_PARENT_GROUP , String P_DEALER_MAP_CD , String P_LOC_CD, String P_ENQ_ORDER_NUM , String P_FLAG , String P_START_DATE , String P_END_DATE) {
		
		this.P_PARENT_GROUP = P_PARENT_GROUP;
		this.P_DEALER_MAP_CD = P_DEALER_MAP_CD;
		this.P_LOC_CD = P_LOC_CD;		
		this.P_ENQ_ORDER_NUM = P_ENQ_ORDER_NUM;		
		this.P_FLAG = P_FLAG;
		this.P_START_DATE = P_START_DATE;
		this.P_END_DATE = P_END_DATE;
		
	}

	// P_PARENT_GROUP

	public String getP_PARENT_GROUP() {
		return P_PARENT_GROUP;
	}

	public void setP_PARENT_GROUP(String P_PARENT_GROUP) {
		this.P_PARENT_GROUP = P_PARENT_GROUP;
	}

	
	
	// P_DEALER_MAP_CD

	public String getP_DEALER_MAP_CD() {
		return P_DEALER_MAP_CD;
	}

	public void setP_DEALER_MAP_CD(String P_DEALER_MAP_CD) {
		this.P_DEALER_MAP_CD = P_DEALER_MAP_CD;
	}
	
	
	// P_LOC_CD

	public String getP_LOC_CD() {
		return P_LOC_CD;
	}

	public void setP_LOC_CD(String P_LOC_CD) {
		this.P_LOC_CD = P_LOC_CD;
	}
	
	
	// P_ENQ_ORDER_NUM

		public String getP_ENQ_ORDER_NUM() {
			return P_ENQ_ORDER_NUM;
		}

		public void setP_ENQ_ORDER_NUM(String P_ENQ_ORDER_NUM) {
			this.P_ENQ_ORDER_NUM = P_ENQ_ORDER_NUM;
		}

		
		
		// P_FLAG

		public String getP_FLAG() {
			return P_FLAG;
		}

		public void setP_FLAG(String P_FLAG) {
			this.P_FLAG = P_FLAG;
		}
		
		
		// P_START_DATE

		public String getP_START_DATE() {
			return P_START_DATE;
		}

		public void setP_START_DATE(String P_START_DATE) {
			this.P_START_DATE = P_START_DATE;
		}

		
		// P_END_DATE

		public String getP_END_DATE() {
			return P_END_DATE;
		}

		public void setP_END_DATE(String P_END_DATE) {
			this.P_END_DATE = P_END_DATE;
		}

		
	

}
