package com.test1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/zyh.xls")
public class ExcelServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/vnd.ms-exce;charset=gb2312");
		PrintWriter out = resp.getWriter();
		out.print("<h3>Student information</h3>\n");
		out.print("学号\t姓名\t性别\t年龄\t所在系\n");
		out.print("95001\t李勇\t男\t20\t信息\n");
		out.print("95002\t刘晨\t女\t19\t数学\n");
	}
}