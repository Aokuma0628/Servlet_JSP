package practice;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Prac_6 testtest
 */
@WebServlet("/Prac_6")
public class Prac_6 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(
      HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

    Random random = new Random();
    int randomVal = random.nextInt(10);
    System.out.print("生成乱数は："+ randomVal + "\n");

    switch(randomVal % 2) {
    case 0:
      RequestDispatcher dispatcher =
          request.getRequestDispatcher("/forwarded.jsp");
      dispatcher.forward(request, response);
      break;
    case 1:
      response.sendRedirect("/Sukkiri_Servlet/redirected.jsp");
      break;
    default:
      System.out.print("何かのミスが発生しています\n");
    }
  }

}
