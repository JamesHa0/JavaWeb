<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.demo.UserBean"%>
<jsp:useBean id="user" class="com.demo.UserBean"></jsp:useBean>
<jsp:setProperty property="*" name="user" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>display</title>
</head>
<body>
	userName:<jsp:getProperty property="userName" name="user" /><br />
	password:<jsp:getProperty property="password" name="user" /><br />
	email:<jsp:getProperty property="email" name="user" />
</body>
</html>