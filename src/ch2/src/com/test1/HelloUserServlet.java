package com.test1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloUserServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
        String userName = request.getParameter("userName");
        String message = "Hello," + userName;

        response.setContentType("text/html");
        response.getWriter().println("<html><body><h2>" + message + "</h2></body></html>");
	}
}