package time_test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class time
 */
@WebServlet("/time")
public class time extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public time() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
	     out.println("<html>");
	     out.println("<body><title>time</title>");
	     out.println("<h3>Hello,World!+22023237 JamesHao</h3>");
	     SimpleDateFormat formatter= new SimpleDateFormat("dd HH:mm:ss z yyyy");
	     Date date = new Date(System.currentTimeMillis());
	     SimpleDateFormat sdf = new SimpleDateFormat("E",Locale.ENGLISH);
	     LocalDate localDate = LocalDate.now();
	     Month month = localDate.getMonth();
	     out.println("this time now is:"+"    "+sdf.format(date)+" "+month.getDisplayName(TextStyle.SHORT_STANDALONE, Locale.ENGLISH)+" "+formatter.format(date));
	     out.println("</body>");
	     out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
