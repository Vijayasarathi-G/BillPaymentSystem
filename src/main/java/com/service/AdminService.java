package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminDao;
import com.model.AdminModel;

@Service
public class AdminService {
	
	@Autowired
	AdminDao ad;

	public boolean checkAdminLogin(AdminModel admin) {
		// TODO Auto-generated method stub
		return ad.checkAdminLogin(admin);
	}
	
	
}

