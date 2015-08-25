package com.verizon.ves.ui;

public class Ordering {
	
	String lineofbusiness;
	CustomerDetails customerdetails;
	OrderDetails orderdetails;
	ContractDetails contractdetails;
	public Ordering(String lineofbusiness, CustomerDetails customerdetails,
			OrderDetails orderdetails, ContractDetails contractdetails) {
		super();
		this.lineofbusiness = lineofbusiness;
		this.customerdetails = customerdetails;
		this.orderdetails = orderdetails;
		this.contractdetails = contractdetails;
	}
	public String getLineofbusiness() {
		return lineofbusiness;
	}
	public void setLineofbusiness(String lineofbusiness) {
		this.lineofbusiness = lineofbusiness;
	}
	public CustomerDetails getCustomerdetails() {
		return customerdetails;
	}
	public void setCustomerdetails(CustomerDetails customerdetails) {
		this.customerdetails = customerdetails;
	}
	public OrderDetails getOrderdetails() {
		return orderdetails;
	}
	public void setOrderdetails(OrderDetails orderdetails) {
		this.orderdetails = orderdetails;
	}
	public ContractDetails getContractdetails() {
		return contractdetails;
	}
	public void setContractdetails(ContractDetails contractdetails) {
		this.contractdetails = contractdetails;
	}


}
