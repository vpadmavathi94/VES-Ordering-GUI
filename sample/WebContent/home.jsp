<!DOCTYPE html>
<html lang="en">
  <head>
  <script type="text/javascript" src="sliderengine/jquery.js"></script><script type="text/javascript" src="sliderengine/jquery.hislider.js"></script>
  
  
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <link rel="shortcut icon" href="img/favicon.png">

    <title>V Enterprise </title>
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
    <!-- new order css -->
    <!--link href="css/default.css" rel="stylesheet"-->
	<!--main page akash css-->
	<link href="css/main-content.css" rel="stylesheet">
    <!-- Bootstrap CSS -->    
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="css/elegant-icons-style.css" rel="stylesheet" />
    <link href="css/font-awesome.min.css" rel="stylesheet" />    
    <!-- full calendar css-->
    <link href="assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css" rel="stylesheet" />
	<link href="assets/fullcalendar/fullcalendar/fullcalendar.css" rel="stylesheet" />
    <!-- easy pie chart-->
    <link href="assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen"/>
    <!-- owl carousel -->
    <link rel="stylesheet" href="css/owl.carousel.css" type="text/css">
	<link href="css/jquery-jvectormap-1.2.2.css" rel="stylesheet">
    <!-- Custom styles -->
	<link rel="stylesheet" href="css/fullcalendar.css">
	<link href="css/widgets.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link href="css/style-responsive.css" rel="stylesheet" />
	<link href="css/xcharts.min.css" rel=" stylesheet">	
	<link href="css/jquery-ui-1.10.4.min.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
      <script src="js/lte-ie7.js"></script>
    <![endif]-->
  </head>

  <body>
  <!-- container section start -->
  <section id="container" class="">
     
      
      <header class="header dark-bg">
            <div class="toggle-nav">
                <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"></div>
            </div>

            <!--logo start-->
            <a href="home.jsp" class="active"><img alt="no source" src="img/2015logoblack.png" height="60px" width="60px"><span class="lite">   </span></a>
            <!--logo end-->

            <div class="nav search-row" id="top_menu">
                <!--  search form start -->
                <ul class="nav top-menu">                    
                    <li>
                        <form class="navbar-form">
                           <!--  <input class="form-control" placeholder="Search" type="text"> -->
                        </form>
                    </li>                    
                </ul>
                <!--  search form end -->                
            </div>

           <div class="top-nav notification-row">                
                <!-- notificatoin dropdown start-->
                <ul class="nav pull-right top-menu">
                    
                    <!-- task notificatoin start -->
                    
                    <!-- alert notification end-->
                    <!-- user login dropdown start-->
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="profile-ava">
                                <img alt="" src="img/avatar1_small.jpg">
                            </span>
                            <span class="username">Jenifer Smith</span>
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu extended logout">
                            <div class="log-arrow-up"></div>
                            <li class="eborder-top">
                                <a href="#"><i class="icon_profile"></i> My Profile</a>
                            </li>
                            <li>
                                <a href="#"><i class="icon_mail_alt"></i> My Inbox</a>
                            </li>
                            <li>
                                <a href="#"><i class="icon_clock_alt"></i> Timeline</a>
                            </li>
                            <li>
                                <a href="#"><i class="icon_chat_alt"></i> Chats</a>
                            </li>
                            <li>
                                <a href="login.html"><i class="icon_key_alt"></i> Log Out</a>
                            </li>
                            <li>
                                <a href="documentation.html"><i class="icon_key_alt"></i> Documentation</a>
                            </li>
                            <li>
                                <a href="documentation.html"><i class="icon_key_alt"></i> Documentation</a>
                            </li>
                        </ul>
                    </li>
                    <!-- user login dropdown end -->
                </ul>
                <!-- notificatoin dropdown end-->
            </div>
      </header>      
      <!--header end-->

      <!--sidebar start-->
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu">                
                  <li>
                      <a data-toggle="tab" class="" href="#neworder" onclick="change1()">
                          <i class="icon_house_alt"></i>
                          <span>New Order</span>
						  <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                  </li>
				    
                  <li class="sub-menu">
                      <a data-toggle="tab" href="#cancelorder" onclick="change2()">
                          <i class="icon_desktop"></i>
                          <span>Edit Order</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      
                  </li>
                 
                  <li>                     
                      <a data-toggle="tab" href="#orderstatus" onclick="change3()">
                          <i class="icon_piechart"></i>
                          <span>Order Status</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                                         
                  </li>  
              </ul>
              <!-- sidebar menu end-->
          </div>
		 
      </aside>
	  
		<div id="framework" >
			
			
				<script>
				document.getElementById("framework").innerHTML='<center><object height="700" width="1300" type="text/html" data="slider.html" ></object></center>';
				</script>
			
				</div>
						<!--footer id="myfooter" class="header dark-bg"></footer--> 
						<!--NEW ORDER-->
						<div id="neworder" class="onetime">
							
							<div id="left">	
								<div id="new_form">
									<form id="myAjaxRequestForm">
										<fieldset>
											<h2>Customer Information</h2>
											<br> 
											<p>
												<label for="cust_name">Customer's Email:</label>
												<input id="cust_name" type="text" name="cust_name"  />&nbsp;&nbsp;&nbsp;
												<input class="btn btn-success" type="button" value="Validate" />
											</p>
										</fieldset>
									</form>
									<div id="anotherSection">
										<fieldset>
									
											<div id="ajaxResponse" >
												<script>
													//document.getElementById("ajaxResponse").innerHTML='<object width="500" height="450" type="text/html" data="register.html" ></object>';
													//$(document).ready(function(){
														$("#ajaxResponse").load("register.html");
													//});
												</script>  
											</div>
										 
											 <div id="provisioningResponse">
												 <script>
												 
												 </script>
											 </div>
											 
											 <div id="quoting">
												<script>
													document.getElementById("quoting").innerHTML='<object width="500" height="300" type="text/html" data="quoting.html" ></object>';
												</script>  
											 </div>	
											 <div><input id="click_check"  class="btn btn-success" type="button" value="submit" onClick="test();"/></div>	 
										</fieldset>
									</div>  
					            </div>
							</div>	
				
							<div id ="right">
								<div id="product_display">
					
									<div id="product_left">
									<img src="" />
										
									</div>
					
					
									<div id="product_right">
										<table>
							
											<tr>
												<td height="120px" width="120px">
							
													<div id="f1_container">
														<div id="f1_card" class="shadow">
															<a href="#" id="prod1" onClick="alert1(this);">
																<div  id="product1" class="front face">
									
																</div>
															
															
															<div id="back1" class="back face center">
															
															</div>
															</a>
														</div>
													</div>
								
												</td>
												
												
													<td height="120px" width="120px">
														<div id="f1_container">
															<div id="f1_card" class="shadow">
																<a href="#" id="prod2" onClick="alert1(this);"> 
																	<div id="product2" class="front face">
								
																	</div>
																	<div id="back2" class="back face center">
				  
																	</div>
																</a>
															</div>
														</div>
													</td>
													<td height="120px" width="120px">
														<div id="f1_container">
															<div id="f1_card" class="shadow">
																<a href="#" id="prod3" onClick="alert1(this);"><div id="product3" class="front face">	</div>					
																	
																	<div id="back3" class="back face center"></div>
				   
																
															</div></a>
														</div>
														</td>
													
											</tr>
							
											<tr>
												<td></td>
												<td height="120px" width="120px">
													<div id="f1_container">
														<div id="f1_card" class="shadow">
															<a href="#" id="prod4" onClick="alert1(this);"> <div id="product4" class="front face"></div>
																<div id="back4" class="back face center"></div>
															
									
														</div></a>
													</div>
												</td>
												<td height="120px" width="120px"></td>
												
											</tr>
							
											<tr>
												<td height="100px" width="100px">
												
													<div id="f1_container">
														<div id="f1_card" class="shadow">
														<a href="#" id="prod5" onClick="alert1(this);">
														    <div  id="product5" class="front face">
																		
															</div>
														  <div id="back5" class="back face center">
														   
														  </div></a>
														</div>
													</div>
													
												</td>
												<td height="120px" width="120px">
													<div id="f1_container">
														<div id="f1_card" class="shadow">
																 <a href="#" id="prod6" onClick="alert1(this);">  <div id="product6" class="front face">
																				
																				</div>
																  <div id="back6" class="back face center">
																  
																  </div></a>
														</div>
													</div>
												</td>
												
												<td height="120px" width="120px">
													<div id="f1_container">
														<div id="f1_card" class="shadow">
														  <a href="#" id="prod7" onClick="alert1(this);"> <div id="product7" class="front face">
																		
																		</div>
														  <div id="back7" class="back face center">
														   
														  </div></a>
														</div>
													</div>
												</td>
											</tr>
							
										</table>
									</div>
							
								</div>
							
							
								<div id="PL">
								
								<!--	<table class="product-table" cellpadding="15px" >
									<tr>
									<td></td>
									<td><h4><b>Product ID</b></h4></td>
									<td><h4><b>Product Description</h4></td>
									<td><h4><b>Price</b></h4></td>
									<td><h4><b>Quantity</b></h4></td>
									</tr>
									</table>-->
								</div>
						
							</div>		
					
						</div>
		 
						 <div id="editorder" class="onetime">
							 <fieldset>
							 
								<h2>Edit Order(Only for the Right To Buy Customer)</h2>
							 
								<div id="editorder1" class="eo">
									<form id="editRequest">
										Contract ID:&nbsp;&nbsp;&nbsp;<input type="text" name="orderID" id="orderID" />&nbsp;&nbsp;
										<input type="button" id="editbutton" class="btn btn-success" name="editbutton" value="Search"/>
										<div id="displaySection">
										<fieldset>
									   
											 <div id="editResponse"></div>
										</fieldset>
										</div> 
									</form>
								</div>
							 
							 
							 
							 <div id ="complex" class="eo">
							 
							 
								 <table>
									 <tr>
										 <td>
											Increase No Of lines : &nbsp;</td><td><input type="text"  /></td>
										 <td>&nbsp;&nbsp;&nbsp;&nbsp;<button class="btn btn-success" type="submit" value="submit">Increase</button></td>
									 </tr>
								 </table>
							 </div>
			 
			 
							 </fieldset>
						 </div>
		 
						 <div id="orderstatus"  class="onetime">
						 
							 <script>
							document.getElementById("orderstatus").innerHTML='<object  type="text/html" data="chart-chartjs.html"  width="800" height="800"></object>';
							</script> 
						 
						 
						 </div>
		 
		
		 
		 
	  
  <!-- container section start -->
  <script>
  
   function test(){
	   alert("hello");
		 
		 var result;
		var obj2 = document.getElementsByName("pdt");	 
		alert (obj2[0].checked);   
		for(var i=0; i<obj2.length; i++){
	        if(obj2[i].checked==true ){
	            result = obj2[i].value;
	            document.location.href="OrderingServlet?servicecode="+result;
	        }
	    }
	    alert( result );




		}
  </script>
     <script src="js/jquery-1.9.1.js" type="text/javascript"></script>
    <script type="text/javascript" src="js/app.js"></script>
    <!-- javascripts -->
    <script src="https://code.jquery.com/jquery-1.10.2.js"></script>
    <!--  The New Order 1St Part -->
    <script type="text/javascript" src="js/app.js"></script>
     <script src="js/jquery-1.9.1.js" type="text/javascript"></script>
    <!--PCAT PRODUCT CATALOG-->
    <script src="js/PCATurl.js" />
    <script src="js/jquery.js"></script>
	<script src="js/jquery-ui-1.10.4.min.js"></script>
    <script src="js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="js/jquery-ui-1.9.2.custom.min.js"></script>
    <!-- bootstrap -->
    <script src="js/bootstrap.min.js"></script>
    <!-- nice scroll -->
    <script src="js/jquery.scrollTo.min.js"></script>
    <script src="js/jquery.nicescroll.js" type="text/javascript"></script>
    <!-- charts scripts -->
    <script src="assets/jquery-knob/js/jquery.knob.js"></script>
    <script src="js/jquery.sparkline.js" type="text/javascript"></script>
    <script src="assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"></script>
    <script src="js/owl.carousel.js" ></script>
    <!-- jQuery full calendar -->
    <script src="js/fullcalendar.min.js"></script> <!-- Full Google Calendar - Calendar -->
	<script src="assets/fullcalendar/fullcalendar/fullcalendar.js"></script>
    <!--script for this page only-->
    <script src="js/calendar-custom.js"></script>
	<script src="js/jquery.rateit.min.js"></script>
    <!-- custom select -->
    <script src="js/jquery.customSelect.min.js" ></script>
	<script src="assets/chart-master/Chart.js"></script>
   
    <!--custome script for all page-->
    <script src="js/scripts.js"></script>
    <!-- custom script for this page-->
    <script src="js/sparkline-chart.js"></script>
    <script src="js/easy-pie-chart.js"></script>
	<script src="js/jquery-jvectormap-1.2.2.min.js"></script>
	<script src="js/jquery-jvectormap-world-mill-en.js"></script>
	<script src="js/xcharts.min.js"></script>
	<script src="js/jquery.autosize.min.js"></script>
	<script src="js/jquery.placeholder.min.js"></script>
	<script src="js/gdp-data.js"></script>	
	<script src="js/morris.min.js"></script>
	<script src="js/sparklines.js"></script>	
	<script src="js/charts.js"></script>
	<script src="js/jquery.slimscroll.min.js"></script>
	<script src="jquery.js"></script> 
   
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
  <script>
  function visibility_div(){
	document.getElementById("details").style.visibility="visible";
	}
  
  function change1()
  {
   document.getElementById("framework").innerHTML="";
   document.getElementById("framework").innerHTML=document.getElementById("neworder").innerHTML;
   
   
  }
   function change2()
  {
   document.getElementById("framework").innerHTML="";
   document.getElementById("framework").innerHTML=document.getElementById("editorder").innerHTML;
   
  }
    function change3()
  {
   document.getElementById("framework").innerHTML="";
   document.getElementById("framework").innerHTML=document.getElementById("orderstatus").innerHTML;
   
  }
  
  
      
      //knob
      $(function() {
        $(".knob").knob({
          'draw' : function () { 
            $(this.i).val(this.cv + '%')
          }
        })
      });

      //carousel
      $(document).ready(function() {
          $("#owl-slider").owlCarousel({
              navigation : true,
              slideSpeed : 300,
              paginationSpeed : 400,
              singleItem : true

          });
      });

      //custom select box

      $(function(){
          $('select.styled').customSelect();
      });
	  
	  /* ---------- Map ---------- */
	$(function(){
	  $('#map').vectorMap({
	    map: 'world_mill_en',
	    series: {
	      regions: [{
	        values: gdpData,
	        scale: ['#000', '#000'],
	        normalizeFunction: 'polynomial'
	      }]
	    },
		backgroundColor: '#eef3f7',
	    onLabelShow: function(e, el, code){
	      el.html(el.html()+' (GDP - '+gdpData[code]+')');
	    }
	  });
	});



  </script>

  </body>
</html>
