package com.bps.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bps.model.CompanyRegistration;
import com.bps.model.Vendor;

@Repository
public class VendorDaoImpl implements VendorDao {
	@Autowired
	SessionFactory sf;
	
//	@Autowired
//	VendorRepository vendorRepository;
	
	@Override
	public Vendor saveVendor(Vendor ven) {
		Session session = sf.openSession();
		session.save(ven);
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
	
	public String updateVendorDao(Vendor vendor) {
		Session session = sf.openSession();
//		Vendor vendor = vendorRepository.findOne((long) vendorDetails.getVendor_id());
//		Vendor vendor = (Vendor) session.get(Vendor.class, vendorDetails.getVendor_id());
//			vendor.setVendor_type(vendorDetails.getVendor_type());
//			vendor.setCompany_reg_no(vendorDetails.getCompany_reg_no());
//			vendor.setAddress(vendorDetails.getAddress());
//			vendor.setCountry(vendorDetails.getCountry());
//			vendor.setState(vendorDetails.getState());
//			vendor.setEmail_address(vendorDetails.getEmail_address());
//			vendor.setContact_number(vendorDetails.getContact_number());
//			vendor.setWebsite(vendorDetails.getWebsite());
//			vendor.setCertificate_issued_date(vendorDetails.getCertificate_issued_date());
//			vendor.setCertificate_validity_date(vendorDetails.getCertificate_validity_date());
//			vendor.setEmployees_count(vendorDetails.getEmployees_count());
//			vendor.setCustomer_count(vendorDetails.getCustomer_count());
//			vendor.setYear_of_establishment(vendorDetails.getYear_of_establishment());
		Transaction transaction = session.getTransaction();
		if (vendor != null) {	
			transaction.begin();
			session.update(vendor);
			transaction.commit();
			return "Records Updated Successfully";
		} else {
			return "Unable to update the record";
		}
		
	}

	@Override
	public List<Vendor> countryList() {
		Session session = sf.openSession();
		Query qry = session.createQuery("from Country group by country_name");
		List<Vendor> countryList = qry.list();
		System.out.println(countryList);
		return countryList;
	}

	@Override
	public List<Vendor> stateList(String country) {
		Session session = sf.openSession();
		Query qry = session.createQuery("from Country where country_name = ?");
		qry.setParameter(0, new String(country));
		List<Vendor> countryList = qry.list();
		System.out.println(countryList);
		return countryList;
	}

	@Override
	public List<CompanyRegistration> companyRegistrationNo() {
		Session session = sf.openSession();
		Query qry = session.createQuery("FROM CompanyRegistration");
		List<CompanyRegistration> countryList = qry.list();
		System.out.println(countryList);
		return countryList;
	}
	

	@Override
	public List<CompanyRegistration> getVendorType(int registrationNo) {
		Session session = sf.openSession();
		Query qry = session.createQuery("FROM CompanyRegistration c where c.company_registration_number = ?");
		qry.setParameter(0, new Integer(registrationNo));
		List<CompanyRegistration> countryList = qry.list();
		System.out.println(countryList);
		return countryList;
	}
	
}
	

