package com.bps.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bps.model.CustomerRegister;
import com.bps.service.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController 
{
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/Update",method=RequestMethod.GET)
	public String update() {
		CustomerRegister cs=new CustomerRegister();
		boolean status=customerService.customerDataUpdate(cs);
		if(status) {
			return "Update Successfully";
		}else {
			return "Update not Successfully";
		}
		
	}
	
	@RequestMapping("/registercustomer")
	public String registerData(){
		
		CustomerRegister s=new CustomerRegister();
		boolean status=customerService.customerDataInsert(s);
				if(status) {
					return "Register Successfully";
				}
				else {
				return "Register Failed";
				}
	}

	
	@PutMapping("/customer_update/{id}/")
	public CustomerRegister saveUpdate(@Valid @RequestBody CustomerRegister customer_register,@PathVariable ("id") Long id) 
	{
	return customerService.saveupdate(customer_register,id);
//		return null;
	}
	
}


