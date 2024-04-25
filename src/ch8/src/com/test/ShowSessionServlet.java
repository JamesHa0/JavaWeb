package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ShowSessionServlet")
public class ShowSessionServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		//session.setMaxInactiveInterval(2);
		Integer count = (Integer) session.getAttribute("count");
		String welcome = "Welcome,Newcomer.";
		if (count == null) {
			count = 1;
		} else {
			count++;
			welcome = "Welcome Back.";
		}
		//session.invalidate();
		session.setAttribute("count", count);
		long creationTime = session.getCreationTime();
		long last = session.getLastAccessedTime();
		Date date = new Date(creationTime);
		Date lastDate = new Date(last);
		out.print("<html><body>");
		out.print("<h1>" + welcome + "</h1>");
		out.print("<h2>Information about your session.</h2>");
		out.print("<table border='1px'><tr><td>Info Type</td><td>Value</td></tr>");
		out.print("<tr><td>ID</td><td>" + session.getId() + "</td></tr>");
		out.print("<tr><td>Creation Time:</td><td>" + date + "</td></tr>");
		out.print("<tr><td>Time of last access:</td><td>" + lastDate + "</td></tr>");
		out.print("<tr><td>Access number:</td><td>" + session.getAttribute("count") + "</td></tr>");
		out.print("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
