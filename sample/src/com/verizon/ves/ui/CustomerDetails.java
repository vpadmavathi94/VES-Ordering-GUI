package com.verizon.ves.ui;


public class CustomerDetails {
	
	String customertype;
	String fname;
	String lname;
	Address connectionaddress;
	Address billingaddress;
	String email;
	String contactnumber;
	String dateofbirth =null;
	public CustomerDetails(String customertype, String fname, String lname,
			Address connectionaddress, Address billingaddress, String email,
			String contactnumber, String dateofbirth) {
		super();
		this.customertype = customertype;
		this.fname = fname;
		this.lname = lname;
		this.connectionaddress = connectionaddress;
		this.billingaddress = billingaddress;
		this.email = email;
		this.contactnumber = contactnumber;
		this.dateofbirth = dateofbirth;
	}
	public String getCustomertype() {
		return customertype;
	}
	public void setCustomertype(String customertype) {
		this.customertype = customertype;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Address getConnectionaddress() {
		return connectionaddress;
	}
	public void setConnectionaddress(Address connectionaddress) {
		this.connectionaddress = connectionaddress;
	}
	public Address getBillingaddress() {
		return billingaddress;
	}
	public void setBillingaddress(Address billingaddress) {
		this.billingaddress = billingaddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	
	
	

}
