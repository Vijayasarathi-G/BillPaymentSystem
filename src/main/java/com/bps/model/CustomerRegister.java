package com.bps.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_register")
public class CustomerRegister {
	@Id
	@Column(name="customer_id")
	private int customer_id;
	@Column(name="customer_name")
	private String customer_name;
	@Column(name="customer_address")
	private String customer_address;
	@Column(name="customer_contact_number")
	private int customer_contact_number;
	@Column(name="customer_country")
	private String customer_country;
	@Column(name="customer_state")
	private String customer_state;
	@Column(name="customer_mail_id")
	private String customer_mail_id;
	@Column(name="customer_identification_document")
	private String customer_identification_document;
	@Column(name="customer_document_number")
	private String customer_document_number;
	@Column(name="customer_register_date")
	private String customer_register_date;
	@Column(name="customer_vendor_type")
	private String customer_vendor_type;
	@Column(name="customer_card_no")
	private String customer_card_no;
	@Column(name="customer_balance")
	private float customer_balance;


	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	public int getCustomer_contact_number() {
		return customer_contact_number;
	}
	public void setCustomer_contact_number(int customer_contact_number) {
		this.customer_contact_number = customer_contact_number;
	}
	public String getCustomer_country() {
		return customer_country;
	}
	public void setCustomer_country(String customer_country) {
		this.customer_country = customer_country;
	}
	public String getCustomer_state() {
		return customer_state;
	}
	public void setCustomer_state(String customer_state) {
		this.customer_state = customer_state;
	}
	public String getCustomer_mail_id() {
		return customer_mail_id;
	}
	public void setCustomer_mail_id(String customer_mail_id) {
		this.customer_mail_id = customer_mail_id;
	}
	public String getCustomer_identification_document() {
		return customer_identification_document;
	}
	public void setCustomer_identification_document(String customer_identification_document) {
		this.customer_identification_document = customer_identification_document;
	}
	public String getCustomer_document_number() {
		return customer_document_number;
	}
	public void setCustomer_document_number(String customer_document_number) {
		this.customer_document_number = customer_document_number;
	}
	public String getCustomer_register_date() {
		return customer_register_date;
	}
	public void setCustomer_register_date(String customer_register_date) {
		this.customer_register_date = customer_register_date;
	}

	public String getCustomer_vendor_type() {
		return customer_vendor_type;
	}
	public void setCustomer_vendor_type(String customer_vendor_type) {
		this.customer_vendor_type = customer_vendor_type;
	}
	public String getCustomer_card_no() {
		return customer_card_no;
	}
	public void setCustomer_card_no(String customer_card_no) {
		this.customer_card_no = customer_card_no;
	}
	public float getCustomer_balance() {
		return customer_balance;
	}
	public void setCustomer_balance(float customer_balance) {
		this.customer_balance = customer_balance;
	}


}
