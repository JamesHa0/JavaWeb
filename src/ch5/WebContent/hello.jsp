<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page errorPage="errorHandler.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>hello</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		if (name == null) {
			throw new RuntimeException("没有指定name的属性值");
		}
	%>
	Hello,<%=name%>
</body>
</html>