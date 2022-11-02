<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="java.util.*"%>
<%@ page import="bean.*"%>
<%@ page import="util.*"%>
	<% Member m = (Member) session.getAttribute("member");%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

		<script src="js/jquery.min.js"></script>

		<link href="css/style.css" rel='stylesheet' type='text/css' />

		<script type="text/javascript" src="js/move-top.js"></script>
		<script type="text/javascript" src="js/easing.js"></script>
		<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
		</script>

		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

		<link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900,100italic,300italic,400italic,700italic,900italic' rel='stylesheet' type='text/css'>

		<script>
			$(function() {
				var pull 		= $('#pull');
					menu 		= $('nav ul');
					menuHeight	= menu.height();
				$(pull).on('click', function(e) {
					e.preventDefault();
					menu.slideToggle();
				});
				$(window).resize(function(){
	        		var w = $(window).width();
	        		if(w > 320 && menu.is(':hidden')) {
	        			menu.removeAttr('style');
	        		}
	    		});
			});
		</script>

</head>
<body>

<%-- 	<a href="<%=request.getContextPath()%>/loadlogin">Login</a>
	<a href="<%=request.getContextPath()%>/loadregister">Register</a> --%>
	
	<!----container---->
		<div class="container">
			<!----top-header---->
			<div class="top-header">
<!-- 				<div class="logo">
					<a href="index.jsp"><img src="img/indext.png" title="Boardgame" /></a>
				</div> -->
				<div class="top-header-info">

					<div class="cart-details">
						<div class="add-to-cart">

						</div>
						<div class="login-rigister">
							<ul class="unstyled-list list-inline">
								<li><a class="login" href="<%=request.getContextPath()%>/loadlogin">ลงชื่อ</a></li>
								<li><a class="rigister" href="<%=request.getContextPath()%>/loadregister">สมัครสมาชิก <span> </span></a></li>
			<%if(m!=null ){%>	
			 <a href="${pageContext.request.contextPath}/editprofile">แก้ไขข้อมูลส่วนตัว</a> <%}%>	


								<div class="clearfix"> </div>
							</ul>
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<div class="top-header-nav"> 

			 <nav class="top-nav main-menu">
					<ul class="top-nav">
						<li><a href="${pageContext.request.contextPath}/index">หน้าแรก</a><span> </span></li>
						<li><a href="${pageContext.request.contextPath}/boardgame">บอร์ดเกม</a><span> </span></li>
						<li><a href="${pageContext.request.contextPath}/rank">อันดับบอร์ดเกม</a><span> </span></li>
						<li><a href="${pageContext.request.contextPath}/contant">ข่าวสาร</a><span> </span></li>
						<li><a href="${pageContext.request.contextPath}/listmember">ผู้เล่น</a></li>
						<li><a href="${pageContext.request.contextPath}/addboardgame">เพิ่มบอร์ดเกม</a></li>
						<li><a href="${pageContext.request.contextPath}/editprofile">ข้อมูลส่วนตัว</a></li>
						<li><a href="${pageContext.request.contextPath}/approveboardgame">คำขออนุมัติบอร์ดเกม</a></li>
						
						<div class="clearfix"> </div>
					</ul>
					<a href="#" id="pull"><img src="img/nav-icon.png" title="menu" /></a>
			  </nav>
			  <!----End-top-nav---->
			  <!---top-header-search-box--->
			  <div class="top-header-search-box">
			  	<form>
			  		<input type="text" placeholder="Search" required / maxlength="22">
			  		<input type="submit" value=" " >
			  	</form>
			  </div>
			  <!---top-header-search-box--->
						<div class="clearfix"> </div>
			</div>
		</div>
			<!--//top-header-nav---->
			<!----start-slider-script---->
			<script src="js/responsiveslides.min.js"></script>
			 <script>
			    // You can also use "$(window).load(function() {"
			    $(function () {
			      // Slideshow 4
			      $("#slider4").responsiveSlides({
			        auto: true,
			        pager: true,
			        nav: true,
			        speed: 500,
			        namespace: "callbacks",
			        before: function () {
			          $('.events').append("<li>before event fired.</li>");
			        },
			        after: function () {
			          $('.events').append("<li>after event fired.</li>");
			        }
			      });
			
			    });
			  </script>
			<!----//End-slider-script---->
			<!-- Slideshow 4 -->
			    <!-- <div  id="top" class="callbacks_container">
			      <ul class="rslides" id="slider4">
			        <li>
			          <img src="img/b3.jpg" alt="">
			          <div class="caption">
			          	<div class="slide-text-info">
			          		<h1></h1>
			          		<label></label>
			          		<a class="slide-btn" href="#"><span></span> <small></small><label> </label></a>
			          	</div>
			          </div>
			        </li>
			        <li>
			          <img src="img/slide2.png" alt="">
			          <div class="caption">
			          	<div class="slide-text-info">
			          		<h1>FAST NER2</h1>
			          		<label>Dress Shoe</label>
			          		<a class="slide-btn" href="#"><span>99.90$</span> <small>GET NOW</small><label> </label></a>
			          	</div>
			          </div>
			        </li>
			        <li>
			          <img src="img/slide1.png" alt="">
			           <div class="caption">
			           	<div class="slide-text-info">
			          		<h1>WILL HELM</h1>
			          		<label>WINTER</label>
			          		<a class="slide-btn" href="#"><span>99.90$</span> <small>GET NOW</small><label> </label></a>
			          	</div>
			          </div>
			        </li>
			      </ul>
			    </div> -->
			    <div class="clearfix"> </div>
			<!----- //End-slider---->
			<!----content---->
			
				<div class="content">
					<div class="container">
				<!---top-row--->
				<div class="top-row">
					<div class="col-xs-4">
						<div class="top-row-col1 text-center">
							<h2>เกมครอบครัว</h2>
							<img class="r-img text-center" src="img/.jpg" title="name" />
							<span><img src="images/obj1.png" title="name" /></span>
							<h4>ทั้งหมด</h4>
							<label>100 เกม</label>
							<a class="r-list-w" href="single-page.html"><img src="images/list-icon.png" title="list" /></a>
						</div>
					</div>
					<div class="col-xs-4">
						<div class="top-row-col1 text-center">
							<h2>เกมวางแผน </h2>
							<img class="r-img text-center" src="img/.jpg" title="name" />
							<span><img src="images/obj2.png" title="name" /></span>
							<h4>ทั้งหมด</h4>
							<label>150 เกม</label>
							<a class="r-list-w" href="single-page.html"><img src="images/list-icon.png" title="list" /></a>
						</div>
					</div>
					<div class="col-xs-4">
						<div class="top-row-col1 text-center">
							<h2>ปาร์ตี้เกม </h2>
							<img class="r-img text-center" src="img/.jpg" title="name" />
							<span><img src="images/obj3.png" title="name" /></span>
							<h4>ทั้งหมด</h4>
							<label>50 เกม</label>
							<a class="r-list-w" href="single-page.html"><img src="images/list-icon.png" title="list" /></a>
						</div>
					</div>
					<vdi class="clearfix"> </div>
				</div>
				<!---top-row--->
				<div class="container"> 
				<!----speical-products---->
				<div class="special-products">
					<div class="s-products-head">
						<div class="s-products-head-left">
							<h3>บอร์ดเกมแปลไทย <span>แนะนำ</span></h3>
						</div>
						<div class="s-products-head-right">
							<a href="${pageContext.request.contextPath}/boardgame"><span> </span>ดูบอร์ดเกมทั้งหมด</a>
						</div>
						<div class="clearfix"> </div>
					</div>
					<!----special-products-grids---->
					<div class="special-products-grids">
						<div class="col-md-3 special-products-grid text-center">
							<a class="brand-name" href="single-page.html"><img src="images/b1.jpg" title="name" /></a>
							<a class="product-here" href="single-page.html"><img src="images/p1.jpg" title="product-name" /></a>
							<h4><a href="${pageContext.request.contextPath}/addroom">เทสเข้าเกม</a></h4>
							<!-- <a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET NOW</small><label> </label></a> -->
						</div>
						<div class="col-md-3 special-products-grid text-center">
							<a class="brand-name" href="single-page.html"><img src="images/b2.jpg" title="name" /></a>
							<a class="product-here" href="single-page.html"><img src="images/p2.jpg" title="product-name" /></a>
							<h4><a href="${pageContext.request.contextPath}/addroom">เทสเข้าเกม</a></h4>
							<!-- <a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET NOW</small><label> </label></a> -->
						</div>
						<div class="col-md-3 special-products-grid text-center">
							<a class="brand-name" href="single-page.html"><img src="images/b3.jpg" title="name" /></a>
							<a class="product-here" href="single-page.html"><img src="images/p3.jpg" title="product-name" /></a>
							<h4><a href="${pageContext.request.contextPath}/addroom">เทสเข้าเกม</a></h4>
							<!-- <a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET NOW</small><label> </label></a> -->
						</div>
						<div class="col-md-3 special-products-grid text-center">
							<a class="brand-name" href="single-page.html"><img src="images/b4.jpg" title="name" /></a>
							<a class="product-here" href="single-page.html"><img src="images/p4.jpg" title="product-name" /></a>
							<h4><a href="${pageContext.request.contextPath}/addroom">เทสเข้าเกม</a></h4>
							<!-- <a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET NOW</small><label> </label></a> -->
						</div>
						<div class="col-md-3 special-products-grid text-center">
							<a class="brand-name" href="single-page.html"><img src="images/b5.jpg" title="name" /></a>
							<a class="product-here" href="single-page.html"><img src="images/p2.jpg" title="product-name" /></a>
							<h4><a href="${pageContext.request.contextPath}/addroom">เทสเข้าเกม</a></h4>
							<!-- <a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET NOW</small><label> </label></a> -->
						</div>
						<div class="col-md-3 special-products-grid text-center">
							<a class="brand-name" href="single-page.html"><img src="images/b6.jpg" title="name" /></a>
							<a class="product-here" href="single-page.html"><img src="images/p6.jpg" title="product-name" /></a>
							<h4><a href="${pageContext.request.contextPath}/addroom">เทสเข้าเกม</a></h4>
						<!-- 	<a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET NOW</small><label> </label></a> -->
						</div>
						<div class="col-md-3 special-products-grid text-center">
							<a class="brand-name" href="single-page.html"><img src="images/b7.jpg" title="name" /></a>
							<a class="product-here" href="single-page.html"><img src="images/p7.jpg" title="product-name" /></a>
							<h4><a href="${pageContext.request.contextPath}/addroom">เทสเข้าเกม</a></h4>
						<!-- 	<a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET NOW</small><label> </label></a> -->
						</div>
						<div class="col-md-3 special-products-grid text-center">
							<a class="brand-name" href="single-page.html"><img src="images/b1.jpg" title="name" /></a>
							<a class="product-here" href="single-page.html"><img src="images/p8.jpg" title="product-name" /></a>
							<h4><a href="${pageContext.request.contextPath}/addroom">เทสเข้าเกม</a></h4>
							<!-- <a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET NOW</small><label> </label></a> -->
						</div>
						<div class="clearfix"> </div>
					</div>
					<!---//special-products-grids---->
				</div>
				<!---//speical-products---->
				</div>
			<!----content---->
			<!----footer--->
<!-- 			<div class="footer">
				<div class="container">
					<div class="col-md-3 footer-logo">
						<a href="index.html"><img src="images/flogo.png" title="brand-logo" /></a>
					</div>
					<div class="col-md-7 footer-links">
						<ul class="unstyled-list list-inline">
							<li><a href="#"> Faq</a> <span> </span></li>
							<li><a href="#"> Terms and Conditions</a> <span> </span></li>
							<li><a href="#"> Secure Payments</a> <span> </span></li>
							<li><a href="#"> Shipping</a> <span> </span></li>
							<li><a href="contact.html"> Contact</a> </li>
							<div class="clearfix"> </div>
						</ul>
					</div>
					<div class="col-md-2 footer-social">
						<ul class="unstyled-list list-inline">
							<li><a class="pin" href="#"><span> </span></a></li>
							<li><a class="twitter" href="#"><span> </span></a></li>
							<li><a class="facebook" href="#"><span> </span></a></li>
							<div class="clearfix"> </div>
						</ul>
					</div>
					<div class="clearfix"> </div>
				</div>
			 </div> -->
			 <div class="clearfix"> </div>
			<!---//footer--->
			<!---copy-right--->
<!-- 					<div class="copy-right">
						<div class="container">
							<p>Template by <a href="http://w3layouts.com/">W3layouts</a></p>
							<script type="text/javascript">
									$(document).ready(function() {
										/*
										var defaults = {
								  			containerID: 'toTop', // fading element id
											containerHoverID: 'toTopHover', // fading element hover id
											scrollSpeed: 1200,
											easingType: 'linear' 
								 		};
										*/
										
										$().UItoTop({ easingType: 'easeOutQuart' });
										
									});
								</script>
							<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
						</div>
					</div> -->
			<!--//copy-right--->
		</div>
		<!----container---->
</body>
</html>
