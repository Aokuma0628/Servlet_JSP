package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Fruit;

@WebServlet("/Prac_7")
public class Prac_7 extends HttpServlet {
  private static final long serialVersionUID = 1L;


  protected void doGet(
      HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

    Fruit fruit = new Fruit("リンゴ", 100);
    request.setAttribute("fruit", fruit);

    RequestDispatcher dispatcher =
        request.getRequestDispatcher("/WEB-INF/jsp/fruit.jsp");
    dispatcher.forward(request, response);
  }

}
