<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>out</title>
</head>
<body>
	<h1>out对象的使用</h1>
	<%
		int BufferSize = out.getBufferSize();
		int Available = out.getRemaining();
		Class clas = out.getClass();
		String className = clas.getName();
		out.print("学习使用out对象<br/>");
	%>
	out对象的类型为：
	<br />
	<%=className%><br /> BufferSize=<%=BufferSize%><br /> Available=<%=Available%>
</body>
</html>