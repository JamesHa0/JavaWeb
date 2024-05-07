package com.demo;

import java.sql.*;

public class BookDAOImplement implements BookDAO{

	@Override
	public BookBean searchBook(String bookid) throws SQLException {
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			String sql = "select * from boos where bookid=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, bookid);
			rs=pstmt.executeQuery();
			BookBean book=new BookBean();
			if(rs.next()) {
				book.setBookid(rs.getString(1));
				book.setTitle(rs.getString(2));
				book.setAuthor(rs.getString(3));
				book.setPublisher(rs.getString(4));
				book.setPrice(rs.getDouble(5));
			}
			return book;
		}catch(Exception e) {
			return null;
		}finally {
			rs.close();
			pstmt.close();
			conn.close();
		}
	}

	@Override
	public boolean insertBook(BookBean book) throws SQLException {
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn=getConnection();
			String sql = "insert into books values (?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,book.getBookid());
			pstmt.setString(2,book.getTitle());
			pstmt.setString(3,book.getAuthor());
			pstmt.setString(4,book.getPublisher());
			pstmt.setDouble(5,book.getPrice());
			int n = pstmt.executeUpdate();
			if (n == 1) {
				return true;
			}else {
				return false;
			}
			
		} catch (Exception e) {
			return false;
		} finally {
			rs.close();
			pstmt.close();
			conn.close();
		}
	}
	
}
