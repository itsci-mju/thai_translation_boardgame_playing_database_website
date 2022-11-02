<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
ห้องเล่นเกม<br>
ชื่อห้อง :<input type="text" name="uname" ><br>
<label >จำนวนผู้เล่น:</label>
  <select  name="player">
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
  </select><br>
เวลาที่ใช้ในการเล่น :<input type="text" name="time" ><br>
<input type="submit" name="submit" value="บันทึก"><input type="submit" name="submit" value="ยกเลิก"><input type="submit" name="submit" value="ลบห้อง">

</body>
</html>