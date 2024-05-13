package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface DAO {
	public default Connection getConnection() throws SQLException, ClassNotFoundException {
		// ��һ����������������
		Class.forName("com.mysql.cj.jdbc.Driver");
		// �ڶ�����׼�����������ӵĲ�����Ϣ�����ݿ��ַ���˺�����
		String dburl = "jdbc:mysql://127.0.0.1:3306/bookstore";
		String username = "root";
		String password = "";
		// ���������������ݿ⣬��ȡ���ݿ����Ӷ���
		Connection conn = DriverManager.getConnection(dburl, username, password);
		return conn;
	}
}
