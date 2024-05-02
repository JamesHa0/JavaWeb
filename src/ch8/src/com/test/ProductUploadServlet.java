package com.test;

import java.io.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/ProductUploadServlet")
@MultipartConfig(location = "D:\\", fileSizeThreshold = 1024)
public class ProductUploadServlet extends HttpServlet {
	public String getFilename(Part part) {
		String fname = null;
		String header = part.getHeader("content-disposition");
		System.out.println(header);
		fname = header.substring(header.lastIndexOf("=") + 2, header.length() - 1);
		return fname;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = this.getServletContext().getRealPath("/");
		String productNo = request.getParameter("productNo");
		Part p = request.getPart("fileName");
		String message = "";
		if (p.getSize() > 1024 * 1024) {
			p.delete();
			message = "文件过大，无法上传！";
		} else {
			path = path + "\\No\\" + productNo;
			File f = new File(path);
			if (!f.exists()) {
				f.mkdirs();
			}
			String fname = getFilename(p);
			System.out.println(fname);
			p.write(path + "\\" + fname);
			message = "文件上传成功！";
		}
		request.setAttribute("message", message);
		RequestDispatcher rd = request.getRequestDispatcher("/product-upload.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
