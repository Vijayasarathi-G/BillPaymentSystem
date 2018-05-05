package com.bps.service;

import com.bps.model.Customer;

public interface CustomerService {
		
	public Customer saveupdate(Customer customerRegister);

	public boolean customerDataInsert(Customer s);

	public boolean customerDataUpdate(Customer cs);

}
