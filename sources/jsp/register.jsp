<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="frm" method="post" action="${pageContext.request.contextPath}/register" >
username :<input type="text" name="uname" >
passowrd :<input type="password" name="pwd" >
<button  type="submit">Login</button>

</form>
</body>
</html>