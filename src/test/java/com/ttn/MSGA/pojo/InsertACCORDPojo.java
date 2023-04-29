package com.ttn.MSGA.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * @author Deepanshu Tyagi
 *
 */

public class InsertACCORDPojo {

	private String P_PARENT_GROUP;
	private String P_DEALER_MAP_CD;
	private String P_LOC_CD;
	private String P_ENQ_NUM;
	private String P_ORDER_DATE;             	
	private String P_CUST_FNAME;	
	private String P_CUST_MNAME;
	private String P_CUST_LNAME;
	private String P_PHONE;
	private String P_EMAIL;
	private String P_ADDRESS1;
	private String P_ADDRESS2;
	private String P_ADDRESS3;	
	private String P_STATE;
	private String P_CITY;
	private String P_PIN;         
	private String P_REMARKS;
	private String P_SOURCE;	
	private String P_MODE;
	private String P_APPOINT_DATE;
	private String P_APPOINT_TIME;
	private String P_STATUS;	
	private String P_FITMENT_STATUS;
	private String P_ORDER_TYPE;
	private String P_PAYMENT_MODE;
	private String P_AMT_PAID;
	private String P_TOTAL_AMT;
	private String P_ACC_PART_DTL;
	private String P_PG_Tracking_Id;
	private String P_PG_Bank_Ref_No;		
	private String P_PG_Order_Status;
	private String P_PG_Payment_Mode;	
	private String P_PG_Payment_Amount;
	private String P_Loyalty_Points;
	private String P_Loyalty_Amount;
	private String P_Loyalty_Transaction_Status;
	private String P_ORDER_NUM;
	private String P_WEB_ORDER_NUM;
	private String P_MSPIN;
	private String P_PG_Booking_Cancellation;

	/* 
	 * @param 
	 */

	public InsertACCORDPojo(String P_PARENT_GROUP , String P_DEALER_MAP_CD , String P_LOC_CD, String P_ENQ_NUM , String P_ORDER_DATE , String P_CUST_FNAME , String P_CUST_MNAME , String P_CUST_LNAME , String P_PHONE , String P_EMAIL , String P_ADDRESS1 , String P_ADDRESS2, String P_ADDRESS3 , String P_STATE , String P_CITY , String P_PIN , String P_REMARKS , String P_SOURCE ,String P_MODE , String P_APPOINT_DATE , String P_APPOINT_TIME , String P_STATUS , 
			String P_FITMENT_STATUS , String P_ORDER_TYPE, String P_PAYMENT_MODE , String P_AMT_PAID , String P_TOTAL_AMT , String P_ACC_PART_DTL , String P_PG_Tracking_Id , String P_PG_Bank_Ref_No ,String P_PG_Order_Status , String P_PG_Payment_Mode, String P_PG_Payment_Amount , String P_Loyalty_Points , String P_Loyalty_Amount , String P_Loyalty_Transaction_Status , String P_ORDER_NUM , String P_WEB_ORDER_NUM , String P_MSPIN , String P_PG_Booking_Cancellation) {
		
		this.P_PARENT_GROUP = P_PARENT_GROUP;
		this.P_DEALER_MAP_CD = P_DEALER_MAP_CD;
		this.P_LOC_CD = P_LOC_CD;		
		this.P_ENQ_NUM = P_ENQ_NUM;		
		this.P_ORDER_DATE = P_ORDER_DATE;
		this.P_CUST_FNAME = P_CUST_FNAME;
		this.P_CUST_MNAME = P_CUST_MNAME;
		this.P_CUST_LNAME = P_CUST_LNAME;
		this.P_PHONE = P_PHONE;				
		this.P_EMAIL = P_EMAIL;
		this.P_ADDRESS1 = P_ADDRESS1;
		this.P_ADDRESS2 = P_ADDRESS2;		
		this.P_ADDRESS3 = P_ADDRESS3;
		this.P_STATE = P_STATE;		
		this.P_CITY = P_CITY;
		this.P_PIN = P_PIN;
		this.P_REMARKS = P_REMARKS;
		this.P_SOURCE = P_SOURCE;			
		this.P_MODE = P_MODE;
		this.P_APPOINT_DATE = P_APPOINT_DATE;
		this.P_APPOINT_TIME = P_APPOINT_TIME;		
		this.P_STATUS = P_STATUS;		
		this.P_FITMENT_STATUS = P_FITMENT_STATUS;
		this.P_ORDER_TYPE = P_ORDER_TYPE;		
		this.P_PAYMENT_MODE = P_PAYMENT_MODE;
		this.P_AMT_PAID = P_AMT_PAID;
		this.P_TOTAL_AMT = P_TOTAL_AMT;
		this.P_ACC_PART_DTL = P_ACC_PART_DTL;
		this.P_PG_Tracking_Id = P_PG_Tracking_Id;
		this.P_PG_Bank_Ref_No = P_PG_Bank_Ref_No;		
		this.P_PG_Order_Status = P_PG_Order_Status;	
		this.P_PG_Payment_Mode = P_PG_Payment_Mode;		
		this.P_PG_Payment_Amount = P_PG_Payment_Amount;
		this.P_Loyalty_Points = P_Loyalty_Points;		
		this.P_Loyalty_Amount = P_Loyalty_Amount;		
		this.P_Loyalty_Transaction_Status = P_Loyalty_Transaction_Status;
		this.P_ORDER_NUM = P_ORDER_NUM;
		this.P_WEB_ORDER_NUM = P_WEB_ORDER_NUM;
		this.P_MSPIN = P_MSPIN;
		this.P_PG_Booking_Cancellation = P_PG_Booking_Cancellation;

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

		
		
		// P_ORDER_DATE-----5

		public String getP_ORDER_DATE() {
			return P_ORDER_DATE;
		}

		public void setP_ORDER_DATE(String P_ORDER_DATE) {
			this.P_ORDER_DATE = P_ORDER_DATE;
		}
		
		
		// P_CUST_FNAME

		public String getP_CUST_FNAME() {
			return P_CUST_FNAME;
		}

		public void setP_CUST_FNAME(String P_CUST_FNAME) {
			this.P_CUST_FNAME = P_CUST_FNAME;
		}

		
		// P_CUST_MNAME

		public String getP_CUST_MNAME() {
			return P_CUST_MNAME;
		}

		public void setP_CUST_MNAME(String P_CUST_MNAME) {
			this.P_CUST_MNAME = P_CUST_MNAME;
		}

		
		
		// P_CUST_LNAME

		public String getP_CUST_LNAME() {
			return P_CUST_LNAME;
		}

		public void setP_CUST_LNAME(String P_CUST_LNAME) {
			this.P_CUST_LNAME = P_CUST_LNAME;
		}
		
		
		// P_PHONE

		public String getP_PHONE() {
			return P_PHONE;
		}

		public void setP_PHONE(String P_PHONE) {
			this.P_PHONE = P_PHONE;
		}

	
		
				

		// P_PARENT_GROUP

		public String getP_EMAIL() {
			return P_EMAIL;
		}

		public void setP_EMAIL(String P_EMAIL) {
			this.P_EMAIL = P_EMAIL;
		}

		
		
		// P_ADDRESS1

		public String getP_ADDRESS1() {
			return P_ADDRESS1;
		}

		public void setP_ADDRESS1(String P_ADDRESS1) {
			this.P_ADDRESS1 = P_ADDRESS1;
		}
		
		
		// P_ADDRESS2

		public String getP_ADDRESS2() {
			return P_ADDRESS2;
		}

		public void setP_ADDRESS2(String P_ADDRESS2) {
			this.P_ADDRESS2 = P_ADDRESS2;
		}
		
		
		// P_ADDRESS3

			public String getP_ADDRESS3() {
				return P_ADDRESS3;
			}

			public void setP_ADDRESS3(String P_ADDRESS3) {
				this.P_ADDRESS3 = P_ADDRESS3;
			}

			
			
			// P_STATE

			public String getP_STATE() {
				return P_STATE;
			}

			public void setP_STATE(String P_STATE) {
				this.P_STATE = P_STATE;
			}
			
			
			// P_CITY

			public String getP_CITY() {
				return P_CITY;
			}

			public void setP_CITY(String P_CITY) {
				this.P_CITY = P_CITY;
			}

			
			// P_PIN

			public String getP_PIN() {
				return P_PIN;
			}

			public void setP_PIN(String P_PIN) {
				this.P_PIN = P_PIN;
			}

			
			
			// P_REMARKS

			public String getP_REMARKS() {
				return P_REMARKS;
			}

			public void setP_REMARKS(String P_REMARKS) {
				this.P_REMARKS = P_REMARKS;
			}
			
			
			// P_SOURCE

			public String getP_SOURCE() {
				return P_SOURCE;
			}

			public void setP_SOURCE(String P_SOURCE) {
				this.P_SOURCE = P_SOURCE;
			}
			
			

			
			// P_MODE

			public String getP_MODE() {
				return P_MODE;
			}

			public void setP_MODE(String P_MODE) {
				this.P_MODE = P_MODE;
			}

			
			
			// P_APPOINT_DATE

			public String getP_APPOINT_DATE() {
				return P_APPOINT_DATE;
			}

			public void setP_APPOINT_DATE(String P_APPOINT_DATE) {
				this.P_APPOINT_DATE = P_APPOINT_DATE;
			}
			
			
			// P_APPOINT_TIME

			public String getP_APPOINT_TIME() {
				return P_APPOINT_TIME;
			}

			public void setP_APPOINT_TIME(String P_APPOINT_TIME) {
				this.P_APPOINT_TIME = P_APPOINT_TIME;
			}

			

			
			// P_STATUS

			public String getP_STATUS() {
				return P_STATUS;
			}

			public void setP_STATUS(String P_STATUS) {
				this.P_STATUS = P_STATUS;
			}

			
			// P_FITMENT_STATUS

			public String getP_FITMENT_STATUS() {
				return P_FITMENT_STATUS;
			}

			public void setP_FITMENT_STATUS(String P_FITMENT_STATUS) {
				this.P_FITMENT_STATUS = P_FITMENT_STATUS;
			}
			
			
			// P_ORDER_TYPE

			public String getP_ORDER_TYPE() {
				return P_ORDER_TYPE;
			}

			public void setP_ORDER_TYPE(String P_ORDER_TYPE) {
				this.P_ORDER_TYPE = P_ORDER_TYPE;
			}
			

			
			// P_PAYMENT_MODE

			public String getP_PAYMENT_MODE() {
				return P_PAYMENT_MODE;
			}

			public void setP_PAYMENT_MODE(String P_PAYMENT_MODE) {
				this.P_PAYMENT_MODE = P_PAYMENT_MODE;
			}

		
			
			// P_AMT_PAID

			public String getP_AMT_PAID() {
				return P_AMT_PAID;
			}

			public void setP_AMT_PAID(String P_AMT_PAID) {
				this.P_AMT_PAID = P_AMT_PAID;
			}
			

			
			// P_TOTAL_AMT

			public String getP_TOTAL_AMT() {
				return P_TOTAL_AMT;
			}

			public void setP_TOTAL_AMT(String P_TOTAL_AMT) {
				this.P_TOTAL_AMT = P_TOTAL_AMT;
			}

			
	
			
			// P_ACC_PART_DTL

			public String getP_ACC_PART_DTL() {
				return P_ACC_PART_DTL;
			}

			public void setP_ACC_PART_DTL(String P_ACC_PART_DTL) {
				this.P_ACC_PART_DTL = P_ACC_PART_DTL;
			}
			
			
			// P_PG_Tracking_Id

			public String getP_PG_Tracking_Id() {
				return P_PG_Tracking_Id;
			}

			public void setP_PG_Tracking_Id(String P_PG_Tracking_Id) {
				this.P_PG_Tracking_Id = P_PG_Tracking_Id;
			}
			
			
			// P_PG_Bank_Ref_No

			public String getP_PG_Bank_Ref_No() {
				return P_PG_Bank_Ref_No;
			}

			public void setP_PG_Bank_Ref_No(String P_PG_Bank_Ref_No) {
				this.P_PG_Bank_Ref_No = P_PG_Bank_Ref_No;
			}
					
			
			
			// P_PG_Order_Status

			public String getP_PG_Order_Status() {
				return P_PG_Order_Status;
			}

			public void setP_PG_Order_Status(String P_PG_Order_Status) {
				this.P_PG_Order_Status = P_PG_Order_Status;
			}
			
			
			// P_PG_Payment_Mode

			public String getP_PG_Payment_Mode() {
				return P_PG_Payment_Mode;
			}

			public void setP_PG_Payment_Mode(String P_PG_Payment_Mode) {
				this.P_PG_Payment_Mode = P_PG_Payment_Mode;
			}
			

			
			// P_PG_Payment_Amount

			public String getP_PG_Payment_Amount() {
				return P_PG_Payment_Amount;
			}

			public void setP_PG_Payment_Amount(String P_PG_Payment_Amount) {
				this.P_PG_Payment_Amount = P_PG_Payment_Amount;
			}

		
			
			// P_Loyalty_Points

			public String getP_Loyalty_Points() {
				return P_Loyalty_Points;
			}

			public void setP_Loyalty_Points(String P_Loyalty_Points) {
				this.P_Loyalty_Points = P_Loyalty_Points;
			}
			

			
			// P_Loyalty_Amount

			public String getP_Loyalty_Amount() {
				return P_Loyalty_Amount;
			}

			public void setP_Loyalty_Amount(String P_Loyalty_Amount) {
				this.P_Loyalty_Amount = P_Loyalty_Amount;
			}

			
	
			
			// P_Loyalty_Transaction_Status

			public String getP_Loyalty_Transaction_Status() {
				return P_Loyalty_Transaction_Status;
			}

			public void setP_Loyalty_Transaction_Status(String P_Loyalty_Transaction_Status) {
				this.P_Loyalty_Transaction_Status = P_Loyalty_Transaction_Status;
			}
			
			
			// P_ORDER_NUM

			public String getP_ORDER_NUM() {
				return P_ORDER_NUM;
			}

			public void setP_ORDER_NUM(String P_ORDER_NUM) {
				this.P_ORDER_NUM = P_ORDER_NUM;
			}
			
			
			// P_WEB_ORDER_NUM

			public String getP_WEB_ORDER_NUM() {
				return P_WEB_ORDER_NUM;
			}

			public void setP_WEB_ORDER_NUM(String P_WEB_ORDER_NUM) {
				this.P_WEB_ORDER_NUM = P_WEB_ORDER_NUM;
			}
			
			
			// P_MSPIN

			public String getP_MSPIN() {
				return P_MSPIN;
			}

			public void setP_MSPIN(String P_MSPIN) {
				this.P_MSPIN = P_MSPIN;
			}
			
			
			// P_WEB_ORDER_NUM

			public String getP_PG_Booking_Cancellation() {
				return P_PG_Booking_Cancellation;
			}

			public void setP_PG_Booking_Cancellation(String P_PG_Booking_Cancellation) {
				this.P_PG_Booking_Cancellation = P_PG_Booking_Cancellation;
			}

}
