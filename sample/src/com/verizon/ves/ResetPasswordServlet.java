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


@WebServlet("/ResetPasswordServlet")
public class ResetPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection;   

    public ResetPasswordServlet() {
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
  		String newPassword=request.getParameter("newPassword");
  	
  		HttpSession session = request.getSession();
  		String emp_id=(String)session.getAttribute("emp_id");

  		System.out.println("\nforgot pwd:"+emp_id);
          
  		try {
  			PreparedStatement ps=connection.prepareStatement("update sales_employee set password=? where emp_id=? ");
  			ps.setString(1, newPassword);
  			ps.setString(2, emp_id);
  		
  			ResultSet rs= ps.executeQuery();
  		
  			if(rs.next())
  			{       
  					response.sendRedirect("index.jsp");
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
