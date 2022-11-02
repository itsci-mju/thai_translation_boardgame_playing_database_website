<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="frm" method="GET" action="${pageContext.request.contextPath}/editroom">
 <label >จำนวนผู้เล่น:</label>
  <select  name="player">
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
  </select>
<input type="submit" name="addroom" value="เพิ่มห้อง"><br>
</form>
</body>
</html>