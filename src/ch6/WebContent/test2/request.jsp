<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request</title>
</head>
<body>
	<%
		String IP = request.getRemoteAddr();
		String Host = request.getRemoteHost();
		int serverPort = request.getServerPort();
	%>
	你的IP地址为：<%=IP%><br /> 你的主机名为：<%=Host%><br /> 服务器的端口号为：<%=serverPort%>
</body>
</html>