<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>employeeForm</title>
</head>
<body>
	<form action="../EmployeeServlet" method="post">
		雇员号:<input name="eno" /><br />
		雇员名:<input name="ename" /><br />
		雇员公司名:<input name="ecompany" /><br />
		<input type="submit" />
	</form>
</body>
</html>