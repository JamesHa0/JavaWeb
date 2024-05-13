<%@page import="java.sql.*,javax.naming.*,javax.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>display2</title>
</head>
<body>
	<%
		try {
			Context context = new InitialContext();
			//lookup的参数必须加上java:comp/env前缀+数据源名称
			DataSource ds = (DataSource) context.lookup("java:comp/env/DataSource");
			Connection conn = ds.getConnection();
			if (conn != null) {
				Statement stmt = conn.createStatement();
				String sql = "select * from books";
				ResultSet rs = stmt.executeQuery(sql);
				out.print("<table border ='1'>");
				out.print("<tr><td>书号</td><td>书名</td><td>作者</td><td>价格</td></tr>");
				while (rs.next()) {
					out.print("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td><td>"
							+ rs.getString(3) + "</td><td>" + rs.getDouble(5) + "</td></tr>");
				}
				out.print("</table>");
				rs.close();
				stmt.close();
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	%>
</body>
</html>