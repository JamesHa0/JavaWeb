package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Second")
public class SecondServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		Object sno = getServletContext().getAttribute("sno");
		Object name = getServletContext().getAttribute("name");
		PrintWriter out = resp.getWriter();
		out.print("<!Doctype html><html><body>");
		out.print("学号：" + sno + "<br/>");
		out.print("姓名：" + name + "<br/>");
		out.print("<a href='/bookstore/input.html'>返回输入页面</a>");
		out.print("</body></html>");
	}
}
