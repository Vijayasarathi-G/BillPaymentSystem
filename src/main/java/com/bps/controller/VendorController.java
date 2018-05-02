package com.bps.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bps.model.Vendor;
import com.bps.model.VendorDto;
import com.bps.service.VendorService;


@RestController
@RequestMapping("/vendor")
public class VendorController {

@Autowired
VendorService vendorService;

@PostMapping("/saveVendor")
public Vendor createVendor(@Valid @RequestBody Vendor cus) {
	return vendorService.saveVendor(cus);
}

@RequestMapping(value = "/getVendor/{id}")
public List<Vendor> getVendorInfo(@PathVariable("id") int id) {
		
		return vendorService.getVendorService(id);
	}


@RequestMapping(value = "/updateVendor")
public String updateVendorInfo(@RequestBody VendorDto vendorDetails) {
			
		return vendorService.updateVendorService(vendorDetails);
	}
}
