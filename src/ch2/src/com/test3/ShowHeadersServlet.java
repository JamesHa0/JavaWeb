package com.test3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowHeadersServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1 align=\"center\">All Request Headers</h1>");
        out.println("<table align=\"center\" border=\"1\"><tr bgcolor=\"#ffb200\" align=\"center\"><td>Header Name</td><td>Header Value</td></tr>");
        
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = req.getHeader(headerName);
            out.println("<tr><td>" + headerName + "</td><td>" + headerValue + "</td></td>");
        }

        out.println("</table></body></html>");
	}

}
