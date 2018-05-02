package com.bps.service;

import java.util.List;

import com.bps.model.Vendor;
import com.bps.model.VendorDto;

public interface VendorService {

	public Vendor saveVendor(Vendor emp);
	
	List<Vendor> getVendorService(int id);

	String updateVendorService(VendorDto vendorDetails);
	
}

