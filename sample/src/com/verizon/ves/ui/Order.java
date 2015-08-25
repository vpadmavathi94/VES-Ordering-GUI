package com.verizon.ves.ui;

public class Order {

	String orderid;
	Ordering ordering;
	 
	public Order(String orderid, Ordering ordering) {
		super();
		this.orderid = orderid;
		this.ordering = ordering;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public Ordering getOrdering() {
		return ordering;
	}
	public void setOrdering(Ordering ordering) {
		this.ordering = ordering;
	}

}
