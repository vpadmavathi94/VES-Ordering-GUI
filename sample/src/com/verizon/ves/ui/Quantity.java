package com.verizon.ves.ui;

public class Quantity {
	
	int max;
	int current;
	int toprovision;
	
	
	public Quantity(int max, int current, int toprovision) {
		super();
		this.max = max;
		this.current = current;
		this.toprovision = toprovision;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public int getToprovision() {
		return toprovision;
	}
	public void setToprovision(int toprovision) {
		this.toprovision = toprovision;
	}

	
}
 