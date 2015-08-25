$(document).ready(function() {
	
    //Stops the submit request
    $("#myAjaxRequestForm").submit(function(e){
           e.preventDefault();
    });
    $("#editRequest").submit(function(e){
        e.preventDefault();
 });
    
    //checks for the button click event
    $("#myButton").click(function(e){
         
            //get the form data and then serialize that
            dataString = $("#myAjaxRequestForm").serialize();
            
            //get the form data using another method
            var cust_name = $("input#cust_name").val();
            dataString = "cust_name=" + cust_name;
       
            
            //make the AJAX request, dataType is set to json
            //meaning we are expecting JSON data in response from the server
            $.ajax({
                type: "POST",
                url: "CountryInformation",
                data: dataString,
                dataType: "json",
                
                //if received a response from the server
                success: function( data, textStatus, jqXHR) {
                    //our country code was correct so we have some information to display
                     if(data.success){
                    	
                     $("#ajaxResponse").html("");
                     $("#ajaxResponse").append("<b>Customer Name:</b> " + data.cust_info.cust_name + "<BR/>");
                    
                     $("#ajaxResponse").append("<b>Billing Address:</b> " + data.cust_info.ba + "<BR/>");
                     
                     $("#ajaxResponse").append("<b>Email Address:</b> " + data.cust_info.ea + "<BR/>");
                     
                     $("#ajaxResponse").append("<b>Contact Number:</b> " + data.cust_info.ca + "<BR/>");
                     
                    
                     
                     $("#ajaxResponse").append("<b>Pincode</b> <input type=\"text\" name=\"pincode\" <br/>");
                     
                     $("#ajaxResponse").append(" <input type=\"button\" name=\"submit\" value=\"search\" <br/>");
                     }
                     //display error message
                     else {
                         $("#ajaxResponse").html("<div><b>Enter the information below</b></div>");
                         $("#ajaxResponse").load("register.html");
                         
               }
                },
                
                //If there was no resonse from the server
                error: function(jqXHR, textStatus, errorThrown){
                     console.log("Something really bad happened " + textStatus);
                      $("#ajaxResponse").html(jqXHR.responseText);
                },
                
                //capture the request before it was sent to server
                beforeSend: function(jqXHR, settings){
                    //adding some Dummy data to the request
                    settings.data += "&dummyData=whatever";
                    //disable the button until we get the response
                    $('#myButton').attr("disabled", true);
                },
                
                //this is called after the response or error functions are finsihed
                //so that we can take some action
                complete: function(jqXHR, textStatus){
                    //enable the button
                    $('#myButton').attr("disabled", false);
                }
      
            });       
    });
    $("#editbutton").click(function(e){
        
        //get the form data and then serialize that
        dataString = $("#editRequest").serialize();
        
        //get the form data using another method
        var orderID = $("input#orderID").val();
        dataString = "orderID=" + orderID;
   
        
        //make the AJAX request, dataType is set to json
        //meaning we are expecting JSON data in response from the server
        $.ajax({
            type: "POST",
            url: "OrderInformation",
            data: dataString,
            dataType: "json",
            
            //if received a response from the server
            success: function( data, textStatus, jqXHR) {
                //our country code was correct so we have some information to display
                 if(data.success){
                	
                 $("#editResponse").html("");
                 $("#editResponse").append("Increase/Decrease No Of lines <br><table> <tr> <td><table> <tr><td> Access               :</td><td><input type=\"text\"  /></td></tr><tr><td>PIP                  :</td><td><input type=\"text\"  /></td> </tr><tr><td> Internet Dedicated   :</td><td><input type=\"text\"  /></td> </tr> </table>");
                 $("#editResponse").append("<input type=\"button\" value=\"Confirm\/>");
                 }
                 //display error message
                 else {
           
                     $("#editResponse").append("<b>Something wrong</b> ");
                   

           }
            },
            
            //If there was no resonse from the server
            error: function(jqXHR, textStatus, errorThrown){
                 console.log("Something really bad happened " + textStatus);
                  $("#editResponse").html(jqXHR.responseText);
            },
            
            //capture the request before it was sent to server
            beforeSend: function(jqXHR, settings){
                //adding some Dummy data to the request
                settings.data += "&dummyData=whatever";
                //disable the button until we get the response
                $('#editbutton').attr("disabled", true);
            },
            
            //this is called after the response or error functions are finsihed
            //so that we can take some action
            complete: function(jqXHR, textStatus){
                //enable the button
                $('#editbutton').attr("disabled", false);
            }
  
        });       
});
 
});