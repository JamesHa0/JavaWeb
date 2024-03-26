package com.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("user");
		String password = req.getParameter("pwd");
		
		if ("admin".equals(username) && "admin".equals(password))
		{
			resp.sendRedirect("/welcome.html");
		}
		else
		{
			resp.sendRedirect("/error.html");
		}
	}
}
