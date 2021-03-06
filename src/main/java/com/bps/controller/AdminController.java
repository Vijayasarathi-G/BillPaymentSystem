package com.bps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bps.model.Admin;
import com.bps.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	AdminService as; 
	
	@RequestMapping("/login")
	public ModelAndView login(Admin admin) {
		ModelAndView mav= null;
		if(as.checkAdminLogin(admin)) {
			mav=new ModelAndView();
		//	mav.setViewName("success.jsp");
			return mav;
		} else {
			mav=new ModelAndView();
			mav.addObject("login", admin);
		//	mav.setViewName("failure.jsp");
			return mav;	
		}
	}
	
}

