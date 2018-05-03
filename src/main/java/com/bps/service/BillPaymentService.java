package com.bps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bps.dao.BillPaymentDao;
import com.bps.model.BillPaymentModel;



@Service
public class BillPaymentService {
	@Autowired
	BillPaymentDao billPaymentDao;
	

	public String billPaymentService(BillPaymentModel billpayment) {
	/*
		cr.setCustomer_id(101);*/
		billpayment.setAmountToPay(1000);
		billpayment.setBillpaymentID(1);
		billpayment.setCardType("credit");
		billpayment.setConfirmCardnumber(54566589);
		billpayment.setCreditMM(12);
		billpayment.setCreditYYYY(2018);
		billpayment.setCvv(345);
		
		//billpayment.setPaymentDate(paymentDate);
		/*Vendor vendor=new Vendor();
		vendor.*/
		
		//billpayment.setCustomerRegister(cr);
		
		return billPaymentDao.billPayment(billpayment);
		
	}
}
