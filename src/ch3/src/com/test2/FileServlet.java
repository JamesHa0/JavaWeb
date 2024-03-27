package com.test2;

import java.io.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet-api.jar")
public class FileServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/jar;charset=utf-8");
		String fileName = "servlet-api.jar";
		ServletContext context = getServletContext();
		String filePath = context.getRealPath("/WEB-INF/" + fileName);
		File file = new File(filePath);

		ServletOutputStream outStream = resp.getOutputStream();
		try (InputStream in = new BufferedInputStream(new FileInputStream(filePath))) {
			byte[] buffer = new byte[4096];
			int bytesRead;
			while ((bytesRead = in.read(buffer)) != -1) {
				outStream.write(buffer, 0, bytesRead);
			}
		} finally {
			outStream.flush();
			outStream.close();
		}
	}
}
