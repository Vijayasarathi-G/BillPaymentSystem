package com.bps.service;

import java.util.List;

import com.bps.model.CompanyRegistration;
import com.bps.model.Vendor;

public interface VendorService {

	public Vendor saveVendor(Vendor emp);
	
	List<Vendor> getVendorService(int id);

	String updateVendorService(Vendor vendorDetails);

	public List<Vendor> countryList();

	public List<Vendor> stateList(String country);

	public List<CompanyRegistration> companyRegistrationNo();

	public List<CompanyRegistration> getVendorType(int registrationNo);
	
}

