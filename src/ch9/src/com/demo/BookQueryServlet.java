package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BookQueryServlet")
public class BookQueryServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bookid = request.getParameter("bookid");
		BookDAOImplement queryBook = new BookDAOImplement();
		BookBean book = new BookBean();
		try {
			book = queryBook.searchBook(bookid);
			if (book != null) {
				request.setAttribute("book", book);
				request.getRequestDispatcher("display.jsp").forward(request,response);
			}else {
				request.getRequestDispatcher("errorPage.jsp").forward(request,response);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
