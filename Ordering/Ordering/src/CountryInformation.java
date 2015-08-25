
import java.io.IOException;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
 

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

 
@SuppressWarnings("unused")
@WebServlet("/CountryInformation")
public class CountryInformation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost( request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email_dummy = request.getParameter("cust_name");
		String email="{\"email\":\""
				+ email_dummy + "}";
		System.out.println(email);
        PrintWriter out = response.getWriter();
         
        
        
        /***
         *  On pressing Submit button,
         *  You have to call the webservice of OrderManagement and with input param as customer name and 
         *  get output json string as customer Information.
         *  if the json string is empty then display  register.html
         *  if the json string contains data display the customer details.
         *  Instead of Country class you will get directly a Json String
         */
        Gson gson = new Gson(); 
        JsonObject myObj = new JsonObject();
 
        String cust_info = null;
        RESTClient rs=new RESTClient();
        cust_info = rs.insert(email);
        System.out.println(cust_info);
        JsonElement countryObj = gson.toJsonTree(cust_info);
        if((cust_info != null)){
            myObj.addProperty("success", true);
        }
        else {
            myObj.addProperty("success", false);
        }
        myObj.add("cust_info", countryObj);
        System.out.println(myObj.toString());
        out.println(myObj.toString());
 
        out.close();
 		 
	}	//Get Country Information
  
}
