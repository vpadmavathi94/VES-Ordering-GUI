<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>`
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <link rel="shortcut icon" href="img/favicon.png">

    <title>Login Page 2 | Creative - Bootstrap 3 Responsive Admin Template</title>

    <!-- Bootstrap CSS -->    
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="css/elegant-icons-style.css" rel="stylesheet" />
    <link href="css/font-awesome.css" rel="stylesheet" />
    <!-- Custom styles -->
    <link href="css/style.css" rel="stylesheet">
    <link href="css/style-responsive.css" rel="stylesheet" />
	<link href="css/logintab.css" rel="stylesheet" />
<script type="text/javascript">

function validate()
{


	var userName = document.getElementById("userName").value;
    var password = document.getElementById("password").value;

	
	
	if(userName==""||password=="")
	{
		document.getElementById("login-error").innerHTML="Atleast one field is empty!";
		return false;
	}
	var emp_id=<%= session.getAttribute("emp_id")%>;
	
		if(emp_id!= null && (<%= session.isNew() %>==false)){
			alert(emp_id+" is your employee id. Please remember");
			return true;
		}
}

</script>

</head>

  <body class="login-img3-body">
	<header id="header">
      
        <nav class="navbar navbar-inverse" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                  
                </div>
				
                <div class="collapse navbar-collapse navbar-right">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="index.html">Home</a></li>
                        <li><a href="about-us.html">About Us</a></li>
                        <li><a href="services.html">Services</a></li>
                        <li><a href="contact-us.html">Contact</a></li>                        
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->
		
    </header><!--/header-->
  
    <div class="container">

      <form class="login-form" action="LoginServlet"  method="post" align="right"> 
	 
        <div class="login-wrap">
            <p class="login-img"><i class="icon_lock_alt"></i></p>
            <div class="input-group">
              <span class="input-group-addon"><i class="icon_profile"></i></span>
              <input type="text" class="form-control" placeholder="Username"  name ="userName" id="userName" autofocus>
            </div>
            <div class="input-group">
                <span class="input-group-addon"><i class="icon_key_alt"></i></span>
                <input type="password" class="form-control" placeholder="Password" name ="password" id="password">
            </div>
			
            <!--  >label class="checkbox">
                <input type="checkbox" value="remember-me">Remember me<span class="pull-right"> <a href="#">&nbsp;&nbsp;&nbsp;Forgot Password?</a></span>
            </label -->
            <span class="pull-right"> <a href="ForgotPassword.jsp">&nbsp;&nbsp;&nbsp;Forgot Password?</a></span>
            <br>
            <br>
            <button class="btn btn-primary btn-lg btn-block " type="submit" onclick="return validate();">Login</button>
            
            <a class="btn btn-info btn-lg btn-block " href="emp_signup.jsp" >New Employee? Register</a>
        	<br>
        	<br>
        	<span id="login-error" style="color:red"></span>
        </div>
		
      </form>

    </div>

 

  </body>
</html>
