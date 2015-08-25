package com.verizon.ves.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.verizon.ves.ui.Address;
import com.verizon.ves.ui.CustomerDetails;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class NewOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();  
		Gson gson = new Gson();
		
		HttpSession session=request.getSession();
		String fname = request.getParameter("firstname");  
		String lname = null; 
		String customertype = session.getParameter();
		String bstreetname = request.getParameter("bstreet");
		String bzipcode = request.getParameter("bzip");
		String bcity = request.getParameter("bcity");		
		String bstate = request.getParameter("bstate");
		int bstateid = Integer.parseInt((String)request.getParameter("bstate"));
		String bcountry = request.getParameter("bcountry");
		String cstreetname = request.getParameter("cstreet");
		String czipcode = request.getParameter("czip");
		String ccity = request.getParameter("ccity");		
		String cstate = request.getParameter("cstate");
		int cstateid = Integer.parseInt((String)request.getParameter("cstate"));
		String ccountry = request.getParameter("ccountry");
		String email = request.getParameter("email");
		String dateofbirth = null;
		String contactnumber = request.getParameter("contact");
		Address billingaddress = new Address(bstreetname, bzipcode, bcity,bstate, bstateid,bcountry);
		Address connectionaddress = new Address(cstreetname,czipcode,ccity,cstate,cstateid,ccountry);
		CustomerDetails new_cust = new CustomerDetails(customertype, fname, lname,
				 connectionaddress, billingaddress,  email, contactnumber, dateofbirth);
		
		// convert java object to JSON format,
		// and returned as JSON formatted string
		String json = gson.toJson(new_cust);

		/*try {
			//write converted json data to a file named "file.txt"
			 
			FileWriter writer = new FileWriter("c:\\file.txt");
			writer.write(json);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		/* SOAP Client */
		//Test objTest = new Test();	
		
		System.out.println(json);
		RESTClient client = new RESTClient();
		out.print("Inserting data...\n");
		client.insert1(json);		
		out.print("You are successfully registered...");		
	}		
}