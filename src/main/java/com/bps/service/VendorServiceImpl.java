package com.bps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bps.dao.VendorDao;
import com.bps.model.Vendor;
import com.bps.model.VendorDto;

@Service
public class VendorServiceImpl implements VendorService{
	@Autowired
	VendorDao vendorDao;
	
	@Override
	public List<Vendor> getVendorService(int id) {
		List<Vendor> vendorList = vendorDao.getVendorDao(id);
		return vendorList;
	}
	@Override
	public String updateVendorService(VendorDto vendorDetails) {
		 String  vendorRecord= vendorDao.updateVendorDao(vendorDetails);		 
		 return vendorRecord;
	}

	@Override
	public Vendor saveVendor(Vendor emp) {
		// TODO Auto-generated method stub
		return vendorDao.saveVendor(emp);
	}
	
}
