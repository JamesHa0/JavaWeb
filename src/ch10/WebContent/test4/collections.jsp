<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>collections</title>
</head>
<body>
	访问集合元素
	<ul>
		<c:forEach items="${collection}" var="country">
			<li>${country.key }的首都是:${country.value }</li>
		</c:forEach>
	</ul>
</body>
</html>