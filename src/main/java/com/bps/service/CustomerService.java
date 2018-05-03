package com.bps.service;

import com.bps.model.CustomerRegister;

public interface CustomerService {
	
	
	public CustomerRegister saveupdate(CustomerRegister customerRegister,Long id);

	public boolean customerDataInsert(CustomerRegister s);

	public boolean customerDataUpdate(CustomerRegister cs);

}
