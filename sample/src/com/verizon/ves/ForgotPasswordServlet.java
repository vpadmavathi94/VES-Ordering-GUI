package com.verizon.ves;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ForgotPasswordServlet")
public class ForgotPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection;   
     public ForgotPasswordServlet()
     {
        super();
       
     }
     
     @Override
 	public void init(ServletConfig config) throws ServletException {
 		// TODO Auto-generated method stub
 		super.init(config);


 		try {
 			Class.forName("oracle.jdbc.driver.OracleDriver");
 			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","password");
 			System.out.println("connection established!!");
 		} catch (ClassNotFoundException e) {
 			
 			e.printStackTrace();
 		} catch (SQLException e) {
 			
 			e.printStackTrace();
 		}
 	
 		
 	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String emp_id=request.getParameter("emp_id");
		String emp_name=request.getParameter("emp_name");
		HttpSession session = request.getSession();
		session.setAttribute("emp_id",emp_id);
		session.setAttribute("emp_name",emp_name);
		System.out.println("\nforgot pwd:"+emp_id+"\n"+emp_name);
        
		try {
			PreparedStatement ps=connection.prepareStatement("select * from sales_employee where emp_id=? and emp_name=?");
			ps.setString(1, emp_id);
			ps.setString(2, emp_name);
		
			ResultSet rs= ps.executeQuery();
		
			if(rs.next())
			{
					response.sendRedirect("ResetPassword.jsp");
			}
			else
			{
				response.sendRedirect("error.jsp");
			}
		
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	
		
		

		
	}

}
