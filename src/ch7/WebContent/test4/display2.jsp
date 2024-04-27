<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.demo.UserBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>display</title>
</head>
<body>
	<%
		UserBean user = (UserBean) request.getAttribute("User");
	%>
	userName:<%=user.getUserName()%>
	<br /> password:<%=user.getPassword()%><br /> email:<%=user.getEmail()%>
</body>
</html>