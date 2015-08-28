<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <link rel="shortcut icon" href="img/favicon.png">

    <title>Charts | Creative - Bootstrap 3 Responsive Admin Template</title>

    <!-- Bootstrap CSS -->    
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="css/elegant-icons-style.css" rel="stylesheet" />
    <link href="css/font-awesome.min.css" rel="stylesheet" />    
    <!-- Custom styles -->
    <link href="css/style.css" rel="stylesheet">
    <link href="css/style-responsive.css" rel="stylesheet" />

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
      <script src="js/lte-ie7.js"></script>
    <![endif]-->
	<script>
	function visibility_div(){
	document.getElementById("details").style.visibility="visible";
	}
	</script>
	
  </head>

  <body>
  <!-- container section start -->
  <!--section id="container" class=""-->
  
      <!--main content start-->      
      <section id="main-content">
        <section class="wrapper">
		<div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="icon_piechart"></i>ORDER STATUS</h3>
					
				</div>
			</div>
            <div>
				<form action="OrderStatusServlet" method="post">
					<pre>
							Order ID : <input type="submit" id="orderid" >		<input type="button" class="btn btn-success" id="searchbutton"value="Search" onclick="visibility_div()">
							
							<%
							if(((String)session.getAttribute("querying")).equals("success"))
							{
								int orderstatus =Integer.parseInt((String)session.getAttribute("orderstatus"));
								
							%>
								<input type="text" id="search" style="visibility:hidden" value=<%= orderstatus %> />
							<%
							}
			 				%>
							
					</pre>
				</form>
			
			<div id="details" style="visibility:hidden" >
					<div >
					<section class="panel"><canvas id="doughnut" height="200" width="300"></canvas> 
					<table>
					<tr>
					<td><b>Status : </b><div id="status"></div></td>	
					</tr>
					</table>
					<br>
																									
							
					</section>
					
					</div>
			</div>
			</div>
			
      <!--/section-->
      <!--main content end-->
    </section>
    <!-- container section end -->
    <!-- javascripts -->
    <script src="js/jquery.js"></script>
    <script src="js/jquery-1.8.3.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <!-- nice scroll -->
    <script src="js/jquery.scrollTo.min.js"></script>
    <script src="js/jquery.nicescroll.js" type="text/javascript"></script>
    <!-- chartjs -->
    <script src="assets/chart-master/Chart.js"></script>
    <!-- custom chart script for this page only-->
    <script src="js/chartjs-custom.js"></script>
    <!--custome script for all page-->
    <script src="js/scripts.js"></script>

  </body>
</html>
