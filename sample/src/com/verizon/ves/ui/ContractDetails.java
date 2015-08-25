package com.verizon.ves.ui;

import java.util.Date;

public class ContractDetails {
	
	String modeltype;
	String classofservice;
	Date fromdate;
	Date todate;
	int discountpercentage;
	
	public ContractDetails(String modeltype, String classofservice,
			Date fromdate, Date todate, int discountpercentage) {
		super();
		this.modeltype = modeltype;
		this.classofservice = classofservice;
		this.fromdate = fromdate;
		this.todate = todate;
		this.discountpercentage = discountpercentage;
	}
	public String getModeltype() {
		return modeltype;
	}
	public void setModeltype(String modeltype) {
		this.modeltype = modeltype;
	}
	public String getClassofservice() {
		return classofservice;
	}
	public void setClassofservice(String classofservice) {
		this.classofservice = classofservice;
	}
	public Date getFromdate() {
		return fromdate;
	}
	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}
	public Date getTodate() {
		return todate;
	}
	public void setTodate(Date todate) {
		this.todate = todate;
	}
	public int getDiscountpercentage() {
		return discountpercentage;
	}
	public void setDiscountpercentage(int discountpercentage) {
		this.discountpercentage = discountpercentage;
	}
	
	
	


}
