package practice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Code_6
 */
@WebServlet("/Code_6")
public class Code_6 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(
      HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

    RequestDispatcher dispatcher =
        request.getRequestDispatcher("/WEB-INF/jsp/code_6.jsp");
    dispatcher.forward(request, response);
  }

}
