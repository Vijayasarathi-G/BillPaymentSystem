package com.bps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bps.dao.CustomerDao;
import com.bps.model.CustomerRegister;
@Service
public class Customer_Register_Service_Impl implements CustomerService {

	@Autowired
	CustomerDao customer_dao;
	
	
	@Override
	public CustomerRegister saveupdate(CustomerRegister customer_register, Long id) {
		// TODO Auto-generated method stub
		return customer_dao.saveupdate(customer_register,id);
	}

}
