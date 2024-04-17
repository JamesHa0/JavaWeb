<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>
<title>test4</title>
</head>
<body>
	<%
		Date time = new Date();
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy年MM月dd日");
		String time1 = f1.format(time);
		SimpleDateFormat f2 = new SimpleDateFormat("yyyy年MM月dd日E");
		String time2 = f2.format(time);
	%>
	<div align="center">
		<h2>使用page指令导入java.util.Data类</h2>
		现在的时间是：<%=time1%>
		<br /> 现在的时间是：time2e2 %>
	</div>
</body>
</html>