<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>application</title>
</head>
<body>
	<h1 align="center" style="color: blue">application对象示例</h1>
	<hr />
	本页面的实际路径是：
	<br />
	<%=request.getRealPath("")%><br />
	<%
		Integer num = (Integer) application.getAttribute("num");
		if (num == null) {
			num = 1;
		} else {
			num++;
		}
		application.setAttribute("num", num);
	%>
	application对象中变量num的值为：<%=num%>
</body>
</html>