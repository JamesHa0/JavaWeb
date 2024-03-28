import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "helloapp", urlPatterns = { "/hello" })
//java������ƣ�ֱ��ͨ��url��/hello)�ҵ������(helloapp)
public class helloapp extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Hello, World!</title></head><body>");
        out.println("<h1>Hello, World!</h1>");
        out.println("</body></html>");
    }
}
