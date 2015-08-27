package com.verizon.ves.webservice.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.verizon.ves.restclient.OrderManagementRestClient;
import com.verizon.ves.ui.CustomerDetails;
import com.verizon.ves.ui.Ordering;


@WebServlet("/CheckNewUserServlet")
public class CheckNewUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL = "http://192.168.1.27:8080/OrderManagement/rest/om/profilePull/email/";  
   
    public CheckNewUserServlet() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		HttpSession session=request.getSession();
		System.out.println(email);
		String emailJson = "{\"email\":\""+email+"\"}";
		String profilePullURL = URL+email;
		String outputJson = "null";
				new OrderManagementRestClient().callServiceGET(profilePullURL);
		
				
		System.out.println(outputJson);
		
		
		if(outputJson.equals("null"))
		{
			session.setAttribute("customertype", "new");
			response.sendRedirect("home.jsp");
			
		}
		else
		{
			session.setAttribute("customertype", "registered");
			CustomerDetails customerdetails = new Gson().fromJson(outputJson, CustomerDetails.class); 
			customerdetails.setCustomertype("registered");
			session.setAttribute("customerdetails", customerdetails);
			response.sendRedirect("home.jsp");
		}
		
	}

}
