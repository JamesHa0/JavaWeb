<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page contentType="text/html;charset=gb2312" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>main</title>
</head>
<body>
	<%-- <%@include file="header.html" %> --%>
	<jsp:include page="header.html" flush="true" />
	<div align="center">
		欢迎光临新世纪网上书店<br />
		<a href="xxxx">开始购买图书</a>
	</div>
	<%-- <%@include file="footer.jsp" %> --%>
	<jsp:include page="footer.jsp" flush="true" />
</body>
</html>