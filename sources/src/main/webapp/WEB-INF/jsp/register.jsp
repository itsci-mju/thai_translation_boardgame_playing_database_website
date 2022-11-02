<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.min.js" integrity="sha384-ODmDIVzN+pFdexxHEHFBQH3/9/vQ9uori45z4JjnFsRydbmQbmL5t1tQ0culUzyK" crossorigin="anonymous"></script>

    <link rel="stylesheet" href="<%= request.getContextPath() %>/css/Register.css">
    
	<link href="http://infiniteiotdevices.com/images/logo.png" rel="icon" sizes="16x16" type="image/gif" />
	<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>
<form name="frm" method="post" action="${pageContext.request.contextPath}/register" enctype="multipart/form-data" >
สมัครสมาชิก<br>

<td>ชื่อผู้ใช้ :<input type="text" name="uname"></td><br>

<td>รหัสผ่าน :<input type="password" name="pwd"></td><br>

<td>ยืนยันรหัสผ่าน :<input type="password" name="spwd"></td><br>

<td>วัน/เดือน/ปีเกิด :<input type="date" name="birthday"></td><br>

<td>เบอร์โทรศัพท์ <input type="text" name="tel"></td><br>

<td>อีเมลล์ :<input type="email" name="email"></td><br>

<td>อัพโหลดรูปประจำตัวผู้เล่น <input type="file" name="imag"></td><br>

 <input type="submit" name="submit"> 
</form>
</body>
</html>
<%-- 
<body>
<form name="frm" method="post" action="${pageContext.request.contextPath}/register" enctype="multipart/form-data" >
		<div class="loginBox">
		<img src="http://infiniteiotdevices.com/images/png1.png" class="user">
		<h2>Log In Here</h2>
		<form>
			<p>ชื่อผู้ใช้</p>
			<input type="text" name="uname" placeholder="ชื่อผู้ใช้">
			<p>รหัสผ่าน</p>
			<input type="password" name="pwd" placeholder="••••••••">
			<input type="password" name="pwd" placeholder="••••••••">
			<input type="date" name="birthday" placeholder="วัน/เดือน/ปีเกิด">
			<input type="text" name="tel" placeholder="ชื่อผู้ใช้">
			<input type="text" name="tel" placeholder="เบอร์โทรศัพท์ ">
			<input type="email" name="email" placeholder="อีเมลล์ ">
			อัพโหลดรูปประจำตัวผู้เล่น <input type="file" name="imag">
			
			<input type="submit" name="submit" value="เข้าสู่ระบบ">
			<a href="#" class="a">ลืมรหัสผ่าน?</a>
			<h5>ลงทะเบียนผู้ใช้</h5>
			
			<h4>สมาชิกใหม่? <a class="txt2" href="register.jsp">สมัครสมาชิก</a></h4>
		</form>
	</div>

</form> --%>
</body>
</html>