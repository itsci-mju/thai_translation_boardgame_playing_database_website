<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
ข้อมูลส่วนตัว<br>

<td>ชื่อผู้ใช้ :<input type="text" name="uname"></td><br>

<td>รหัสผ่าน :<input type="password" name="pwd"></td><br>

<td>ยืนยันรหัสผ่าน :<input type="password" name="spwd"></td><br>

<td>วัน/เดือน/ปีเกิด :<input type="date" name="birthday"></td><br>

<td>เบอร์โทรศัพท์ <input type="text" name="tel"></td><br>

<td>อีเมลล์ :<input type="email" name="email"></td><br>

<td>อัพโหลดรูปประจำตัวผู้เล่น <input type="file" name="imag"></td><br>

<input type="submit" name="submit"  value="แก้ไข">  <input type="submit" name="submit" value="ยกเลิก"> 

</body>
</html>