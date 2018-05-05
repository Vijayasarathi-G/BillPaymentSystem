package com.bps.dao;

import com.bps.model.Customer;

public interface CustomerDao {
	
	
	Customer saveupdate(Customer customer_register);

	boolean customerDataUpdate(Customer s);

	boolean CustomerDataInsert(Customer s);

}
