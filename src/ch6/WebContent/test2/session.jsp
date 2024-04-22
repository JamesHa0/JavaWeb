<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>session</title>
</head>
<body>
	<%
		session.setAttribute("user", "詹宇昊22023237");
	%>
	您的会话ID是：<%=session.getId()%><br/>
	session对象中存放的变量user的值为：<%=session.getAttribute("user")%>
</body>
</html>