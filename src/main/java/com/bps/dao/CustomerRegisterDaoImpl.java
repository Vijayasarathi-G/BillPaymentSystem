package com.bps.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bps.model.CustomerRegister;


@Repository
public class CustomerRegisterDaoImpl implements CustomerDao {

	@Autowired
	SessionFactory sf;
	
	@Override
	public CustomerRegister saveupdate(CustomerRegister customer_register, Long id) {
		Session session = sf.openSession();
		session.update(customer_register);
		
		return customer_register;
	}

	public boolean CustomerDataInsert(CustomerRegister s) {
		boolean status=true;
		Session session=sf.openSession();
		try {
		session.save(s);
		}
		catch(Exception e) {
			System.out.println("Exception to insert "+e);
			status=false;
		}
		
		Transaction t=session.beginTransaction();
		t.commit();
		return status;
		
	}
	
	public boolean customerDataUpdate(CustomerRegister s) {
		boolean status=true;
		Session session=sf.openSession();
		try {
		session.update(s);
		}
		catch(Exception e) {
			System.out.println("Exception to insert "+e);
			status=false;
		}
		
		Transaction t=session.beginTransaction();
		t.commit();
		return status;
		
	}
}
