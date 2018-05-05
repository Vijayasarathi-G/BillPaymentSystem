package com.bps.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bps.dao.CustomerDao;
import com.bps.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	
		
	public boolean customerDataUpdate(Customer customerRegister) {
		SimpleDateFormat n= new SimpleDateFormat("yyyy-MM-dd hh:mm");
//		s.setCustomer_address("Chennai");
//		s.setCustomer_balance(2500.0f);
//		s.setCustomer_card_no("887452");
//		s.setCustomer_contact_number(258745);
//		s.setCustomer_country("India");
//		s.setCustomer_document_number("98989898");
//		s.setCustomer_id(101);
//		s.setCustomer_identification_document("887456");
//		s.setCustomer_mail_id("sasi@gmail.com");
//		s.setCustomer_name("Muthu Kumar");
//		s.setCustomer_register_date(n.format(new Date()));
//		s.setCustomer_state("Tamil Nadu");
//		s.setCustomer_vendor_type("Telephone");
		return customerDao.customerDataUpdate(customerRegister);
	}
	
	public boolean customerDataInsert(Customer s) {
//		SimpleDateFormat n= new SimpleDateFormat("yyyy-MM-dd hh:mm");
//		s.setCustomer_address("Chennai");
//		s.setCustomer_balance(2500.0f);
//		s.setCustomer_card_no("887452");
//		s.setCustomer_contact_number(258745);
//		s.setCustomer_country("India");
//		s.setCustomer_document_number("98989898");
//		s.setCustomer_id(101);
//		s.setCustomer_identification_document("887456");
//		s.setCustomer_mail_id("muthu@gmail.com");
//		s.setCustomer_name("Muthu Kumar");
//		s.setCustomer_register_date(n.format(new Date()));
//		s.setCustomer_state("Tamil Nadu");
//		s.setCustomer_vendor_type("Telephone");
		return customerDao.CustomerDataInsert(s);
	}
	
	@Override
	public Customer saveupdate(Customer customer_register) {
		// TODO Auto-generated method stub
		return customerDao.saveupdate(customer_register);
	}

	
}
