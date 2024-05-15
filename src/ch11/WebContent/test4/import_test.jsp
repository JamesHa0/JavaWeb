<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>import_test</title>
</head>
<body>
	<h1>这是包含页面中的内容</h1>
	<c:import url="included.jsp" charEncoding="UTF-8">
		<c:param name="userName" value="Harry Porter" />
	</c:import>
</body>
</html>