package com.verizon.ves.restclient;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
 
public class RESTClient {

    private static final String pCatURL = "http://192.168.1.64:4782/PCatServiceCatalog/api/VES";
    
     
    public String callPCatURL(String input) {
    	 String output="";
    	 String op = null;
        try {
        	System.out.println("data cc"+ input);
        	String url = pCatURL + "/"+input;
        	System.out.println(url);
            URL insertUrl = new URL(url);           
            HttpURLConnection httpConnection = (HttpURLConnection) insertUrl.openConnection();
            httpConnection.setDoOutput(true);
            httpConnection.setRequestMethod("GET");
            httpConnection.setRequestProperty("Content-Type", "application/json");
          
            //OutputStream outputStream = httpConnection.getOutputStream();
            //outputStream.write(input.getBytes());
            //outputStream.flush();
            
            if (httpConnection.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                    + httpConnection.getResponseCode());
            }

            BufferedReader responseBuffer = new BufferedReader(new InputStreamReader(
                    (httpConnection.getInputStream())));
           
            System.out.println("Output from Server:\n");
            while ((op = responseBuffer.readLine()) != null) {
            	output = output+op;
                System.out.println(output);
            }
            httpConnection.disconnect();
          } catch (MalformedURLException e) {
            e.printStackTrace();
          } catch (IOException e) {
            e.printStackTrace();
         }
        //if(output!=null)
        //	return output;
        //else
        	return output;
		
        }
    
}