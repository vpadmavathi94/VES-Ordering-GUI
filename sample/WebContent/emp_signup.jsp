<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <head>
        <title>Sign-up</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <link rel="shortcut icon" href="img/favicon.png">
		<!-- Bootstrap CSS -->    
  
	<link href="css/signup.css" rel="stylesheet" />
		<link href="css/logintab.css" rel="stylesheet" />
		<link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="css/elegant-icons-style.css" rel="stylesheet" />
    <link href="css/font-awesome.css" rel="stylesheet" />
	
<script type="text/javascript">

function register_form()
{
	var pass1 = document.getElementById("pwd").value;
    var pass2 = document.getElementById("pwd2").value;
	
	var name = document.getElementById("ename").value;
    var id = document.getElementById("e_id").value;
	var pwd1 = document.getElementById("pwd").value;
    var pwd2 = document.getElementById("pwd2").value;

	
	
	if(name==""||id==""||pwd1==""||pwd2=="")
	{
		alert("Atleast one field is empty!");
		return false;
	}
    else{   
			 if (/\d/.test(name)) 
			{
				alert("Name should not contain numbers");
				return false;
			}
			else
			{
			if(pass1.length<8)
			{
				alert("Password should be minimum 8 characters");
				return false;
			}
			else
			{
				if(!document.getElementById("agree").checked)
				{
					document.getElementById("agrv").innerHTML="You have to certify that you are an employee";
					return false;
				}
				else{
					if (pass1 != pass2) 
					{
						alert("Passwords Do Not Match!!!");
						return false;
					}
					else
					{
						alert("Signup successful..Redirecting to login page.");
						return true;
					}
				}
			}
			}
			
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

      <form class="login-form" align="center" action="login.html" onSubmit='return register_form();'> 
	 
        <div class="login-wrap">
          <pre>  
			<table width=300>
            	<tr><td>Employee Name *</td><td><input type="text" id="ename" name="ename" /><span id="namev"></span></td></tr>
				<tr><td>Employee ID *</td><td><input type="text" id="e_id" name="e_id" /> </p><span id="idv"></span></div></td></tr>
				<tr><td>Password *</td><td><input type="password" id="pwd" name="password1" /></div></td></tr>
				<tr><td>Repeat Password *</td><td><input type="password" id="pwd2" name="password2" /></div></td></tr>
            	<tr><td colspan=2><label class="checkbox"><input type="checkbox" id="agree" value=""/><span id="agrv"></span><label>* I am an employee of ABC</label></td></tr>
				<tr><td colspan=2><input class="btn btn-info btn-lg btn-block" type="submit" value="Sign Up"  /></td></tr>
            </table>	
       </pre> 
	    </div>
		
      </form>

    </div>
	
    </body>
</html>





