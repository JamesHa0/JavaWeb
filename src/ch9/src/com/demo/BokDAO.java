package com.demo;

import java.sql.*;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BokDAO {
	private static InitialContext context = null;
	private DataSource dataSource = null;

	public BokDAO() {
		try {
			if (context == null) {
				context = new InitialContext();
			}
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/bookDS");
		} catch (NamingException e2) {
		}
	}

	public BookBean searchBook(String bookid) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = dataSource.getConnection();
			String sql = "select * from boos where bookid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookid);
			rs = pstmt.executeQuery();
			BookBean book = new BookBean();
			if (rs.next()) {
				book.setBookid(rs.getString(1));
				book.setTitle(rs.getString(2));
				book.setAuthor(rs.getString(3));
				book.setPublisher(rs.getString(4));
				book.setPrice(rs.getDouble(5));
			}
			return book;
		} catch (Exception e) {
			return null;
		} finally {
			rs.close();
			pstmt.close();
			conn.close();
		}
	}

	public boolean insertBook(BookBean book) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = dataSource.getConnection();
			String sql = "insert into books values (?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBookid());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getAuthor());
			pstmt.setString(4, book.getPublisher());
			pstmt.setDouble(5, book.getPrice());
			int n = pstmt.executeUpdate();
			if (n == 1) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			return false;
		} finally {
			pstmt.close();
			conn.close();
		}
	}
}
