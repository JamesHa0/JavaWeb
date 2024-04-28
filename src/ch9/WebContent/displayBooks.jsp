<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	try{
		//第一步：加载驱动程序
		Class.forName("com.mysql.cj.jdbc.Driver");
		//第二步：准备数据区链接的参数信息，数据库地址，账号密码
		String dburl="jdbc:mysql://127.0.0.1:3306/bookstore";
		String username="root";
		String password="123456";
		//第三步：连接数据库，获取数据库连接对象
		Connection conn=DriverManager.getConnection(dburl,username,password);
		if(conn!= null){
			//第四步：创建语句对象
			Statement stmt=conn.createStatement();
			//第五步：准备SQL语句
			String sql="select * from books";
			//第六步：执行
			ResultSet rs = stmt.executeQuery(sql);
			
			out.print("<table border ='1'>");
			out.print("<tr><td>书号</td><td>书名</td><td>作者</td><td>价格</td></tr>");
			while(rs.next()){
				out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getDouble(5)+"</td></tr>");
			}
			out.print("</table>");
			rs.close();
			stmt.close();
			conn.close();
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
%>
</body>
</html>