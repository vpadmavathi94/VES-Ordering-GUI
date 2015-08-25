package com.verizon.ves.servlets;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/server1")
public class Server {

	//example of type=get
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test_plaintext() {
		return "Plain text is sent through GET and JSON text is sent through POST format";
	}
	
	//example of type=post
	@Path("/postcheck1")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String test_jsontext(String str1)
	{
		
		System.out.println(str1);
		String str2 = "{\"name\":\""+str1+ "\""+"}";
		return str2;
	}

}
