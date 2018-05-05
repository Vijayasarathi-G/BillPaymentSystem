package com.bps.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company_registration")
public class CompanyRegistration {
	@Id
	private int company_registration_number;
	private String vendor_name;
	private String vendor_type;
		
	public int getCompany_registration_number() {
		return company_registration_number;
	}
	public void setCompany_registration_number(int company_registration_number) {
		this.company_registration_number = company_registration_number;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getVendor_type() {
		return vendor_type;
	}
	public void setVendor_type(String vendor_type) {
		this.vendor_type = vendor_type;
	}
	
}

