package com.demo;

import java.sql.SQLException;

public interface BookDAO extends DAO{
	public BookBean searchBook(String bookid) throws SQLException;
	public boolean insertBook(BookBean book) throws SQLException;
}
