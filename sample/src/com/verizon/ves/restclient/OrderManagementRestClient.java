package com.verizon.ves.restclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class OrderManagementRestClient {


	
	public String callService(String input, String currentURL) {
   	 String output=null;
       try {
           URL insertUrl = new URL(currentURL);           
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

       return output;
		
       }




}
