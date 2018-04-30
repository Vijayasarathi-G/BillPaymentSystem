package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.AdminModel;

@Repository
public class AdminDao {
	@Autowired
	SessionFactory sf;

	public boolean checkAdminLogin(AdminModel admin) {
		Session s=sf.openSession();
		Query qry= s.createQuery("select e from Login e where e.username like ? and e.password like ?");
		qry.setParameter(0, admin.getUsername());
		qry.setParameter(1, admin.getPassword());
		List<?>li=qry.list();
		if(li.size()>0) {
			return true;
		} else {
		return false;
	}

	}	
	
}

