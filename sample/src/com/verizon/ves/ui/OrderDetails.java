package com.verizon.ves.ui;

import java.util.Date;

public class OrderDetails {
	
	Date dateofbooking;
	Date duedate;
	Services[] services;
	public OrderDetails(Date dateofbooking, Date duedate, Services[] services) {
		super();
		this.dateofbooking = dateofbooking;
		this.duedate = duedate;
		this.services = services;
	}
	public Date getDateofbooking() {
		return dateofbooking;
	}
	public void setDateofbooking(Date dateofbooking) {
		this.dateofbooking = dateofbooking;
	}
	public Date getDuedate() {
		return duedate;
	}
	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}
	public Services[] getServices() {
		return services;
	}
	public void setServices(Services[] services) {
		this.services = services;
	}
	
	
	
}
