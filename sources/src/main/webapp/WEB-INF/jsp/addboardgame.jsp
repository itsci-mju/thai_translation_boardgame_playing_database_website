<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
ลงทะเบียนบอร์ดเกม<br>
อัพโหลดรูปบอร์ดเกม: <input type="file" name="imag"><br>
ข้อมูลบอร์ดเกม:<input type="text" name="bname" ><br>
ชื่ออื่น:<input type="text" name="nickname" ><br>
<label >ประเภทเกม:</label>
  <select  name="player">
    <option value="1">ครอบครัว</option>
    <option value="2">วางแผน</option>
    <option value="3">ปาร์ตี้เกม</option>  
  </select>
  <br>
<label >อายุ:</label>
  <select  name="player">
    <option value="1">7+</option>
    <option value="2">12+</option>
    <option value="3">17+</option>
    <option value="4">20+</option>    
  </select>
  <br>
 
 <label >ระยะเวลาในการเล่น ตั้งแต่:</label>
  <select  name="player">
    <option value="1">15m</option>
    <option value="2">20m</option>
    <option value="3">30m</option>
    <option value="4">45m</option>    
  </select>
   <label >ถึง:</label>
  <select  name="player">
    <option value="1">45m</option>
    <option value="2">1h</option>
    <option value="3">1h30m</option>
    <option value="4">2h</option>    
  </select><br>
  <label >จำนวนผู้เล่น:</label>
  <select  name="player">
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
  </select>
 <br>
  คำอธิบาย:<input type="text" name="discription" ><br>
 <input type="submit" name="submit" value="บันทึก">  <input type="submit" name="ยกเลิก"> 
</body>
</html>