<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>flowControl</title>
</head>
<body>
	<h1>标签c:if的使用</h1>
	<c:if
		test="${param.user == 'Tom' || param.user == 'Jerry' || param.user == 'Mike' || param.users == 'Ben'}">
		<c:out value="您好,${param.user }" />
	</c:if>
	<h1>标签c:choose c:when c:otherwise使用</h1>
	<c:choose>
		<c:when test="${param.user == 'Tom' }">
			<c:out value="您好,${param.user }" />
		</c:when>
		<c:when test="${param.user == 'Jerry' }">
			<c:out value="您好,${param.user }" />
		</c:when>
		<c:when test="${param.user == 'Mike' }">
			<c:out value="您好,${param.user }" />
		</c:when>
		<c:when test="${param.user == 'Ben' }">
			<c:out value="您好,${param.user }" />
		</c:when>
		<c:otherwise>
			<c:out value="非预期用户：${param.user }"></c:out>
		</c:otherwise>
	</c:choose>
</body>
</html>