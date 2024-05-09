<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page= %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jstl_test</title>
</head>
<body>
	Request Method:
	<c:out value="${header.method}" />
	Remote Address:
	<c:out value="${header.remoteaddress}" />

	<c:set var="number" scope="page">
		<c:out value="${5}" />
	</c:set>
	<c:set var="number" scope="request">
		<c:out value="${15}" />
	</c:set>
	<c:set var="number" scope="session">
		<c:out value="${25}" />
	</c:set>

	XXXXXXXXXXXX pageScorpe.number:
	<c:out value="${pageScorpe.number}" default="No data" />
	requestScorpe.number:
	<c:out value="${requestScorpe.number}" default="No data" />
	sessionScorpe.number:
	<c:out value="${sessionScorpe.number}" default="No data" />

	<c:remove var="number" scope="page" />
	<c:remove var="number" scope="" />
	<c:remove var="number" scope="" />

	pageScorpe.number:
	<c:out value="${pageScorpe.number}" default="No data" />
	requestScorpe.number:
	<c:out value="${requestScorpe.number}" default="No data" />
	sessionScorpe.number:
	<c:out value="${sessionScorpe.number}" default="No data" />
</body>
</html>