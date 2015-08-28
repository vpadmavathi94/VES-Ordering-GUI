package com.verizon.ves.restclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

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

	public String callServiceGET(String currentURL) throws IOException {
	   	
		String outputJson = null;
	   	int responseCode = 0;
		
						
		URL url = new URL(currentURL);
		HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
		httpConnection.connect();
		responseCode = httpConnection.getResponseCode();
		if (responseCode == 200) {
			BufferedReader br = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
			String str = "";
			StringBuilder responseJson = new StringBuilder();
			while ((str = br.readLine()) != null) {
				
				responseJson.append(str);
			}
			JsonReader jsonReader = Json.createReader(new StringReader(new String(responseJson)));
			JsonObject jsonObj = jsonReader.readObject();
			jsonReader.close();
			outputJson = jsonObj.toString();
			//System.out.println(jsonObj.toString());
		}

	      return outputJson;
			
	  }



}
