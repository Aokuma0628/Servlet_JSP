package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Fruit;

@WebServlet("/Prac_7")
public class Prac_7 extends HttpServlet {
  private static final long serialVersionUID = 1L;


  protected void doGet(
      HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

    HttpSession session = request.getSession();
    Fruit fruit = new Fruit("リンゴ", 100);
    session.setAttribute("fruit", fruit);

    RequestDispatcher dispatcher =
        request.getRequestDispatcher("/WEB-INF/jsp/fruit.jsp");
    dispatcher.forward(request, response);

    session.removeAttribute("fruit");
  }

}
