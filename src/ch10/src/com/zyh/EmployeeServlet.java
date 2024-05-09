package com.zyh;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eno = request.getParameter("eno");
		String ename = request.getParameter("ename");
		String ecompany = request.getParameter("ecompany");
		EmployeeBean employee = new EmployeeBean(eno,ename,ecompany);
		request.setAttribute("employee", employee);
		request.getRequestDispatcher("test2/displayEmployee.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
