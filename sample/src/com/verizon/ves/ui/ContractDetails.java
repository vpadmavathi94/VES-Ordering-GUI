package com.verizon.ves.ui;


public class ContractDetails {
	
	String contractid;
	String modeltype;
	String classofservice;
	String fromdate;
	String todate;
	int discountpercentage;
	int change;
	public ContractDetails(String contractid, String modeltype,
			String classofservice, String fromdate, String todate,
			int discountpercentage, int change) {
		super();
		this.contractid = contractid;
		this.modeltype = modeltype;
		this.classofservice = classofservice;
		this.fromdate = fromdate;
		this.todate = todate;
		this.discountpercentage = discountpercentage;
		this.change = change;
	}
	public String getContractid() {
		return contractid;
	}
	public void setContractid(String contractid) {
		this.contractid = contractid;
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
	public String getFromdate() {
		return fromdate;
	}
	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}
	public String getTodate() {
		return todate;
	}
	public void setTodate(String todate) {
		this.todate = todate;
	}
	public int getDiscountpercentage() {
		return discountpercentage;
	}
	public void setDiscountpercentage(int discountpercentage) {
		this.discountpercentage = discountpercentage;
	}
	public int getChange() {
		return change;
	}
	public void setChange(int change) {
		this.change = change;
	}
	@Override
	public String toString() {
		return "ContractDetails [contractid=" + contractid + ", modeltype="
				+ modeltype + ", classofservice=" + classofservice
				+ ", fromdate=" + fromdate + ", todate=" + todate
				+ ", discountpercentage=" + discountpercentage + ", change="
				+ change + "]";
	}
	
	
	


}
