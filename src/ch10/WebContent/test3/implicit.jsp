<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>implicit</title>
</head>
<body>
	<form action="implicit.jsp" method="get">
		foo=<input name="foo" value='${param["foo"]}' />
		<input type="submit" /><br />
	</form>
	显示参数foo的值:${param.foo}<br />
	初始URL中的主机和端口Host:${header.host}<br />
	浏览器可接受的MIME类型Accept:${header.accept}<br />
	浏览器类型user-agent:${header["user-agent"]}<br />
</body>
</html>