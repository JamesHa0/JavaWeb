 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>operator</title>
</head>
<body>
<h1>JSP表达式语言-基本算术运算符</h1>
<table border="1px">
	<tr>
		<th>EL表达式</th>
		<th>结果</th>
	</tr>
	<tr>
		<td>\${1}</td>
		<td>${1}</td>
	</tr>
	<tr>
		<td>\${1+2}</td>
		<td>${1+2}</td>
	</tr>
	<tr>
		<td>\${1.2+2.3}</td>
		<td>${1.2+2.3}</td>
	</tr>
	<tr>
		<td>\${1.2E4+1.4}</td>
		<td>${1.2E4+1.4}</td>
	</tr>
	<tr>
		<td>\${-4-2}</td>
		<td>${-4-2}</td>
	</tr>
	<tr>
		<td>\${21*2}</td>
		<td>${21*2}</td>
	</tr>
	<tr>
		<td>\${3/4}</td>
		<td>${3/4}</td>
	</tr>
	<tr>
		<td>\${3 div 4}</td>
		<td><%-- ${3 div 4} --%></td>
	</tr>
	<tr>
		<td>\${3/0}</td>
		<td>${3/0}</td>
	</tr>
	<tr>
		<td>\${10%4}</td>
		<td>${10%4}</td>
	</tr>
	<tr>
		<td>\${10 mod 4}</td>
		<td>${10 mod 4}</td>
	</tr>
	<tr>
		<td>\${(1==2)?3:4}</td>
		<td>${(1==2)?3:4}</td>
	</tr>
</table>
</body>
</html>