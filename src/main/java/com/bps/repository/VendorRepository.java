package com.bps.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.bps.model.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Long>{
	
}
