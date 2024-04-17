<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>test7</title>
</head>
<body>
	<table border=1 cellspacing="0">
		<tr>
			<%
				for (int i = 0; i <= 9; i++) {
			%>
			<td>
				<%
					out.print(i);
				%>
			</td>
			<%
				}
			%>
		</tr>
		<tr>
			<%
				for (int i = 0; i <= 9; i++) {
			%>
			<td>
				<%
					out.print(i * i);
				%>
			</td>
			<%
				}
			%>
		</tr>
	</table>
</body>
</html>