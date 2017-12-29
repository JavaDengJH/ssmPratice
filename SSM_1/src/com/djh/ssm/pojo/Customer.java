package com.djh.ssm.pojo;

import java.io.Serializable;

public class Customer implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7578402543833868115L;
	private int customerID;
	private String customerName;
	private String customerPhone;
	private String customerIDCard;
	private String customerPwd;
	
	
	
	public Customer() {
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerIDCard() {
		return customerIDCard;
	}
	public void setCustomerIDCard(String customerIDCard) {
		this.customerIDCard = customerIDCard;
	}
	public String getCustomerPwd() {
		return customerPwd;
	}
	public void setCustomerPwd(String customerPwd) {
		this.customerPwd = customerPwd;
	}
	
	
}
