package com.demo;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.demo.BokDAO;

@WebServlet("/BookInsertServlet")
public class BookInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("gb2312");
		String message = null;
		BookBean book = new BookBean(request.getParameter("bookid"), request.getParameter("title"),
				request.getParameter("author"), request.getParameter("publisher"),
				Float.parseFloat(request.getParameter("price")));
		BokDAO bookdao = new BokDAO();
		try {
			boolean success = bookdao.insertBook(book);
			if (success) {
				message = "成功插入一条记录！";
			} else {
				message = "插入记录错误！";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("result", message);
		RequestDispatcher view = request.getRequestDispatcher("/bookInsert.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
