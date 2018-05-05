package com.bps.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bps.model.Customer;


@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	SessionFactory sf;
	
	@Override
	public Customer saveupdate(Customer customer_register) {
		Session session = sf.openSession();
		session.update(customer_register);
		
		return customer_register;
	}

	public boolean CustomerDataInsert(Customer s) {
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
	
	public boolean customerDataUpdate(Customer customerRegister) {
		boolean status=true;
		Session session=sf.openSession();
		try {
		session.update(customerRegister);
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
