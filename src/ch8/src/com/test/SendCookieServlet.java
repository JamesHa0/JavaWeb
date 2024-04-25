package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SendCookieServlet")
public class SendCookieServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cookieName = "zyh";
		String cookieValue = "22023237";
		request.getCookies();
		Cookie[] cookies = request.getCookies();
		response.addCookie(new Cookie(cookieName, cookieValue));

		PrintWriter writer = response.getWriter();
		writer.print("<html><h2>A cookie has been got from brower</h2>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
