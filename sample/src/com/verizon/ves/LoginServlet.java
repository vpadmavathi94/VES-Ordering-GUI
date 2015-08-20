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


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection; 
    public LoginServlet() {
        
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
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		HttpSession session = request.getSession();
		session.setAttribute("userName",userName);
		session.setAttribute("password",password);
		System.out.println("\n"+userName+"\n"+password);
        
		try {
			PreparedStatement ps=connection.prepareStatement("select * from sales_employee where emp_name=? and password=?");
			ps.setString(1, userName);
			ps.setString(2, password);
		
			ResultSet rs= ps.executeQuery();
		
			if(rs.next())
			{
					response.sendRedirect("home.jsp");
			}
			else
			{
				response.sendRedirect("error.jsp");
			}
		
		} 
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		
	}

}
