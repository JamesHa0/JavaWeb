<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bookInsert</title>
</head>
<body>
	<h3>请输入图书信息：</h3>
	${result}
	<form action="../BookInsertServlet" method="post">
		<table>
			<tr>
				<td>书号</td>
				<td><input name="bookid"></td>
			</tr>
			<tr>
				<td>书名</td>
				<td><input name="title"></td>
			</tr>
			<tr>
				<td>作者</td>
				<td><input name="author"></td>
			</tr>
			<tr>
				<td>出版社</td>
				<td><input name="publisher"></td>
			</tr>
			<tr>
				<td>单价</td>
				<td><input name="price"></td>
			</tr>
			<tr>
				<td><input type="submit" value="确定"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>