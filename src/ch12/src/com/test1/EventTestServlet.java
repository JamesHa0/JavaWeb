package com.test1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EventTestServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext context =null;
	    context = getServletConfig().getServletContext();
	    response.setContentType("text/html;charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    out.println("<html><head><title>EventTestServlet</title></head>");
	    context.setAttribute("obj",100); //�������
	    context.setAttribute("obj",new Date());  //�滻����
	    context.removeAttribute("obj");  //ɾ������
	    out.println("<h3 align=center>"+ "����ServletContext��������ӡ��滻��ɾ��������</h3>");
	    out.println("</body></html>");
	    out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
