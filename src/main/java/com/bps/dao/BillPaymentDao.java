package com.bps.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bps.model.BillPaymentModel;


@Repository
public class BillPaymentDao {
	
	
	@Autowired
	SessionFactory sf;
	
	public String billPayment(BillPaymentModel billpayment) {
		Session obj=sf.openSession();
	//	Query qry=obj.createQuery("from BillPaymentModel");
		//List<BillPaymentModel> list=qry.list();
		//System.out.println(list.get(0).getCustomerRegister().getCustomer_id());
		obj.save(billpayment);
		Transaction t=obj.beginTransaction();
		t.commit();
		return "Saved successfully";
			
		
	}
	

	
}
