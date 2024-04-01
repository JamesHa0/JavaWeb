package com.test2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*@WebServlet(name = "ConfigDemoServlet", urlPatterns = "/configDemo.do", initParams = {
		@WebInitParam(name = "email", value = "22023237zyh@hrbu.com"),
		@WebInitParam(name = "telephone", value = "22023237") })*/
public class ConfigDemoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		ServletConfig config = getServletConfig();
		String email = config.getInitParameter("email");
		String tele = config.getInitParameter("telephone");
		out.println("servlet名称 : " + config.getServletName());
		out.println("<br>");
		out.println("Email 地址: " + email);
		out.println("<br>");
		out.println("电话号码:" + tele);
		out.println("<br>");
		getServletContext().log("Servlet名称：" + config.getServletName());
		getServletContext().log("Email地址：" + email);
		getServletContext().log("电话号码：" + tele);
	}
}
