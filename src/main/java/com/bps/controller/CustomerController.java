package com.bps.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bps.model.Customer;
import com.bps.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/updateCustomer", method = RequestMethod.PUT)
	public String update(@Valid @RequestBody Customer customerRegister) {
		boolean status = customerService.customerDataUpdate(customerRegister);
		if (status) {
			return "Update Successfully";
		} else {
			return "Update not Successfully";
		}

	}

	@RequestMapping("/registercustomer")
	public String registerData(@Valid @RequestBody Customer customerRegister) {

		boolean status = customerService.customerDataInsert(customerRegister);
		if (status) {
			return "Register Successfully";
		} else {
			return "Register Failed";
		}
	}

	@PutMapping("/customer_update")
	public Customer saveUpdate(@Valid @RequestBody Customer customerRegister) {
		return customerService.saveupdate(customerRegister);
		// return null;
	}

}
