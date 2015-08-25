<html>
<head>
    <title>Customer Information</title>
 
  <!-- 
    <link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" />
   -->  
    <script src="js/jquery-1.9.1.js" type="text/javascript"></script>
    <script type="text/javascript" src="js/app.js"></script>
     <link rel="stylesheet" type="text/css" href="default.css"/>
 
</head>
<body>
 
    <form id="myAjaxRequestForm">
        <fieldset>
            <legend>Customer Information</legend>
 
                <p>
                    <label for="cust_name">Email:</label>
 
                    <input id="cust_name" type="text" name="cust_name" />
                </p>
                <p>
                    <input id="myButton" type="button" value="Submit" />
                </p>
        </fieldset>
    </form>
    <div id="anotherSection">
        <fieldset>
           <!--  <legend>Existing Customers</legend>--> 
                 <div id="ajaxResponse"></div>
        </fieldset>
    </div>  
</body>
</html>