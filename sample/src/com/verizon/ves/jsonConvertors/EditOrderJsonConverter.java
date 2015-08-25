package com.verizon.ves.jsonConvertors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class EditOrderJsonConverter {
	
	private static final String editOrderURL = "http://192.168.1.23:8080/OMTest/rest/profilepull/email";
	
	public String sendContractid(String input) {
   	 String output=null;
       try {
           URL insertUrl = new URL(editOrderURL);           
           HttpURLConnection httpConnection = (HttpURLConnection) insertUrl.openConnection();
           httpConnection.setDoOutput(true);
           httpConnection.setRequestMethod("POST");
           httpConnection.setRequestProperty("Content-Type", "application/json");                
           OutputStream outputStream = httpConnection.getOutputStream();
           outputStream.write(input.getBytes());
           outputStream.flush();
           
           if (httpConnection.getResponseCode() != 200) {
               throw new RuntimeException("Failed : HTTP error code : "
                   + httpConnection.getResponseCode());
           }

           BufferedReader responseBuffer = new BufferedReader(new InputStreamReader(
                   (httpConnection.getInputStream())));
          
           System.out.println("Output from Server:\n");
           while ((output = responseBuffer.readLine()) != null) {
               System.out.println(output);
           }
           httpConnection.disconnect();
         } catch (MalformedURLException e) {
           e.printStackTrace();
         } catch (IOException e) {
           e.printStackTrace();
        }
       if(output!=null)
       	return output;
       else
       	return null;
		
       }

}
