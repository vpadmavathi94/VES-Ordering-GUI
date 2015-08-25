package com.verizon.ves.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.verizon.ves.jsonConvertors.EditOrderJsonConverter;


@WebServlet("/EditOrderServlet")
public class EditOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EditOrderServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String contractid = request.getParameter("contractid");
		String contractIdJson ="{\"contractid\":\""
		+ contractid + "}";
		Gson gson = new Gson(); 
        JsonObject myObj = new JsonObject();
		EditOrderJsonConverter editOrder=new EditOrderJsonConverter();
		String contractInfo=null;
		contractInfo= editOrder.sendContractid(contractIdJson);
		JsonElement contractDetailsObject = gson.toJsonTree(contractInfo);
		 if((contractInfo != null)){
	            myObj.addProperty("success", true);
	        }
	        else {
	            myObj.addProperty("success", false);
	        }
		myObj.add("contractInfo", contractDetailsObject);
		System.out.println(myObj.toString());
       
		
	}

}
