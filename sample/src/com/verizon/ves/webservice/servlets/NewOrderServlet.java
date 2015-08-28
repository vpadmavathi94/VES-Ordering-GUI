package com.verizon.ves.webservice.servlets;
import java.io.IOException;
import java.io.PrintWriter;







import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.verizon.ves.dao.EnterpriseOrderDAO;
import com.verizon.ves.restclient.OrderManagementRestClient;
import com.verizon.ves.ui.Address;
import com.verizon.ves.ui.ContractDetails;
import com.verizon.ves.ui.CustomerDetails;
import com.verizon.ves.ui.EnterpriseOrder;
import com.verizon.ves.ui.OrderDetails;
import com.verizon.ves.ui.Ordering;
import com.verizon.ves.ui.Quantity;
import com.verizon.ves.ui.Services;
import com.verizon.ves.ui.SwitchCaseClass;


@WebServlet("/NewOrderServlet")
public class NewOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String orderingURL = "http://192.168.1.27:8080/OrderManagement/rest/om/submitorder";

    public NewOrderServlet() {
        super();
        
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session=request.getSession();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Calendar calendar = Calendar.getInstance();
		
		String sysdate = sdf.format(calendar.getTime());



		String bstreetname = request.getParameter("bstreetname");
		String bzipcode = request.getParameter("bzipcode");
		String bcity = request.getParameter("bcity");		
		String bstate = request.getParameter("bstate");
		int bstateid = Integer.parseInt(new SwitchCaseClass().StateName(bstate));
		String bcountry = "USA";
		Address billingaddress = new Address(bstreetname,bzipcode,bcity,bstate,bstateid,bcountry);
		
		String cstreetname = request.getParameter("cstreetname");
		String czipcode = request.getParameter("czipcode");
		String ccity = request.getParameter("ccity");		
		String cstate = request.getParameter("cstate");
		int cstateid = Integer.parseInt(new SwitchCaseClass().StateName(cstate));
		String ccountry = "USA";
		Address connectionaddress = new Address(cstreetname,czipcode,ccity,cstate,cstateid,ccountry);
		
		String customertype ="new";
		String customerid ="null";
		String fname = request.getParameter("firstname");  
		String lname = "null";
		String email = request.getParameter("email");
		String dateofbirth = "null";
		String contactnumber = request.getParameter("contactnumber");
		
		CustomerDetails customerdetails = new CustomerDetails(customertype,customerid, fname, lname, billingaddress, connectionaddress, email, dateofbirth, contactnumber);
		
		
		int max = Integer.parseInt((String)request.getParameter("max"));
		int current = (int)(0.25*max);
		Quantity quantity = new Quantity(max,current);
		
		Services[] services = new Services[1];
		String servicecode = request.getParameter("servicecode");
		String servicename = new SwitchCaseClass().serviceName(servicecode);
		services[0] = new Services(servicecode, servicename, quantity);
		
		String orderid ="null";
		String duedate ="null"; 
		String dateofbooking = sysdate;
		
		
		String contractid ="null";
		String modeltype = request.getParameter("modeltype");
		String classofservice = request.getParameter("classofservice");
		
		
		if(classofservice.equals(""))
		  calendar.add(Calendar.DATE, 3); 
		else if(classofservice.equals(""))
			calendar.add(Calendar.DATE, 7); 	
		else if(classofservice.equals(""))
			calendar.add(Calendar.DATE, 11); 	
		else if(classofservice.equals(""))
			calendar.add(Calendar.DATE, 15); 	
		else 
		  calendar.add(Calendar.DATE, 20); 	
		
		duedate = sdf.format(calendar.getTime());
		OrderDetails orderdetails = new OrderDetails(orderid,dateofbooking, duedate, services);
		
		String fromdate =request.getParameter("fromdate");
		String todate = request.getParameter("todate");
		int discountpercentage = Integer.parseInt((String)request.getParameter("discountpercentage"));
		String change ="null";
		ContractDetails[] contractdetails = new ContractDetails[1];
		contractdetails[0] = new ContractDetails(contractid, modeltype, classofservice, fromdate, todate, discountpercentage, change);
		
		String lineofbusiness = request.getParameter("lineofbusiness");
		Ordering ordering = new Ordering(lineofbusiness, customerdetails, orderdetails, contractdetails);
		
		
		PrintWriter out = response.getWriter();  
		Gson gson = new Gson();
		String orderingJson = gson.toJson(ordering);
						
		System.out.println(orderingJson);
		
		String outputJson = new OrderManagementRestClient().callService(orderingJson, orderingURL);
		
		//write if else for outputJson
		if(outputJson.equals("null"))
		{
			session.setAttribute("orderingstatus", "failed");
		}
		
		else
		{
			session.setAttribute("orderingstatus", "success");
			
			EnterpriseOrder enterpriseOrder=gson.fromJson(outputJson, EnterpriseOrder.class);
			customerid = enterpriseOrder.getCustomerid();
			contractid = enterpriseOrder.getContractid();
			orderid = enterpriseOrder.getOrderid();
			
			boolean status = new EnterpriseOrderDAO().NewOrder(orderid, contractid, customerid, email);
			
			ordering.getCustomerdetails().setCustomerid(customerid);
			ordering.getContractdetails()[0].setContractid(contractid);
			ordering.getOrderdetails().setOrderid(orderid);
			
			session.setAttribute("ordering", ordering);
			response.sendRedirect("ordersummary.jsp");
			
			
			
		}
		

	}		
}