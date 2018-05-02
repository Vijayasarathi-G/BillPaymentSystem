package com.bps.dao;


import java.util.List;
import java.util.Optional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.bps.model.Vendor;
import com.bps.model.VendorDto;
import com.bps.repository.VendorRepository;

@Repository
public class VendorDaoImpl implements VendorDao{
	@Autowired
	SessionFactory sf;
	
//	@Autowired
//	VendorRepository vendorRepository;
	
	@Override
	public Vendor saveVendor(Vendor ven) {
		Session session = sf.openSession();
		System.out.println("new   =="+session.save(ven));
		return ven;
	}

	public List<Vendor> getVendorDao(int id) {
		Session session = sf.openSession();
		Query qry = session.createQuery("from Vendor where vendor_id=?");
		qry.setParameter(0, new Integer(id));
		List<Vendor> vendorList = qry.list();
		System.out.println(vendorList);
		return vendorList;
	}
	
	
	public String updateVendorDao(VendorDto vendorDetails) {
		Session session = sf.openSession();
//		Vendor vendor = vendorRepository.findOne((long) vendorDetails.getVendor_id());
		
		Vendor vendor = (Vendor) session.get(Vendor.class, vendorDetails.getVendor_id());
		Transaction transaction = session.getTransaction();
		if (vendor != null) {
		
			vendor.setVendor_type(vendorDetails.getVendor_type());
			vendor.setCompany_reg_no(vendorDetails.getCompany_reg_no());
			vendor.setAddress(vendorDetails.getAddress());
			vendor.setCountry(vendorDetails.getCountry());
			vendor.setState(vendorDetails.getState());
			vendor.setEmail_address(vendorDetails.getEmail_address());
			vendor.setContact_number(vendorDetails.getContact_number());
			vendor.setWebsite(vendorDetails.getWebsite());
			vendor.setCertificate_issued_date(vendorDetails.getCertificate_issued_date());
			vendor.setCertificate_validity_date(vendorDetails.getCertificate_validity_date());
			vendor.setEmployees_count(vendorDetails.getEmployees_count());
			vendor.setCustomer_count(vendorDetails.getCustomer_count());
			vendor.setYear_of_establishment(vendorDetails.getYear_of_establishment());
			transaction.begin();
			session.update(vendor);
			transaction.commit();
			return "Records Updated Successfully";
		} else {
			return "Unable to update the record";
		}
	}	
}
