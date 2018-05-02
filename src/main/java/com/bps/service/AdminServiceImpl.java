package com.bps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bps.dao.AdminDao;
import com.bps.model.Admin;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminDao admindao;

	public boolean checkAdminLogin(Admin admin) {
		// TODO Auto-generated method stub
		return admindao.checkAdminLogin(admin);
	}
	
	
}

