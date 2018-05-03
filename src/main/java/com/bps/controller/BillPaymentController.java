package com.bps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bps.model.BillPaymentModel;
import com.bps.service.BillPaymentService;




@RestController
public class BillPaymentController {

	@Autowired
	BillPaymentService serv;
	@RequestMapping("/bill")
	public String registerData(){
		BillPaymentModel b=new BillPaymentModel();
		
		String status=serv.billPaymentService(b);
				if(status.equals("Saved successfully")) {
					return "Register Successfully";
				}
				else {
				return "Register Failed";
				}
	}
}
