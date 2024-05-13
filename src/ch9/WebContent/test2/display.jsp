<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="book" class="com.demo.BookBean" scope="request" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>display</title>
</head>
<body>
	书号：<jsp:getProperty name="book" property="bookid" />
	书名：<jsp:getProperty name="book" property="title" />
	作者：<jsp:getProperty name="book" property="author" />
	出版社：<jsp:getProperty name="book" property="publisher" />
	价格：<jsp:getProperty name="book" property="price" />
</body>
</html>