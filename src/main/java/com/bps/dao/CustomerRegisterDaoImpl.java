package com.bps.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bps.model.CustomerRegister;
import com.bps.repository.CustomerRepository;
import com.bps.repository.VendorRepository;

@Repository
public class CustomerRegisterDaoImpl implements CustomerDao {
   
//	@Autowired
//    CustomerRepository customerRepository;
//	
	@Autowired
	SessionFactory sf;
	
	@Override
	public CustomerRegister saveupdate(CustomerRegister customer_register, Long id) {
		Session session = sf.openSession();
		session.update(customer_register);
		
		return customer_register;
	}

}
