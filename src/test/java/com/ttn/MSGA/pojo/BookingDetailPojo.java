package com.ttn.MSGA.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * @author Deepanshu Tyagi
 *
 */

public class BookingDetailPojo {

	private String P_PARENT_GROUP;
	private String P_DEALER_MAP_CD;
	private String P_LOC_CD;
	private String P_ENQ_NUM;
	private String P_BOOKING_ID;
	private String P_STATUS;
	private String P_REFUND_AMT;

	/* 
	 * @param P_PMC
	 */

	public BookingDetailPojo(String P_PARENT_GROUP , String P_DEALER_MAP_CD , String P_LOC_CD , String P_ENQ_NUM , String P_BOOKING_ID , String P_STATUS, String P_REFUND_AMT) {
		this.P_PARENT_GROUP = P_PARENT_GROUP;
		this.P_DEALER_MAP_CD = P_DEALER_MAP_CD;
		this.P_LOC_CD = P_LOC_CD;
		this.P_ENQ_NUM = P_ENQ_NUM;
		this.P_BOOKING_ID = P_BOOKING_ID;
		this.P_STATUS = P_STATUS;
		this.P_REFUND_AMT = P_REFUND_AMT;

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
	
	
	// P_ENQ_NUM
		public String getP_ENQ_NUM() {
			return P_ENQ_NUM;
		}

		public void setP_ENQ_NUM(String P_ENQ_NUM) {
			this.P_ENQ_NUM = P_ENQ_NUM;
		}

		
		
		// P_BOOKING_ID

		public String getP_BOOKING_ID() {
			return P_BOOKING_ID;
		}

		public void setP_BOOKING_ID(String P_BOOKING_ID) {
			this.P_BOOKING_ID = P_BOOKING_ID;
		}
		
		
		// P_STATUS

		public String getP_STATUS() {
			return P_STATUS;
		}

		public void setP_STATUS(String P_STATUS) {
			this.P_STATUS = P_STATUS;
		}
		
		
		// P_REFUND_AMT

		public String getP_REFUND_AMT() {
		return P_REFUND_AMT;
	    }

		public void setP_REFUND_AMT(String P_REFUND_AMT) {
		this.P_REFUND_AMT = P_REFUND_AMT;
		}

}
