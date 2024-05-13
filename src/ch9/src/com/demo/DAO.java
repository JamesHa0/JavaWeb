package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface DAO {
	public default Connection getConnection() throws SQLException, ClassNotFoundException {
		// 第一步：加载驱动程序
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 第二步：准备数据区链接的参数信息，数据库地址，账号密码
		String dburl = "jdbc:mysql://127.0.0.1:3306/bookstore";
		String username = "root";
		String password = "";
		// 第三步：连接数据库，获取数据库连接对象
		Connection conn = DriverManager.getConnection(dburl, username, password);
		return conn;
	}
}
