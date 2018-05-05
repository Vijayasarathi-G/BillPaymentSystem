package com.bps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bps.dao.VendorDao;
import com.bps.model.CompanyRegistration;
import com.bps.model.Vendor;

@Service
public class VendorServiceImpl implements VendorService{
	@Autowired
	VendorDao vendorDao;
	
	@Override
	public List<Vendor> getVendorService(int id) {
		
		return vendorDao.getVendorDao(id);
	}
	
	@Override
	public String updateVendorService(Vendor vendorDetails) {
		 return vendorDao.updateVendorDao(vendorDetails);
	}

	@Override
	public Vendor saveVendor(Vendor emp) {
		// TODO Auto-generated method stub
		return vendorDao.saveVendor(emp);
	}

	@Override
	public List<Vendor> countryList() {
		// TODO Auto-generated method stub
		return vendorDao.countryList();
	}

	@Override
	public List<Vendor> stateList(String country) {
		// TODO Auto-generated method stub
		return vendorDao.stateList(country);
	}

	@Override
	public List<CompanyRegistration> companyRegistrationNo() {
		// TODO Auto-generated method stub
		return vendorDao.companyRegistrationNo();
	}

	@Override
	public List<CompanyRegistration> getVendorType(int registrationNo) {
		// TODO Auto-generated method stub
		return vendorDao.getVendorType(registrationNo);
	}
	
}
