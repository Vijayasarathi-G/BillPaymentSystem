package com.bps.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name="vendor_details")
public class Vendor {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int vendor_id;
	private int company_reg_no;
	private String vendor_type;
	private String address;
	private String country;
	private String state;
	private String email_address;
	private int contact_number;
	private String website;
	private Date certificate_issued_date;
	private Date certificate_validity_date;
	private long employees_count;
	private long customer_count;
	private int year_of_establishment;
	
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	public int getCompany_reg_no() {
		return company_reg_no;
	}
	public void setCompany_reg_no(int company_reg_no) {
		this.company_reg_no = company_reg_no;
	}
	public String getVendor_type() {
		return vendor_type;
	}
	public void setVendor_type(String vendor_type) {
		this.vendor_type = vendor_type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public int getContact_number() {
		return contact_number;
	}
	public void setContact_number(int contact_number) {
		this.contact_number = contact_number;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public Date getCertificate_issued_date() {
		return certificate_issued_date;
	}
	public void setCertificate_issued_date(Date certificate_issued_date) {
		this.certificate_issued_date = certificate_issued_date;
	}
	public Date getCertificate_validity_date() {
		return certificate_validity_date;
	}
	public void setCertificate_validity_date(Date certificate_validity_date) {
		this.certificate_validity_date = certificate_validity_date;
	}
	public long getEmployees_count() {
		return employees_count;
	}
	public void setEmployees_count(long employees_count) {
		this.employees_count = employees_count;
	}
	public long getCustomer_count() {
		return customer_count;
	}
	public void setCustomer_count(long customer_count) {
		this.customer_count = customer_count;
	}
	public int getYear_of_establishment() {
		return year_of_establishment;
	}
	public void setYear_of_establishment(int year_of_establishment) {
		this.year_of_establishment = year_of_establishment;
	}
	
	
	
}
