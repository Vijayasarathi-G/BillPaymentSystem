package com.bps.dao;

import java.util.List;

import com.bps.model.Vendor;
import com.bps.model.VendorDto;

public interface VendorDao {

	List<Vendor> getVendorDao(int id);

	String updateVendorDao(VendorDto vendorDetails);

	Vendor saveVendor(Vendor emp);
	
}

