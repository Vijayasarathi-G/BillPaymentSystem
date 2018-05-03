package com.bps.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="billpaymenttb")
public class BillPaymentModel {
	@Id
    private int billpaymentID;

   /*	private Customer_Register customerRegister;
	
	private Vendor vendor;*/
    private Date paymentDate;
    private double pendingAmount;
    private double amountToPay;
    private  String cardType;
    private long confirmCardnumber;
    private int creditMM; 
    private int creditYYYY;
    private int cvv;
    public int getBillpaymentID() {
		return billpaymentID;
	}
	public void setBillpaymentID(int billpaymentID) {
		this.billpaymentID = billpaymentID;
	}
																																																																																	
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public double getPendingAmount() {
		return pendingAmount;
	}
	public void setPendingAmount(double pendingAmount) {
		this.pendingAmount = pendingAmount;
	}
	public double getAmountToPay() {
		return amountToPay;
	}
	public void setAmountToPay(double amountToPay) {
		this.amountToPay = amountToPay;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
		public long getConfirmCardnumber() {
		return confirmCardnumber;
	}
	public void setConfirmCardnumber(long confirmCardnumber) {
		this.confirmCardnumber = confirmCardnumber;
	}
	public int getCreditMM() {
		return creditMM;
	}
	public void setCreditMM(int creditMM) {
		this.creditMM = creditMM;
	}
	public int getCreditYYYY() {
		return creditYYYY;
	}
	public void setCreditYYYY(int creditYYYY) {
		this.creditYYYY = creditYYYY;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
  /* 	public Customer_Register getCustomerRegister() {
		return customerRegister;
	}
	public void setCustomerRegister(Customer_Register customerRegister) {
		this.customerRegister = customerRegister;
	}
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}*/
	
}
 
