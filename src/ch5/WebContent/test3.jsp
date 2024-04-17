<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>test3</title>
</head>
<body>
	<h2>球体积计算</h2>
	<%
	if(request.getParameter("submit")!=null){
		double radius = Double.parseDouble(request.getParameter("radius"));
    	double volume = (4.0/3.0) * Math.PI * radius *radius *radius;
	%>
	<p>
		球的半径：
		<%= radius %>
	</p>
	<p>
		球的体积：
		<%= volume %>
	</p>
	<%
	} else {
    %>
	<form action="test3.jsp" method="post">
		输入球的半径：<input name="radius" />
		<button type="submit" name="submit">计算</button>
	</form>
	<% } %>
</body>
</html>