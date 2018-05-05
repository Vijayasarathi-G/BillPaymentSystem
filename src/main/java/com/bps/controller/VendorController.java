package com.bps.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bps.model.CompanyRegistration;
import com.bps.model.Vendor;
import com.bps.service.VendorService;

@RestController
@RequestMapping("/vendor")
public class VendorController {

	@Autowired
	VendorService vendorService;

	@RequestMapping("/saveVendor")
	public Vendor createVendor(@Valid @RequestBody Vendor cus) {
		return vendorService.saveVendor(cus);
	}

	@RequestMapping("/countryList")
	public List<Vendor> countryList() {
		return vendorService.countryList();
	}
	
	@RequestMapping("/stateList/{country}")
	public List<Vendor> stateList(@PathVariable("country") String country) {
		return vendorService.stateList(country);
	}
	
	@RequestMapping(value = "/getVendor/{id}")
	public List<Vendor> getVendorInfo(@PathVariable("id") int id) {

		return vendorService.getVendorService(id);
	}

	@RequestMapping(value = "/updateVendor", method = RequestMethod.PUT)
	public String updateVendorInfo(@RequestBody Vendor vendorDetails) {

		return vendorService.updateVendorService(vendorDetails);
	}
	
	@RequestMapping("/companyRegistrationNo")
	public List<CompanyRegistration> companyRegistration() {
		return vendorService.companyRegistrationNo();
	}
	
	@RequestMapping("/vendorType/{registrationNo}")
	public List<CompanyRegistration> vendorType(@PathVariable("registrationNo") int registrationNo) {
		return vendorService.getVendorType(registrationNo);
	}
	
}
