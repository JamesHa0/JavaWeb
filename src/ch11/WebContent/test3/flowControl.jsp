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
<%-- <h1>标签c:if的使用</h1>
<c:if test="${request.name == 'Tom' || request.name == 'Jerry'|| request.name == 'Mike'|| request.name == 'Ben'}" >
<c:out value="您好,${request.name }"/>
</c:if> --%>
<c:out value="您好,${request.user }"/>
</body>
</html>