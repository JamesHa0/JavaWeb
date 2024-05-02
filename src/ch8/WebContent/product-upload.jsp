<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>product-upload</title>
</head>
<body>
	商品上传
	<form action="ProductUploadServlet" method="Post"
		enctype="multipart/form-data">
		商品号：<input name="productNo" /><br /> 商品名称：<input name="productName" /><br />
		商品价格：<input name="productPrice" /><br /> 商品图片：<input type="file"
			name="fileName" size="30" /><br /> <input type="submit" />
	</form>
	${message}
</body>
</html>