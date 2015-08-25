public class Customer {
	
	private String customertype;
	private String customerid;
	private String lineofbusiness;	
	private String fname;
	private String lname;		
	private Address connectionaddress;
	private Address billingaddress;	
	private String email;
	private String contactnumber;
	private String dateofbirth;
	
	public Customer(String customertype, String customerid,
			String fname, String lname,	Address connectionaddress,
			Address billingaddress, String email,
			String contactnumber, String dateofbirth) {
		super();
		this.customertype = customertype;
		this.customerid = customerid;
		this.lineofbusiness = "ves";
		this.fname = fname;
		this.lname = lname;
		this.connectionaddress = connectionaddress;
		this.billingaddress = billingaddress;
		this.email = email;
		this.contactnumber = contactnumber;
		this.dateofbirth = dateofbirth;
	}
	//getter and setter methods
}
