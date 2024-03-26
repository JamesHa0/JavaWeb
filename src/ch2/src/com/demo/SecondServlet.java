package com.demo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		Student stu = (Student)req.getAttribute("student");
		PrintWriter out = resp.getWriter();
		out.print("<!Doctype html><html><body>");
		out.print("学号："+stu.getSno()+"<br/>");
		out.print("姓名："+stu.getName()+"<br/>");
		out.print("<a href='/ch2/input.html'>返回输入页面</a>");
		out.print("</body></html>");
	}
}