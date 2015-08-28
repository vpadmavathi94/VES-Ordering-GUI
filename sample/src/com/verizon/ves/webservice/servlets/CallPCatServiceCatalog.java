package com.verizon.ves.webservice.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.verizon.ves.restclient.RESTClient;

public class CallPCatServiceCatalog extends HttpServlet {
	private static final long serialVersionUID = 1L;
//private static final String urlPcat =       "http://192.168.1.64:4782/PCatServiceCatalog/api/VES/";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//    url: "http://192.168.1.64:4782/PCatServiceCatalog/api/VES/"+
		//document.getElementById("pstate").value+"&"+service
		String st = request.getParameter("pstate");
		String service = request.getParameter("pService");
		
		String str = st+"&" +service;
		//System.out.println("data"+ str);
		String pList = null;
	    RESTClient rs=new RESTClient();
	    pList = rs.callPCatURL(str);
	    System.out.println( "pList "+ pList);
	    PrintWriter out = response.getWriter();
	    out.println( pList );
	    out.flush();
	        
	}

}
