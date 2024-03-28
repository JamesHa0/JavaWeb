package com.test3;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShowTimeServlet")
public class ShowTimeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setHeader("Refresh", "2");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = dateFormat.format(new Date());
		String name = "詹宇昊";
		String Sno = "22023237";
		PrintWriter out1 = resp.getWriter();
		out1.println("<html><head><title>ShowTimeServlet</title></head>");
		out1.println("<body>");
		out1.println("<p>姓名：" + name + "</p>");
		out1.println("<p>学号：" + Sno + "</p><br/>");
		out1.println("<h2>当前时间：" + time + "</h2>");
		out1.println("</body></html>");
	}
}
