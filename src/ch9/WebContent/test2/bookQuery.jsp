<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bookQuery</title>
</head>
<body>
	请输入一个书号:
	<br />
	<form action="../BookQueryServlet" method="post">
		<input name="bookid"><br /> <input type="submit" value="提交">
	</form>
</body>
</html>