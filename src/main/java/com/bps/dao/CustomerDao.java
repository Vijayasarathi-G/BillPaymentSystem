package com.bps.dao;

import com.bps.model.CustomerRegister;

public interface CustomerDao {
	
	
	CustomerRegister saveupdate(CustomerRegister customer_register,Long id);

	boolean customerDataUpdate(CustomerRegister s);

	boolean CustomerDataInsert(CustomerRegister s);

}
