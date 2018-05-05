package com.bps.dao;

import java.util.List;

import com.bps.model.CompanyRegistration;
import com.bps.model.Vendor;

public interface VendorDao {

	List<Vendor> getVendorDao(int id);

	String updateVendorDao(Vendor vendorDetails);

	Vendor saveVendor(Vendor emp);

	List<Vendor> countryList();

	List<Vendor> stateList(String country);

	List<CompanyRegistration> companyRegistrationNo();

	List<CompanyRegistration> getVendorType(int registrationNo);
	
}

