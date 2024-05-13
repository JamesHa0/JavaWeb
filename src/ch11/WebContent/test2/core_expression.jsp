<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>core_expression</title>
</head>
<body>
	<c:set var="number" scope="page">
		<c:out value="${5}" />
	</c:set>
	<c:set var="number" scope="request">
		<c:out value="${15}" />
	</c:set>
	<c:set var="number" scope="session">
		<c:out value="${25}" />
	</c:set>
	
	<c:out value="不同作用域的number变量的初始值" /><br /><br />
	pageScorpe.number:
	<c:out value="${pageScope.number}" default="No data" /><br />
	requestScorpe.number:
	<c:out value="${requestScope.number}" default="No data" /><br />
	sessionScorpe.number:
	<c:out value="${sessionScope.number}" default="No data" /><br />
	
	<c:remove var="number" scope="request" />
	<c:out value='执行<c:remove var="number" />之后' /><br /><br />
	pageScorpe.number:
	<c:out value="${pageScope.number}" default="No data" /><br />
	requestScorpe.number:
	<c:out value="${requestScope.number}" default="No data" /><br />
	sessionScorpe.number:
	<c:out value="${sessionScope.number}" default="No data" /><br />
</body>
</html>