function alert1(temp)
{
	alert(document.getElementById("pstate").value);
	alert(temp.id);
	if(temp.id=="prod1")
	{service="internetdedicated";}
	else if(temp.id=="prod2")
		{service="pip";}
	else if(temp.id=="prod3")
	{service="internetdedicated&pip";}
	else if(temp.id=="prod4")
	{service="access";
	alert(service);}
	else if(temp.id=="prod5")
	{service="pip&access";}
	else if(temp.id=="prod6")
	{service="access&internetdedicated";}
	else if(temp.id=="prod7")
	{service="access&pip&internetdedicated";}
		
	
	
		
	
	
	
	alert(service);
		//var str="http://localhost:8090/SimpleRESTBasedCommunication/rest/server/"+document.getElementById("state").value+"&"+service;
alert("http://localhost:8090/SimpleRESTBasedCommunication/rest/server/"+document.getElementById("pstate").value+"&"+service);
		dataString="json";
		//alert(document.getElementById("pstate").value);
		$.ajax({
            type: "POST",
            url: "http://192.168.1.64:4782/PCatServiceCatalog/api/VES/"+document.getElementById("pstate").value+"&"+service,
            data: dataString,
            dataType: "json",
            
            //if received a response from the server
            success: function( data, textStatus, jqXHR) {
            	alert("helo akash");
                 $("#PL").html("");
                 // console.log( data );
                 str1 = JSON.stringify(data);
                 var obj=JSON.parse(str1);
                 alert(str1);
                // console.log(str1);
               //  console.log( obj.products);
                 //alert(obj.products[1].product_name);
                 var radio="<input type=\"radio\" name=\"product\" value=\"";
                 var radio_next="\"/>";
                 var table_head="<table cellpadding=\"15px\" class=\"product-table\"><tr><td>Select</td><td>Product ID</td><td>Product Name</td><td>Product Description</td><td>Cost</td></tr>";
                 //alert(obj.products.length);
                 med="";
             for(var i=0;i<obj.products.length;i++)
            	 {
            	// alert(i);
                med=med+"<tr><td>"+radio+obj.products[i].product_id+radio_next+"</td><td>"+obj.products[i].product_id+"</td><td>"+obj.products[i].product_name+"</td><td>"+obj.products[i].product_desc+"</td><td>"+obj.products[i].cost+"</td></tr>";
              //$("#PL").append(obj.products[i].product_id);
             // $("#PL").append("</td><td>"+obj.products[i].product_name);
             // $("#PL").append(obj.products[i].product_name);
             // $("#PL").append("</td><td>"+obj.products[i].product_desc);
            //  $("#PL").append(obj.products[i].product_desc);
              //$("#PL").append("</td><td>"+obj.products[i].cost);
              //$("#PL").append(obj.products[i].cost);
           //   $("#PL").append("</td></tr>");
            	 } 
             $("#PL").append(table_head+med+"</table>");
             
            
               // alert(obj.products[0]);
            //  $("#PL").append("<br/>Parsed data<br/>")
                //$("#PL").append(obj.product_id);
              
                 
                 
            },
            
            //If there was no response from the server
            error: function(jqXHR, textStatus, errorThrown){
                 console.log("Something really bad happened " + textStatus);
                  $("#PL").html(jqXHR.responseText);
            }
             
        });       

}

