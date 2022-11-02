<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.min.js" integrity="sha384-ODmDIVzN+pFdexxHEHFBQH3/9/vQ9uori45z4JjnFsRydbmQbmL5t1tQ0culUzyK" crossorigin="anonymous"></script>
    
    
    <link rel="stylesheet" href="<%= request.getContextPath() %>/css/Login.css">
    


  

  
</head>
<%--<body>--%>
<%--<form name="frm" method="post" action="${pageContext.request.contextPath}/login" >--%>
<%--username :<input type="text" name="uname" >--%>
<%--passowrd :<input type="password" name="pwd" >--%>
<%--<button  type="submit">Login</button>--%>

<%--</form>--%>

<%--</body>--%>

<body>
<form name="frm" method="post" action="${pageContext.request.contextPath}/login">
		<div class="loginBox">
		<img src="http://infiniteiotdevices.com/images/png1.png" class="user">
		<h2>เข้าสู่ระบบ</h2>
		<form>
			<p>ชื่อผู้ใช้</p>
			<input type="text" name="uname" placeholder="ชื่อผู้ใช้">
			<p>รหัสผ่าน</p>
			<input type="password" name="pwd" placeholder="••••••••">
			<input type="submit" name="submit" value="เข้าสู่ระบบ">
			<a href="#" class="a">ลืมรหัสผ่าน?</a>
			
			
			<h4>สมาชิกใหม่? <a class="txt2" href="register.jsp">สมัครสมาชิก</a></h4>
		</form>
	</div>

</form>
</body>
</html>








