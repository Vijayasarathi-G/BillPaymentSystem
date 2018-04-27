package com.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.AdminModel;

@Repository
public class AdminDao {
	@Autowired
	SessionFactory sf;
	
	public boolean loginCheck(AdminModel ad) {
		
		
		
		
		return true;
	}
	
	
}

