<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="frm" method="post" action="${pageContext.request.contextPath}/login" >
Login :<a href="<%= request.getContextPath() %>/loadlogin">
Register :<a href="<%= request.getContextPath() %>/loadregister">
<button  type="submit">Login</button>

</form>

</body>
</html>