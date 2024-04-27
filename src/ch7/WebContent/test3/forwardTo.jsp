<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>forwardTo</title>
</head>
<body>
	<%
		String name = request.getParameter("username");
		name = new String(name.getBytes("ISO-8859-1"), "UTF-8");
		out.print(name + "，欢迎光临本站");
	%>
</body>
</html>