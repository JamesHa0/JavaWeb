package com.demo;

import java.io.IOException;
import com.demo.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/First")
public class FirstServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		String sno = req.getParameter("sno");
		String name = req.getParameter("name");

		Student stu = new Student(sno, name);
		stu.setSno(sno);
		stu.setName(name);
		this.getServletContext().setAttribute("sno", stu.getSno());
		this.getServletContext().setAttribute("name", stu.getName());
		req.setAttribute("student", stu);

		RequestDispatcher rd = req.getRequestDispatcher("/Second");
		rd.forward(req, resp);
	}
}
