package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demo.xls")
public class TestServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*resp.setContentType("application/vnd.ms-exce;charset=gb2312");
		PrintWriter out = resp.getWriter();
		out.print("<h3>Student information</h3>\n");
		out.print("ѧ��\t����\t�Ա�\t����\t����ϵ\n");
		out.print("95001\t����\t��\t20\t��Ϣ\n");
		out.print("95002\t����\tŮ\t19\t��ѧ\n");*/
		/*resp.setContentType("application/jar;charset=utf-8");
		ServletOutputStream sos = resp.getOutputStream();
		sos.write();*/
	}
}
