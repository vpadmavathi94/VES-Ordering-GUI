package com.verizon.ves.ui;

public class Address {
	
	 String streetname ;
	 String zipcode ;
	 String city ;
	 String state ;
	 int stateid ;
	 String country ; 
	 
	 
	
	 public Address(String streetname, String zipcode, String city,
			String state, int stateid, String country) {
		super();
		this.streetname = streetname;
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
		this.stateid = stateid;
		this.country = country;
	}

	public String getStreetname() {
			return streetname;
		}

		public void setStreetname(String streetname) {
			this.streetname = streetname;
		}

		public String getZipcode() {
			return zipcode;
		}

		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public int getStateid() {
			return stateid;
		}

		public void setStateid(int stateid) {
			this.stateid = stateid;
		}
		
	
}
