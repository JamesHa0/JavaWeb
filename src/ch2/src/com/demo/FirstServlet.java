package com.demo;
import java.io.IOException;
import com.demo.Student;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		String sno = req.getParameter("sno");
		String name = req.getParameter("name");
		Student stu = new Student(sno,name);
		req.setAttribute("student", stu);
		RequestDispatcher rd=req.getRequestDispatcher("/Second");
		rd.forward(req, resp);
	}
}