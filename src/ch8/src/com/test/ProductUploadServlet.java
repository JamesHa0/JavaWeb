package com.test;

import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class ProductUploadServlet
 */
@WebServlet("/ProductUploadServlet")
@MultipartConfig(location="D:\\",fileSizeThreshold=1024)
public class ProductUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductUploadServlet() {
        super();
        String fname = null;
        String header = part.getHeader("content-disposition");
        System.out.println(header);
        fname = header.substring(header.lastIndexOf("=")+2,
        						header.length()-1);
        return fname;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = this.getServletContext().getRealPath("/");
		String mnumber = request.getParameter("mnumber");
		Part p = request.getPart("fileName");
		String message="";
		if (p.getSize() > 1024*1024) {
			p.delete();
			message = " ļ ̫ 󣬲    ϴ   ";
		}else {
			path = path + "\\menber\\" + mnumber;
			File f = new File(path);
			if (!f.exists()) {
				f.mkdir();
			}
			String fname = getFilename(p);
			System.out.println(fname);
			p.write(path+"\\"+fname);
			message = " ļ  ϴ  ɹ   ";
		}
		request.setAttribute("message", message);
		RequestDispatcher rd = request.getRequestDispatcher("/*********.jsp");
   		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
