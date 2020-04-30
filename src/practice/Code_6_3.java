package practice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Code_6_3
 */
@WebServlet("/Code_6_3")
public class Code_6_3 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(
      HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

    response.sendRedirect("/Sukkiri_Servlet/Test1");

  }

}
