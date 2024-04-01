package com.test4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServerInfo")
public class ServerInfo extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		ServletContext sc = getServletContext();
		out.println("<h1>����������Ϣ��</h1>");
		out.println("<table border=\"1\"><tr><td>վ����</td><td>" + req.getServerName() + "</td></tr>");
		out.println("<tr><td>�˿ں�</td><td>" + req.getServerPort() + "</td></tr>");
		out.println("<tr><td>����������</td><td>" + sc.getServerInfo() + "</td></tr>");
		out.println("<tr><td>֧��Servlet�汾</td><td>" + sc.getMajorVersion() + "</td></tr>");
		out.println("<tr><td>����������</td><td>");
		Enumeration<String> attributes = sc.getAttributeNames();
		while (attributes.hasMoreElements()) {
			String name = (String) attributes.nextElement();
			out.println(name + "<br/>");
		}
		out.print("</td></tr>");
		out.println("</table>");
	}

}
