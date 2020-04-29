package practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Prac_5
 */
@WebServlet("/Prac_5")
public class Prac_5 extends HttpServlet {
    private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(
      HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

      request.setCharacterEncoding("UTF-8");
      String name = request.getParameter("name");
      String qtype = request.getParameter("qtype");
      String body = request.getParameter("body");

      //HTMLを出力
      response.setContentType("text/html; charset = UTF-8");
      PrintWriter out = response.getWriter();
      out.println("<!DOCTYPE html>");
      out.println("<html>");
        out.println("<head>");
          out.println("<meta charset = \"UTF-8\">");
          out.println("<title>問い合わせ結果</title>");
        out.println("</head>");
        out.println("<body>");
          out.println("<h1>問い合わせ結果</h1>");
          out.println("<p>name:" + name + "</p>");
          out.println("<p>qtype:" + qtype + "</p>");
          out.println("<p>body:" + body + "</p>");
        out.println("</body>");
      out.println("</html>");

  }

}
